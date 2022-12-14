/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Business.Appointment;
import Business.Patient;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author muhyideenelias
 */
@WebServlet(urlPatterns = {"/UpdateDentistAppointmentServlet"})
public class UpdateDentistAppointmentServlet extends HttpServlet {

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
        System.out.println("---> UpdateDentistAppointmentServlet was called <---");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String procCode = request.getParameter("procCode");
            String apptDateTime = request.getParameter("apptDateTime");
            String patientEmail = request.getParameter("email");
            
            System.out.println(patientEmail + " " +procCode + " " + apptDateTime);
            
            Appointment appointment = new Appointment();
            appointment.UpdateDentistAppointment(procCode, apptDateTime);
            
            Patient patient = new Patient();
            patient.selectPatient(patientEmail);
            HttpSession session;
            session = request.getSession(); // get current session
            session.setAttribute("patient", patient); // set new patient object to session
            
            out.println("<script type=\"text/JavaScript\">");
            out.println("alert(\"Update Successful\")");
            out.println("</script>");
            
            RequestDispatcher rd = request.getRequestDispatcher("/pages/patient/viewAppointment.jsp");
            rd.forward(request, response);
            
            
            System.out.println("---> UpdateDentistAppointmentServlet was closed <---");
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
