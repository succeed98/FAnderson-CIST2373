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

@WebServlet("/LoginServletDB")
public class LoginServletDB extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id;
        String pw;
        try {
            id = request.getParameter("idTB");
            pw = request.getParameter("pwTB");
            System.out.println("id="+id+"pw="+pw);
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Immor\\Downloads\\CTC\\Java 3 - ACTIVE\\ChattBankMDB.mdb");
                System.out.println("Database is connected.....");  
                PreparedStatement stmt = con.prepareStatement("select CustID, CustPassword from Customers where CustID=? and CustPasword=?");
                stmt.setString(1,id);
                stmt.setString(2,pw);
                resultSet rs = stmt.executeQuery();
                                                           
                // page outputs 
                if (rs.next()) {
                out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Servlet LoginServlet </title>");   out.println("</head>");
				out.println("<body>");
				out.println("<h1> Valid Login </h1>");
				out.println("</body>");
				out.println("</ html>");
            }
            
            else{
                out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Servlet LoginServlet </title>");   out.println("</head>");
				out.println("<body>");
				out.println("<h1> InValid Login </h1>");
				out.println("</body>");
				out.println("</html>");
            }
        }
        
        catch (Exception e){
            System.out.println(e); 
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

} 