package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AccountLookup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Chatt Bank Account Lookup</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("            .input-container {\n");
      out.write("                width: 100%;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap: .7rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                padding: 20px 24px;\n");
      out.write("                width: 100%;\n");
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
      out.write("                    <h1>ChattBank Account Lookup</h1>\n");
      out.write("                </nav>\n");
      out.write("                <form action=\"http://localhost:31328/ChattBank/AccountLookupServlet\" method=\"post\" class=\"card\">\n");
      out.write("                    <input name=\"accountNumber\" type=\"text\" Placeholder=\"Enter account number\"/>\n");
      out.write("                    <input name=\"password\" type=\"password\" Placeholder=\"Enter your customer ID\"/>\n");
      out.write("                    <input name=\"email\" type=\"email\" Placeholder=\"Enter account type\"/>\n");
      out.write("                    <input name=\"balance\" type=\"password\" Placeholder=\"Enter your balance\"/>\n");
      out.write("                    <input type=\"submit\" value=\"Lookup\"/>\n");
      out.write("                    <input type=\"button\" value=\"Clear\" />\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
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
