/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : FailedLoginServlet
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

public class FailedLoginServlet extends HttpServlet {

    
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
            System.out.println("Customer Last Name: " + customer.getCustLastName());
            
            System.out.println("############ an error occured before redirection: " + out.checkError());
            
            String errorPage  = "/pages/ErroPage.jsp";
            String displayAccount = "/pages/DisplayAccount.jsp";
            
            String onSuccess = (password.equals(customer.getCustPassword())) ? displayAccount : errorPage;
            System.out.println("$$$$ an error occured before redirection: " + out.checkError());
            RequestDispatcher rd = request.getRequestDispatcher(onSuccess);
            System.out.println("****** an error occured before redirection: " + out.checkError());

            rd.forward(request, response);

            
//            if (password.equals(customer.getCustPassword())){
//               RequestDispatcher rd = request.getRequestDispatcher("/pages/DisplayAccount.jsp");
//               rd.forward(request, response);
//               HttpSession session;
//               session = request.getSession();
//               session.setAttribute("customer", customer);
//               System.out.println("Customer added to session");
           // } else {
//                rd = request.getRequestDispatcher("/pages/ErrorPage.jsp"); 
//
//            }
            
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
