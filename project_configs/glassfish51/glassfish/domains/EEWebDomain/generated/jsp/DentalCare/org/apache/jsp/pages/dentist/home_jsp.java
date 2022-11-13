package org.apache.jsp.pages.dentist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <title>Home Page</title>\n");
      out.write("    </head>\n");
      out.write("<body class=\"font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover\" style=\"background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');\">        \n");
      out.write("    <header>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pages/patients/components/navBar.jsp", out, false);
      out.write("</header>\n");
      out.write("        \n");
      out.write("<!--    <div class=\"max-w-4xl flex items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0\">\n");
      out.write("\t<div id=\"profile\" class=\"w-full lg:w-4/5 rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-75 mx-6 lg:mx-0\">\n");
      out.write("\t\t<div class=\"p-4 md:p-12 text-center lg:text-left\">\t\t\n");
      out.write("                    <h1 class=\"text-3xl font-bold pt-8 lg:pt-0\">Your Name</h1>\n");
      out.write("                    <div class=\"mx-auto lg:mx-0 w-4/5 pt-3 border-b-2 border-green-500 opacity-25\"></div>\n");
      out.write("                    <p class=\"pt-4 text-base font-bold flex items-center justify-center lg:justify-start\"><svg class=\"h-4 fill-current text-green-700 pr-4\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 20 20\"><path d=\"M9 12H1v6a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-6h-8v2H9v-2zm0-1H0V5c0-1.1.9-2 2-2h4V2a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v1h4a2 2 0 0 1 2 2v6h-9V9H9v2zm3-8V2H8v1h4z\"/></svg> What you do</p>\n");
      out.write("                    <p class=\"pt-2 text-gray-600 text-xs lg:text-sm flex items-center justify-center lg:justify-start\"><svg class=\"h-4 fill-current text-green-700 pr-4\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 20 20\"><path d=\"M10 20a10 10 0 1 1 0-20 10 10 0 0 1 0 20zm7.75-8a8.01 8.01 0 0 0 0-4h-3.82a28.81 28.81 0 0 1 0 4h3.82zm-.82 2h-3.22a14.44 14.44 0 0 1-.95 3.51A8.03 8.03 0 0 0 16.93 14zm-8.85-2h3.84a24.61 24.61 0 0 0 0-4H8.08a24.61 24.61 0 0 0 0 4zm.25 2c.41 2.4 1.13 4 1.67 4s1.26-1.6 1.67-4H8.33zm-6.08-2h3.82a28.81 28.81 0 0 1 0-4H2.25a8.01 8.01 0 0 0 0 4zm.82 2a8.03 8.03 0 0 0 4.17 3.51c-.42-.96-.74-2.16-.95-3.51H3.07zm13.86-8a8.03 8.03 0 0 0-4.17-3.51c.42.96.74 2.16.95 3.51h3.22zm-8.6 0h3.34c-.41-2.4-1.13-4-1.67-4S8.74 3.6 8.33 6zM3.07 6h3.22c.2-1.35.53-2.55.95-3.51A8.03 8.03 0 0 0 3.07 6z\"/></svg> Your Location - 25.0000° N, 71.0000° W</p>\n");
      out.write("                    <p class=\"pt-8 text-sm\">Totally optional short description about yourself, what you do and so on.</p>\n");
      out.write("\n");
      out.write("                    <div class=\"pt-12 pb-8\">\n");
      out.write("                            <button class=\"bg-green-700 hover:bg-green-900 text-white font-bold py-2 px-4 rounded-full\">\n");
      out.write("                              Get In Touch\n");
      out.write("                            </button> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>-->\n");
      out.write("        <div class=\"max-w-4xl flex items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0\">\n");
      out.write("            <form action=\"http://localhost:31328/ChattBank/LoginServlet\" method=\"post\" name=\"form\" class=\"w-full lg:w-4/5 rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-75 mx-6 lg:mx-0\">\n");
      out.write("                <div class=\"p-4 md:p-12 text-center lg:text-left\">\t\t\n");
      out.write("                    <h1 class=\"text-3xl font-bold pt-8 lg:pt-0\">Update Your Information </h1>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-1/2 px-3 mb-5\">\n");
      out.write("                            <label for=\"\" class=\"text-xs font-semibold px-1\">First name</label>\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"text\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"John\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w-1/2 px-3 mb-5\">\n");
      out.write("                            <label for=\"\" class=\"text-xs font-semibold px-1\">Last name</label>\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-account-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"text\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Smith\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("                            <label for=\"\" class=\"text-xs font-semibold px-1\">Email</label>\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-email-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"text\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"johnsmith@example.com\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("                            <label for=\"\" class=\"text-xs font-semibold px-1\">Address</label>\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-email-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"text\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Address\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex -mx-3\">\n");
      out.write("                        <div class=\"w-full px-3 mb-5\">\n");
      out.write("                            <label for=\"\" class=\"text-xs font-semibold px-1\">Phone #</label>\n");
      out.write("                            <div class=\"flex\">\n");
      out.write("                                <div class=\"w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center\"><i class=\"mdi mdi-email-outline text-gray-400 text-lg\"></i></div>\n");
      out.write("                                <input type=\"email\" class=\"w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500\" placeholder=\"Phone #\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pt-12 pb-8 flex items-center justify-center\">\n");
      out.write("\t\t\t<button class=\"bg-green-700 hover:bg-green-1000 text-white font-bold py-2 px-4 rounded-full\">\n");
      out.write("                            Get In Touch\n");
      out.write("\t\t\t</button> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\t<script src=\"https://unpkg.com/popper.js@1/dist/umd/popper.min.js\"></script>\n");
      out.write("\t<script src=\"https://unpkg.com/tippy.js@4\"></script>\n");
      out.write("        \n");
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
