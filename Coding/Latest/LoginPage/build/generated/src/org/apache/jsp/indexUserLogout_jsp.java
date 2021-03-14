package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexUserLogout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("         <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("        <meta http-equiv=\"Content-Security-Policy\" content=\"default-src;        \r\n");
      out.write("        script-src 'self';     \r\n");
      out.write("        style-src 'report-sample' 'self' 'unsafe-inline' \r\n");
      out.write("        https://cdnjs.cloudflare.com https://fonts.googleapis.com; \r\n");
      out.write("        img-src 'self' data:; base-uri 'self'; object-src 'self'; \r\n");
      out.write("        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; \r\n");
      out.write("        frame-src 'self';  \r\n");
      out.write("        manifest-src 'self'; media-src 'self';  \r\n");
      out.write("        worker-src 'none';\">\r\n");
      out.write("        <title>Logout</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/loginStyleSheet.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("       \r\n");
      out.write("    </head>     \r\n");
      out.write("    <body class=\"body2\">         \r\n");
      out.write("         <div class=\"image\">            \r\n");
      out.write("            <div><img src=\"assetsJSP/css/images/mainPageBackgroundv2.png\" class=\"image \" alt=”K&OLogo” ></div>              \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flex-container\">   \r\n");
      out.write("            <div class=\"login-clean\">            \r\n");
      out.write("                <form action=\"indexUserLogoutAction.jsp\" method=\"post\" >  \r\n");
      out.write("                    <h1>User Logout</h1>                \r\n");
      out.write("                    <div class=\"illustration\">                    \r\n");
      out.write("                        <img src=\"assetsJSP/css/images/iconfinder_Account_1891016.png\" width=\"60\" height=\"60\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">                  \r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"userID\" placeholder=\"Scan ID\"><br>\r\n");
      out.write("                    </div>   \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input class=\"form-control\"  type=\"password\" name=\"pinCode\" placeholder=\"Enter pin\"  required=\"\"><br>                    \r\n");
      out.write("                    </div>  \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button class=\"btn btn-primary btn-block\" type=\"submit\">Log Out</button>             \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"indexUserRegistration.jsp\"> Create a user Account</a>\r\n");
      out.write("                    <a class=\"forgot\" href=\"indexUserRegistration.jsp\"> Forgot username or pin?</a>\r\n");
      out.write("                </form>   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("        <div class=\"flex-container\">\r\n");
      out.write("           <nav>\r\n");
      out.write("               <div  >                    \r\n");
      out.write("                    <a href=\"index.jsp\">Home</a> \r\n");
      out.write("                    <a href=\"indexUserLogin.jsp\">Login</a>\r\n");
      out.write("               </div>           \r\n");
      out.write("           </nav>   \r\n");
      out.write("        </div>          \r\n");
      out.write("        <div class=\"sticky-footer\">\r\n");
      out.write("            <footer>      \r\n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>           \r\n");
      out.write("            </footer>             \r\n");
      out.write("        </div> \r\n");
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
