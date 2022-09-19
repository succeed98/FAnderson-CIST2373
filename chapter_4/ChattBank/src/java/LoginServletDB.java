/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : LoginServletDB
    Created on : 04-Sep-2022, 11:50:05
    I Promise I wrote this code
*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet(urlPatterns = {"/LoginServletDB"})
public class LoginServletDB extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";
            String validate="";
            boolean userExist = false;
            
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection conn = DriverManager.getConnection(connURL);
                System.out.println("Connection is working");
                
                String customerId, password;
                customerId =  request.getParameter("customerId");
                password =  request.getParameter("password");
                
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM Customers WHERE CustID=? AND CustPassword=?");
                   
                ps.setString(1, customerId);
                ps.setString(2, password);
                
                ResultSet result = ps.executeQuery();
                
                userExist=result.next();
                
                validate = (userExist) ? ("Valid Login") : ("Invalid Login");
            } 
            catch(ClassNotFoundException | SQLException sqlExcptn) {
                System.out.println(sqlExcptn);
                System.out.println("Not working");
            }
            

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+ validate +"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
