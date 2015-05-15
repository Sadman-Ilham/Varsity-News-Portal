package com.sadman.varsityNewsPortal.dto;

/**
 * Created by Sadman on 3/17/2015.
 */
public class newsDto {
    private int newsID;
    private String title;
    private String details;
    private String imageLocation;
    private int reporterID;
    private String reporterName;
    private String date;
    private int like;
    private int view;
    private int varsityID;
    private String varsityName;
    private String varsityAbbreviation;

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public int getReporterID() {
        return reporterID;
    }

    public void setReporterID(int reporterID) {
        this.reporterID = reporterID;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getVarsityID() {
        return varsityID;
    }

    public void setVarsityID(int varsityID) {
        this.varsityID = varsityID;
    }

    public String getVarsityName() {
        return varsityName;
    }

    public void setVarsityName(String varsityName) {
        this.varsityName = varsityName;
    }

    public String getVarsityAbbreviation() {
        return varsityAbbreviation;
    }

    public void setVarsityAbbreviation(String varsityAbbreviation) {
        this.varsityAbbreviation = varsityAbbreviation;
    }
}
