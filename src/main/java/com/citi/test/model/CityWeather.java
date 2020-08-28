package com.citi.test.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consolidated_weather",
    "time",
    "sun_rise",
    "sun_set",
    "timezone_name",
    "parent",
    "sources",
    "title",
    "location_type",
    "woeid",
    "latt_long",
    "timezone"
})
public class CityWeather {
	/*
	 * for the sake of time http://www.jsonschema2pojo.org has been used to code this object 8)
	 */

    @JsonProperty("consolidated_weather")
    private List<ConsolidatedWeather> consolidatedWeather = null;
    @JsonProperty("time")
    private String time;
    @JsonProperty("sun_rise")
    private String sunRise;
    @JsonProperty("sun_set")
    private String sunSet;
    @JsonProperty("timezone_name")
    private String timezoneName;
    @JsonProperty("parent")
    private Parent parent;
    @JsonProperty("sources")
    private List<Source> sources = null;
    @JsonProperty("title")
    private String title;
    @JsonProperty("location_type")
    private String locationType;
    @JsonProperty("woeid")
    private Integer woeid;
    @JsonProperty("latt_long")
    private String lattLong;
    @JsonProperty("timezone")
    private String timezone;

    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSunRise() {
        return sunRise;
    }

    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    public String getTimezoneName() {
        return timezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Integer getWoeid() {
        return woeid;
    }

    public void setWoeid(Integer woeid) {
        this.woeid = woeid;
    }

    public String getLattLong() {
        return lattLong;
    }

    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
