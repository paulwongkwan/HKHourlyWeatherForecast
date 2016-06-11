
package mememe.hkhourlyweatherforecast.accuweather.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imperial {

    @SerializedName("Value")
    @Expose
    private Integer value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    @SerializedName("UnitType")
    @Expose
    private Integer unitType;

    /**
     * 
     * @return
     *     The value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The Value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The Unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 
     * @return
     *     The unitType
     */
    public Integer getUnitType() {
        return unitType;
    }

    /**
     * 
     * @param unitType
     *     The UnitType
     */
    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

}
