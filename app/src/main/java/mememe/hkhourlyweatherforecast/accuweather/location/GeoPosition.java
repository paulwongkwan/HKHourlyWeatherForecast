
package mememe.hkhourlyweatherforecast.accuweather.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoPosition {

    @SerializedName("Latitude")
    @Expose
    private Double latitude;
    @SerializedName("Longitude")
    @Expose
    private Double longitude;
    @SerializedName("Elevation")
    @Expose
    private Elevation elevation;

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The Latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The Longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The elevation
     */
    public Elevation getElevation() {
        return elevation;
    }

    /**
     * 
     * @param elevation
     *     The Elevation
     */
    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
    }

}
