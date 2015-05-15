package com.sadman.varsityNewsPortal.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Sadman on 3/17/2015.
 */
public class dataRetrieve {
    private Statement statement;

    public dataRetrieve(databaseConnection dbConnection) throws SQLException{
        statement = dbConnection.getStatement();
    }

    public ResultSet getResultset(String query) throws SQLException{
        return statement.executeQuery(query);
    }
}
