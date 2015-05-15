package com.sadman.varsityNewsPortal.dto;

/**
 * Created by Sadman on 3/26/2015.
 */
public class userInfoDto {
    private int userID;
    private String name;
    private int varsityID;
    private String gender;
    private String dob;
    private int noOfFollowers;
    private int noOfFollowings;
    private int noOfNews;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsityID() {
        return varsityID;
    }

    public void setVarsityID(int varsityID) {
        this.varsityID = varsityID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getNoOfFollowers() {
        return noOfFollowers;
    }

    public void setNoOfFollowers(int noOfFollowers) {
        this.noOfFollowers = noOfFollowers;
    }

    public int getNoOfFollowings() {
        return noOfFollowings;
    }

    public void setNoOfFollowings(int noOfFollowings) {
        this.noOfFollowings = noOfFollowings;
    }

    public int getNoOfNews() {
        return noOfNews;
    }

    public void setNoOfNews(int noOfNews) {
        this.noOfNews = noOfNews;
    }
}
