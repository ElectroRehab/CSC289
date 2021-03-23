package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import readfile.ReadSessions;
import readfile.ReadTitles;
import readfile.ReadSQL;
import readfile.ReadFile;
import java.sql.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("    <title>Profile - Brand</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/css/adminControl.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetsJSP/mainPageCSS/styles.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page-top\">\r\n");

    ReadSessions r = new ReadSessions();
    r.getPost(request, response, session);

      out.write("\r\n");
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
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"resetLockedAccount.jsp\"><i class=\"fas fa-lock-open\"></i><span>Reset Locked Account</span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"indexMainPage.jsp\"><i class=\"far fa-user-circle\"></i><span>Log out</span></a></li>\r\n");
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
      out.write("                    <h3 class=\"text-dark mb-4\">Profile</h3>\r\n");
      out.write("                    <div class=\"row mb-3\">\r\n");
      out.write("                        <div class=\"col-lg-4\">\r\n");
      out.write("                            <div class=\"card mb-3\">\r\n");
      out.write("                                <div class=\"card-body text-center shadow\"><img class=\"rounded-circle mb-3 mt-4\" src=\"assetsJSP/css/images/iconfinder_Account_1891016.png\" width=\"160\" height=\"160\">\r\n");
      out.write("                                    <div class=\"mb-3\"><button class=\"btn btn-primary btn-sm\" type=\"button\">Change Photo</button></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card shadow mb-4\">\r\n");
      out.write("                                <div class=\"card-header py-3\">\r\n");
      out.write("                                    <h6 class=\"text-primary font-weight-bold m-0\">Projects</h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Server migration<span class=\"float-right\">20%</span></h4>\r\n");
      out.write("                                    <div class=\"progress progress-sm mb-3\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-danger\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%;\"><span class=\"sr-only\">20%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Sales tracking<span class=\"float-right\">40%</span></h4>\r\n");
      out.write("                                    <div class=\"progress progress-sm mb-3\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-warning\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%;\"><span class=\"sr-only\">40%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Customer Database<span class=\"float-right\">60%</span></h4>\r\n");
      out.write("                                    <div class=\"progress progress-sm mb-3\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-primary\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"><span class=\"sr-only\">60%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Payout Details<span class=\"float-right\">80%</span></h4>\r\n");
      out.write("                                    <div class=\"progress progress-sm mb-3\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-info\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%;\"><span class=\"sr-only\">80%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"small font-weight-bold\">Account setup<span class=\"float-right\">Complete!</span></h4>\r\n");
      out.write("                                    <div class=\"progress progress-sm mb-3\">\r\n");
      out.write("                                        <div class=\"progress-bar bg-success\" aria-valuenow=\"100\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 100%;\"><span class=\"sr-only\">100%</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <div class=\"row mb-3 d-none\">\r\n");
      out.write("                                <div class=\"col\">\r\n");
      out.write("                                    <div class=\"card text-white bg-primary shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"row mb-2\">\r\n");
      out.write("                                                <div class=\"col\">\r\n");
      out.write("                                                    <p class=\"m-0\">Peformance</p>\r\n");
      out.write("                                                    <p class=\"m-0\"><strong>65.2%</strong></p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-auto\"><i class=\"fas fa-rocket fa-2x\"></i></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\"><i class=\"fas fa-arrow-up\"></i>&nbsp;5% since last month</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col\">\r\n");
      out.write("                                    <div class=\"card text-white bg-success shadow\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"row mb-2\">\r\n");
      out.write("                                                <div class=\"col\">\r\n");
      out.write("                                                    <p class=\"m-0\">Peformance</p>\r\n");
      out.write("                                                    <p class=\"m-0\"><strong>65.2%</strong></p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-auto\"><i class=\"fas fa-rocket fa-2x\"></i></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <p class=\"text-white-50 small m-0\"><i class=\"fas fa-arrow-up\"></i>&nbsp;5% since last month</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             ");
    
    try{
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
        con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
        Statement st=con.createStatement();
        sqlInt = 12;
        s.ReadSQL(sqlInt);
        ResultSet rs=st.executeQuery(s.getSQLAll());
    
      out.write("\r\n");
      out.write("     ");
 rs.next(); 
    
            
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col\">\r\n");
      out.write("                                    <div class=\"card shadow mb-3\">\r\n");
      out.write("                                        <div class=\"card-header py-3\">\r\n");
      out.write("                                            <p class=\"text-primary m-0 font-weight-bold\">User Information</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <form>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <div class=\"form-row\">\r\n");
      out.write("                                                    <div class=\"col\">\r\n");
      out.write("                                                        <div class=\"form-group\"><label for=\"first_name\"><strong>First Name</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"");
t.ReadTitles(3);
      out.write("\r\n");
      out.write("                ");
      out.print(rs.getString(t.getSQLTitles()));
      out.write("\" name=\"first_name\"></div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col\">\r\n");
      out.write("                                                        <div class=\"form-group\"><label for=\"last_name\"><strong>Last Name</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"");
t.ReadTitles(4);
      out.write("\r\n");
      out.write("                 ");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("\" name=\"last_name\"></div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                    <div class=\"form-row\">\r\n");
      out.write("                                                     <div class=\"col\">\r\n");
      out.write("                                                        <div class=\"form-group\"><label for=\"phone_nuber\"><strong>Phone Number</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"");
t.ReadTitles(9);
      out.write("\r\n");
      out.write("                ");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("\" name=\"last_name\"></div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col\">\r\n");
      out.write("                                                        <div class=\"form-group\"><label for=\"email\"><strong>Email Address</strong></label><input class=\"form-control\" type=\"email\" placeholder=\"");
t.ReadTitles(10);
      out.write("\r\n");
      out.write("                 ");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("\" name=\"email\"></div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\"><button class=\"btn btn-primary btn-sm\" type=\"submit\">Save Settings</button></div>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card shadow\">\r\n");
      out.write("                                        <div class=\"card-header py-3\">\r\n");
      out.write("                                            <p class=\"text-primary m-0 font-weight-bold\">Contact Settings</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <form>\r\n");
      out.write("                                                <div class=\"form-group\"><label for=\"address\"><strong>Address</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"");
t.ReadTitles(5);
      out.write("\r\n");
      out.write("                 ");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("\" name=\"address\"></div>\r\n");
      out.write("                                                <div class=\"form-group\"><label for=\"city\"><strong>City</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"");
t.ReadTitles(6);
      out.write("\r\n");
      out.write("                ");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("\" name=\"address\"></div>\r\n");
      out.write("                 \r\n");
      out.write("                                                <div class=\"form-row\">\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"col\">\r\n");
      out.write("                                                        <div class=\"form-group\"><label for=\"State\"><strong>State</strong></label><input class=\"form-control\" type=\"text\" placeholder=\" ");
t.ReadTitles(7);
      out.write("\r\n");
      out.write("                 ");
      out.print(rs.getString(t.getSQLTitles()) );
      out.write("\" name=\"State\"></div>\r\n");
      out.write("                                                    </div>                      \r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                    <div class=\"form-row\">\r\n");
      out.write("\r\n");
      out.write("                                                   <div class=\"col\">\r\n");
      out.write("                                                        <div class=\"form-group\"><label for=\"country\"><strong>Country</strong></label><input class=\"form-control\" type=\"text\" value=\"USA\" name=\"country\"></div>\r\n");
      out.write(" \r\n");
      out.write("                                                    </div>   \r\n");
      out.write("                                                        <div class=\"col\">\r\n");
      out.write("                                                                <img class=\"world-map-image\" src=\"assetsJSP/css/images/worldImage.png\" alt=\"worldIcon\">    \r\n");
      out.write("                                                    </div>  \r\n");
      out.write("                                                                                               \r\n");
      out.write("                                                </div>                                           \r\n");
      out.write("                                                <div class=\"form-group\"><button class=\"btn btn-primary btn-sm\" type=\"submit\">Save&nbsp;Settings</button></div>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                                             \r\n");
      out.write("                            ");
}

    catch(Exception e){
        out.print(e.getMessage());
      out.write("<br>");

    }
    finally{         
    }
    
      out.write("\r\n");
      out.write("                    <div class=\"card shadow mb-5\">\r\n");
      out.write("                        <div class=\"card-header py-3\">\r\n");
      out.write("                            <p class=\"text-primary m-0 font-weight-bold\">Forum Settings</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                        <div class=\"form-group\"><label for=\"signature\"><strong>Signature</strong><br></label><textarea class=\"form-control\" rows=\"4\" name=\"signature\"></textarea></div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"custom-control custom-switch\"><input class=\"custom-control-input\" type=\"checkbox\" id=\"formCheck-1\"><label class=\"custom-control-label\" for=\"formCheck-1\"><strong>Notify me about new replies</strong></label></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\"><button class=\"btn btn-primary btn-sm\" type=\"submit\">Save Settings</button></div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"company-logo-profile-table\" src=\"assetsJSP/css/images/CompanyLogo.png\" height=\"280\" width=\"280\">\r\n");
      out.write("            <footer class=\"bg-white sticky-footer\">\r\n");
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
