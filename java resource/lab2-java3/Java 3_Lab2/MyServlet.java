*
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

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id;
        try{
                // page outputs 
                out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Servlet MyServlet </title>");            
				out.println("</head>");
				out.println("<body>");
				out.println("<h1> Go Brave </h1>");
				out.println("</body>");
				out.println("</html>");
            }
        } 

    // doGet() Method
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    // doPost() Method
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

} //end processRequest()
