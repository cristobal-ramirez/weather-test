package com.citi.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "location_type",
    "woeid",
    "latt_long"
})
public class CityLocation {
	/*
	 * for the sake of time http://www.jsonschema2pojo.org has been used to code this object 8)
	 */
	
    @JsonProperty("title")
    private String title;
    @JsonProperty("location_type")
    private String locationType;
    @JsonProperty("woeid")
    private Integer woeid;
    @JsonProperty("latt_long")
    private String lattLong;

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
}
