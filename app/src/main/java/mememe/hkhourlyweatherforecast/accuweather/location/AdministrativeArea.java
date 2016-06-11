
package mememe.hkhourlyweatherforecast.accuweather.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdministrativeArea {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("LocalizedName")
    @Expose
    private String localizedName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;
    @SerializedName("Level")
    @Expose
    private Integer level;
    @SerializedName("LocalizedType")
    @Expose
    private String localizedType;
    @SerializedName("EnglishType")
    @Expose
    private String englishType;
    @SerializedName("CountryID")
    @Expose
    private String countryID;

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

    /**
     * 
     * @return
     *     The level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The Level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The localizedType
     */
    public String getLocalizedType() {
        return localizedType;
    }

    /**
     * 
     * @param localizedType
     *     The LocalizedType
     */
    public void setLocalizedType(String localizedType) {
        this.localizedType = localizedType;
    }

    /**
     * 
     * @return
     *     The englishType
     */
    public String getEnglishType() {
        return englishType;
    }

    /**
     * 
     * @param englishType
     *     The EnglishType
     */
    public void setEnglishType(String englishType) {
        this.englishType = englishType;
    }

    /**
     * 
     * @return
     *     The countryID
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * 
     * @param countryID
     *     The CountryID
     */
    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

}
