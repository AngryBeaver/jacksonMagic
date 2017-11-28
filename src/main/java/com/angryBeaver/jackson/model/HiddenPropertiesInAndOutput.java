package com.angryBeaver.jackson.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class HiddenPropertiesInAndOutput {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String title;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String subTitle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}

