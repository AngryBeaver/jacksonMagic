package com.angryBeaver.jackson.model;


public class IDontCareAboutBuilderPatterns {
    private String title;
    private String subTitle;

    IDontCareAboutBuilderPatterns(){
        this.subTitle = "initial";
    }

    public String getSubTitle() {
        return "##"+this.subTitle+"##";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.subTitle = "wtf";
    }
}
