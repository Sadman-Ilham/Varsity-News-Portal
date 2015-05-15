package com.sadman.varsityNewsPortal.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sadman on 3/28/2015.
 */
public class userLogoutController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("userLogin");
        request.getSession().removeAttribute("userInfo");

        response.sendRedirect("home");
    }

}
