package com.angryBeaver.jackson.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MagicProperties {

    @JsonProperty
    private String title;
    private String subTitle;

    MagicProperties(){
        this.subTitle = "hidden Property";
    }

    public String getHidden() {
        return subTitle;
    }

    public String getMagic() {
        return title;
    }

    public void setMagic(String title) {
        this.title = "magic:"+title;
    }
}
