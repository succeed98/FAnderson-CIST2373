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
      out.write("            <link rel=\"stylesheet\" href=\"css/tailus.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Urbanist:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family : Urbanist, sans-serif;\n");
      out.write("/*            @apply bg-white dark:bg-gray-900*/\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-active .hamburger div:first-child {\n");
      out.write("/*            @apply rotate-45 translate-y-1.5;*/\n");
      out.write("        }\n");
      out.write("        .navbar-active .hamburger div:last-child {\n");
      out.write("/*            @apply -rotate-45 -translate-y-1;*/\n");
      out.write("        }\n");
      out.write("        .navbar-active div:first-child div:first-child div:last-child{\n");
      out.write("/*            @apply block lg:flex*/\n");
      out.write("        }\n");
      out.write("    </style>  \n");
      out.write("        <title>Welcome Page</title>\n");
      out.write("    </head>\n");
      out.write("<body class=\"bg-white dark:bg-gray-900\">\n");
      out.write("    <header>\n");
      out.write("        <input type=\"checkbox\" name=\"hbr\" id=\"hbr\" class=\"hbr peer\" hidden aria-hidden=\"true\">\n");
      out.write("        <nav class=\"fixed z-20 w-full bg-white/90 dark:bg-gray-900/80 backdrop-blur navbar shadow-2xl shadow-gray-600/5 border-b border-gray-100 dark:border-gray-800 peer-checked:navbar-active dark:shadow-none\">\n");
      out.write("            <div class=\"xl:container m-auto px-6 md:px-12 lg:px-6\">\n");
      out.write("                <div class=\"flex flex-wrap items-center justify-between gap-6 md:py-3 md:gap-0 lg:py-5\">\n");
      out.write("                    <div class=\"w-full items-center flex justify-between lg:w-auto\">\n");
      out.write("                        <a class=\"flex gap-4 items-center\" href=\"#\" aria-label=\"logo\">\n");
      out.write("                            <img class=\"h-12 w-12\" src=\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fclipground.com%2Fimages%2Fcartoon-tooth-clipart-6.jpg&f=1&nofb=1&ipt=2f79236994fc46546c8d90f44da9c80d75e4fbf6efa86359754e4c252b9d8973&ipo=images\"  alt=\"logo\" loading=\"lazy\" >\n");
      out.write("                            <h4 class=\" font-black text-blue-900 text-2xl  text-center  dark:text-white relative text-transparent bg-clip-text bg-gradient-to-r from-blue-600 to-cyan-500 dark:from-blue-400 dark:to-cyan-300\">Farees Dental Care </h4>\n");
      out.write("                        </a>\n");
      out.write("                        <label for=\"hbr\" class=\"peer-checked:hamburger block relative z-20 p-6 -mr-6 cursor-pointer lg:hidden\">\n");
      out.write("                            <div aria-hidden=\"true\" class=\"m-auto h-0.5 w-5 rounded bg-gray-900 dark:bg-gray-300 transition duration-300\"></div>\n");
      out.write("                            <div aria-hidden=\"true\" class=\"m-auto mt-2 h-0.5 w-5 rounded bg-gray-900 dark:bg-gray-300 transition duration-300\"></div>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navmenu hidden w-full flex-wrap justify-end items-center mb-16 space-y-8 p-6 border border-gray-100 rounded-3xl shadow-2xl shadow-gray-300/20 bg-white dark:bg-gray-800 lg:space-y-0 lg:p-0 lg:m-0 lg:flex md:flex-nowrap lg:bg-transparent lg:w-7/12 lg:shadow-none dark:shadow-none dark:border-gray-700 lg:border-0\">\n");
      out.write("                        <div class=\"text-gray-600 dark:text-gray-300 lg:pr-4\">\n");
      out.write("                            <ul class=\"space-y-6 tracking-wide font-medium text-base lg:text-sm lg:flex lg:space-y-0\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block md:px-4 transition hover:text-primary dark:hover:text-primaryLight\">\n");
      out.write("                                        <span>Home</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block md:px-4 transition hover:text-primary dark:hover:text-primaryLight\">\n");
      out.write("                                        <span>Portfolio</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block md:px-4 transition hover:text-primary dark:hover:text-primaryLight\">\n");
      out.write("                                        <span>Services</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <div class=\"w-full space-y-2 border-primary/10 dark:border-gray-700 flex flex-col -ml-1 sm:flex-row lg:space-y-0 md:w-max lg:border-l\">\n");
      out.write("                            <a href=\"/DentalCare/pages/register.jsp\" class=\"relative flex h-9 ml-auto items-center justify-center sm:px-6 before:absolute before:inset-0 before:rounded-full focus:before:bg-sky-600/10 dark:focus:before:bg-sky-400/10 before:transition before:duration-300 hover:before:scale-105 active:duration-75 active:before:scale-95\">\n");
      out.write("                                <span class=\"relative text-sm font-semibold text-primary dark:text-primaryLight\">Sign Up</span>                    \n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"/DentalCare/pages/log_in.jsp\" class=\"relative flex h-9 ml-auto items-center justify-center sm:px-6 before:absolute before:inset-0 before:rounded-full before:bg-sky-600 dark:before:bg-sky-400 before:transition before:duration-300 hover:before:scale-105 active:duration-75 active:before:scale-95\">\n");
      out.write("                                <span class=\"relative text-sm font-semibold text-white dark:text-gray-900\">Login</span>                    \n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    <div class=\"bg-white relative pt-40 pb-20 lg:pt-44 dark:bg-gray-900\">\n");
      out.write("        <div class=\"relative xl:container m-auto px-6 md:px-12 lg:px-6\">\n");
      out.write("            <h1 class=\"sm:mx-auto sm:w-10/12 md:w-2/3 font-black text-blue-900 text-4xl text-center sm:text-5xl md:text-6xl lg:w-auto lg:text-left xl:text-7xl dark:text-white\">A better life starts with a beautiful smile. <br class=\"lg:block hidden\"> <span class=\"relative text-transparent bg-clip-text bg-gradient-to-r from-blue-600 to-cyan-500 dark:from-blue-400 dark:to-cyan-300\">Laugh more, stress less</span>.</h1>\n");
      out.write("            <div class=\"lg:flex\">\n");
      out.write("                <div class=\"relative mt-8 md:mt-16 space-y-8 sm:w-10/12 md:w-2/3 lg:ml-0 sm:mx-auto text-center lg:text-left lg:mr-auto lg:w-7/12\">\n");
      out.write("                    <p class=\"sm:text-lg text-gray-700 dark:text-gray-300 lg:w-11/12\">\n");
      out.write("                        Many adults cannot afford dental care, especially our community’s most vulnerable<br> residents.\n");
      out.write("                        From clearing up painful dental infections and being able to eat again to <br> rejoining the workforce,\n");
      out.write("                        Farees Dental Care helps those desperately in need of <br>dental care become pain-free and smile confidently again.\n");
      out.write("                    </p>\n");
      out.write("                    <span class=\"block font-semibold text-gray-500 dark:text-gray-400\">The best live changing dental care.</span>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"mt-12 md:mt-0 lg:absolute -right-10 lg:w-7/12\">\n");
      out.write("                    <div class=\"relative w-full\">\n");
      out.write("                        <div aria-hidden=\"true\" class=\"absolute scale-75 md:scale-110 inset-0 m-auto w-full h-full md:w-96 md:h-96 rounded-full rotate-45 bg-gradient-to-r from-sky-500 to-cyan-300 blur-3xl\"></div>\n");
      out.write("                        <img src=\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fclipground.com%2Fimages%2Fcartoon-tooth-clipart-6.jpg&f=1&nofb=1&ipt=2f79236994fc46546c8d90f44da9c80d75e4fbf6efa86359754e4c252b9d8973&ipo=images\" class=\"relative w-full\" alt=\"wath illustration\" loading=\"lazy\" width=\"320\" height=\"280\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
