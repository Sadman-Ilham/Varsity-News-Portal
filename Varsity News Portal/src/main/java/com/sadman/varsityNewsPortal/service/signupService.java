package com.sadman.varsityNewsPortal.service;

import com.sadman.varsityNewsPortal.database.dataRetrieve;
import com.sadman.varsityNewsPortal.database.databaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Sadman on 3/27/2015.
 */
public class signupService {

    private databaseConnection dbConnection;
    private dataRetrieve retrieve;
    private ResultSet resultSet;
    private String query;

    public signupService() throws SQLException{
        dbConnection = databaseConnection.createConnection();
        retrieve = new dataRetrieve(dbConnection);
    }

    public void insertNewUser(String email, String password) throws SQLException{
        /*query = "START TRANSACTION;\n" +
                "INSERT INTO user_login_table (user_login_emailID, user_login_password) VALUES ('" +email+ "', '" +password+ "');\n" +
                "INSERT INTO user_info_table (user_info_id, user_info_name, user_info_varsityID, user_info_gender, user_info_dob) VALUES (LAST_INSERT_ID(), '" +name+ "', " +varsityID+ ",'" +gender+ "', '" +dob+ "');\n" +
                "COMMIT;";*/
        query = "INSERT INTO user_login_table (user_login_emailID, user_login_password) VALUES ('" +email+ "', '" +password+ "');";
        Statement st = dbConnection.getStatement();
        int rs = st.executeUpdate(query);
    }

    public void insertNewUserInfo(int id, String name, int varsityID, String gender, String dob) throws SQLException{
        query = "Insert into user_info_table (user_info_id, user_info_name, user_info_varsityID, user_info_gender, user_info_dob) values("+id+", ' "+name+" ', "+varsityID+", ' "+gender+" ', ' "+dob+" ')";
        Statement st = dbConnection.getStatement();
        int rs = st.executeUpdate(query);
    }

    public int getUserIDByEmail(String email) throws SQLException{
        query = "select * from user_login_table where user_login_emailID = '" +email+ "'";
        resultSet = retrieve.getResultset(query);

        while(resultSet.next()){
            return resultSet.getInt("user_login_id");
        }
        return -1;
    }

}
