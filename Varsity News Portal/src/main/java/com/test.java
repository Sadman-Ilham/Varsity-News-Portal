package com;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.sadman.varsityNewsPortal.database.databaseConnection;
import com.sadman.varsityNewsPortal.database.dataRetrieve;

/**
 * Created by Sadman on 3/8/2015.
 */
public class test extends HttpServlet {

    private ResultSet res;

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        PrintWriter writer = response.getWriter();
        writer.println(name);

        try {
            databaseConnection dbConnection = databaseConnection.createConnection();

            String query = "select * from user_login_table";
            dataRetrieve dataretrieve = new dataRetrieve(dbConnection);
            res = dataretrieve.getResultset(query);

            while (res.next()) {
                String email = res.getString("user_login_emailID");
                writer.println(email);
                String uname = res.getString("user_login_password");
                writer.println(uname);
            }
        } catch (Exception e) {
            System.out.println("Error in Connection: " + e);
        }
    }
}
