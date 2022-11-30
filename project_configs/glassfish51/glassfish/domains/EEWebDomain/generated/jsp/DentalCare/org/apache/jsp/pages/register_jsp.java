package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <header>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../components/navBar.jsp", out, false);
      out.write("</header>\n");
      out.write("        <section class=\"h-screen\">\n");
      out.write("          <div class=\"container px-6 py-12 h-full\">\n");
      out.write("            <div class=\"flex justify-center items-center flex-wrap h-full g-6 text-gray-800\">\n");
      out.write("              <div class=\"md:w-8/12 lg:w-6/12 mb-12 md:mb-0\">\n");
      out.write("                <img src=\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fclipground.com%2Fimages%2Fcartoon-tooth-clipart-6.jpg&f=1&nofb=1&ipt=2f79236994fc46546c8d90f44da9c80d75e4fbf6efa86359754e4c252b9d8973&ipo=images\" class=\"relative w-full\" alt=\"wath illustration\" loading=\"lazy\" width=\"320\" height=\"280\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"w-full md:w-1/2 py-10 px-5 md:px-10\">\n");
      out.write("                <div class=\"text-center mb-10\">\n");
      out.write("                    <h1 class=\"font-bold text-3xl text-[#1967d2]\">REGISTER</h1>\n");
      out.write("                    <p>Enter your information to register</p>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <form action=\"http://localhost:31328/DentalCare/RegisterServlet\" method=\"post\" name=\"form\">\n");
      out.write("                        <div class=\"flex -mx-3\">\n");
      out.write("                            <div class=\"w-1/2 px-3 mb-5\">\n");
      out.write("                                <label for=\"\" class=\"text-xs font-semibold px-1\">First name</label>\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("                                    <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                    <input type=\"text\" name=\"firstName\" required class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"John\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"w-1/2 px-3 mb-5\">\n");
      out.write("                                <label for=\"\" class=\"text-xs font-semibold px-1\">Last name</label>\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("                                    <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                    <input type=\"text\" name=\"lastName\" required class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Smith\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"flex -mx-3\">\n");
      out.write("                            <div class=\"w-1/2 px-3 mb-5\">\n");
      out.write("                                <label for=\"\" class=\"text-xs font-semibold px-1\">Address</label>\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("                                    <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                    <input type=\"text\" name=\"addr\" required class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Address\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"w-1/2 px-3 mb-5\">\n");
      out.write("                                <label for=\"\" class=\"text-xs font-semibold px-1\">Insurance Company</label>\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("                                    <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                    <input type=\"text\" name=\"insCo\" required class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Insurance Company\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"flex -mx-3\">\n");
      out.write("                            <div class=\"w-full px-3 mb-5\">\n");
      out.write("                                <label for=\"\" class=\"text-xs font-semibold px-1\">Email</label>\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("                                    <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-email-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                    <input type=\"email\" name=\"email\" required class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"johnsmith@example.com\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"flex -mx-3\">\n");
      out.write("                            <div class=\"w-full px-3 mb-12\">\n");
      out.write("                                <label for=\"\" class=\"text-xs font-semibold px-1\">Password</label>\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("                                    <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-lock-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                    <input type=\"password\" name=\"passwd\" required class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"************\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"flex -mx-3\">\n");
      out.write("                            <div class=\"w-full px-3 mb-5\">\n");
      out.write("                                <input type=\"submit\" value=\"REGISTER NOW\" class=\"block w-full max-w-xs mx-auto bg-[#1967d2] hover:bg-[#48487f] focus:bg-indigo-700 text-white rounded-lg px-3 py-3 font-semibold\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
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
