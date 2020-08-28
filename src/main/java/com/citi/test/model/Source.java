package com.citi.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "slug",
    "url",
    "crawl_rate"
})
public class Source {
	/*
	 * for the sake of time http://www.jsonschema2pojo.org has been used to code this object 8)
	 */
	
    @JsonProperty("title")
    private String title;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("url")
    private String url;
    @JsonProperty("crawl_rate")
    private Integer crawlRate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCrawlRate() {
        return crawlRate;
    }

    public void setCrawlRate(Integer crawlRate) {
        this.crawlRate = crawlRate;
    }
}
