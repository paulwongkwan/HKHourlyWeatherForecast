
package mememe.hkhourlyweatherforecast.accuweather.hourlyforecast;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Direction {

    @SerializedName("Degrees")
    @Expose
    private Integer degrees;
    @SerializedName("Localized")
    @Expose
    private String localized;
    @SerializedName("English")
    @Expose
    private String english;

    /**
     * 
     * @return
     *     The degrees
     */
    public Integer getDegrees() {
        return degrees;
    }

    /**
     * 
     * @param degrees
     *     The Degrees
     */
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }

    /**
     * 
     * @return
     *     The localized
     */
    public String getLocalized() {
        return localized;
    }

    /**
     * 
     * @param localized
     *     The Localized
     */
    public void setLocalized(String localized) {
        this.localized = localized;
    }

    /**
     * 
     * @return
     *     The english
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 
     * @param english
     *     The English
     */
    public void setEnglish(String english) {
        this.english = english;
    }

}
