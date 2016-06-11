package mememe.hkhourlyweatherforecast.accuweather;

import mememe.hkhourlyweatherforecast.accuweather.location.Location;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by MEMEME-iClass on 8/6/2016.
 */
public interface LocationService {
	@GET("locations/v1/cities/geoposition/search")
	Observable<Location> getLocationInfo(@Query("apikey") String apikey,
	                                     @Query("q") String coordinate);
}
