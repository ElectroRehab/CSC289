package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexAdminRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <p id=\"random_number\"></p>\n");
      out.write("    ");

        // Long Integer for first 6 digits of random barcode
        long first = Math.round(Math.random() *999999);
       // Long Integer for second 6 digits of random barcode
        long second = Math.round(Math.random() *999999);
        // Link integers into one 12 character string barcode. 
        String linked = Long.toString(first) + 
                Long.toString(second);
    
      out.write("\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"assetsJSP/css/registrationStyleSheet.css\">\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Admin Registration</title>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav>\n");
      out.write("               <div class= \"main_home\" >                    \n");
      out.write("                        <a href=\"index.jsp\">Home</a>    \n");
      out.write("                        <a href=\"indexAdminLogin.jsp\">Login</a>  \n");
      out.write("               </div>           \n");
      out.write("           </nav> \n");
      out.write("        \n");
      out.write("          <h1>Admin Registration</h1>\n");
      out.write("        <div class=\"reg-box\">             \n");
      out.write("           <h1>Complete the Registration Form</h1>\n");
      out.write("           <form onsubmit=\"return validationForm()\" action=\"indexAdminRegistrationAction.jsp\" method=\"post\" >   \n");
      out.write("                <div class=\"section-one\">\n");
      out.write("                    <p>First Name</p>     \n");
      out.write("                    <input type=\"text\" name=\"fname\" placeholder=\"Enter first name\" required=\"\"><br>                 \n");
      out.write("                    <p>Address</p>     \n");
      out.write("                    <input type=\"text\" name=\"address\" placeholder=\"Enter address\" required=\"\"><br>                 \n");
      out.write("                    <p>State</p>   \n");
      out.write("                        <input type=\"text\" name=\"state\" placeholder=\"Enter state\" required=\"\"><br>                 \n");
      out.write("                    <p>Phone Number</p>   \n");
      out.write("                        <input type=\"text\" name=\"mobileNo\" placeholder=\"Enter Phone Number\" required=\"\"><br>\n");
      out.write("                <div class=\"passwordControl\">\n");
      out.write("                    <h1>Set user Pin#</h1>                    \n");
      out.write("                        <p>Create Pin</p>                        \n");
      out.write("                             \n");
      out.write(" \n");
      out.write("  \n");
      out.write("<input name=\"password_confirm\"  type=\"password\" placeholder=\"Enter pin\" id=\"password\"  required=\"required\"  />\n");
      out.write("<p>Confirm Pin:</p>\n");
      out.write("<input name=\"password_confirm\"   type=\"password\" placeholder=\"Re-enter pin\" id=\"confirm_password\"  required=\"required\"  />\n");
      out.write("<script language='javascript' type='text/javascript'>\n");
      out.write("    var password = document.getElementById(\"password\")\n");
      out.write("  , confirm_password = document.getElementById(\"confirm_password\");\n");
      out.write("\n");
      out.write("function validatePassword(){\n");
      out.write("  if(password.value !== confirm_password.value) {\n");
      out.write("    confirm_password.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("  } else {\n");
      out.write("    confirm_password.setCustomValidity('');\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("password.onchange = validatePassword;\n");
      out.write("confirm_password.onkeyup = validatePassword;\n");
      out.write("</script>\n");
      out.write("               \n");
      out.write("                            \n");
      out.write("                </div>                \n");
      out.write("                </div>                \n");
      out.write("                <div class=\"section-two\">\n");
      out.write("                    <p>Last Name</p>     \n");
      out.write("                          <input class=\"lastN\" type=\"text\" name=\"lname\" placeholder=\"Enter last name\" required=\"\"><br>                 \n");
      out.write("                    <p>City</p>   \n");
      out.write("                        <input type=\"text\" name=\"city\" placeholder=\"Enter city\" required=\"\"><br>                 \n");
      out.write("                    <p>Zip code</p>   \n");
      out.write("                        <input type=\"text\" name=\"zipcode\" placeholder=\"Enter zip code\" required=\"\"><br>                 \n");
      out.write("                    <p>Enter Email</p>     \n");
      out.write("                        <input   type=\"text\" name=\"email\" placeholder=\"Enter email\" required=\"\"><br>        \n");
      out.write("                    <p>Unique ID</p>     \n");
      out.write("                        <input   type=\"text\" name=\"rand_num\" value=\"");
out.print(linked);
      out.write("\" readonly=\"readonly\">\n");
      out.write("                    <div class=\"image-control\">\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                            <button type=\"submit\" class=\"pure-button pure-button-primary\">Confirm</button>                    \n");
      out.write("               </div>\n");
      out.write("            </form>      \n");
      out.write("        </div>\n");
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
