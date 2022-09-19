package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ChattBank Home</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("                  background-color: #f1f4f8; ;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            header {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-content: center;\n");
      out.write("                background-color: #F9F9F8;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-left {\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                gap: 2px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            img {\n");
      out.write("                height: 70px;\n");
      out.write("                width: 80px;  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-left h1 {\n");
      out.write("                align-self: center;\n");
      out.write("                color: #61dafb;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-right {\n");
      out.write("                display: flex;\n");
      out.write("                align-content: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-self: center;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-right a {\n");
      out.write("                align-self: center;\n");
      out.write("                   color: #61dafb;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .custom-padding {\n");
      out.write("                padding: 0 1% 0 1%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"custom-padding\"> \n");
      out.write("            <div class=\"nav-left\">\n");
      out.write("                <img class=\"img\" src=\"https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.pngmart.com%2Ffiles%2F5%2FBank-PNG-Pic.png&f=1&nofb=1\" alt='bank-logo'>\n");
      out.write("                <h1>Welcome To ChattBank</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-right\">\n");
      out.write("                <a href=\"./pages/login.jsp\">Login</a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
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
