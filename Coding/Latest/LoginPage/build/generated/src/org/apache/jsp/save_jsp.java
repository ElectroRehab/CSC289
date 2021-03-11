package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.ReadSQL;
import readfile.ReadFile;
import java.util.Random;
import java.sql.*;

public final class save_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/saveStyleSheet.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\"> \r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"jsBarcode.all.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\twindow.history.forward();\r\n");
      out.write("\tfunction noBack() { window.history.forward(); }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>  \r\n");
      out.write("    <body onload=\"noBack();\" onpageshow=\"if (event.persisted) noBack();\" onunload=\"\">    \r\n");
      out.write("          <div class=\"image\">            \r\n");
      out.write("            <div><img src=\"assetsJSP/css/images/mainPageBackgroundv3.png\" class=\"image \" alt=”K&OLogo”>    </div>              \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class= \"flex-container\"> \r\n");
      out.write("        <nav style=\"height: 65px\">\r\n");
      out.write("        <script>\r\n");
      out.write("            function printDiv(divName) {\r\n");
      out.write("                var printContents = document.getElementById(divName).innerHTML;\r\n");
      out.write("                var originalContents = document.body.innerHTML;\r\n");
      out.write("                document.body.innerHTML = originalContents;                \r\n");
      out.write("                window.print();\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("        <div class= \"main_home\" >                              \r\n");
      out.write("                <a href=\"index.jsp\" style=\"text-decoration: none\">Home</a>                 \r\n");
      out.write("                <a><input class=\"btn-print\" type=\"button\" name=\"btn\" onclick=\"printDiv('printableArea')\" value=\"Print Barcode\" /></a>  \r\n");
      out.write("        </div>         \r\n");
      out.write("        </nav> \r\n");
      out.write("            <div class=\"form-container\">             \r\n");
      out.write("                <div id=\"printableArea\" class=\"reg-box\"> \r\n");
      out.write("                     <h1><br>Registration Accepted</h1>\r\n");
      out.write("           \r\n");

                int sqlInt = 0;
                // Create string to be used after reading through database.
                String userBarCode = "";
                // Connect to database and find the most recent ID
                try{
                    // Create a new clean conneciton.
                    Connection con = null;
                    // Create object
                    ReadFile rf = new ReadFile();
                    // Create object
                    ReadSQL s = new ReadSQL();
                    // Run the CSV Reader Class
                    rf.ReadFile();
                    // Connect to Database
                    Class.forName(rf.getClassDriver());
                    con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
                    // String used for SQL Query
                    sqlInt = 1;
                    s.ReadSQL(sqlInt);
                    
                    Statement st=con.createStatement();
                    ResultSet rs = st.executeQuery(s.getSQLAll());
                    
                    while(rs.next()){
                        // User ID
                        sqlInt = 20;
                        s.ReadSQL(sqlInt);
                        userBarCode = rs.getString(s.getSQLAll().toString());

      out.write("\r\n");
      out.write("            <table class=\"table my-0\" id=\"dataTable\">  \r\n");
      out.write("                \r\n");
      out.write("                <div><img src=\"assetsJSP/css/images/formBG_Image.png\" class=\"image \" alt=”K&OLogo” style=\"opacity: .1\" >    </div> \r\n");
      out.write("                <h1><br>Registration Accepted</h1>\r\n");
      out.write("                                <div><img src=\"assetsJSP/css/images/CompanyApprovalSeal.png\" class=\"image-seal \" alt=”K&OLogo”>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"email-ins\"><p>Check your email for further instructions. <i class=\"fas fa-exclamation-triangle\" style=\"color: red\"></i></p></div>        \r\n");
      out.write("                <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>&nbsp;&nbsp;Unique ID</th>\r\n");
      out.write("                                <th>First Name</th>\r\n");
      out.write("                                <th>Last Name</th>\r\n");
      out.write("                                <th>&nbsp;&nbsp;Email</th>\r\n");
      out.write("                                <th>&nbsp;&nbsp;&nbsp;&nbsp;Identifier</th>\r\n");
      out.write("                            </tr><br>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <!-- User ID -->\r\n");
      out.write("                            ");

                                sqlInt = 20;
                                s.ReadSQL(sqlInt);
                            
      out.write("                            \r\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(s.getSQLAll().toString()) );
      out.write("</td>\r\n");
      out.write("                            <!-- First Name -->\r\n");
      out.write("                            ");

                                sqlInt = 21;
                                s.ReadSQL(sqlInt);
                            
      out.write("\r\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(s.getSQLAll().toString()) );
      out.write("</td>\r\n");
      out.write("                            <!-- Last Name -->\r\n");
      out.write("                            ");

                                sqlInt = 22;
                                s.ReadSQL(sqlInt);
                            
      out.write("\r\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(s.getSQLAll().toString()) );
      out.write("</td>\r\n");
      out.write("                            <!-- E-Mail -->\r\n");
      out.write("                            ");

                                sqlInt = 28;
                                s.ReadSQL(sqlInt);
                            
      out.write("\r\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(s.getSQLAll().toString()) );
      out.write("</td>\r\n");
      out.write("                            <!-- Group -->\r\n");
      out.write("                            ");

                                sqlInt = 31;
                                s.ReadSQL(sqlInt);
                            
      out.write("\r\n");
      out.write("                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString(s.getSQLAll().toString()) );
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("            </table>\r\n");

                    }
                    con.close();
                }
                catch(Exception e){
                    out.println(e);
                }

      out.write("\r\n");
      out.write("                <!--Display Unique User Barcode-->\r\n");
      out.write("                 <br><br>\r\n");
      out.write("                 <img class= \"barcode-image\" id=\"barcode\"/>\r\n");
      out.write("                 <script>\r\n");
      out.write("                    JsBarcode(\"#barcode\", \"");
out.print(userBarCode);
      out.write("\");\r\n");
      out.write("                 </script>\r\n");
      out.write("                  \r\n");
      out.write("             </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    <div class=\"flex-container\">        \r\n");
      out.write("        <footer>            \r\n");
      out.write("            <div class = \"sticky-footer\">               \r\n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>                \r\n");
      out.write("            </div>            \r\n");
      out.write("        </footer>              \r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
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
