package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.HashSHA512Encryption;
import readfile.ReadTitles;
import readfile.ReadSQL;
import readfile.ReadFile;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.JOptionPane;

public final class resetLockedAccountAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
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
      out.write("    <title>Current Locked Accounts</title>    \r\n");
      out.write("</head>\r\n");

    HashSHA512Encryption hashText = new HashSHA512Encryption();
    String idInfo=request.getParameter("user_id");
    String password=request.getParameter("password");
    hashText.setHashText(password);
    password = hashText.getHashText();
    out.println(idInfo);
    out.println(password);
    out.println("Currently resets the number back to zero. \nStill need to create a pin reset portion.");
    int sqlInt = 0;
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
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
            // Create a Statement to run query from database.
            sqlInt = 15;
            s.ReadSQL(sqlInt);
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(s.getSQLAll().toString());
            // Read through database for user's currently inputted info
            while(r.next()){
                // User Name
                sqlInt = 2;
                t.ReadTitles(sqlInt);
                // Check for current user input info
                if(r.getString(t.getSQLTitles().toString()).equals(idInfo)){
                    // Check for locked account and count and reset to 0.                   
                    sqlInt = 22;
                    s.ReadSQL(sqlInt);
                    Statement psps = con.createStatement();
                    psps.executeUpdate(s.getSQLAll() + idInfo);
                    response.sendRedirect("indexAdminControl.jsp"); 
                }
                else{
                }
            }
        }
        catch(Exception e){
            out.println(e);
        }

      out.write("\r\n");
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
