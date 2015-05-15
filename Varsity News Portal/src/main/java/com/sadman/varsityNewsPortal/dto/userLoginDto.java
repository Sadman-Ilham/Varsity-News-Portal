package com.sadman.varsityNewsPortal.dto;

/**
 * Created by Sadman on 3/27/2015.
 */
public class userLoginDto {

    private int userLoginID;
    private String email;
    private String password;

    public int getUserLoginID() {
        return userLoginID;
    }

    public void setUserLoginID(int accountID) {
        this.userLoginID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
