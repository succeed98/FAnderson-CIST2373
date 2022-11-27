/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Business.*;
/**
 *
 * @author muhyideenelias
 */
@WebServlet(urlPatterns = {"/DentistHomeServlet"})
public class DentistHomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("---> DentistHomeServlet was called <---");
        try (PrintWriter out = response.getWriter()) {
            
            // get request parameters
            String id, firstName, lastName, email, office;
            id = request.getParameter("id");
            firstName =  request.getParameter("firstName");
            lastName = request.getParameter("lastName");
            email = request.getParameter("email");
            office = request.getParameter("office");
            System.out.println(id + " " + firstName + " " + lastName + " "+ email + " "  + office);
            
            Dentist dentist = new Dentist(); // create a new denttist object
            dentist.UpdateDentist(id, firstName, lastName, email, office); // updates dentist with new fields
            RequestDispatcher rd = request.getRequestDispatcher("/pages/dentist/home.jsp");
            rd.forward(request, response);
            
            System.out.println("---> DentistHomeServlet was closed <---");

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
