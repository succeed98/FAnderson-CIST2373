package org.apache.jsp.pages.patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.*;
import java.util.*;

public final class addAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/tailwindcss-jit-cdn\"></script>\n");
      out.write("        <title>Add Appointment</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover\" style=\"background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');\">        \n");
      out.write("        ");
 Patient patient = (Patient)session.getAttribute("patient");
           ProcedureList procedures  = patient.procedures;
           Procedure procedureArray [] = procedures.getProcedure();
        
      out.write("\n");
      out.write("        ");

            if (procedures.counter > 0) {
                response.sendRedirect("/DentalCare/pages/patient/notAllowed.jsp");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <header>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pages/patient/components/navBar.jsp", out, false);
      out.write("</header>\n");
      out.write("\n");
      out.write("        <div class=\"max-w-4xl flex items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0\">\n");
      out.write("            <form action=\"http://localhost:31328/DentalCare/AddAppointmentServlet\" method=\"post\" name=\"form\" class=\"w-full lg:w-4/5 rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-65 mx-6 lg:mx-0\">\n");
      out.write("                <div class=\"p-4 md:p-12 text-center lg:text-left\">\t\t\n");
      out.write("                    <h1 class=\"text-3xl font-bold pt-8 pb-8 lg:pt-0\">Add Appointment </h1>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-1/2 px-3 mb-5 hidden\">\n");
      out.write("                            <label for=\"\" class=\"text-xs font-semibold px-1\"></label>\n");
      out.write("                            <div class=\"flex hidden\">\n");
      out.write("                                <input type=\"text\" name=\"email\" value=\"");
      out.print( patient.getEmail() );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"textarea\" name=\"patId\" value=\"");
      out.print( patient.getPatId());
      out.write("\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none min-h-18 focus:border-indigo-500\" placeholder=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("                            <select class=\"form-select appearance-none\n");
      out.write("                                block\n");
      out.write("                                w-full\n");
      out.write("                                px-3\n");
      out.write("                                py-1.5\n");
      out.write("                                text-base\n");
      out.write("                                font-normal\n");
      out.write("                                text-gray-700\n");
      out.write("                                bg-white bg-clip-padding bg-no-repeat\n");
      out.write("                                border border-solid border-gray-300\n");
      out.write("                                rounded\n");
      out.write("                                transition\n");
      out.write("                                ease-in-out\n");
      out.write("                                m-0\n");
      out.write("                                focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none\" aria-label=\"Default select example\" name=\"procName\">\n");
      out.write("                                  <option selected>Select a procedure</option>\n");
      out.write("                                  <option value=\"Cleaning/Examinations\">Cleaning/Examinations</option>\n");
      out.write("                                  <option value=\"X-rays\">X-rays</option>\n");
      out.write("                                  <option value=\"Whitening\">Whitening</option>\n");
      out.write("                                  <option value=\"Cavity\">Cavity</option>\n");
      out.write("                                  <option value=\"Top Dentures\">Top Dentures</option>\n");
      out.write("                                  <option value=\"Bottom Dentures\">Bottom Dentures</option>\n");
      out.write("                                  <option value=\"Crown\">Crown</option>\n");
      out.write("                                  <option value=\"Root Canal\">Root Canal</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("<!--                            <label for=\"\" class=\"text-xs font-semibold px-1\">Email</label>-->\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-email-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"text\" name=\"procDesc\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Enter Procedure Description\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("<!--                            <label for=\"\" class=\"text-xs font-semibold px-1\">Address</label>-->\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-email-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"text\" name=\"apptDateTime\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Enter Appointment date and time (May 14, 2022, 1pm)\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <select class=\"form-select appearance-none\n");
      out.write("                                block\n");
      out.write("                                w-full\n");
      out.write("                                px-3\n");
      out.write("                                py-1.5\n");
      out.write("                                text-base\n");
      out.write("                                font-normal\n");
      out.write("                                text-gray-700\n");
      out.write("                                bg-white bg-clip-padding bg-no-repeat\n");
      out.write("                                border border-solid border-gray-300\n");
      out.write("                                rounded\n");
      out.write("                                transition\n");
      out.write("                                ease-in-out\n");
      out.write("                                m-0\n");
      out.write("                                focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none\" aria-label=\"Default select example\" name=\"dentId\">\n");
      out.write("                                  <option selected>Select Your Dentist</option>\n");
      out.write("                                  <option value=\"D201\">Frank Martin</option>\n");
      out.write("                                  <option value=\"D202\">Susan Cassidy</option>\n");
      out.write("                                  <option value=\"D203\">Jerry York</option>\n");
      out.write("                                  <option value=\"D204\">Wayne Pettersen</option>\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pt-12 pb-8 flex items-center justify-center\">\n");
      out.write("                        <button class=\"bg-green-700 hover:bg-green-1000 text-white font-bold py-2 px-4 rounded\">\n");
      out.write("                            Add Appointment\n");
      out.write("                        </button> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/popper.js@1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/tippy.js@4\"></script>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
