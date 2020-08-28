package com.citi.test.model;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "weather_state_name",
    "weather_state_abbr",
    "wind_direction_compass",
    "created",
    "applicable_date",
    "min_temp",
    "max_temp",
    "the_temp",
    "wind_speed",
    "wind_direction",
    "air_pressure",
    "humidity",
    "visibility",
    "predictability"
})
public class ConsolidatedWeather {
	/*
	 * for the sake of time http://www.jsonschema2pojo.org has been used to code this object 8)
	 */

    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("weather_state_name")
    private String weatherStateName;
    @JsonProperty("weather_state_abbr")
    private String weatherStateAbbr;
    @JsonProperty("wind_direction_compass")
    private String windDirectionCompass;
    @JsonProperty("created")
    private String created;
    @JsonProperty("applicable_date")
    private String applicableDate;
    @JsonProperty("min_temp")
    private Double minTemp;
    @JsonProperty("max_temp")
    private Double maxTemp;
    @JsonProperty("the_temp")
    private Double theTemp;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_direction")
    private Double windDirection;
    @JsonProperty("air_pressure")
    private Double airPressure;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("visibility")
    private Double visibility;
    @JsonProperty("predictability")
    private Integer predictability;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public String getWeatherStateAbbr() {
        return weatherStateAbbr;
    }

    public void setWeatherStateAbbr(String weatherStateAbbr) {
        this.weatherStateAbbr = weatherStateAbbr;
    }

    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getApplicableDate() {
        return applicableDate;
    }

    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Double getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(Double theTemp) {
        this.theTemp = theTemp;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public Double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Integer getPredictability() {
        return predictability;
    }

    public void setPredictability(Integer predictability) {
        this.predictability = predictability;
    }
}
