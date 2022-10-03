package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ChattBank Login</title>\n");
      out.write("        <style> \n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: 'Outfit', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            main {\n");
      out.write("                background-color: #f1f4f8;\n");
      out.write("                height: 100vh;\n");
      out.write("                width: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .main-container {\n");
      out.write("                width: 30%;\n");
      out.write("                min-height: 4rem;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap: .7rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav {\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                align-content: center;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav img {\n");
      out.write("                height: 70px;\n");
      out.write("                width: 80px;  \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-size: 28px;\n");
      out.write("                color: #042f62;\n");
      out.write("                align-self: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card{\n");
      out.write("                display: flex;\n");
      out.write("                gap: .5rem;\n");
      out.write("                flex-direction: column;\n");
      out.write("                width: 100%;\n");
      out.write("                min-height: 7rem;\n");
      out.write("                background-color: white;\n");
      out.write("                box-shadow: 0px 8px 16px -4px rgba(22, 34, 51, 0.08);\n");
      out.write("                border-radius: 4px;\n");
      out.write("                padding: 32px 48px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .forgot-pass {\n");
      out.write("                display:flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .forgot-pass p {\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: #2f445b;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-container {\n");
      out.write("                /*display: flex;*/\n");
      out.write("                /*border: 1px solid blue;*/\n");
      out.write("                width: 100%;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap: .7rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                padding: 20px 24px;\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input::placeholder{\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-button {\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-button button {\n");
      out.write("                padding: 20px 24px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #095fc3;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main> \n");
      out.write("\n");
      out.write("            <div class=\"main-container\">\n");
      out.write("                <nav class=\"nav\"> \n");
      out.write("                    <img class=\"img\" src=\"https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.pngmart.com%2Ffiles%2F5%2FBank-PNG-Pic.png&f=1&nofb=1\" alt='bank-logo'>\n");
      out.write("                    <h1>Chatt Bank Login</h1>\n");
      out.write("                </nav>\n");
      out.write("                <form action=\"http://localhost:31328/ChattBank/LoginServlet\" method=\"post\" name=\"form\" class=\"card\">\n");
      out.write("                    <input label=\"customer-id\" type=\"text\" name=\"customerId\" class=\"input-click\" id=\"customer-id\" Placeholder=\"Enter your Customer ID\"/>\n");
      out.write("                    <input label=\"Password\" class=\"input-with-onclick\" type=\"password\" name=\"password\" id=\"password\" Placeholder=\"Enter your password\" autocomplete=\"on\"/>\n");
      out.write("                    <input type=\"submit\" value=\"Login\"/>\n");
      out.write("                    <input type=\"button\" value=\"Clear\"/>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"forgot-pass\">\n");
      out.write("                    <p>Forgot password?</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
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
