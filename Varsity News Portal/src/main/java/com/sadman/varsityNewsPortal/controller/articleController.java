package com.sadman.varsityNewsPortal.controller;

import com.sadman.varsityNewsPortal.dto.newsDto;
import com.sadman.varsityNewsPortal.service.newsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Sadman on 3/28/2015.
 */
public class articleController extends HttpServlet {

    private int newsID;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        newsID = Integer.valueOf(request.getParameter("newsID"));
        try{
            newsService newsservice = new newsService();
            newsDto news = newsservice.getNewsByID(newsID);
        }catch(Exception e){}
    }

}
