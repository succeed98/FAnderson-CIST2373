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
      out.write("          <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("\n");
      out.write("        <title>Welcome Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "components/navBar.jsp", out, false);
      out.write("</header>\n");
      out.write("        <section class=\"w-full p-4\">\n");
      out.write("            <div class=\"w-full flex flex-col items-center pt-12 gap-6\">\n");
      out.write("                <div class=\"w-full flex flex-col items-center justify-center gap-6\">\n");
      out.write("                    <h2 class=\"text-[#1967d2] text-6xl font-['Libre Baskerville,serif']\"> Fareeda's Dental Centre </h2>\n");
      out.write("                    <p>Best Dental Clinic In Georgia</p>\n");
      out.write("                    <p>Open 24/7</p>\n");
      out.write("                    <button class=\"border-2 w-1/6 bg-[#1967d2] hover:bg-[#48487f] text-white p-6\">Call Now 212 345 21</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w-3/4 p-12\">\n");
      out.write("                    <img src=\"https://neighborhoodmedicalcenter.org/wp-content/uploads/2018/03/bigstock-Portrait-Of-Dentist-And-Dental-92589275.jpg\" alt=\"employees\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
