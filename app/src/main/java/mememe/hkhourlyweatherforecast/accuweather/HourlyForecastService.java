package mememe.hkhourlyweatherforecast.accuweather;

import java.util.List;

import mememe.hkhourlyweatherforecast.accuweather.hourlyforecast.HourlyForecast;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface HourlyForecastService {
	@GET("forecasts/v1/hourly/12hour/{locationKey}")
	Observable<List<HourlyForecast>> listHourlyForecast(@Path("locationKey") String locationKey,
	                                                    @Query("apikey") String apikey,
	                                                    @Query("details") boolean details,
	                                                    @Query("metric") boolean metric);
}
