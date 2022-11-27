/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.Patient;
import Business.Dentist;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author muhyideenelias
 */
@WebServlet(urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            System.out.println("---> LoginServlet was called <---");
            
            String email, passwd;
            email =  request.getParameter("email");
            passwd =  request.getParameter("passwd");
            String dentistOrNot = request.getParameter("dentistOrNot");
            
            if(dentistOrNot == null){ // checks to see if dentist checkbox was ticked or ot
                Patient patient = new Patient();
                patient.selectPatient(email);
                if (passwd.equals(patient.getPasswd())){ // compares the input password with the fetched password from database
                    HttpSession session;
                    session = request.getSession(); // get current session
                    session.setAttribute("patient", patient); // set new patient object to session

                    RequestDispatcher rd = request.getRequestDispatcher("/pages/patient/home.jsp");
                    rd.forward(request, response);

                    System.out.println("Patient added to session");
                }else {
                    RequestDispatcher rd = request.getRequestDispatcher("/pages/ErrorPage.jsp");
                    rd.forward(request, response);
                    System.out.println("! Wrong Credentials, redirecting to ErrorPage.jsp");
                }
                
            } else {             
                Dentist dentist = new Dentist(); // creates new dentist object
                dentist.selectDentist(email); // base on email, selects record with such email
                if (passwd.equals(dentist.getPasswd())){ // compares the input password with the fetched password from database
                    HttpSession session;
                    session = request.getSession();
                    session.setAttribute("dentist", dentist);

                    RequestDispatcher rd = request.getRequestDispatcher("/pages/dentist/home.jsp");
                    rd.forward(request, response);

                    System.out.println("Dentist added to session");
                }else {
                    RequestDispatcher rd = request.getRequestDispatcher("/pages/ErrorPage.jsp");
                    rd.forward(request, response);
                    System.out.println("! Wrong Credentials, redirecting to ErrorPage.jsp");
                }
            }     
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
