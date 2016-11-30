package com.NYTimes.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by iceman on 11/29/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    @JsonProperty("section")
    String section;
    @JsonProperty("subsection")
    String subsection;
    @JsonProperty("title")
    String title;
    @JsonProperty("abstract")
    String storyAbstract;
    @JsonProperty("url")
    String url;
    @JsonProperty("byline")
    String byline;
    @JsonProperty("item_type")
    String item_type;
    @JsonProperty("updated_date")
    String updated_date;
    @JsonProperty("created_date")
    String created_date;
    @JsonProperty("published_date")
    String published_date;
    @JsonProperty("material_type_facet")
    String material_type_facet;
    @JsonProperty("kicker")
    String kicker;
    @JsonProperty("short_url")
    String short_url;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStoryAbstract() {
        return storyAbstract;
    }

    public void setStoryAbstract(String storyAbstract) {
        this.storyAbstract = storyAbstract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    @Override
    public String toString() {
        return "Results{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", storyAbstract='" + storyAbstract + '\'' +
                ", url='" + url + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", short_url='" + short_url + '\'' +
                '}';
    }
}
