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

public final class resetLockedAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src;  \r\n");
      out.write("\r\n");
      out.write("        script-src 'self'  'sha256-JE0280krcqkShSI9tiB7uYMolH2Mp4kLOi+tnmU+JI4='    \r\n");
      out.write("        ;style-src 'report-sample' 'self' 'unsafe-inline' \r\n");
      out.write("        https://cdnjs.cloudflare.com https://fonts.googleapis.com; \r\n");
      out.write("        img-src 'self' data:; base-uri 'self'; object-src 'self';\r\n");
      out.write("        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; \r\n");
      out.write("        frame-src 'self';\r\n");
      out.write("        manifest-src 'self'; media-src 'self'; \r\n");
      out.write("        worker-src 'none';\">\r\n");
      out.write("    <title>Table - Brand</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/registrationStyleSheet.css\"> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/adminControl.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/timeWorkedTableStyleSheet.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">   \r\n");
      out.write("     \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0\">\r\n");
      out.write("            <div class=\"container-fluid d-flex flex-column p-0\"><a class=\"navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0\" href=\"#\">\r\n");
      out.write("                   <div><img src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"60\" width=\"60\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\" style=\"color: white\"><span><b>Personnel Management</b></span></div>\r\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("                <ul class=\"nav navbar-nav text-light\" id=\"accordionSidebar\">\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"indexAdminControl.jsp\"><i class=\"fas fa-tachometer-alt\"></i><span>Dashboard</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"profile.jsp\"><i class=\"fas fa-user\"></i><span>Profile</span></a></li>                    \r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"tableAdmin.jsp\"><i class=\"fas fa-table\"></i><span>Admin Table</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"tableUser.jsp\"><i class=\"fas fa-table\"></i><span>Employee Table</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"workTable.jsp\"><i class=\"fas fa-table\"></i><span>Work Table</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"timeWorkedTable.jsp\"><i class=\"fas fa-table\"></i><span>Time Worked Table</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"resetLockedAccount.jsp\"><i class=\"fas fa-lock-open\"></i><span>Reset Locked Account</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"indexMainPage.jsp\"><i class=\"far fa-user-circle\"></i><span>Log out</span></a></li>                   \r\n");
      out.write("                     \r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\"><button class=\"btn rounded-circle border-0\" id=\"sidebarToggle\" type=\"button\"></button></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"d-flex flex-column\" id=\"content-wrapper\">\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <nav class=\"navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top\">\r\n");
      out.write("                    <div class=\"container-fluid\"><button class=\"btn btn-link d-md-none rounded-circle mr-3\" id=\"sidebarToggleTop\" type=\"button\"><i class=\"fas fa-bars\"></i></button>\r\n");
      out.write("                        <form class=\"form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("                            <div class=\"input-group\"><input class=\"bg-light form-control border-0 small\" type=\"text\" placeholder=\"Search for ...\">\r\n");
      out.write("                                <div class=\"input-group-append\"><button class=\"btn btn-primary py-0\" type=\"button\"><i class=\"fas fa-search\"></i></button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <ul class=\"nav navbar-nav flex-nowrap ml-auto\">\r\n");
      out.write("                            <li class=\"nav-item dropdown d-sm-none no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\"><i class=\"fas fa-search\"></i></a>\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 animated--grow-in\" aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                                    <form class=\"form-inline mr-auto navbar-search w-100\">\r\n");
      out.write("                                        <div class=\"input-group\"><input class=\"bg-light form-control border-0 small\" type=\"text\" placeholder=\"Search for ...\">\r\n");
      out.write("                                            <div class=\"input-group-append\"><button class=\"btn btn-primary py-0\" type=\"button\"><i class=\"fas fa-search\"></i></button></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                                <div class=\"nav-item dropdown no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\"><span class=\"badge badge-danger badge-counter\">3+</span><i class=\"fas fa-bell fa-fw\"></i></a>\r\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in\">\r\n");
      out.write("                                        <h6 class=\"dropdown-header\">alerts center</h6><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"mr-3\">\r\n");
      out.write("                                                <div class=\"bg-primary icon-circle\"><i class=\"fas fa-file-alt text-white\"></i></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div><span class=\"small text-gray-500\">December 12, 2019</span>\r\n");
      out.write("                                                <p>A new monthly report is ready to download!</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"mr-3\">\r\n");
      out.write("                                                <div class=\"bg-success icon-circle\"><i class=\"fas fa-donate text-white\"></i></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div><span class=\"small text-gray-500\">December 7, 2019</span>\r\n");
      out.write("                                                <p>$290.29 has been deposited into your account!</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"mr-3\">\r\n");
      out.write("                                                <div class=\"bg-warning icon-circle\"><i class=\"fas fa-exclamation-triangle text-white\"></i></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div><span class=\"small text-gray-500\">December 2, 2019</span>\r\n");
      out.write("                                                <p>Spending Alert: We've noticed unusually high spending for your account.</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"text-center dropdown-item small text-gray-500\" href=\"#\">Show All Alerts</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                                <div class=\"nav-item dropdown no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\"><i class=\"fas fa-envelope fa-fw\"></i><span class=\"badge badge-danger badge-counter\">7</span></a>\r\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in\">\r\n");
      out.write("                                        <h6 class=\"dropdown-header\">alerts center</h6><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"dropdown-list-image mr-3\"><img class=\"rounded-circle\" src=\"assets/img/avatars/avatar4.jpeg\">\r\n");
      out.write("                                                <div class=\"bg-success status-indicator\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"font-weight-bold\">\r\n");
      out.write("                                                <div class=\"text-truncate\"><span>Hi there! I am wondering if you can help me with a problem I've been having.</span></div>\r\n");
      out.write("                                                <p class=\"small text-gray-500 mb-0\">Emily Fowler - 58m</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"dropdown-list-image mr-3\"><img class=\"rounded-circle\" src=\"assets/img/avatars/avatar2.jpeg\">\r\n");
      out.write("                                                <div class=\"status-indicator\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"font-weight-bold\">\r\n");
      out.write("                                                <div class=\"text-truncate\"><span>I have the photos that you ordered last month!</span></div>\r\n");
      out.write("                                                <p class=\"small text-gray-500 mb-0\">Jae Chun - 1d</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"dropdown-list-image mr-3\"><img class=\"rounded-circle\" src=\"assets/img/avatars/avatar3.jpeg\">\r\n");
      out.write("                                                <div class=\"bg-warning status-indicator\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"font-weight-bold\">\r\n");
      out.write("                                                <div class=\"text-truncate\"><span>Last month's report looks great, I am very happy with the progress so far, keep up the good work!</span></div>\r\n");
      out.write("                                                <p class=\"small text-gray-500 mb-0\">Morgan Alvarez - 2d</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"d-flex align-items-center dropdown-item\" href=\"#\">\r\n");
      out.write("                                            <div class=\"dropdown-list-image mr-3\"><img class=\"rounded-circle\" src=\"assets/img/avatars/avatar5.jpeg\">\r\n");
      out.write("                                                <div class=\"bg-success status-indicator\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"font-weight-bold\">\r\n");
      out.write("                                                <div class=\"text-truncate\"><span>Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</span></div>\r\n");
      out.write("                                                <p class=\"small text-gray-500 mb-0\">Chicken the Dog · 2w</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </a><a class=\"text-center dropdown-item small text-gray-500\" href=\"#\">Show All Alerts</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"shadow dropdown-list dropdown-menu dropdown-menu-right\" aria-labelledby=\"alertsDropdown\"></div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <div class=\"d-none d-sm-block topbar-divider\"></div>\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                                <div class=\"nav-item dropdown no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\"><span class=\"d-none d-lg-inline mr-2 text-gray-600 small\">Administrator</span><img class=\"border rounded-circle img-profile\" src=\"assetsJSP/css/images/iconfinder_Account_1891016.png\"></a>\r\n");
      out.write("                                    <div class=\"dropdown-menu shadow dropdown-menu-right animated--grow-in\"><a class=\"dropdown-item\" href=\"profile.jsp\"><i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Profile</a><a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Settings</a><a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Activity log</a>\r\n");
      out.write("                                        <div class=\"dropdown-divider\"></div><a class=\"dropdown-item\" href=\"indexMainPage.jsp\"><i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Logout</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <h3 class=\"text-dark mb-4\">Locked Accounts</h3>\r\n");
      out.write("                    <div class=\"card shadow\">\r\n");
      out.write("                        <div class=\"card-header py-3\">\r\n");
      out.write("                            <p class=\"text-primary m-0 font-weight-bold\">Reset Employee Account</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6 text-nowrap\">\r\n");
      out.write("                                    <div id=\"dataTable_length\" class=\"dataTables_length\" aria-controls=\"dataTable\"><label>Show&nbsp;<select class=\"form-control form-control-sm custom-select custom-select-sm\">\r\n");
      out.write("                                                <option value=\"10\" selected=\"\">10</option>\r\n");
      out.write("                                                <option value=\"25\">25</option>\r\n");
      out.write("                                                <option value=\"50\">50</option>\r\n");
      out.write("                                                <option value=\"100\">100</option>\r\n");
      out.write("                                            </select>&nbsp;</label></div>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"text-md-right dataTables_filter\" id=\"dataTable_filter\"><label><input type=\"search\" class=\"form-control form-control-sm\" aria-controls=\"dataTable\" placeholder=\"Search\"></label></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             ");
    
    try{
        HashSHA512Encryption hashText = new HashSHA512Encryption();
        int sqlInt = 0;
        java.util.Date date=new java.util.Date();			
        // Create a new clean conneciton.
        Connection con = null;
        // Create object
        ReadFile rf = new ReadFile();
        // Run the CSV Reader Class
        rf.ReadFile();
        // Create object
        ReadSQL s = new ReadSQL();
        // Create object
        ReadTitles t = new ReadTitles();
        // Connect to Database
        Class.forName(rf.getClassDriver());
        con = DriverManager.getConnection(rf.getLink(), rf.getUser(), rf.getPass());
        Statement st=con.createStatement();
        sqlInt = 23;
        s.ReadSQL(sqlInt);
        ResultSet rs=st.executeQuery(s.getSQLAll());
        

      out.write("\r\n");
      out.write("                            <div class=\"table-responsive table mt-2\" id=\"dataTable\" role=\"grid\" aria-describedby=\"dataTable_info\">\r\n");
      out.write("                                <table class=\"table my-0\" id=\"dataTable\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>First Name</th>\r\n");
      out.write("                                            <th>Last Name</th>\r\n");
      out.write("                                            <th>User ID</th>                                             \r\n");
      out.write("                                            <th>Wrong</th>\r\n");
      out.write("                                            <th>Enter New PIN</th>  \r\n");
      out.write("                                            <th>Pin Reset</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("        ");
while(rs.next())
        {
              
            
      out.write("               \r\n");
      out.write("            <tr>\r\n");
      out.write("                <form  action=\"resetLockedAccountAction.jsp\" method=\"post\">    \r\n");
      out.write("                <!--First Name-->\r\n");
      out.write("                ");
t.ReadTitles(3);
      out.write("\r\n");
      out.write("                <td>");
      out.print(rs.getString(t.getSQLTitles()));
      out.write("</td>\r\n");
      out.write("                <!--Last Name-->\r\n");
      out.write("                ");
t.ReadTitles(4);
      out.write("\r\n");
      out.write("                <td>");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("</td>\r\n");
      out.write("                <!--User ID-->\r\n");
      out.write("                ");
t.ReadTitles(2);
      out.write("                \r\n");
      out.write("                <td><input class=\"form-control\" type=\"text\" name=\"user_id\" value=\"");
out.print(rs.getString(t.getSQLTitles()));
      out.write("\" readonly=\"readonly\"></td>\r\n");
      out.write("                <!--Wrong-->\r\n");
      out.write("                ");
t.ReadTitles(19);
      out.write("\r\n");
      out.write("                <td>");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("</td>\r\n");
      out.write("                <!--PIN RESET-->\r\n");
      out.write("                <td><div class=\"form-group\">\r\n");
      out.write("                        <div class=\"pass-inst \"><p>\r\n");
      out.write("                  <input class=\"form-stand\" name=\"password\" type=\"password\" placeholder=\"Enter pin\" id=\"plainText1\"/>\r\n");
      out.write("                            </p></div>\r\n");
      out.write("                </td>\r\n");
      out.write("                <!--Reset-->\r\n");
      out.write("                <td>\r\n");
      out.write("                    <div class=\"form-group\">                        \r\n");
      out.write("                        <input  onclick=\"return getConfirmation();\" type=\"submit\" value=\"Reset\" name=\"Reset Time\" class=\"btn\">\r\n");
      out.write("                        <script type = \"text/javascript\">\r\n");
      out.write("                            function getConfirmation(){\r\n");
      out.write("                                var retVal = confirm(\"You are about to reset a PIN.\\nDo you wish to continue?\");\r\n");
      out.write("                                \r\n");
      out.write("                                if( retVal === true ){\r\n");
      out.write("                                    return true;\r\n");
      out.write("                                } \r\n");
      out.write("                                else{\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                            </script>                            \r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("    ");
}
}
    catch(Exception e){
        out.print(e.getMessage());
      out.write("<br>");

    }
    finally{         
    }
    
      out.write("\r\n");
      out.write("                                         \r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6 align-self-center\">\r\n");
      out.write("                                    <p id=\"dataTable_info\" class=\"dataTables_info\" role=\"status\" aria-live=\"polite\">Showing 1 to 10 of 27</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <nav class=\"d-lg-flex justify-content-lg-end dataTables_paginate paging_simple_numbers\">\r\n");
      out.write("                                        <ul class=\"pagination\">\r\n");
      out.write("                                            <li class=\"page-item disabled\"><a class=\"page-link\" href=\"#\" aria-label=\"Previous\"><span aria-hidden=\"true\">«</span></a></li>\r\n");
      out.write("                                            <li class=\"page-item active\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\" aria-label=\"Next\"><span aria-hidden=\"true\">»</span></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </nav>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("             <footer class=\"bg-white sticky-footer\">\r\n");
      out.write("                <div class=\"container my-auto\">\r\n");
      out.write("                    <div class=\"text-center my-auto copyright\"><span>Copyright © Brand 2021</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div><a class=\"border rounded d-inline scroll-to-top\" href=\"#page-top\"><i class=\"fas fa-angle-up\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/chart.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/theme.js\"></script>\r\n");
      out.write("</body>\r\n");
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
