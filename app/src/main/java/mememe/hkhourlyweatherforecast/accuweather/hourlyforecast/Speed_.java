
package mememe.hkhourlyweatherforecast.accuweather.hourlyforecast;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Speed_ {

    @SerializedName("Value")
    @Expose
    private Double value;
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
    public Double getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The Value
     */
    public void setValue(Double value) {
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
