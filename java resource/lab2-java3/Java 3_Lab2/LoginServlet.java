/*
* Instructor: Ron Enz
*  Lab #02
* Due: 9/9/2021
* Author:fareeda anderson  
* I promise that I wrote this code on my own
*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
       PrintWriter out = response.getWriter();
       String id = request.getParameter("id");
       String password = request.getParameter("password");
      
       if(null != id && null != password && id.equals("admin") && password.equals("123")) {
           response.sendRedirect("http://localhost:8080/ChattBank/Login.html");
       }else {
           out.println("InValid Login");
       }
   }

}