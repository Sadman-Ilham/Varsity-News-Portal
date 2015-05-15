package com.sadman.varsityNewsPortal.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.sadman.varsityNewsPortal.dto.varsityDto;
import com.sadman.varsityNewsPortal.service.newsService;
import com.sadman.varsityNewsPortal.dto.newsDto;
import com.sadman.varsityNewsPortal.service.varsityService;

/**
 * Created by Sadman on 3/17/2015.
 */
public class homeController extends HttpServlet {

    private List<newsDto> topNews, recentNews;
    private List<varsityDto> varsityList;

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try{
            newsService newsservice = new newsService();
            topNews = newsservice.getTopNews();
            recentNews = newsservice.getRecentNews();

            request.setAttribute("topNews", topNews);
            request.setAttribute("recentNews", recentNews);

            varsityService varsityservice = new varsityService();
            varsityList = varsityservice.getVarsity();

            request.setAttribute("varsityList", varsityList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
            dispatcher.forward(request, response);
        }catch(Exception ex){}
    }

}
