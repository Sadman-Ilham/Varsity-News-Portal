package com.sadman.varsityNewsPortal.service;

import com.sadman.varsityNewsPortal.database.dataRetrieve;
import com.sadman.varsityNewsPortal.database.databaseConnection;
import com.sadman.varsityNewsPortal.dto.userLoginDto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sadman on 3/27/2015.
 */
public class userLoginService {

    private databaseConnection dbConnection;
    private dataRetrieve retrieve;
    private ResultSet resultSet;
    private String query;

    public userLoginService() throws SQLException{
        dbConnection = databaseConnection.createConnection();
        retrieve = new dataRetrieve(dbConnection);
    }

    public userLoginDto varify(String email, String password) throws SQLException{
        query = "select * from user_login_table where user_login_emailID = '" + email + "' and user_login_password = '" + password + "'";
        resultSet = retrieve.getResultset(query);

        userLoginDto login = new userLoginDto();
        while(resultSet.next()){
            login.setUserLoginID(resultSet.getInt("user_login_id"));
            login.setEmail(resultSet.getString("user_login_emailID"));
            return login;
        }
        return null;
    }

}
