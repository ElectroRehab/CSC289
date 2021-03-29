package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.ReadSessions;
import readfile.ReadTitles;
import readfile.ReadSQL;
import readfile.ReadFile;
import java.sql.*;
import java.sql.*;

public final class taskList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Table - Brand</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/adminControl.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/todoListStyleSheet.css\">  \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");

    ReadSessions r = new ReadSessions();
    r.getPost(request, response, session);
     

      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    <div id=\"myDIV\" class=\"header\">\n");
      out.write("        <h2 >My To Do List</h2>\n");
      out.write("        <form action=\"taskAction.jsp\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"task\" placeholder=\"Enter Task...\"  >\n");
      out.write("        \n");
      out.write("         <button class=\"button\" type=\"submit\">Add</button>  \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   ");
    
    try{
        String uid = (String)session.getAttribute("adminID");
        int count = 0;
        int sqlInt = 0;
        // Create a new clean conneciton.
        Connection con = null;
        // Create object
        ReadFile rf = new ReadFile();
        // Create object
        ReadSQL s = new ReadSQL();
        //Create Object
        ReadTitles t = new ReadTitles();
        // Run the CSV Reader Class
        rf.ReadFile();
        // Connect to Database
        Class.forName(rf.getClassDriver());
        //con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
        con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5400998","sql5400998","7xWESpbAN5");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * From admintask where adminID= ('"+uid+"')");         
    
      out.write("\n");
      out.write("     ");
while(rs.next())
        {
    
            
      out.write(" \n");
      out.write("<ul id=\"myUL\" class=\"list-list\">\n");
      out.write("   \n");
      out.write("    <form action=\"deleteTaskAction\" method=\"post\">   \n");
      out.write("        <table>\n");
      out.write("             <tr>\n");
      out.write("                <td>\n");
      out.write("                 \n");
      out.write("                    ");
      out.print(rs.getString("task") );
      out.write("          \n");
      out.write("                </td> \n");
      out.write("             \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                     \n");
      out.write("                      <button class=\"button-delete\" type=\"submit\">Delete</button>          \n");
      out.write("                </div>    \n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("             </table>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("      \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</ul> \n");
      out.write(" \n");
      out.write("                        ");
}
}
    catch(Exception e){
        out.print(e.getMessage());
      out.write("<br>");

    }
    finally{         
    }
    
      out.write("\n");
      out.write(" </div>\n");
      out.write(" <div id=\"wrapper\">\n");
      out.write("    <nav class=\"navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-1\">\n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid d-flex flex-column p-0\"><a class=\"navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0\" href=\"indexAdminControl.jsp\">\n");
      out.write("                    <div><img src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"60\" width=\"60\"></div>                    \n");
      out.write("                </a>\n");
      out.write("                <div class=\"sidebar-brand-text mx-2\" style=\"color: white\"><span><b>Personnel Management</b></span></div>\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("                <ul class=\"nav navbar-nav text-light\" id=\"accordionSidebar\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"indexAdminControl.jsp\"><i class=\"fas fa-tachometer-alt\"></i><span>&nbsp;&nbsp;Dashboard</span></a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"profile.jsp\"><i class=\"fas fa-user\"></i><span>&nbsp;&nbsp;Profile</span></a>                 \n");
      out.write("                    <a class=\"nav-link active\" href=\"tableAdmin.jsp\"><i class=\"fas fa-table\"></i><span>&nbsp;&nbsp;Admin Table</span></a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"tableUser.jsp\"><i class=\"fas fa-table\"></i><span>&nbsp;&nbsp;Employee Table</span></a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"workTable.jsp\"><i class=\"fas fa-table\"></i><span>&nbsp;&nbsp;Work Table</span></a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"timeWorkedTable.jsp\"><i class=\"fas fa-table\"></i><span>&nbsp;&nbsp;Time Worked Table</span></a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"resetLockedAccount.jsp\"><i class=\"fas fa-lock-open\"></i><span>&nbsp;&nbsp;Reset Locked Account</span></a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"indexMainPage.jsp\"><i class=\"far fa-user-circle\"></i><span>&nbsp;&nbsp;Log out</span></a>                  \n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("    </nav>\n");
      out.write("       <div class=\"d-flex flex-column\" id=\"content-wrapper\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <nav class=\"navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top\">\n");
      out.write("                    <div class=\"container-fluid\"><button class=\"btn btn-link d-md-none rounded-circle mr-3\" id=\"sidebarToggleTop\" type=\"button\"><i class=\"fas fa-bars\"></i></button>\n");
      out.write("                        <form class=\"form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                            <div class=\"input-group\"><input class=\"bg-light form-control border-0 small\" type=\"text\" placeholder=\"Search for ...\">\n");
      out.write("                                <div class=\"input-group-append\"><button class=\"btn btn-primary py-0\" type=\"button\"><i class=\"fas fa-search\"></i></button></div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <ul class=\"nav navbar-nav flex-nowrap ml-auto\">\n");
      out.write("                            <li class=\"nav-item dropdown d-sm-none no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 animated--grow-in\" aria-labelledby=\"searchDropdown\">\n");
      out.write("                                    <form class=\"form-inline mr-auto navbar-search w-100\">\n");
      out.write("                                        <div class=\"input-group\"><input class=\"bg-light form-control border-0 small\" type=\"text\" placeholder=\"Search for ...\">\n");
      out.write("                                            <div class=\"input-group-append\"><button class=\"btn btn-primary py-0\" type=\"button\"><i class=\"fas fa-search\"></i></button></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                            <div class=\"d-none d-sm-block topbar-divider\"></div>\n");
      out.write("                             \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                 \n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Create a \"close\" button and append it to each list item\n");
      out.write("var myNodelist = document.getElementsByTagName(\"LI\");\n");
      out.write("var i;\n");
      out.write("for (i = 0; i < myNodelist.length; i++) {\n");
      out.write("  var span = document.createElement(\"SPAN\");\n");
      out.write("  var txt = document.createTextNode(\"\\u00D7\");\n");
      out.write("  span.className = \"close\";\n");
      out.write("  span.appendChild(txt);\n");
      out.write("  myNodelist[i].appendChild(span);\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Click on a close button to hide the current list item\n");
      out.write("var close = document.getElementsByClassName(\"close\");\n");
      out.write("var i;\n");
      out.write("for (i = 0; i < close.length; i++) {\n");
      out.write("  close[i].onclick = function() {\n");
      out.write("    var div = this.parentElement;\n");
      out.write("    div.style.display = \"none\";\n");
      out.write("     \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Add a \"checked\" symbol when clicking on a list item\n");
      out.write("var list = document.querySelector('ul');\n");
      out.write("list.addEventListener('click', function(ev) {\n");
      out.write("  if (ev.target.tagName === 'LI') {\n");
      out.write("    ev.target.classList.toggle('checked');\n");
      out.write("  }\n");
      out.write("}, false);\n");
      out.write(" \n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("</body>\n");
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
