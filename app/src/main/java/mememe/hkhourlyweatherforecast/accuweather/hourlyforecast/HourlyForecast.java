
package mememe.hkhourlyweatherforecast.accuweather.hourlyforecast;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class HourlyForecast {

    @SerializedName("DateTime")
    @Expose
    private String dateTime;
    @SerializedName("EpochDateTime")
    @Expose
    private Integer epochDateTime;
    @SerializedName("WeatherIcon")
    @Expose
    private Integer weatherIcon;
    @SerializedName("IconPhrase")
    @Expose
    private String iconPhrase;
    @SerializedName("IsDaylight")
    @Expose
    private Boolean isDaylight;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("RealFeelTemperature")
    @Expose
    private RealFeelTemperature realFeelTemperature;
    @SerializedName("WetBulbTemperature")
    @Expose
    private WetBulbTemperature wetBulbTemperature;
    @SerializedName("DewPoint")
    @Expose
    private DewPoint dewPoint;
    @SerializedName("Wind")
    @Expose
    private Wind wind;
    @SerializedName("WindGust")
    @Expose
    private WindGust windGust;
    @SerializedName("RelativeHumidity")
    @Expose
    private Integer relativeHumidity;
    @SerializedName("Visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("Ceiling")
    @Expose
    private Ceiling ceiling;
    @SerializedName("UVIndex")
    @Expose
    private Integer uVIndex;
    @SerializedName("UVIndexText")
    @Expose
    private String uVIndexText;
    @SerializedName("PrecipitationProbability")
    @Expose
    private Integer precipitationProbability;
    @SerializedName("RainProbability")
    @Expose
    private Integer rainProbability;
    @SerializedName("SnowProbability")
    @Expose
    private Integer snowProbability;
    @SerializedName("IceProbability")
    @Expose
    private Integer iceProbability;
    @SerializedName("TotalLiquid")
    @Expose
    private TotalLiquid totalLiquid;
    @SerializedName("Rain")
    @Expose
    private Rain rain;
    @SerializedName("Snow")
    @Expose
    private Snow snow;
    @SerializedName("Ice")
    @Expose
    private Ice ice;
    @SerializedName("CloudCover")
    @Expose
    private Integer cloudCover;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * 
     * @return
     *     The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 
     * @param dateTime
     *     The DateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * 
     * @return
     *     The epochDateTime
     */
    public Integer getEpochDateTime() {
        return epochDateTime;
    }

    /**
     * 
     * @param epochDateTime
     *     The EpochDateTime
     */
    public void setEpochDateTime(Integer epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    /**
     * 
     * @return
     *     The weatherIcon
     */
    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    /**
     * 
     * @param weatherIcon
     *     The WeatherIcon
     */
    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    /**
     * 
     * @return
     *     The iconPhrase
     */
    public String getIconPhrase() {
        return iconPhrase;
    }

    /**
     * 
     * @param iconPhrase
     *     The IconPhrase
     */
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    /**
     * 
     * @return
     *     The isDaylight
     */
    public Boolean getIsDaylight() {
        return isDaylight;
    }

    /**
     * 
     * @param isDaylight
     *     The IsDaylight
     */
    public void setIsDaylight(Boolean isDaylight) {
        this.isDaylight = isDaylight;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The Temperature
     */
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The realFeelTemperature
     */
    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    /**
     * 
     * @param realFeelTemperature
     *     The RealFeelTemperature
     */
    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    /**
     * 
     * @return
     *     The wetBulbTemperature
     */
    public WetBulbTemperature getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    /**
     * 
     * @param wetBulbTemperature
     *     The WetBulbTemperature
     */
    public void setWetBulbTemperature(WetBulbTemperature wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    /**
     * 
     * @return
     *     The dewPoint
     */
    public DewPoint getDewPoint() {
        return dewPoint;
    }

    /**
     * 
     * @param dewPoint
     *     The DewPoint
     */
    public void setDewPoint(DewPoint dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * 
     * @return
     *     The wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * 
     * @param wind
     *     The Wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * 
     * @return
     *     The windGust
     */
    public WindGust getWindGust() {
        return windGust;
    }

    /**
     * 
     * @param windGust
     *     The WindGust
     */
    public void setWindGust(WindGust windGust) {
        this.windGust = windGust;
    }

    /**
     * 
     * @return
     *     The relativeHumidity
     */
    public Integer getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * 
     * @param relativeHumidity
     *     The RelativeHumidity
     */
    public void setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The Visibility
     */
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The ceiling
     */
    public Ceiling getCeiling() {
        return ceiling;
    }

    /**
     * 
     * @param ceiling
     *     The Ceiling
     */
    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    /**
     * 
     * @return
     *     The uVIndex
     */
    public Integer getUVIndex() {
        return uVIndex;
    }

    /**
     * 
     * @param uVIndex
     *     The UVIndex
     */
    public void setUVIndex(Integer uVIndex) {
        this.uVIndex = uVIndex;
    }

    /**
     * 
     * @return
     *     The uVIndexText
     */
    public String getUVIndexText() {
        return uVIndexText;
    }

    /**
     * 
     * @param uVIndexText
     *     The UVIndexText
     */
    public void setUVIndexText(String uVIndexText) {
        this.uVIndexText = uVIndexText;
    }

    /**
     * 
     * @return
     *     The precipitationProbability
     */
    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    /**
     * 
     * @param precipitationProbability
     *     The PrecipitationProbability
     */
    public void setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    /**
     * 
     * @return
     *     The rainProbability
     */
    public Integer getRainProbability() {
        return rainProbability;
    }

    /**
     * 
     * @param rainProbability
     *     The RainProbability
     */
    public void setRainProbability(Integer rainProbability) {
        this.rainProbability = rainProbability;
    }

    /**
     * 
     * @return
     *     The snowProbability
     */
    public Integer getSnowProbability() {
        return snowProbability;
    }

    /**
     * 
     * @param snowProbability
     *     The SnowProbability
     */
    public void setSnowProbability(Integer snowProbability) {
        this.snowProbability = snowProbability;
    }

    /**
     * 
     * @return
     *     The iceProbability
     */
    public Integer getIceProbability() {
        return iceProbability;
    }

    /**
     * 
     * @param iceProbability
     *     The IceProbability
     */
    public void setIceProbability(Integer iceProbability) {
        this.iceProbability = iceProbability;
    }

    /**
     * 
     * @return
     *     The totalLiquid
     */
    public TotalLiquid getTotalLiquid() {
        return totalLiquid;
    }

    /**
     * 
     * @param totalLiquid
     *     The TotalLiquid
     */
    public void setTotalLiquid(TotalLiquid totalLiquid) {
        this.totalLiquid = totalLiquid;
    }

    /**
     * 
     * @return
     *     The rain
     */
    public Rain getRain() {
        return rain;
    }

    /**
     * 
     * @param rain
     *     The Rain
     */
    public void setRain(Rain rain) {
        this.rain = rain;
    }

    /**
     * 
     * @return
     *     The snow
     */
    public Snow getSnow() {
        return snow;
    }

    /**
     * 
     * @param snow
     *     The Snow
     */
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    /**
     * 
     * @return
     *     The ice
     */
    public Ice getIce() {
        return ice;
    }

    /**
     * 
     * @param ice
     *     The Ice
     */
    public void setIce(Ice ice) {
        this.ice = ice;
    }

    /**
     * 
     * @return
     *     The cloudCover
     */
    public Integer getCloudCover() {
        return cloudCover;
    }

    /**
     * 
     * @param cloudCover
     *     The CloudCover
     */
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     * 
     * @return
     *     The mobileLink
     */
    public String getMobileLink() {
        return mobileLink;
    }

    /**
     * 
     * @param mobileLink
     *     The MobileLink
     */
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The Link
     */
    public void setLink(String link) {
        this.link = link;
    }

}
