/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : LoginServlet
    Created on : 03-Sep-2022, 10:50:05
    I Promise I wrote this code
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import Business.*;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            System.out.println("LoginServlet Running...");
            
            String customerId, password;
            customerId =  request.getParameter("customerId");
            password =  request.getParameter("password");
            
            System.out.println("CustomerID: " + customerId);
            System.out.println("Password: " + password);
            
            Customer customer = new Customer();
            customer.selectDB(customerId);
            System.out.println("Customer First Name: " + customer.getCustFirstName());
         
            if (password.equals(customer.getCustPassword())){
                RequestDispatcher rd = request.getRequestDispatcher("/accountLookup.jsp");
                rd.forward(request, response);
                
                // put the Customer object in the Session.  
                HttpSession session1;
                session1 = request.getSession();
                session1.setAttribute("customer", customer);

                System.out.println("Customer added to session");
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
                rd.forward(request, response);
            }

        }  finally {
            System.out.println("LoginServlet  Finished...");
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
