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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Untitled</title>\n");
      out.write("     \n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/fonts/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/Footer-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/Navigation-with-Button.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/styles.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">  \n");
      out.write("   \n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-light navbar-expand-md navigation-clean-button\">\n");
      out.write("        <div class=\"container\"><a class=\"navbar-brand\" href=\"index.jsp\">K&O</a><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav mr-auto\">\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item dropdown\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Access </a>\n");
      out.write("                        <div class=\"dropdown-menu\"><a class=\"dropdown-item\" href=\"indexUserLogin.jsp\">Clock-In</a><a class=\"dropdown-item\" href=\"indexUserLogout.jsp\">Clock-Out</a><a class=\"dropdown-item\" href=\"indexAdminLogin.jsp\">Admin Login</a></div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Create Account </a>\n");
      out.write("                        <div class=\"dropdown-menu\"><a class=\"dropdown-item\" href=\"indexAdminRegistration.jsp\">Create Admin Account</a><a class=\"dropdown-item\" href=\"indexUserRegistration.jsp\">Create User Account</a></div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Info </a>\n");
      out.write("                        <div class=\"dropdown-menu\"><a class=\"dropdown-item\" href=\"indexAboutCompany.jsp\">About</a><a class=\"dropdown-item\" href=\"indexCompanyMission.jsp\">Mission</a><a class=\"dropdown-item\" href=\"ohNo.jsp\">Contact</a></div>\n");
      out.write("                    </li>                 \n");
      out.write("                    \n");
      out.write("                </ul><span class=\"navbar-text actions\"> <a class=\"login\" href=\"indexAdminLogin.jsp\">Admin Log In</a><a class=\"btn btn-light action-button\" role=\"button\" href=\"indexAdminRegistration.jsp\">Admin Sign Up</a></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div data-bs-parallax-bg=\"true\" style=\"height:1000px;background-image:url(assetsJSP/css/images/mainPageBackgroundv2.png);background-position:center;background-size:cover;\"></div>\n");
      out.write("    <div class=\"footer-dark\">\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-md-3 item\">\n");
      out.write("                        <h3>Services</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Web design</a></li>\n");
      out.write("                            <li><a href=\"#\">Development</a></li>\n");
      out.write("                            <li><a href=\"#\">Hosting</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 col-md-3 item\">\n");
      out.write("                        <h3>About</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Company</a></li>\n");
      out.write("                            <li><a href=\"#\">Team</a></li>\n");
      out.write("                            <li><a href=\"#\">Careers</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 item text\">\n");
      out.write("                        <h3>K&amp;O</h3>\n");
      out.write("                        <p> K&O Personnel Management System is a web-based application that uses a database to access and store user data, so organizations can better track and monitor their employees.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col item social\">\n");
      out.write("                        <a  href=\"https://www.facebook.com/\" target=\"blank\"><i class=\"fa  fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"https://twitter.com/?lang=en\" target=\"blank\"><i class=\"fa  fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"https://myaccount.google.com/intro/profile\" target=\"blank\"><i class=\"fa  fa-google-plus\"></i></a>\n");
      out.write("                        <a href=\"https://www.youtube.com/\" target=\"blank\"><i class=\"fa  fa-youtube\"></i></a></div>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"copyright\">&nbsp;© 2021 KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
