package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.ReadSessions;

public final class activateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("             \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("        <meta http-equiv=\"Content-Security-Policy\" content=\"default-src;  \r\n");
      out.write("         \r\n");
      out.write("        script-src 'self'  'sha256-JE0280krcqkShSI9tiB7uYMolH2Mp4kLOi+tnmU+JI4='    \r\n");
      out.write("        ;style-src 'report-sample' 'self' 'unsafe-inline' \r\n");
      out.write("        https://cdnjs.cloudflare.com https://fonts.googleapis.com; \r\n");
      out.write("        img-src 'self' data:; base-uri 'self'; object-src 'self';\r\n");
      out.write("        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; \r\n");
      out.write("        frame-src 'self';\r\n");
      out.write("        manifest-src 'self'; media-src 'self'; \r\n");
      out.write("        worker-src 'none';\">\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/registrationStyleSheet.css\">        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/Navigation-with-Button.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/styles.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/popupLoginStyleSheet.css\"> \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\r\n");
      out.write("        <title>User Activation</title>        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <nav class=\"navbar navbar-light navbar-expand-md navigation-clean-button\">\r\n");
      out.write("            <div class=\"container\"><img src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"60\" width=\"60\"><a class=\"user-login\" href=\"indexMainPage.jsp\">Home</a><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav mr-auto\">                                    \r\n");
      out.write("                    \r\n");
      out.write("                    </ul> \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div ><img class=\"image-reg\" src=\"assetsJSP/css/images/mainPageBackgroundv3.png\"</div>      \r\n");
      out.write("        <p id=\"random_number\"></p>        \r\n");
      out.write("    <div class=\"form-container\" >                          \r\n");
      out.write("            <h1 class=\"reg-form-title\">Complete the User Activation</h1>\r\n");
      out.write("           <form onsubmit=\"return validationForm()\" action=\"activateAccountAction.jsp\" method=\"post\" >                 \r\n");
      out.write("            <div class=\"section-one\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"userID\" placeholder=\"Enter Unique ID\" required=\"\" id=\"holder\"><br>                     \r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"section-two\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"activate\" placeholder=\"Enter Activation Code\" required=\"\"><br> \r\n");
      out.write("                    </div>   \r\n");
      out.write("                <button type=\"submit\" class=\"form-submit-button\">Confirm</button>\r\n");
      out.write("                    \r\n");
      out.write("                </div>                    \r\n");
      out.write("                         \r\n");
      out.write("                </div>              \r\n");
      out.write("            </form>       \r\n");
      out.write("    </div>\r\n");
      out.write("               \r\n");
      out.write("    <div class=\"flex-container\">             \r\n");
      out.write("        <footer>            \r\n");
      out.write("            <div class = \"sticky-footer\">           \r\n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>              \r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\r\n");
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
