package org.apache.jsp.pages.dentist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.*;

public final class viewAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Appointment Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover\" style=\"background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');\">\n");
      out.write("        ");

            Dentist dentist = (Dentist)session.getAttribute("dentist");
            ProcedureList procedures  = dentist.procedures;
            Procedure procedureArray [] = procedures.getProcedure();
        
      out.write("\n");
      out.write("        <header>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pages/dentist/components/navBar.jsp", out, false);
      out.write("</header>\n");
      out.write("        <div class=\"max-w-8xl flex justify-center items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0\">\n");
      out.write("           <div class=\"flex flex-col w-full  rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-65 mx-6 lg:mx-0>\n");
      out.write("                <div class=\"overflow-x-auto sm:-mx-6 lg:-mx-8\">\n");
      out.write("                  <div class=\"py-2 inline-block min-w-full sm:px-6 lg:px-8\">\n");
      out.write("                    <div class=\"overflow-hidden\">\n");
      out.write("                      <table class=\"min-w-full\">\n");
      out.write("                        <thead class=\"bg-white border-b\">\n");
      out.write("                          <tr>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              #\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                             Patient Name\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              Email\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              Code\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              Date\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              Procedure\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              Description\n");
      out.write("                            </th>\n");
      out.write("                            <th scope=\"col\" class=\"text-xl font-medium text-gray-900 px-6 py-4 text-left\">\n");
      out.write("                              Cost\n");
      out.write("                            </th>\n");
      out.write("                          </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                          ");
 for(int i = 0; i < procedures.counter; i++) {
      out.write("\n");
      out.write("                            <tr class=\"bg-white border-b transition duration-300 ease-in-out hover:bg-gray-100\">\n");
      out.write("                              <td class=\"px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900\">");
      out.print( i + 1);
      out.write("</td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                ");
      out.print( procedureArray[i].getPatientFirstName() + " " + procedureArray[i].getPatientLastName());
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                ");
      out.print( procedureArray[i].getPatientEmail() );
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                ");
      out.print( procedureArray[i].getProcCode() );
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                ");
      out.print( procedureArray[i].getAptDateTime() );
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                  ");
      out.print( procedureArray[i].getProcName() );
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                  ");
      out.print( procedureArray[i].getProcDesc() );
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                              <td class=\"text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap\">\n");
      out.write("                                  ");
      out.print( procedureArray[i].getCost() );
      out.write("\n");
      out.write("                              </td>\n");
      out.write("                            </tr>\n");
      out.write("                          ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                      </table>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
