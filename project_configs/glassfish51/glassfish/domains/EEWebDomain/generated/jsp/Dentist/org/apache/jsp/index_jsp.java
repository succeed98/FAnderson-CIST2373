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
      out.write("                background-color: #fff;\n");
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
      out.write("            .container {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            margin: auto;\n");
      out.write("            width: 800px;\n");
      out.write("            height: 600px;\n");
      out.write("        }\n");
      out.write("        /* ----- end of container stylings ----- */\n");
      out.write("  \n");
      out.write("        /* provides padding to main heading */\n");
      out.write("        .main-heading {\n");
      out.write("            padding: 2rem 0 2rem 0;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        .content {\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        /* ----- carousel content stylings ----- */\n");
      out.write("        /* places the carousel content on center of the carousel */\n");
      out.write("        .carousel-content {\n");
      out.write("            position: absolute;\n");
      out.write("            /*to center the content horizontally and vertically*/\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            transform: translate(-50%, -50%); \n");
      out.write("            text-align: center;\n");
      out.write("            z-index: 50;\n");
      out.write("        }\n");
      out.write("        .carousel-heading {\n");
      out.write("            font-size: 3rem;\n");
      out.write("            color: #308d46;\n");
      out.write("            margin-bottom: 1rem;\n");
      out.write("        }\n");
      out.write("        /*----- end of carousel content stylings ----- */\n");
      out.write("  \n");
      out.write("        /* ----- slideshow stylings ----- */\n");
      out.write("        .slideshow {\n");
      out.write("            height: 100%;\n");
      out.write("            overflow: hidden; /* to hide slides in x-direction */\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        /* wrapper which wraps all the slideshow images stylings */\n");
      out.write("        .slideshow-wrapper {\n");
      out.write("            display: flex;\n");
      out.write("            /* We give it width as 400% because we are making a \n");
      out.write("               4 image carousel. If you want to make for example, \n");
      out.write("               5 images carousel, then give width as 500%. */\n");
      out.write("            width: 400%;\n");
      out.write("            height: 100%;\n");
      out.write("            position: relative;\n");
      out.write("            /* you can change the animation settings from below */\n");
      out.write("            animation: slideshow 20s infinite;\n");
      out.write("         }\n");
      out.write("        /* define width and height for images*/\n");
      out.write("        .slide {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        .slide-img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            object-fit: cover; \n");
      out.write("        }\n");
      out.write("        /* @keyframes are used to provide animations\n");
      out.write("           We make these settings for 4 image carousel.\n");
      out.write("           Make modification according to your needs. */\n");
      out.write("        @keyframes slideshow {\n");
      out.write("            0%  { left: 0; }\n");
      out.write("            10% { left: 0; }\n");
      out.write("            15% { left: -100%; }\n");
      out.write("            25% { left: -100%; }\n");
      out.write("            30% { left: -200%; }\n");
      out.write("            40% { left: -200%; }\n");
      out.write("            45% { left: -300%; }\n");
      out.write("            55% { left: -300%; }\n");
      out.write("            60% { left: -200%; }\n");
      out.write("            70% { left: -200%; }\n");
      out.write("            75% { left: -100%; }\n");
      out.write("            85% { left: -100%; }\n");
      out.write("            90% { left: 0%; }\n");
      out.write("        }\n");
      out.write("        /* ----- end of slideshow stylings ----- */\n");
      out.write("  \n");
      out.write("        /* ----- carousel control buttons stylings ----- */\n");
      out.write("        .slide-btn {\n");
      out.write("            background-color: #bbb;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            border: .2rem solid #d38800;\n");
      out.write("            width: 1.2rem;\n");
      out.write("            height: 1.2rem;\n");
      out.write("            outline: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            /* stylings for positioning the buttons at\n");
      out.write("               the bottom of the carousel */\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 3%;\n");
      out.write("            left: 50%;\n");
      out.write("            transform: translateX(-50%);\n");
      out.write("            z-index: 70;\n");
      out.write("        }\n");
      out.write("        /* As we provide position as absolute, \n");
      out.write("        the buttons places one over the other. \n");
      out.write("        So, we have to place them individually\n");
      out.write("        at their correct positions. */\n");
      out.write("        .slide-btn-1 {\n");
      out.write("            left: 45%;\n");
      out.write("        }\n");
      out.write("        .slide-btn-2 {\n");
      out.write("            left: 50%;\n");
      out.write("        }\n");
      out.write("        .slide-btn-3 {\n");
      out.write("            left: 55%;\n");
      out.write("        }\n");
      out.write("        .slide-btn-4 {\n");
      out.write("            left: 60%;\n");
      out.write("        }\n");
      out.write("        /* When we focus on the particular button, \n");
      out.write("        the animation stops to that particular image \n");
      out.write("        to which the button is associated. */\n");
      out.write("        .slide-btn-1:focus~.slideshow-wrapper {\n");
      out.write("            animation: none;\n");
      out.write("            left: 0;\n");
      out.write("        }\n");
      out.write("        .slide-btn-2:focus~.slideshow-wrapper {\n");
      out.write("            animation: none;\n");
      out.write("            left: -100%;\n");
      out.write("        }\n");
      out.write("        .slide-btn-3:focus~.slideshow-wrapper {\n");
      out.write("            animation: none;\n");
      out.write("            left: -200%;\n");
      out.write("        }\n");
      out.write("        .slide-btn-4:focus~.slideshow-wrapper {\n");
      out.write("            animation: none;\n");
      out.write("            left: -300%;\n");
      out.write("        }\n");
      out.write("        /* when we focus on the button, the background color changes */\n");
      out.write("        .slide-btn:focus {\n");
      out.write("            background-color: #308d46;\n");
      out.write("        }\n");
      out.write("        /* ----- end of carousel control buttons stylings ----- */\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"custom-padding\"> \n");
      out.write("            <div class=\"nav-left\">\n");
      out.write("                <img class=\"img\" src=\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstatic.vecteezy.com%2Fsystem%2Fresources%2Fpreviews%2F000%2F562%2F550%2Foriginal%2Fdental-care-logo-template-illustration-design-vector-eps-10.jpg&f=1&nofb=1&ipt=3084998807994cedd8263f8c039c0c7b5ec35dc62a96591f50fb3eb07dea61b1&ipo=images\" alt='bank-logo'>\n");
      out.write("                <h1>Welcome To Dental Care</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-right\">\n");
      out.write("                <a href=\"./pages/Login.jsp\">Login</a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h1 class=\"main-heading\">A smile remains the most inexpensive gift...</h1>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- The content which is placed at the center of the carousel -->\n");
      out.write("\n");
      out.write("            <div class=\"slideshow\">\n");
      out.write("                <!-- carousel control buttons -->\n");
      out.write("                <button class=\"slide-btn slide-btn-1\"></button>\n");
      out.write("                <button class=\"slide-btn slide-btn-2\"></button>\n");
      out.write("                <button class=\"slide-btn slide-btn-3\"></button>\n");
      out.write("                <button class=\"slide-btn slide-btn-4\"></button>\n");
      out.write("                <!-- carousel wrapper which contains all images -->\n");
      out.write("                <div class=\"slideshow-wrapper\">\n");
      out.write("                    <div class=\"slide\">\n");
      out.write("                        <img class=\"slide-img\"\n");
      out.write("                            src=\n");
      out.write("\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fyegfitness.ca%2Fwp-content%2Fuploads%2F2019%2F03%2FGive-Your-Kids-Great-Dental-Care-e1552401648429.jpg&f=1&nofb=1&ipt=0b5e6704cbbcd85a145a49fbeec66e232075d0fd71c126f72dda1601d2e5102f&ipo=images\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"slide\">\n");
      out.write("                        <img class=\"slide-img\"\n");
      out.write("                            src=\n");
      out.write("\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.trbimg.com%2Fimg-5a4c0021%2Fturbine%2Fct-perspec-dental-therapists-dentists-teeth-health-care-0103-20180102&f=1&nofb=1&ipt=0d65958712a0d72125477ff6d33b0601a295323a32cc58fbf53c7283e07481ee&ipo=images\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"slide\">\n");
      out.write("                        <img class=\"slide-img\" src=\n");
      out.write("\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.2kXody5fehHa3zHaj-sEoAHaE8%26pid%3DApi&f=1&ipt=c5750cfa59e4b9be528f672c05e4bf82da61333a18ea66ad78d19ed0f732cadf&ipo=images\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"slide\">\n");
      out.write("                        <img class=\"slide-img\" src=\n");
      out.write("\"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.deansdentalcare.com%2Fwp-content%2Fuploads%2F2016%2F10%2FDeansDentalCareMens.jpg&f=1&nofb=1&ipt=df90b58eb5d0080f04a42a5187fd34c725a3d35bdf2204207f69e6bf0928fde9&ipo=images\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
