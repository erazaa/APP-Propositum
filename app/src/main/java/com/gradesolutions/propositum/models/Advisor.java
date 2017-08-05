package com.gradesolutions.propositum.models;

public class Advisor {
    private String picture;
    private String userName;
    private String description;



    public Advisor(String picture, String userName, String description) {
        this.picture = picture;
        this.userName = userName;
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}








