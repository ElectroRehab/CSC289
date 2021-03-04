package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.ReadFile;
import java.sql.*;

public final class indexAdminControl_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("    <meta http-equiv=\"Content-Security-Policy\" content=\"  script-src 'self' \r\n");
      out.write("    'report-sample'; base-uri 'self'; object-src 'none';\r\n");
      out.write("    connect-src 'self'; font-src 'self'; frame-src 'self';  manifest-src 'self'; media-src 'self'; \r\n");
      out.write("    worker-src 'none'; report-uri https://603fa0ec0e0d6cb74f6e96a4.endpoint.csper.io;\">\r\n");
      out.write("    <title>Dashboard - Brand</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/adminControl.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0\">\r\n");
      out.write("            <div class=\"container-fluid d-flex flex-column p-0\"><a class=\"navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0\" href=\"#\">\r\n");
      out.write("                    <div><img src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"60\" width=\"60\"></div>\r\n");
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
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"indexAdminLogin.jsp\"><i class=\"far fa-user-circle\"></i><span>Log out</span></a></li>\r\n");
      out.write("                     \r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\"><button class=\"btn rounded-circle border-0\" id=\"sidebarToggle\" type=\"button\"></button></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
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
      out.write("                                <div class=\"nav-item dropdown no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\"><span class=\"d-none d-lg-inline mr-2 text-gray-600 small\">Valerie Luna</span><img class=\"border rounded-circle img-profile\" src=\"assets/img/avatars/avatar1.jpeg\"></a>\r\n");
      out.write("                                    <div class=\"dropdown-menu shadow dropdown-menu-right animated--grow-in\"><a class=\"dropdown-item\" href=\"profile.jsp\"><i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Profile</a><a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Settings</a><a class=\"dropdown-item\" href=\"index.jsp\"><i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Activity log</a>\r\n");
      out.write("                                        <div class=\"dropdown-divider\"></div><a class=\"dropdown-item\" href=\"index.jsp\"><i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>&nbsp;Logout</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"d-sm-flex justify-content-between align-items-center mb-4\">\r\n");
      out.write("                        <h3 class=\"text-dark mb-0\">Dashboard</h3><a class=\"btn btn-primary btn-sm d-none d-sm-inline-block\" role=\"button\" href=\"#\"><i class=\"fas fa-download fa-sm text-white-50\"></i>&nbsp;Generate Report</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6 col-xl-3 mb-4\">\r\n");
      out.write("                            <div class=\"card shadow border-left-primary py-2\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                        <div class=\"col mr-2\">\r\n");
      out.write("                                            <div class=\"text-uppercase text-primary font-weight-bold text-xs mb-1\"><span>Total Number of Employees</span></div>\r\n");
      out.write("                                            <div class=\"text-dark font-weight-bold h5 mb-0\"> \r\n");
      out.write("                                                ");
    
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
        ResultSet rs=st.executeQuery("select COUNT(*) from userdatamain;");
   
        String Countrow="";                     
        while(rs.next()){
        Countrow = rs.getString(1);
        
        }
              
            
      out.write("               \r\n");
      out.write("             <span>");
out.println("Employee Total: " +Countrow);
      out.write(" </span>      \r\n");
      out.write("           \r\n");
      out.write("    ");

    }
    
    catch(Exception e){
        out.print(e.getMessage());
    }
    finally{         
    }
    
      out.write(" </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-auto\"><i class=\"fas fa-users fa-2x text-blue-300\"></i></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-xl-3 mb-4\">\r\n");
      out.write("                            <div class=\"card shadow border-left-success py-2\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                        <div class=\"col mr-2\">\r\n");
      out.write("                                            <div class=\"text-uppercase text-success font-weight-bold text-xs mb-1\"><span>Number of Employees Working</span></div>\r\n");
      out.write("                                            <div class=\"text-dark font-weight-bold h5 mb-0\">                                            ");
    
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
        ResultSet rs=st.executeQuery("select COUNT(*) from employeetimetracker where status = 'In';");
   
        String Countrow="";                     
        while(rs.next()){
        Countrow = rs.getString(1);
        
        }
              
            
      out.write("               \r\n");
      out.write("             <span>");
out.println("Employee Total: " +Countrow);
      out.write(" </span>      \r\n");
      out.write("           \r\n");
      out.write("    ");

    }
    
    catch(Exception e){
        out.print(e.getMessage());
    }
    finally{         
    }
    
      out.write("<span> </span></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-auto\"><i class=\"fas fa-users fa-2x text-blue-300\"></i></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-xl-3 mb-4\">\r\n");
      out.write("                            <div class=\"card shadow border-left-info py-2\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                        <div class=\"col mr-2\">\r\n");
      out.write("                                            <div class=\"text-uppercase text-info font-weight-bold text-xs mb-1\"><span>Tasks</span></div>\r\n");
      out.write("                                            <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                                <div class=\"col-auto\">\r\n");
      out.write("                                                    <div class=\"text-dark font-weight-bold h5 mb-0 mr-3\"><span>50%</span></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col\">\r\n");
      out.write("                                                    <div class=\"progress progress-sm\">\r\n");
      out.write("                                                        <div class=\"progress-bar bg-info\" aria-valuenow=\"50\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 50%;\"><span class=\"sr-only\">50%</span></div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-auto\"><i class=\"fas fa-clipboard-list fa-2x text-blue-300\"></i></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-xl-3 mb-4\">\r\n");
      out.write("                            <div class=\"card shadow border-left-warning py-2\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                        <div class=\"col mr-2\">\r\n");
      out.write("                                            <div class=\"text-uppercase text-warning font-weight-bold text-xs mb-1\"><span>Pending Registration Requests</span></div>\r\n");
      out.write("                                            <div class=\"text-dark font-weight-bold h5 mb-0\"><span>18</span></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-auto\"><i class=\"fas fa-comments fa-2x text-blue-300\"></i></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-7 col-xl-8\">\r\n");
      out.write("                            <div class=\"card shadow mb-4\">\r\n");
      out.write("                                <div class=\"card-header d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                    <h6 class=\"text-primary font-weight-bold m-0\">Earnings Overview</h6>\r\n");
      out.write("                                    <div class=\"dropdown no-arrow\"><button class=\"btn btn-link btn-sm dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\" type=\"button\"><i class=\"fas fa-ellipsis-v text-gray-400\"></i></button>\r\n");
      out.write("                                        <div class=\"dropdown-menu shadow dropdown-menu-right animated--fade-in\">\r\n");
      out.write("                                            <p class=\"text-center dropdown-header\">dropdown header:</p><a class=\"dropdown-item\" href=\"#\">&nbsp;Action</a><a class=\"dropdown-item\" href=\"#\">&nbsp;Another action</a>\r\n");
      out.write("                                            <div class=\"dropdown-divider\"></div><a class=\"dropdown-item\" href=\"#\">&nbsp;Something else here</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"chart-area\"><canvas data-bs-chart=\"{&quot;type&quot;:&quot;line&quot;,&quot;data&quot;:{&quot;labels&quot;:[&quot;Jan&quot;,&quot;Feb&quot;,&quot;Mar&quot;,&quot;Apr&quot;,&quot;May&quot;,&quot;Jun&quot;,&quot;Jul&quot;,&quot;Aug&quot;],&quot;datasets&quot;:[{&quot;label&quot;:&quot;Earnings&quot;,&quot;fill&quot;:true,&quot;data&quot;:[&quot;0&quot;,&quot;10000&quot;,&quot;5000&quot;,&quot;15000&quot;,&quot;10000&quot;,&quot;20000&quot;,&quot;15000&quot;,&quot;25000&quot;],&quot;backgroundColor&quot;:&quot;rgba(78, 115, 223, 0.05)&quot;,&quot;borderColor&quot;:&quot;rgba(78, 115, 223, 1)&quot;}]},&quot;options&quot;:{&quot;maintainAspectRatio&quot;:false,&quot;legend&quot;:{&quot;display&quot;:false},&quot;title&quot;:{},&quot;scales&quot;:{&quot;xAxes&quot;:[{&quot;gridLines&quot;:{&quot;color&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;zeroLineColor&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;drawBorder&quot;:false,&quot;drawTicks&quot;:false,&quot;borderDash&quot;:[&quot;2&quot;],&quot;zeroLineBorderDash&quot;:[&quot;2&quot;],&quot;drawOnChartArea&quot;:false},&quot;ticks&quot;:{&quot;fontColor&quot;:&quot;#858796&quot;,&quot;padding&quot;:20}}],&quot;yAxes&quot;:[{&quot;gridLines&quot;:{&quot;color&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;zeroLineColor&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;drawBorder&quot;:false,&quot;drawTicks&quot;:false,&quot;borderDash&quot;:[&quot;2&quot;],&quot;zeroLineBorderDash&quot;:[&quot;2&quot;]},&quot;ticks&quot;:{&quot;fontColor&quot;:&quot;#858796&quot;,&quot;padding&quot;:20}}]}}}\"></canvas></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-5 col-xl-4\">\r\n");
      out.write("                            <div class=\"card shadow mb-4\">\r\n");
      out.write("                                <div class=\"card-header d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                    <h6 class=\"text-primary font-weight-bold m-0\">Revenue Sources</h6>\r\n");
      out.write("                                    <div class=\"dropdown no-arrow\"><button class=\"btn btn-link btn-sm dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\" type=\"button\"><i class=\"fas fa-ellipsis-v text-gray-400\"></i></button>\r\n");
      out.write("                                        <div class=\"dropdown-menu shadow dropdown-menu-right animated--fade-in\">\r\n");
      out.write("                                            <p class=\"text-center dropdown-header\">dropdown header:</p><a class=\"dropdown-item\" href=\"#\">&nbsp;Action</a><a class=\"dropdown-item\" href=\"#\">&nbsp;Another action</a>\r\n");
      out.write("                                            <div class=\"dropdown-divider\"></div><a class=\"dropdown-item\" href=\"#\">&nbsp;Something else here</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"chart-area\"><canvas data-bs-chart=\"{&quot;type&quot;:&quot;doughnut&quot;,&quot;data&quot;:{&quot;labels&quot;:[&quot;Direct&quot;,&quot;Social&quot;,&quot;Referral&quot;],&quot;datasets&quot;:[{&quot;label&quot;:&quot;&quot;,&quot;backgroundColor&quot;:[&quot;#4e73df&quot;,&quot;#1cc88a&quot;,&quot;#36b9cc&quot;],&quot;borderColor&quot;:[&quot;#ffffff&quot;,&quot;#ffffff&quot;,&quot;#ffffff&quot;],&quot;data&quot;:[&quot;50&quot;,&quot;30&quot;,&quot;15&quot;]}]},&quot;options&quot;:{&quot;maintainAspectRatio&quot;:false,&quot;legend&quot;:{&quot;display&quot;:false},&quot;title&quot;:{}}}\"></canvas></div>\r\n");
      out.write("                                    <div class=\"text-center small mt-4\"><span class=\"mr-2\"><i class=\"fas fa-circle text-primary\"></i>&nbsp;Direct</span><span class=\"mr-2\"><i class=\"fas fa-circle text-success\"></i>&nbsp;Social</span><span class=\"mr-2\"><i class=\"fas fa-circle text-info\"></i>&nbsp;Refferal</span></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                                        \r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                      \r\n");
      out.write("                            <div class=\"card shadow mb-4\">\r\n");
      out.write("                                <div class=\"card-header py-3\">\r\n");
      out.write("                                    <h6 class=\"text-primary font-weight-bold m-0\">Taskings</h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                 \r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Server migration<span class=\"float-right\">20%</span></h4>\r\n");
      out.write("                                    <div class=\"progress mb-4\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-danger\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%;\"><span class=\"sr-only\">20%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Sales tracking<span class=\"float-right\">40%</span></h4>\r\n");
      out.write("                                    <div class=\"progress mb-4\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-warning\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%;\"><span class=\"sr-only\">40%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Customer Database<span class=\"float-right\">60%</span></h4>\r\n");
      out.write("                                    <div class=\"progress mb-4\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-primary\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"><span class=\"sr-only\">60%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Payout Details<span class=\"float-right\">80%</span></h4>\r\n");
      out.write("                                    <div class=\"progress mb-4\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-info\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%;\"><span class=\"sr-only\">80%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Account setup<span class=\"float-right\">Complete!</span></h4>\r\n");
      out.write("                                    <div class=\"progress mb-4\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-success\" aria-valuenow=\"100\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 100%;\"><span class=\"sr-only\">100%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <div class=\"card shadow mb-4\">\r\n");
      out.write("                                <div class=\"card-header py-3\">\r\n");
      out.write("                                    <h6 class=\"text-primary font-weight-bold m-0\">Todo List</h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"flex-container\">\r\n");
      out.write("        <div class=\"task-form\">          \r\n");
      out.write("            <form >  \r\n");
      out.write("                <h1>&nbsp; Task</h1>                \r\n");
      out.write("                                                         \r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\" >                  \r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"adminID\" placeholder=\"Enter Task\" style=\"height:50px; width:500px\"><br>\r\n");
      out.write("                </div>   \r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <button class=\" btn-primary\" type=\"submit\">Add</button>             \r\n");
      out.write("                </div>                        \r\n");
      out.write("                 \r\n");
      out.write("            </form>        \r\n");
      out.write("        </div> \r\n");
      out.write("        </div>         \r\n");
      out.write("                                <ul class=\"list-group list-group-flush\">\r\n");
      out.write("                                    <li class=\"list-group-item\">\r\n");
      out.write("                                        <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <h6 class=\"mb-0\"><strong>Lunch meeting</strong></h6><span class=\"text-xs\">10:30 AM</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\"><input class=\"custom-control-input\" type=\"checkbox\" id=\"formCheck-1\"><label class=\"custom-control-label\" for=\"formCheck-1\"></label></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"list-group-item\">\r\n");
      out.write("                                        <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <h6 class=\"mb-0\"><strong>Lunch meeting</strong></h6><span class=\"text-xs\">11:30 AM</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\"><input class=\"custom-control-input\" type=\"checkbox\" id=\"formCheck-2\"><label class=\"custom-control-label\" for=\"formCheck-2\"></label></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"list-group-item\">\r\n");
      out.write("                                        <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <h6 class=\"mb-0\"><strong>Lunch meeting</strong></h6><span class=\"text-xs\">11:30 AM</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\"><input class=\"custom-control-input\" type=\"checkbox\" id=\"formCheck-2\"><label class=\"custom-control-label\" for=\"formCheck-2\"></label></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"list-group-item\">\r\n");
      out.write("                                        <div class=\"row align-items-center no-gutters\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <h6 class=\"mb-0\"><strong>Lunch meeting</strong></h6><span class=\"text-xs\">12:30 AM</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\"><input class=\"custom-control-input\" type=\"checkbox\" id=\"formCheck-3\"><label class=\"custom-control-label\" for=\"formCheck-3\"></label></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                         \r\n");
      out.write("                        <div class=\"col\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card text-white bg-primary shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <p class=\"m-0\">Primary</p>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\">#4e73df</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card text-white bg-success shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <p class=\"m-0\">Success</p>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\">#1cc88a</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card text-white bg-info shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <p class=\"m-0\">Info</p>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\">#36b9cc</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card text-white bg-warning shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <p class=\"m-0\">Warning</p>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\">#f6c23e</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card text-white bg-danger shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <p class=\"m-0\">Danger</p>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\">#e74a3b</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card text-white bg-secondary shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <p class=\"m-0\">Secondary</p>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\">#858796</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                                        <img class=\"company-logo\" src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"375\" width=\"375\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <footer class=\"bg-white sticky-footer\">\r\n");
      out.write("                <div class=\"container my-auto\">\r\n");
      out.write("                <div class=\"text-center my-auto copyright\"><span>Copyright © KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</span></div>\r\n");
      out.write("\r\n");
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
