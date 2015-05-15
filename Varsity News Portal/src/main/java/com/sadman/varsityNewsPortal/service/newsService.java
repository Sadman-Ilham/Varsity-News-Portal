package com.sadman.varsityNewsPortal.service;

import com.sadman.varsityNewsPortal.dto.newsDto;
import com.sadman.varsityNewsPortal.database.databaseConnection;
import com.sadman.varsityNewsPortal.database.dataRetrieve;
import com.sadman.varsityNewsPortal.dto.userInfoDto;
import com.sadman.varsityNewsPortal.dto.varsityDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 3/17/2015.
 */
public class newsService {

    private List<newsDto> newsList;
    private databaseConnection dbConnection;
    private dataRetrieve retrieve;
    private ResultSet resultSet;
    private String query;

    public newsService() throws SQLException{
        dbConnection = databaseConnection.createConnection();
        retrieve = new dataRetrieve(dbConnection);
    }

    public List<newsDto> getTopNews() throws SQLException{
        query = "select * from news_table order by news_noOfView desc limit 5";
        resultSet = retrieve.getResultset(query);

        if(resultSet != null) return fillTheList();
        else return null;
    }

    public List<newsDto> getRecentNews() throws  SQLException{
        query = "select * from news_table order by news_date desc limit 21";
        resultSet = retrieve.getResultset(query);

        if(resultSet != null) return fillTheList();
        else return null;
    }

    public List<newsDto> getVarsityNews(int varsityID) throws  SQLException{
        query = "select * from news_table where news_varsityID = " +varsityID;
        resultSet = retrieve.getResultset(query);

        if(resultSet != null) return fillTheList();
        else return null;
    }

    public newsDto getNewsByID(int newsID) throws SQLException{
        query = "select * from news_table where news_id = '" + newsID + "'";
        resultSet = retrieve.getResultset(query);

        newsDto news = new newsDto();
        news.setNewsID(resultSet.getInt("news_id"));
        news.setTitle(resultSet.getString("news_title"));
        news.setDetails(resultSet.getString("news_details"));
        news.setImageLocation(resultSet.getString("news_image"));

        news.setReporterID(resultSet.getInt("news_reporterID"));
        //news.setReporterName(getUserName(news.getReporterID()));

        news.setDate(resultSet.getString("news_date"));
        news.setLike(resultSet.getInt("news_noOfLike"));
        news.setView(resultSet.getInt("news_noOfView"));

        news.setVarsityID(resultSet.getInt("news_varsityID"));

        news.setReporterName(getUserName(news.getReporterID()));

        varsityDto varsity = getVarsityInfo(news.getVarsityID());
        news.setVarsityName(varsity.getName());
        news.setVarsityAbbreviation(varsity.getAbbreviation());

        return news;
    }

    private List<newsDto> fillTheList() throws SQLException{
        newsList = new ArrayList<newsDto>();

        while(resultSet.next()){
            newsDto news = new newsDto();
            news.setNewsID(resultSet.getInt("news_id"));
            news.setTitle(resultSet.getString("news_title"));
            news.setDetails(resultSet.getString("news_details"));
            news.setImageLocation(resultSet.getString("news_image"));

            news.setReporterID(resultSet.getInt("news_reporterID"));
            //news.setReporterName(getUserName(news.getReporterID()));

            news.setDate(resultSet.getString("news_date"));
            news.setLike(resultSet.getInt("news_noOfLike"));
            news.setView(resultSet.getInt("news_noOfView"));

            news.setVarsityID(resultSet.getInt("news_varsityID"));
            /*varsityDto varsity = getVarsityInfo(news.getVarsityID());
            news.setVarsityName(varsity.getName());
            news.setVarsityAbbreviation(varsity.getAbbreviation());*/

            newsList.add(news);
        }

        for (newsDto news : newsList){
            news.setReporterName(getUserName(news.getReporterID()));
        }

        for (newsDto news : newsList){
            varsityDto varsity = getVarsityInfo(news.getVarsityID());
            news.setVarsityName(varsity.getName());
            news.setVarsityAbbreviation(varsity.getAbbreviation());
        }

        return newsList;
    }

    private String getUserName(int userID) throws SQLException{
        userInfoService userservice = new userInfoService();
        userInfoDto user = userservice.getUserByID(userID);

        return user.getName();
    }

    private varsityDto getVarsityInfo(int varsityID) throws SQLException{
        varsityService varsityservice = new varsityService();
        varsityDto varsity = varsityservice.getVarsityByID(varsityID);

        return varsity;
    }
}
