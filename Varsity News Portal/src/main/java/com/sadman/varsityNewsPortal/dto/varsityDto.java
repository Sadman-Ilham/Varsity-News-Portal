package com.sadman.varsityNewsPortal.dto;

/**
 * Created by Sadman on 3/26/2015.
 */
public class varsityDto {

    private int varsityID;
    private String name;
    private String abbreviation;
    private int noOfFollowers;

    public int getVarsityID() {
        return varsityID;
    }

    public void setVarsityID(int varsityID) {
        this.varsityID = varsityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getNoOfFollowers() {
        return noOfFollowers;
    }

    public void setNoOfFollowers(int noOfFollowers) {
        this.noOfFollowers = noOfFollowers;
    }
}
