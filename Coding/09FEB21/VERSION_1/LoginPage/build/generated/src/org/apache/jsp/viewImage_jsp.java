package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class viewImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");

String im=request.getParameter("imgID");
Blob image = null;
Connection con = null;
byte[ ] imgData = null ;
Statement stmt = null;
ResultSet rs = null;
try {
Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceLogin","root","Javakings21##");
stmt = con.createStatement();
rs = stmt.executeQuery("select imageID from userdatamain where userID = '11111'");
if (rs.next()) {
image = rs.getBlob(1);
imgData = image.getBytes(1,(int)image.length());
}
else {
out.println("Display Blob Example");
out.println("image not found for given id>");
return;
}
// display the image
response.setContentType("image/jpg");
OutputStream o = response.getOutputStream();
o.write(imgData);

o.flush();
o.close();
} catch (Exception e) {
out.println("Unable To Display image");
out.println("Image Display Error=" + e.getMessage());
return;
} finally {
try {
 rs.close();
 stmt.close();
con.close();
} catch (SQLException e) {
e.printStackTrace();
}
}



      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Account Created</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"saveStyleSheet.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"viewImage.jsp\" method=\"post\">\n");
      out.write("            <img src=\"image\" name=\"imgData\" width=60px height=60px>\n");
      out.write("            <input  type=\"submit\" name=\"\" value=\"Continue\">   \n");
      out.write("     \n");
      out.write("        </form>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    /*\n");
      out.write("Blob image = null;\n");
      out.write("Connection con = null;\n");
      out.write("byte[ ] imgData = null ;\n");
      out.write("Statement stmt = null;\n");
      out.write("ResultSet rs = null;\n");
      out.write("try {\n");
      out.write("Class.forName(\"com.mysql.jdbc.Driver\");\n");
      out.write("con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/practiceLogin\",\"root\",\"Javakings21##\");\n");
      out.write("stmt = con.createStatement();\n");
      out.write("rs = stmt.executeQuery(\"select imageID from userdatamain where userID = '1'\");\n");
      out.write("if (rs.next()) {\n");
      out.write("image = rs.getBlob(1);\n");
      out.write("imgData = image.getBytes(1,(int)image.length());\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("out.println(\"Display Blob Example\");\n");
      out.write("out.println(\"image not found for given id>\");\n");
      out.write("return;\n");
      out.write("}\n");
      out.write("// display the image\n");
      out.write("response.setContentType(\"image/png\");\n");
      out.write("OutputStream o = response.getOutputStream();\n");
      out.write("o.write(imgData);\n");
      out.write("o.flush();\n");
      out.write("o.close();\n");
      out.write("} catch (Exception e) {\n");
      out.write("out.println(\"Unable To Display image\");\n");
      out.write("out.println(\"Image Display Error=\" + e.getMessage());\n");
      out.write("return;\n");
      out.write("} finally {\n");
      out.write("try {\n");
      out.write(" \n");
      out.write("stmt.close();\n");
      out.write("con.close();\n");
      out.write("} catch (SQLException e) {\n");
      out.write("e.printStackTrace();\n");
      out.write("}\n");
      out.write("}*/\n");
      out.write("%>");
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
