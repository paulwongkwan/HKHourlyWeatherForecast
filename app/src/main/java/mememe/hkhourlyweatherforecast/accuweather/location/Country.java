
package mememe.hkhourlyweatherforecast.accuweather.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("LocalizedName")
    @Expose
    private String localizedName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;

    /**
     * 
     * @return
     *     The iD
     */
    public String getID() {
        return iD;
    }

    /**
     * 
     * @param iD
     *     The ID
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * 
     * @return
     *     The localizedName
     */
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * 
     * @param localizedName
     *     The LocalizedName
     */
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    /**
     * 
     * @return
     *     The englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 
     * @param englishName
     *     The EnglishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

}
