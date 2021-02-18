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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/mainPage.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("       \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav>\n");
      out.write("                <a class=\"active\" href=\"\">Home</a>\n");
      out.write("\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t<button class=\"dropbtn\">Account\n");
      out.write("      \t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("    \t\t\t</button>\n");
      out.write("                    \n");
      out.write("    \t\t\t<div class=\"dropdown-content\">\n");
      out.write("      \t\t\t\t<a href=\"indexAdminLogin.jsp\">Admin Login </a>\n");
      out.write("                                <a href=\"indexUserLogin.jsp\">User Login</a>\n");
      out.write("                                <a href=\"indexUserLogout.jsp\">User LogOut</a>\n");
      out.write("                                <a href=\"indexAdminRegistration.jsp\">Create Admin Account</a>\n");
      out.write("                                <a href=\"indexUserRegistration.jsp\">Create User Account</a>\n");
      out.write("   \t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t \n");
      out.write("        \n");
      out.write("\t\t<a href=\"about\">About</a>\n");
      out.write("\t\t<a href=\"contact\">Contact</a>\n");
      out.write("\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t<button class=\"dropbtn\">Blank\n");
      out.write("      \t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("    \t\t\t</button>\n");
      out.write("    \t\t\t<div class=\"dropdown-content\">\n");
      out.write("      \t\t\t\t<a href=\"https://www.udemy.com/\">Udemy </a>\n");
      out.write("      \t\t\t\t<a href=\"https://www.w3schools.com/\">W3Schools</a>\n");
      out.write("      \t\t\t\t<a href=\"https://www.codecademy.com/\">Code Academy</a>\n");
      out.write("   \t\t\t </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("         <h1 style=\"font-size: 55px\">K&O Personnel Management System </h1>\n");
      out.write("        <div class=\"footer-dark\">\n");
      out.write("            <footer>                \n");
      out.write("                <div class=\"container\"> \n");
      out.write("                   \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-md-3 item\">\n");
      out.write("                            <h3>Services</h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Blank</a>                                    \n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Blank</a>                                    \n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Blank</a>                                    \n");
      out.write("                                </li>                                \n");
      out.write("                            </ul>                           \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div> \n");
      out.write("                   <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-md-3 item\">\n");
      out.write("                            <h3>Services</h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Blank</a>                                    \n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Blank</a>                                    \n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Blank</a>                                    \n");
      out.write("                                </li>                                \n");
      out.write("                            </ul>                           \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-md-6 item text\">\n");
      out.write("                        <p>Write info</p>                        \n");
      out.write("                    </div>                   \n");
      out.write("                </div>\n");
      out.write("                              \n");
      out.write("            </footer>                   \n");
      out.write("        </div> \n");
      out.write("        <div class=\"sticky-footer\">\n");
      out.write("         <footer>\n");
      out.write("            <h4 > Connect via social media</h4>\n");
      out.write("            <ul>                \n");
      out.write("                <li><a  href=\"https://www.facebook.com/\" target=\"blank\"><i class=\"fa  fa-facebook\"></i></a></li>\n");
      out.write("                <li><a href=\"https://twitter.com/?lang=en\" target=\"blank\"><i class=\"fa  fa-twitter\"></i></a></li>\n");
      out.write("                <li><a href=\"https://myaccount.google.com/intro/profile\" target=\"blank\"><i class=\"fa  fa-google-plus\"></i></a></li>\n");
      out.write("                <li><a href=\"https://www.youtube.com/\" target=\"blank\"><i class=\"fa  fa-youtube\"></i></a></li>\n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </footer>     \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         \n");
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
