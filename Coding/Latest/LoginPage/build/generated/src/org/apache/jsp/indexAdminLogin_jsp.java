package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexAdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/adminLoginStyleSheet.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>       \n");
      out.write("    <body>\n");
      out.write("           <nav>\n");
      out.write("               <div  >                    \n");
      out.write("                        <a href=\"index.jsp\">Home</a>             \n");
      out.write("               </div>           \n");
      out.write("           </nav>   \n");
      out.write("          <div class=\"login-clean\">          \n");
      out.write("            <form action=\"indexAdminLoginAction.jsp\" method=\"post\" >  \n");
      out.write("                <h1>Admin Login</h1>                \n");
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
      out.write("                <a href=\"indexAdminRegistration.jsp\"> Create an Admin Account</a>\n");
      out.write("                        <a class=\"forgot\" href=\"indexAdminRegistration.jsp\"> Forgot username or pin?</a>\n");
      out.write("            </form>        \n");
      out.write("        </div>        \n");
      out.write("        <div class=\"sticky-footer\">\n");
      out.write("         <footer>      \n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>           \n");
      out.write("        </footer>             \n");
      out.write("        </div>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
