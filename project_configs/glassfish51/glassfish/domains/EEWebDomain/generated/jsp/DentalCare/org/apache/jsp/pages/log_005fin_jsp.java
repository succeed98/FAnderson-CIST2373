package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sign In</title>\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../components/navBar.jsp", out, false);
      out.write("</header>\n");
      out.write("        <section class=\"h-screen\">\n");
      out.write("          <div class=\"container px-6 py-12 h-full\">\n");
      out.write("            <div class=\"flex justify-center items-center flex-wrap h-full g-6 text-gray-800\">\n");
      out.write("              <div class=\"md:w-8/12 lg:w-6/12 mb-12 md:mb-0\">\n");
      out.write("                <img src=\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fclipground.com%2Fimages%2Fcartoon-tooth-clipart-6.jpg&f=1&nofb=1&ipt=2f79236994fc46546c8d90f44da9c80d75e4fbf6efa86359754e4c252b9d8973&ipo=images\" class=\"relative w-full\" alt=\"wath illustration\" loading=\"lazy\" width=\"320\" height=\"280\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"md:w-8/12 lg:w-5/12 lg:ml-20 flex flex-col gap-16\">\n");
      out.write("                  <div class=\"text-center mb-10\">\n");
      out.write("                    <h3 class=\"text-[#1967d2] text-3xl font-['Libre Baskerville,serif'] mx-4 mb-0 font-bold\">Sign In</h3>\n");
      out.write("                    <p>Enter your information to sign in</p>\n");
      out.write("                  </div>\n");
      out.write("                <form>\n");
      out.write("                  <!-- Email input -->\n");
      out.write("                  <div class=\"mb-6\">\n");
      out.write("                    <input\n");
      out.write("                      type=\"text\"\n");
      out.write("                      class=\"form-control block w-full px-4 py-2 text-xl font-normal text-gray-700 bg-white bg-clip-padding border border-solid border-gray-300 rounded transition ease-in-out m-0 focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none\"\n");
      out.write("                      placeholder=\"Email address\"\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Password input -->\n");
      out.write("                  <div class=\"mb-6\">\n");
      out.write("                    <input\n");
      out.write("                      type=\"password\"\n");
      out.write("                      class=\"form-control block w-full px-4 py-2 text-xl font-normal text-gray-700 bg-white bg-clip-padding border border-solid border-gray-300 rounded transition ease-in-out m-0 focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none\"\n");
      out.write("                      placeholder=\"Password\"\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"flex justify-between items-center mb-6\">\n");
      out.write("                    <div class=\"form-group form-check\">\n");
      out.write("                      <input\n");
      out.write("                        type=\"checkbox\"\n");
      out.write("                        class=\"form-check-input appearance-none h-4 w-4 border border-gray-300 rounded-sm bg-white checked:bg-[#48487f]blue-600 checked:border-blue-600 focus:outline-none transition duration-200 mt-1 align-top bg-no-repeat bg-center bg-contain float-left mr-2 cursor-pointer\"\n");
      out.write("                        id=\"exampleCheck3\"\n");
      out.write("                        checked\n");
      out.write("                      />\n");
      out.write("                      <label class=\"text-[#48487f] form-check-label inline-block text-gray-800\" for=\"exampleCheck2\"\n");
      out.write("                        >Remember me</label\n");
      out.write("                      >\n");
      out.write("                    </div>\n");
      out.write("                    <a\n");
      out.write("                      href=\"#!\"\n");
      out.write("                      class=\"text-[#48487f] hover:text-blue-700 focus:text-blue-700 active:text-blue-800 duration-200 transition ease-in-out\"\n");
      out.write("                      >Forgot password?</a\n");
      out.write("                    >\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Submit button -->\n");
      out.write("                  <div class=\"w-full px-3 mb-5\">\n");
      out.write("                        <button class=\"block w-full max-w-xs mx-auto bg-[#1967d2] hover:bg-[#48487f] focus:bg-indigo-700 text-white rounded-lg px-3 py-3 font-semibold\">SIGN IN</button>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("<!--                  <div\n");
      out.write("                    class=\"flex items-center my-4 before:flex-1 before:border-t before:border-gray-300 before:mt-0.5 after:flex-1 after:border-t after:border-gray-300 after:mt-0.5\"\n");
      out.write("                  >\n");
      out.write("                    <p class=\"text-center font-semibold mx-4 mb-0\">OR</p>\n");
      out.write("                  </div>-->\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
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
