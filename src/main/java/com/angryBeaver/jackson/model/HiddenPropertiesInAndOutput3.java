package com.angryBeaver.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

//https://github.com/springfox/springfox/issues/1725

public class HiddenPropertiesInAndOutput3 {
    @ApiModelProperty(value = "title", readOnly=true)
    @JsonIgnore
    private String title;

    @JsonIgnore
    private String subTitle;

    @JsonProperty
    public String getTitle() {
        return title;
    }

    @JsonIgnore
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonIgnore
    public String getSubTitle() {
        return subTitle;
    }
    @JsonProperty
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}

