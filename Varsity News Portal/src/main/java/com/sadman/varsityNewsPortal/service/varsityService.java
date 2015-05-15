package com.sadman.varsityNewsPortal.service;

import com.sadman.varsityNewsPortal.database.dataRetrieve;
import com.sadman.varsityNewsPortal.database.databaseConnection;
import com.sadman.varsityNewsPortal.dto.varsityDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 3/26/2015.
 */
public class varsityService {

    private databaseConnection dbConnection;
    private dataRetrieve retrieve;
    private ResultSet resultSet;
    private varsityDto varsity;
    private List<varsityDto> varsityList;

    public varsityService() throws SQLException{
        dbConnection = databaseConnection.createConnection();
        retrieve = new dataRetrieve(dbConnection);
    }

    public List<varsityDto> getVarsity() throws SQLException{
        String query = "select * from varsity_table";
        resultSet = retrieve.getResultset(query);

        if(resultSet != null) return fillTheList();
        else return null;
    }

    public varsityDto getVarsityByID(int varsityID) throws SQLException{
        String query = "select * from varsity_table where varsity_id = " + varsityID;
        resultSet = retrieve.getResultset(query);

        if(resultSet != null) return fillTheObject();
        else return null;
    }

    public varsityDto getVarsityByAbbreviation(String varsityAbbreviation) throws SQLException{
        String query = "select * from varsity_table where varsity_abbreviation = '" + varsityAbbreviation + "'";
        resultSet = retrieve.getResultset(query);

        if(resultSet.next()) return fillTheObject();
        else return null;
    }

    private varsityDto fillTheObject() throws SQLException{
        varsity = new varsityDto();

        while(resultSet.next()){
            varsity.setVarsityID(resultSet.getInt("varsity_id"));
            varsity.setName(resultSet.getString("varsity_name"));
            varsity.setAbbreviation(resultSet.getString("varsity_abbreviation"));
            varsity.setNoOfFollowers(resultSet.getInt("varsity_noOfFollowers"));
        }

        return varsity;
    }

    private List<varsityDto> fillTheList() throws SQLException{
        varsityList = new ArrayList<varsityDto>();

        while(resultSet.next()){
            varsity = new varsityDto();
            varsity.setVarsityID(resultSet.getInt("varsity_id"));
            varsity.setName(resultSet.getString("varsity_name"));
            varsity.setAbbreviation(resultSet.getString("varsity_abbreviation"));
            varsity.setNoOfFollowers(resultSet.getInt("varsity_noOfFollowers"));

            varsityList.add(varsity);
        }

        return varsityList;
    }
}
