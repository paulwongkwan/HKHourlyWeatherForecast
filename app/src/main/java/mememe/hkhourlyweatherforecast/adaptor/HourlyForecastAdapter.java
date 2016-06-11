package mememe.hkhourlyweatherforecast.adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import mememe.hkhourlyweatherforecast.R;
import mememe.hkhourlyweatherforecast.accuweather.hourlyforecast.HourlyForecast;
import mememe.hkhourlyweatherforecast.weatherIcon.WeatherIcon;

/**
 * Created by MEMEME on 8/6/2016.
 */
public class HourlyForecastAdapter extends RecyclerView.Adapter<HourlyForecastAdapter.HourlyForecastViewHolder> {

	Context context;
	ArrayList<HourlyForecast> forecasts;

	public HourlyForecastAdapter(Context context, ArrayList<HourlyForecast> forecasts){
		this.context = context;
		this.forecasts = forecasts;
	}

	@Override
	public HourlyForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new HourlyForecastViewHolder(LayoutInflater.from(context).inflate(R.layout.hourlyforecast, parent, false));
	}

	@Override
	public void onBindViewHolder(HourlyForecastViewHolder holder, int position) {
		HourlyForecast forecast = getItem(position);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		try {
			Date date = formatter.parse(forecast.getDateTime());
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			formatter = new SimpleDateFormat("HH:mm");
			holder.hourlyforecastTime.setText(formatter.format(calendar.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		holder.hourlyforecastTemp.setText(forecast.getTemperature().getValue() + "°" + forecast.getTemperature().getUnit());
		holder.hourlyforecastReal.setText("Feel " + forecast.getRealFeelTemperature().getValue() + "°" + forecast.getRealFeelTemperature().getUnit());
		holder.hourlyforecastCover.setText(forecast.getCloudCover() + "%");
		holder.hourlyforecastRain.setText(forecast.getRain().getValue() + forecast.getRain().getUnit());
		holder.hourlyforecastWindSpeed.setText(forecast.getWind().getSpeed().getValue() + forecast.getWind().getSpeed().getUnit());

		Picasso.with(context).load(WeatherIcon.getWeatherIconResources(forecast.getWeatherIcon())).into(holder.hourlyforecastweathericon);

	}

	@Override
	public int getItemCount() {
		return forecasts.size();
	}

	private HourlyForecast getItem(int position){
		return forecasts.get(position);
	}

	static class HourlyForecastViewHolder extends RecyclerView.ViewHolder{

		@BindView(R.id.hourlyforecastTime) TextView hourlyforecastTime;
		@BindView(R.id.hourlyforecastweathericon) ImageView hourlyforecastweathericon;
		@BindView(R.id.hourlyforecastWindSpeed) TextView hourlyforecastWindSpeed;
		@BindView(R.id.hourlyforecastTemp) TextView hourlyforecastTemp;
		@BindView(R.id.hourlyforecastReal) TextView hourlyforecastReal;
		@BindView(R.id.hourlyforecastCover) TextView hourlyforecastCover;
		@BindView(R.id.hourlyforecastRain) TextView hourlyforecastRain;

		public HourlyForecastViewHolder(View itemView) {
			super(itemView);

			ButterKnife.bind(this, itemView);
		}
	}
}
