package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.ReadTitles;
import readfile.ReadSQL;
import readfile.ReadFile;
import java.util.Random;
import java.sql.*;

public final class indexUserPrintPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/saveStyleSheet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\"> \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"jsBarcode.all.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\twindow.history.forward();\n");
      out.write("\tfunction noBack() { window.history.forward(); }\n");
      out.write("        </script>\n");
      out.write("    </head>  \n");
      out.write("    <body onload=\"noBack();\" onpageshow=\"if (event.persisted) noBack();\" onunload=\"\">    \n");
      out.write("          <div class=\"image\">            \n");
      out.write("            <div><img src=\"assetsJSP/css/images/mainPageBackgroundv3.png\" class=\"image \" alt=”K&OLogo”>    </div>              \n");
      out.write("        </div>\n");
      out.write("        <div class= \"flex-container\"> \n");
      out.write("        <nav style=\"height: 65px\">\n");
      out.write("        <script>\n");
      out.write("            function printDiv(divName) {\n");
      out.write("                var printContents = document.getElementById(divName).innerHTML;\n");
      out.write("                var originalContents = document.body.innerHTML;\n");
      out.write("                document.body.innerHTML = originalContents;                \n");
      out.write("                window.print();\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <div class= \"main_home\" >                              \n");
      out.write("                <a href=\"indexUserLogin.jsp\" style=\"text-decoration: none\">Home</a>                 \n");
      out.write("                <a><input class=\"btn-print\" type=\"button\" name=\"btn\" onclick=\"printDiv('printableArea')\" value=\"Print Barcode\" /></a>  \n");
      out.write("        </div>         \n");
      out.write("        </nav> \n");
      out.write("            <div class=\"form-container\">             \n");
      out.write("                <div id=\"printableArea\" class=\"reg-box\"> \n");
      out.write("                     <h1><br>Registration Accepted</h1>\n");
      out.write("           \n");

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
                    // Create Object 
                    ReadTitles t = new ReadTitles();
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
                        sqlInt = 2;
                        t.ReadTitles(sqlInt);
                        userBarCode = rs.getString(t.getSQLTitles().toString());

      out.write("\n");
      out.write("            <table class=\"table my-0\" id=\"dataTable\">  \n");
      out.write("                \n");
      out.write("                <div><img src=\"assetsJSP/css/images/formBG_Image.png\" class=\"image \" alt=”K&OLogo” style=\"opacity: .1\" >    </div> \n");
      out.write("                <h1><br>Registration Accepted</h1>\n");
      out.write("                                <div><img src=\"assetsJSP/css/images/CompanyApprovalSeal.png\" class=\"image-seal \" alt=”K&OLogo”>\n");
      out.write("\n");
      out.write("                <div class=\"email-ins\"><p>Check your email for further instructions. <i class=\"fas fa-exclamation-triangle\" style=\"color: red\"></i></p></div>        \n");
      out.write("                <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>&nbsp;&nbsp;Unique ID</th>\n");
      out.write("                                <th>First Name</th>\n");
      out.write("                                <th>Last Name</th>\n");
      out.write("                                <th>&nbsp;&nbsp;Email</th>\n");
      out.write("                                <th>&nbsp;&nbsp;&nbsp;&nbsp;Identifier</th>\n");
      out.write("                            </tr><br>\n");
      out.write("                        <tr>\n");
      out.write("                            <!-- User ID -->\n");
      out.write("                            ");

                                sqlInt = 2;
                                t.ReadTitles(sqlInt);
                            
      out.write("                            \n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(t.getSQLTitles().toString()) );
      out.write("</td>\n");
      out.write("                            <!-- First Name -->\n");
      out.write("                            ");

                                sqlInt = 3;
                                t.ReadTitles(sqlInt);
                            
      out.write("\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(t.getSQLTitles().toString()) );
      out.write("</td>\n");
      out.write("                            <!-- Last Name -->\n");
      out.write("                            ");

                                sqlInt = 4;
                                t.ReadTitles(sqlInt);
                            
      out.write("\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(t.getSQLTitles().toString()) );
      out.write("</td>\n");
      out.write("                            <!-- E-Mail -->\n");
      out.write("                            ");

                                sqlInt = 10;
                                t.ReadTitles(sqlInt);
                            
      out.write("\n");
      out.write("                            <td>&nbsp;&nbsp;");
      out.print(rs.getString(t.getSQLTitles().toString()) );
      out.write("</td>\n");
      out.write("                            <!-- Group -->\n");
      out.write("                            ");

                                sqlInt = 13;
                                t.ReadTitles(sqlInt);
                            
      out.write("\n");
      out.write("                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString(t.getSQLTitles().toString()) );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");

                    }
                    con.close();
                }
                catch(Exception e){
                    out.println(e);
                }

      out.write("\n");
      out.write("                <!--Display Unique User Barcode-->\n");
      out.write("                 <br><br>\n");
      out.write("                 <img class= \"barcode-image\" id=\"barcode\"/>\n");
      out.write("                 <script>\n");
      out.write("                    JsBarcode(\"#barcode\", \"");
out.print(userBarCode);
      out.write("\");\n");
      out.write("                 </script>\n");
      out.write("                  \n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("    <div class=\"flex-container\">        \n");
      out.write("        <footer>            \n");
      out.write("            <div class = \"sticky-footer\">               \n");
      out.write("                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>                \n");
      out.write("            </div>            \n");
      out.write("        </footer>              \n");
      out.write("    </div>\n");
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
