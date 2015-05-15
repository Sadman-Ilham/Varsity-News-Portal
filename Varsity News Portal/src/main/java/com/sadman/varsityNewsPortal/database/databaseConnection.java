package com.sadman.varsityNewsPortal.database;

import java.sql.*;

/**
 * Created by Sadman on 3/17/2015.
 */
public class databaseConnection {

    private Connection connection;
    private Statement statement;
    private static databaseConnection databaseconnection = null;

    private databaseConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/varsitynewsportaldb", "root", "root");
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println("Error in Connection: " + e);
        }
    }

    public static databaseConnection createConnection(){
        if(databaseconnection == null){
            databaseconnection = new databaseConnection();
            return databaseconnection;
        }
        else return databaseconnection;
    }

    public Statement getStatement(){
        return statement;
    }
}
