
package mememe.hkhourlyweatherforecast.accuweather.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Elevation {

    @SerializedName("Metric")
    @Expose
    private Metric metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

}
