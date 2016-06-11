
package mememe.hkhourlyweatherforecast.accuweather.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeZone {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("GmtOffset")
    @Expose
    private Integer gmtOffset;

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The gmtOffset
     */
    public Integer getGmtOffset() {
        return gmtOffset;
    }

    /**
     * 
     * @param gmtOffset
     *     The GmtOffset
     */
    public void setGmtOffset(Integer gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

}
