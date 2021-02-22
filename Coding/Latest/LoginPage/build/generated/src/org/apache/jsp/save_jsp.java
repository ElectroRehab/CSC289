package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assetsJSP/css/saveStyleSheet.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\"> \r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"jsBarcode.all.min.js\"></script>\r\n");
      out.write("    </head>  \r\n");
      out.write("    <body>    \r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class= \"main_home\" >                    \r\n");
      out.write("                <a href=\"index.jsp\">Home</a>             \r\n");
      out.write("            </div>           \r\n");
      out.write("        </nav> \r\n");
      out.write("            <h1><br>Registration Accepted</h1>\r\n");
      out.write("            <p>Check your email for further instructions. <i class=\"fas fa-exclamation-triangle\"></i></p>   \r\n");

                // Create string to be used after reading through database.
                String userBarCode = "";
                // Connect to database and find the most recent ID
                try{
                    // Create a new clean conneciton.
                    Connection con = null;
                    // Create object
                    ReadFile rf = new ReadFile();
                    // Run the CSV Reader Class
                    rf.ReadFile();
                    // String for the JBDC Driver Info
                    String classDriver = rf.getClassDriver();
                    // String used for link to the Remote Database
                    String link = rf.getLink();
                    // String used for username of the Remote Database
                    String user = rf.getUser();
                    // String used for password to the Remote Database
                    String pass = rf.getPass();
                    // Coneect to Database
                    Class.forName(classDriver);
                    con = DriverManager.getConnection(link,user,pass);
                    Statement st=con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM userdatamain WHERE ID = (SELECT MAX(ID) FROM userdatamain)");
                    
                    while(rs.next()){
                        userBarCode = rs.getString("userID");

      out.write("\r\n");
      out.write("                        <table style=\"width:35%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Unique ID</th>\r\n");
      out.write("                                <th>First Name</th>\r\n");
      out.write("                                <th>Last Name</th>\r\n");
      out.write("                                <th>Email</th>\r\n");
      out.write("                                <th>PIN #</th>\r\n");
      out.write("                                <th>Identifier</th>\r\n");
      out.write("                            </tr><br>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <td>");
      out.print(rs.getString("userID") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("firstName") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("lastName") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("email") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("pinNum") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(rs.getString("identifier") );
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </table>\r\n");

                    }
                    con.close();
                }
                catch(Exception e){
                    out.println(e);
                }

      out.write("\r\n");
      out.write("                <!--Display Unique User Barcode-->\r\n");
      out.write("                 <br><br>\r\n");
      out.write("                 <img id=\"barcode\"/>\r\n");
      out.write("                 <script>\r\n");
      out.write("                 JsBarcode(\"#barcode\", \"");
out.print(userBarCode);
      out.write("\");\r\n");
      out.write("                 </script>\r\n");
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
