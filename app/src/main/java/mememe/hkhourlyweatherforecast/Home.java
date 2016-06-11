package mememe.hkhourlyweatherforecast;

import android.Manifest;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.SmartLocation;
import io.nlopez.smartlocation.location.providers.LocationGooglePlayServicesWithFallbackProvider;
import mememe.hkhourlyweatherforecast.accuweather.HourlyForecastService;
import mememe.hkhourlyweatherforecast.accuweather.LocationService;
import mememe.hkhourlyweatherforecast.accuweather.hourlyforecast.HourlyForecast;
import mememe.hkhourlyweatherforecast.adaptor.HourlyForecastAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class Home extends AppCompatActivity {

	static final String baseurl = "http://dataservice.accuweather.com";
	static final String apiKey = "hFxpi4eiQL9Sz45DzWsSVX8XykH351Cx";
	private static final int REQUEST_FINE_LOCATION = 1;

	@BindView(R.id.hourlyforecastlist)
	RecyclerView hourlyforecastlist;
	@BindView(R.id.hourlyforecastLocation)
	TextView hourlyforecastLocation;
	@BindView(R.id.progressBar)
	ProgressBar progressBar;

	Retrofit retrofit;

	ArrayList<HourlyForecast> forecasts = new ArrayList<>();
	HourlyForecastAdapter hourlyForecastAdapter;

    /*
    HK: 1123655
    CW: 2333529
    East: 1123656
    HungHom: 570
    SheungShui: 59240
    SaiKung: 59222
    SSP:571
    SHAIN:59216
    TM: 59215
     */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_home);

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		ButterKnife.bind(this);

		loadPermissions(Manifest.permission.ACCESS_FINE_LOCATION,REQUEST_FINE_LOCATION);

		hourlyForecastAdapter = new HourlyForecastAdapter(this, forecasts);
		hourlyforecastlist.setLayoutManager(new LinearLayoutManager(this));
		hourlyforecastlist.setAdapter(hourlyForecastAdapter);

		retrofit = new Retrofit.Builder()
			.baseUrl(baseurl)
			.addConverterFactory(GsonConverterFactory.create())
			.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
			.build();

		SmartLocation.with(getBaseContext()).location(new LocationGooglePlayServicesWithFallbackProvider(this))
				.oneFix()
				.start(new OnLocationUpdatedListener() {
					@Override
					public void onLocationUpdated(Location location) {
						updateLocationForecast(location.getLatitude(), location.getLongitude());
					}
				});
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	private void updateLocationForecast(double lat, double lon){
		LocationService locationService = retrofit.create(LocationService.class);

		locationService.getLocationInfo(apiKey, lat + "," + lon)
			.subscribeOn(Schedulers.io())
			.observeOn(AndroidSchedulers.mainThread())
			.subscribe(new Subscriber<mememe.hkhourlyweatherforecast.accuweather.location.Location>() {
				@Override
				public void onCompleted() {}
				@Override
				public void onError(Throwable e) {}

				@Override
				public void onNext(mememe.hkhourlyweatherforecast.accuweather.location.Location location) {
					// Location
					hourlyforecastLocation.setText(location.getLocalizedName());

					updateForecast(location.getKey());
				}
			});
	}

	private void updateForecast(String locationKey){
		HourlyForecastService service = retrofit.create(HourlyForecastService.class);

		service.listHourlyForecast(locationKey, apiKey, true, true)
			.flatMap(new Func1<List<HourlyForecast>, Observable<HourlyForecast>>() {
				@Override
				public Observable<HourlyForecast> call(List<HourlyForecast> hourlyForecasts) {
					return Observable.from(hourlyForecasts);
				}
			})
			.subscribeOn(Schedulers.io())
			.observeOn(AndroidSchedulers.mainThread())
			.subscribe(new Subscriber<HourlyForecast>() {
				@Override
				public void onCompleted() {
					progressBar.animate().setInterpolator(new DecelerateInterpolator(1.5f)).alpha(0).setDuration(500).start();
				}

				@Override
				public void onError(Throwable e) {
					e.printStackTrace();
				}

				@Override
				public void onNext(HourlyForecast hourlyForecast) {
					forecasts.add(hourlyForecast);
					if(hourlyForecastAdapter != null)
						hourlyForecastAdapter.notifyItemInserted(forecasts.size());
					//Hourly Forecast
				}
			});
	}

	private void loadPermissions(String perm,int requestCode) {
		if (ContextCompat.checkSelfPermission(this, perm) != PackageManager.PERMISSION_GRANTED) {
			if (!ActivityCompat.shouldShowRequestPermissionRationale(this, perm)) {
				ActivityCompat.requestPermissions(this, new String[]{perm},requestCode);
			}
		}
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		switch (requestCode) {
			case REQUEST_FINE_LOCATION: {
				// If request is cancelled, the result arrays are empty.
				if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
					// granted
				}
				else{
					// no granted
					finish();
				}
				return;
			}

		}

	}
}
