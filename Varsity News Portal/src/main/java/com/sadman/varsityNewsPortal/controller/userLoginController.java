package com.sadman.varsityNewsPortal.controller;

import com.sadman.varsityNewsPortal.dto.userInfoDto;
import com.sadman.varsityNewsPortal.dto.userLoginDto;
import com.sadman.varsityNewsPortal.service.userInfoService;
import com.sadman.varsityNewsPortal.service.userLoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sadman on 3/27/2015.
 */
public class userLoginController extends HttpServlet {

    private String email;
    private String password;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        email = request.getParameter("email");
        password = request.getParameter("password");

        try{
            userLoginService userloginservice = new userLoginService();
            userLoginDto userLogin = userloginservice.varify(email, password);

            userInfoService userinfoservice = new userInfoService();
            userInfoDto userInfo = userinfoservice.getUserByID(userLogin.getUserLoginID());

            if(userLogin != null){
                request.getSession().setAttribute("userLogin", userLogin);
                request.getSession().setAttribute("userInfo", userInfo);
                response.sendRedirect("home");
            }
            else response.sendRedirect("login");
        }catch(Exception e){}
    }

}
