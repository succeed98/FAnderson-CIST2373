package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.Customer;
import Business.AccountList;
import Business.Account;

public final class DisplayAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("/*\n");
      out.write("    Author     : Fareeda Anderson\n");
      out.write("    Programme  : Java III\n");
      out.write("    Document   : DisplayAccount.jsp\n");
      out.write("    Created on : 03-Oct-2022, 07:20:05\n");
      out.write("    I Promise I wrote this code\n");
      out.write("*/\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ChattBank Display Account</title>\n");
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
      out.write("            \n");
      out.write("            table{\n");
      out.write("                table-layout: fixed;\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border: 3px solid #dedede;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            td {\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #406b9e;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .break td{\n");
      out.write("                background-color: #dedede;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .cust-info-header {\n");
      out.write("                padding-left: 30%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("/*            .output-container {\n");
      out.write("                width: 100%;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap: .7rem;\n");
      out.write("                 \n");
      out.write("            }*/\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            Customer customer = (Customer)session.getAttribute("customer");
            AccountList aList  = customer.aList;
            Account accountArray [] = aList.getAccountArray();
        
      out.write("\n");
      out.write("        <main> \n");
      out.write("\n");
      out.write("            <div class=\"main-container\">\n");
      out.write("                <nav class=\"nav\"> \n");
      out.write("                    <img class=\"img\" src=\"https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.pngmart.com%2Ffiles%2F5%2FBank-PNG-Pic.png&f=1&nofb=1\" alt='bank-logo'>\n");
      out.write("                    <h1>Display Account</h1>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer != null}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <h3 class=\"cust-info-header\"> Customer Information </h3>\n");
          out.write("                        <table class=\"output-container\">\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Customer ID:\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getCustId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    First Name:\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getCustFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            \n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Last Name:\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getCustLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Address:\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getCustAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Email:\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getCustEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        </table>\n");
          out.write("                        \n");
          out.write("                        <h3 class=\"cust-info-header\"> Account Information </h3>\n");
          out.write("                        <table>\n");
          out.write("                            ");
 for(int i = 0; i < aList.counter; i++) {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>\n");
          out.write("                                        Account #:\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        ");
          out.print( accountArray[i].getAcctNo());
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                \n");
          out.write("                                <tr>\n");
          out.write("                                    <td>\n");
          out.write("                                        Account Type:\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        ");
          out.print( accountArray[i].getAcctNo());
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                \n");
          out.write("                                <tr>\n");
          out.write("                                    <td>\n");
          out.write("                                        Account Balance:\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        ");
          out.print( accountArray[i].getBalance());
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                ");
if(i != aList.counter - 1){
          out.write("\n");
          out.write("                                    <tr class=\"break\">\n");
          out.write("                                        <td></td>\n");
          out.write("                                        <td></td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
}
          out.write("\n");
          out.write("                            ");
}
          out.write("\n");
          out.write("                        </table>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer == null}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <h1>No Account related to ");
          out.print(customer.getCustId());
          out.write("</h1>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
