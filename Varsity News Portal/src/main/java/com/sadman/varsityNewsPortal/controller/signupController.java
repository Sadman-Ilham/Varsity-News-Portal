package com.sadman.varsityNewsPortal.controller;

import com.sadman.varsityNewsPortal.dto.varsityDto;
import com.sadman.varsityNewsPortal.service.signupService;
import com.sadman.varsityNewsPortal.service.varsityService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Sadman on 3/27/2015.
 */
public class signupController extends HttpServlet {

    private String email;
    private String password;
    private String confirmPassword;
    private String name;
    private String varsityAbbreviation;
    private String gender;
    private String date, month, year, dob;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try{
            email = request.getParameter("email");
            password = request.getParameter("password");
            confirmPassword = request.getParameter("confirmPassword");
            name = request.getParameter("name");
            varsityAbbreviation = request.getParameter("varsityAbbreviation");
            if(request.getParameter("gender").equals("male")) gender = "m";
            else gender = "f";
            date = request.getParameter("date");
            if(Integer.valueOf(date)<10) date = "0" + date;
            month = request.getParameter("month");
            if(Integer.valueOf(month)<10) month = "0" + month;
            year = request.getParameter("year");
            dob = date + "-" + month + "-" + year;

            varsityService varsityservice = new varsityService();
            varsityDto varsity = varsityservice.getVarsityByAbbreviation(varsityAbbreviation);

            signupService signupservice = new signupService();
            signupservice.insertNewUser(email, password);

            int id = signupservice.getUserIDByEmail(email);
            signupservice.insertNewUserInfo(id, name, varsity.getVarsityID(), gender, dob);

            response.sendRedirect("login");
        }catch(Exception e){}
    }

}
