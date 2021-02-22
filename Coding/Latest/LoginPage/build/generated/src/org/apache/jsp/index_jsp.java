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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/mainPage.css\">\r\n");
      out.write("        <meta charset=\"UTF-8\">        \r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>       \r\n");
      out.write("    <body> \r\n");
      out.write("        <div class=\"image\">            \r\n");
      out.write("            <div><img src=\"assetsJSP/css/images/mainPageBackgroundv2.png\" class=\"image \" alt=”K&OLogo” ></div>              \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flex-container\" >            \r\n");
      out.write("            <nav>              \r\n");
      out.write("                <a class=\"active\" href=\"\">Home</a>                \r\n");
      out.write("\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t    <button class=\"dropbtn\">Account\r\n");
      out.write("      \t\t        <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    \t\t    </button>                    \r\n");
      out.write("    \t        <div class=\"dropdown-content\">\r\n");
      out.write("      \t\t    <a href=\"indexAdminLogin.jsp\">Admin Login </a>\r\n");
      out.write("                    <a href=\"indexUserLogin.jsp\">User Login</a>\r\n");
      out.write("                    <a href=\"indexUserLogout.jsp\">User LogOut</a>\r\n");
      out.write("                    <a href=\"indexAdminRegistration.jsp\">Create Admin Account</a>\r\n");
      out.write("                    <a href=\"indexUserRegistration.jsp\">Create User Account</a>\r\n");
      out.write("   \t        </div>\r\n");
      out.write("\t\t</div>     \r\n");
      out.write("                    <a href=\"ohNo.jsp\">About</a>\r\n");
      out.write("                    <a href=\"ohNo.jsp\">Contact</a>\r\n");
      out.write("\t\t<div class=\"dropdown\" id=\"wrapper\">\r\n");
      out.write("                    <button class=\"dropbtn\">Blank\r\n");
      out.write("      \t\t\t<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("    \t\t<div class=\"dropdown-content\">\r\n");
      out.write("      \t            <a href=\"https://www.udemy.com/\">Udemy </a>\r\n");
      out.write("      \t\t    <a href=\"https://www.w3schools.com/\">W3Schools</a>\r\n");
      out.write("      \t\t    <a href=\"https://www.codecademy.com/\">Code Academy</a>\r\n");
      out.write("   \t\t</div>\r\n");
      out.write("\t\t</div>                \r\n");
      out.write("            </nav>         \r\n");
      out.write("        </div>        \r\n");
      out.write("        <div class=\"flex-container\"> \r\n");
      out.write("            \r\n");
      out.write("            <footer>\r\n");
      out.write("             \r\n");
      out.write("                <div class = \"sticky-footer\">\r\n");
      out.write("             \r\n");
      out.write("                    <h4 > Connect via social media</h4>\r\n");
      out.write("                        <ul>                \r\n");
      out.write("                            <li><a  href=\"https://www.facebook.com/\" target=\"blank\"><i class=\"fa  fa-facebook\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"https://twitter.com/?lang=en\" target=\"blank\"><i class=\"fa  fa-twitter\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"https://myaccount.google.com/intro/profile\" target=\"blank\"><i class=\"fa  fa-google-plus\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"https://www.youtube.com/\" target=\"blank\"><i class=\"fa  fa-youtube\"></i></a></li>               \r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>            \r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>              \r\n");
      out.write("        </div>      \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
