package com.sadman.varsityNewsPortal.controller;

import com.sadman.varsityNewsPortal.dto.newsDto;
import com.sadman.varsityNewsPortal.dto.varsityDto;
import com.sadman.varsityNewsPortal.service.newsService;
import com.sadman.varsityNewsPortal.service.varsityService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Sadman on 3/29/2015.
 */
public class newsController extends HttpServlet {

    private List<newsDto> topNews;
    private List<newsDto> recentNews;
    private List<newsDto> varsityNews;
    private List<varsityDto> varsityList;
    private varsityDto varsity;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        /*String type = request.getParameter("type");

        try{
            varsityService varsityservice = new varsityService();
            varsityList = varsityservice.getVarsity();
            request.setAttribute("varsityList", varsityList);

            newsService newsservice = new newsService();
            if(type.equals("tn")){
                topNews = newsservice.getTopNews();
                request.setAttribute("topNews", topNews);
                RequestDispatcher dispatcher = request.getRequestDispatcher("newsList.jsp");
                dispatcher.forward(request, response);
            }else if(type.equals("rn")){
                recentNews = newsservice.getRecentNews();
                request.setAttribute("recentNews", recentNews);
                RequestDispatcher dispatcher = request.getRequestDispatcher("newsList.jsp");
                dispatcher.forward(request, response);
            }else{
                varsity = new varsityService().getVarsityByAbbreviation(type);
                varsityNews = newsservice.getVarsityNews(varsity.getVarsityID());
                request.setAttribute("varsityNews", varsityNews);
                RequestDispatcher dispatcher = request.getRequestDispatcher("newsList.jsp");
                dispatcher.forward(request, response);
            }
        }catch(Exception e){
            response.getWriter().write(e.toString());
        }*/

        PrintWriter out = response.getWriter();

        String type = request.getParameter("type");

        try{
            varsityService varsityservice = new varsityService();
            varsityList = varsityservice.getVarsity();

            request.setAttribute("varsityList", varsityList);

            newsService newsservice = new newsService();

            if(type.equals("tn")){
                topNews = newsservice.getTopNews();
                request.setAttribute("topNews", topNews);

                RequestDispatcher dispatcher = request.getRequestDispatcher("newsList.jsp");
                dispatcher.forward(request, response);
            }else if(type.equals("rn")){
                recentNews = newsservice.getRecentNews();
                request.setAttribute("recentNews", recentNews);

                RequestDispatcher dispatcher = request.getRequestDispatcher("newsList.jsp");
                dispatcher.forward(request, response);
            }else{
                try {
                    varsityDto varsity = varsityservice.getVarsityByAbbreviation(type);
                    varsityNews = newsservice.getVarsityNews(varsity.getVarsityID());
                    request.setAttribute("varsityNews", varsityNews);
                    request.setAttribute("size", varsityNews.size());
                }catch (Exception e){
                    response.getWriter().write(e.toString());
                }

                RequestDispatcher dispatcher = request.getRequestDispatcher("newsList.jsp");
                dispatcher.forward(request, response);
            }
        }catch(Exception ex){}
    }

}
