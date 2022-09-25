/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : AccountLookupServlet
    Created on : 19-Sep-2022, 9:20:05
    I Promise I wrote this code
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Business.Account;
import javax.servlet.RequestDispatcher;

@WebServlet(urlPatterns = {"/AccountLookupServlet"})
public class AccountLookupServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String accountNumber, password, email, balance;
            
            accountNumber = request.getParameter("accountNumber");
            password = request.getParameter("password");
            email = request.getParameter("email");
            balance = request.getParameter("balance");
            
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Password: " + password);
            System.out.println("Email: " + email);
            System.out.println("Balance: " + balance);
            
            Account account = new Account();
            account.selectDB(accountNumber);
            
            if (accountNumber.equals(account.getAcctNo())){
                System.out.println("Account exist...");
                HttpSession session1;
                session1 = request.getSession();
                session1.setAttribute("account", account);
                System.out.println("Customer added to session");
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
                rd.forward(request, response);
            }

        }finally {
            System.out.println("AccountLookupServlet  Finished...");
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
