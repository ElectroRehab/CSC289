package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Blob;
import java.io.OutputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class testImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String id = request.getParameter("id");
 

String user = "root";
String pass = "root";
 
Connection conn = null;
 
try{
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceLogin","root","Javakings21##");
   
     PreparedStatement pst = conn.prepareStatement("select * from userdatamain where userID=?");
        pst.setString(1, id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()) {     
              byte[] bytearray = new byte[4096];
              int size=0;
              InputStream sImage;
              sImage = rs.getBinaryStream(1);
              response.reset();
             
              while((size=sImage.read(bytearray))!= -1 )
                {
                    response.getOutputStream().write(bytearray,0,size);
                }
              response.flushBuffer();
              sImage.close();
              rs.close();
           }
}  
catch(Exception e){
    e.printStackTrace();
}   
finally{
    if(conn != null){
        try{
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

      out.write("\n");
      out.write("\t\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>View Image</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <b>View | <a href=\"viewImage.jsp\">Upload</a></b><br/><br/>\n");
      out.write("        \n");
      out.write("\t\t");

		id = request.getParameter("userID");
		
      out.write("\n");
      out.write("\t\t<img src=\"testImage.jsp?userID=");
      out.print(id);
      out.write("\" width=\"400px\"/>\n");
      out.write(" \n");
      out.write("    </body>\n");
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
