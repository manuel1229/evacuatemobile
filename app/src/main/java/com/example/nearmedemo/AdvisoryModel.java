package com.example.nearmedemo;

public class AdvisoryModel {

    String description, title;

    public AdvisoryModel(){

    }
    public AdvisoryModel(String description, String title){
        this.description = description;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
