package com.sadman.varsityNewsPortal.service;

import com.sadman.varsityNewsPortal.database.dataRetrieve;
import com.sadman.varsityNewsPortal.database.databaseConnection;
import com.sadman.varsityNewsPortal.dto.userInfoDto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sadman on 3/26/2015.
 */
public class userInfoService {

    private databaseConnection dbConnection;
    private dataRetrieve retrieve;
    private ResultSet resultSet;

    public userInfoService()throws SQLException{
        dbConnection = databaseConnection.createConnection();
        retrieve = new dataRetrieve(dbConnection);
    }

    public userInfoDto getUserByID(int userID) throws SQLException{
        String query = "select * from user_info_table where user_info_id = '" + userID + "'";
        resultSet = retrieve.getResultset(query);

        if(resultSet != null) return fillTheList();
        else return null;
    }

    public userInfoDto fillTheList() throws SQLException{
        userInfoDto user = new userInfoDto();

        while(resultSet.next()){
            user.setUserID(resultSet.getInt("user_info_id"));
            user.setName(resultSet.getString("user_info_name"));
            user.setVarsityID(resultSet.getInt("user_info_varsityID"));
            user.setGender(resultSet.getString("user_info_gender"));
            user.setDob(resultSet.getString("user_info_dob"));
            user.setNoOfFollowers(resultSet.getInt("user_info_noOfFollowers"));
            user.setNoOfFollowings(resultSet.getInt("user_info_noOfFollowings"));
            user.setNoOfNews(resultSet.getInt("user_info_noOfNews"));
        }

        return user;
    }
}
