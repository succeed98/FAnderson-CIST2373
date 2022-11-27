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
import Business.Appointment;
import Business.Procedure;
/**
 *
 * @author muhyideenelias
 */
@WebServlet(urlPatterns = {"/AddAppointmentServlet"})
public class AddAppointmentServlet extends HttpServlet {

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
        System.out.println("--> AddAppointmentServlet was called <---");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String dentId, patId,procName, procCode, apptDateTime, procDesc, cost;
            
            dentId = request.getParameter("dentId");
            patId = request.getParameter("patId");
            apptDateTime = request.getParameter("apptDateTime");
            procDesc = request.getParameter("procDesc");
            procName = request.getParameter("procName");
            procCode = "P" + String.valueOf(getRandomNumber());
            cost = String.valueOf(getRandomNumber());
            
            System.out.println(dentId + " " + patId + " " + procCode + " " + apptDateTime + " " + procName + " " + procDesc  + " $" + cost);
            
            Appointment appointment = new Appointment();
            appointment.insertAppointment(apptDateTime, patId, dentId, procCode);
            
            Procedure procedure = new Procedure();
            procedure.insertProcedure(procCode, procCode, procDesc, cost);
            
            RequestDispatcher rd = request.getRequestDispatcher("/pages/patient/viewAppointment.jsp");
            rd.forward(request, response);
            
            System.out.println("--> AddAppointmentServlet was closed <---");

            
        }
    }
    
    private int getRandomNumber() {
    return (int) ((Math.random() * (800 - 200)) + 200);
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
