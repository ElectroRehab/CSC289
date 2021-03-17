package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexSystemLoginOption_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Security-Policy\" content=\"default-src;        \n");
      out.write("        script-src 'self' 'sha256-OzqmAO+SFutn2tx7ipegj2ASyYCgLzk+60O8Tb/3fkE=';     \n");
      out.write("        style-src 'report-sample' 'self' 'unsafe-inline' \n");
      out.write("        https://cdnjs.cloudflare.com https://fonts.googleapis.com; \n");
      out.write("        img-src 'self' data:; base-uri 'self'; object-src 'self'; \n");
      out.write("        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; \n");
      out.write("        frame-src 'self';  \n");
      out.write("        manifest-src 'self'; media-src 'self';  \n");
      out.write("        worker-src 'none';\">\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/loginStyleSheet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/popupLoginStyleSheet.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/styles.css\">\n");
      out.write("         \n");
      out.write("       \n");
      out.write("    </head>       \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"flex-container\">\n");
      out.write("        <div class=\"login-clean-admin\">          \n");
      out.write("            <form action=\"indexAdminSystemLoginAction.jsp\" method=\"post\" >  \n");
      out.write("                <div ><h1>Admin System</h1></div>              \n");
      out.write("                <div class=\"illustration\">                       \n");
      out.write("                    <img src=\"assetsJSP/css/images/iconfinder_Account_1891016.png\" alt=\"accountIcon\" width= \"60\"  height=\"60\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >                  \n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"adminID\" placeholder=\"Scan ID\"><br>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\"  type=\"password\" name=\"pinNum\" placeholder=\"Enter pin\"  required=\"\"><br>                    \n");
      out.write("                </div>  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\" btn-primary\" type=\"submit\">Login</button>             \n");
      out.write("                </div>                        \n");
      out.write("                     \n");
      out.write("            </form>        \n");
      out.write("        </div> \n");
      out.write("        </div >\n");
      out.write("        <div class=\"flex-container\">\n");
      out.write("        <div class=\"login-clean-user \">          \n");
      out.write("            <form action=\"indexAdminSystemLoginAction.jsp\" method=\"post\" >  \n");
      out.write("                <div ><h1>User System</h1></div>              \n");
      out.write("                <div class=\"illustration\">                       \n");
      out.write("                    <img src=\"assetsJSP/css/images/iconfinder_Account_1891016.png\" alt=\"accountIcon\" width= \"60\"  height=\"60\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >                  \n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"adminID\" placeholder=\"Scan ID\"><br>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\"  type=\"password\" name=\"pinNum\" placeholder=\"Enter pin\"  required=\"\"><br>                    \n");
      out.write("                </div>  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\" btn-primary\" type=\"submit\">Login</button>             \n");
      out.write("                </div>                        \n");
      out.write("                     \n");
      out.write("            </form>        \n");
      out.write("        </div> \n");
      out.write("        </div >\n");
      out.write("        <nav class=\"navbar navbar-light navbar-expand-md navigation-clean-button\">\n");
      out.write("             <div class=\"container\"><img class=\"item-co-logo\" src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"60\" width=\"60\">&nbsp;&nbsp;&nbsp;<a class=\"home-main\" href=\"indexSystemLoginOption.jsp\">K&O</a><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-1\">              \n");
      out.write("                    <span class=\"navbar-text actions\"> <a class=\"home-system-logout\" href=\"indexAdminLogin.jsp\"data-target=\"#admin-login\" data-toggle=\"modal\" >System Logout</a></span> \n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("        </nav> \n");
      out.write("        <div id=\"admin-login\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <button data-dismiss=\"modal\" class=\"close\">&times;</button>\n");
      out.write("            \n");
      out.write("                <form action=\"indexAdminLoginAction.jsp\" method=\"post\" >\n");
      out.write("                    <div ><h2>Admin Login</h2></div>              \n");
      out.write("                \n");
      out.write("                    <div class=\"form-group\" >                  \n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"adminID\" placeholder=\"Scan ID\"><br>\n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input class=\"form-control\"  type=\"password\" name=\"pinNum\" placeholder=\"Enter pin\"  required=\"\"><br>                    \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button class=\"home-popup-login\" type=\"submit\">Login</button>             \n");
      out.write("                    </div> \n");
      out.write("             \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    </div>\n");
      out.write("            <div><img class=\"image-main\"  src=\"assetsJSP/css/images/mainPageBackgroundv2.png\"</div>\n");
      out.write("\n");
      out.write("        <div class=\"sticky-footer\">\n");
      out.write("         <footer>      \n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>           \n");
      out.write("        </footer>             \n");
      out.write("        </div>        \n");
      out.write("    </body>\n");
      out.write("       <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\n");
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
