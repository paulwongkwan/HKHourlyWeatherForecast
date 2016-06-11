
package mememe.hkhourlyweatherforecast.accuweather.hourlyforecast;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WindGust {

    @SerializedName("Speed")
    @Expose
    private Speed_ speed;

    /**
     * 
     * @return
     *     The speed
     */
    public Speed_ getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The Speed
     */
    public void setSpeed(Speed_ speed) {
        this.speed = speed;
    }

}
