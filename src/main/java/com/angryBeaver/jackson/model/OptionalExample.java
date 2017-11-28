package com.angryBeaver.jackson.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

public class OptionalExample {
    String title;

    @ApiModelProperty(
            position = 2, dataType="String", example = "string"
    )
    Optional<String> subTitle;

    public Optional<String> getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(Optional<String> subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
