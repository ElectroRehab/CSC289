<%-- 
    Document   : indexMain.jsp
    Created on : Feb 3, 2021, 6:40:30 AM
    Author     : Anthony
--%>
<%@page import="readfile.ConnectDB"%>
<%@page import="readfile.ReadSessions"%>
<%@page import="readfile.ReadSQL"%>
<%@page import="readfile.ReadFile"%>
<%@page import ="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="Content-Security-Policy" content="default-src;        
        script-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com;  ;     
        style-src 'report-sample' 'self' 'sha256-47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU='
        'sha256-z7zcnw/4WalZqx+PrNaRnoeLz/G9WXuFqV1WCJ129sg=' https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
        img-src 'self' data:; base-uri 'self'; object-src 'self'; 
        connect-src 'self'; font-src 'self'  https://cdnjs.cloudflare.com https://fonts.gstatic.com; 
        frame-src 'self';  
        manifest-src 'self'; media-src 'self';  
        worker-src 'none';">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
     <link rel="stylesheet" href="assetsJSP/css/adminControl.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    
</head>

<body id="page-top">
<%
    ReadSessions r = new ReadSessions();
    r.getPost(request, response, session);
%>
    <div id="wrapper">
        <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
            <div class="container-fluid d-flex flex-column p-0"><a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                    <div><img src="assetsJSP/css/images/CompanyLogo.png" height="60" width="60"></div>
                    
                </a>
                <div class="text"><span><b>Personnel Management</b></span></div>
                <hr class="sidebar-divider my-0">
                <ul class="nav navbar-nav text-light" id="accordionSidebar">
                    <li class="nav-item"><a class="nav-link active" href="indexAdminControl.jsp"><i class="fas fa-tachometer-alt"></i><span>Dashboard</span></a></li>
                    <li class="nav-item"><a class="nav-link active" href="profile.jsp"><i class="fas fa-user"></i><span>Profile</span></a></li>     
                    <li class="nav-item"><a class="nav-link active" href="taskList.jsp"><i class="fas fa-user"></i><span>Task</span></a></li>  
                    <li class="nav-item"><a class="nav-link active" href="tableAdmin.jsp"><i class="fas fa-table"></i><span>Admin Table</span></a></li>
                    <li class="nav-item"><a class="nav-link active" href="tableUser.jsp"><i class="fas fa-table"></i><span>Employee Table</span></a></li>
                    <li class="nav-item"><a class="nav-link active" href="workTable.jsp"><i class="fas fa-table"></i><span>Work Table</span></a></li>
                    <li class="nav-item"><a class="nav-link active" href="timeWorkedTable.jsp"><i class="fas fa-table"></i><span>Time Worked Table</span></a></li>
                    <li class="nav-item"><a class="nav-link active" href="resetLockedAccount.jsp"><i class="fas fa-lock-open"></i><span>Reset Locked Account</span></a></li>
                    <li class="nav-item"><a class="nav-link active" href="indexMainPage.jsp"><i class="far fa-user-circle"></i><span>Log out</span></a></li>
                     
                </ul>
                <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
            </div>
            
        </nav>
        <div class="d-flex flex-column" id="content-wrapper">
            <div id="content">
                <nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
                    <div class="container-fluid"><button class="btn btn-link d-md-none rounded-circle mr-3" id="sidebarToggleTop" type="button"><i class="fas fa-bars"></i></button>
                        <form class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                            <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                            </div>
                        </form>
                        <ul class="nav navbar-nav flex-nowrap ml-auto">
                            <li class="nav-item dropdown d-sm-none no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><i class="fas fa-search"></i></a>
                                <div class="dropdown-menu dropdown-menu-right p-3 animated--grow-in" aria-labelledby="searchDropdown">
                                    <form class="form-inline mr-auto navbar-search w-100">
                                        <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                            <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                        </div>
                                    </form>
                                </div>
                            </li>
                            <li class="nav-item dropdown no-arrow mx-1">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="badge badge-danger badge-counter">3+</span><i class="fas fa-bell fa-fw"></i></a>
                                    <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in">
                                        <h6 class="dropdown-header">alerts center</h6><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="mr-3">
                                                <div class="bg-primary icon-circle"><i class="fas fa-file-alt text-white"></i></div>
                                            </div>
                                            <div><span class="small text-gray-500">December 12, 2019</span>
                                                <p>A new monthly report is ready to download!</p>
                                            </div>
                                        </a><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="mr-3">
                                                <div class="bg-success icon-circle"><i class="fas fa-donate text-white"></i></div>
                                            </div>
                                            <div><span class="small text-gray-500">December 7, 2019</span>
                                                <p>$290.29 has been deposited into your account!</p>
                                            </div>
                                        </a><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="mr-3">
                                                <div class="bg-warning icon-circle"><i class="fas fa-exclamation-triangle text-white"></i></div>
                                            </div>
                                            <div><span class="small text-gray-500">December 2, 2019</span>
                                                <p>Spending Alert: We've noticed unusually high spending for your account.</p>
                                            </div>
                                        </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All Alerts</a>
                                    </div>
                                </div>
                            </li>
                            <li class="nav-item dropdown no-arrow mx-1">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><i class="fas fa-envelope fa-fw"></i><span class="badge badge-danger badge-counter">7</span></a>
                                    <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in">
                                        <h6 class="dropdown-header">alerts center</h6><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar4.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>Hi there! I am wondering if you can help me with a problem I've been having.</span></div>
                                                <p class="small text-gray-500 mb-0">Emily Fowler - 58m</p>
                                            </div>
                                        </a><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar2.jpeg">
                                                <div class="status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>I have the photos that you ordered last month!</span></div>
                                                <p class="small text-gray-500 mb-0">Jae Chun - 1d</p>
                                            </div>
                                        </a><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar3.jpeg">
                                                <div class="bg-warning status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>Last month's report looks great, I am very happy with the progress so far, keep up the good work!</span></div>
                                                <p class="small text-gray-500 mb-0">Morgan Alvarez - 2d</p>
                                            </div>
                                        </a><a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar5.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</span></div>
                                                <p class="small text-gray-500 mb-0">Chicken the Dog · 2w</p>
                                            </div>
                                        </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All Alerts</a>
                                    </div>
                                </div>
                                <div class="shadow dropdown-list dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown"></div>
                            </li>
                            <div class="d-none d-sm-block topbar-divider"></div>
                            <li class="nav-item dropdown no-arrow">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="d-none d-lg-inline mr-2 text-gray-600 small">Administrator</span><img class="border rounded-circle img-profile" src="assetsJSP/css/images/iconfinder_Account_1891016.png"></a>
                                    <div class="dropdown-menu shadow dropdown-menu-right animated--grow-in"><a class="dropdown-item" href="profile.jsp"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Profile</a><a class="dropdown-item" href="#"><i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Settings</a><a class="dropdown-item" href="index.jsp"><i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Activity log</a>
                                        <div class="dropdown-divider"></div><a class="dropdown-item" href="indexMainPage.jsp"><i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Logout</a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
                <div class="container-fluid">
                    <div class="d-sm-flex justify-content-between align-items-center mb-4">
                        <h3 class="text-dark mb-0">Dashboard</h3><a class="btn btn-primary btn-sm d-none d-sm-inline-block" role="button" href="#"><i class="fas fa-download fa-sm text-white-50"></i>&nbsp;Generate Report</a>
                    </div>
                    <div class="row">
                        <div class="col-md-6 col-xl-3 mb-4">
                            <div class="card shadow border-left-primary py-2">
                                <div class="card-body">
                                    <div class="row align-items-center no-gutters">
                                        <div class="col mr-2">
                                            <div class="text-uppercase text-primary font-weight-bold text-xs mb-1"><span>Total Number of Employees</span></div>
                                            <div class="text-dark font-weight-bold h5 mb-0"> 
                                                <%    
    try{
        // Create object
        ReadSQL s = new ReadSQL();
        // Create a new clean connection to database.          
        ConnectDB dbc = new ConnectDB();
        dbc.ConnectDB();
        Connection con = dbc.getConnections();
        Statement st=con.createStatement();
        s.ReadSQL(19);
        ResultSet rs=st.executeQuery(s.getSQLAll().toString());
   
        String Countrow="";                     
        while(rs.next()){
            Countrow = rs.getString(1);
        }
              
            %>               
             <span><%out.println("Employee Total: " +Countrow);%> </span>      
           
    <%
    }
    
    catch(Exception e){
        out.print(e.getMessage());
    }
    finally{         
    }
    %> </div>
                                        </div>
                                        <div class="col-auto"><i class="fas fa-users fa-2x text-blue-300"></i></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-xl-3 mb-4">
                            <div class="card shadow border-left-success py-2">
                                <div class="card-body">
                                    <div class="row align-items-center no-gutters">
                                        <div class="col mr-2">
                                            <div class="text-uppercase text-success font-weight-bold text-xs mb-1"><span>Number of Employees Working</span></div>
                                            <div class="text-dark font-weight-bold h5 mb-0">                                            <%    
    try{
        
        // Create object
        ReadSQL s = new ReadSQL();
        // Create a new clean connection to database.          
        ConnectDB dbc = new ConnectDB();
        dbc.ConnectDB();
        Connection con = dbc.getConnections();
        Statement st=con.createStatement();
        // Run the SQL Reader Class
        s.ReadSQL(20);
        ResultSet rs=st.executeQuery(s.getSQLAll().toString());   
        String Countrow="";                     
        while(rs.next()){
            Countrow = rs.getString(1);        
        }
              
            %>               
             <span><%out.println("Employee Total: " +Countrow);%> </span>      
           
    <%
    }
    
    catch(Exception e){
        out.print(e.getMessage());
    }
    finally{         
    }
    %><span> </span></div>
                                        </div>
                                        <div class="col-auto"><i class="fas fa-users fa-2x text-blue-300"></i></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-xl-3 mb-4">
                            <div class="card shadow border-left-info py-2">
                                <div class="card-body">
                                    <div class="row align-items-center no-gutters">
                                        <div class="col mr-2">
                                            <div class="text-uppercase text-info font-weight-bold text-xs mb-1"><span>Tasks</span></div>
                                            <div class="row no-gutters align-items-center">
                                                <div class="col-auto">
                                                    <div class="text-dark font-weight-bold h5 mb-0 mr-3"><span>50%</span></div>
                                                </div>
                                                <div class="col">
                                                    <div class="progress progress-sm">
                                                        <div class="progress-bar bg-info" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"><span class="sr-only">50%</span></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-auto"><i class="fas fa-clipboard-list fa-2x text-blue-300"></i></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-xl-3 mb-4">
                            <div class="card shadow border-left-warning py-2">
                                <div class="card-body">
                                    <div class="row align-items-center no-gutters">
                                        <div class="col mr-2">
                                            <div class="text-uppercase text-warning font-weight-bold text-xs mb-1"><span>Pending Registration Requests</span></div>
                                            <div class="text-dark font-weight-bold h5 mb-0"><span>18</span></div>
                                        </div>
                                        <div class="col-auto"><i class="fas fa-comments fa-2x text-blue-300"></i></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-7 col-xl-8">
                            <div class="card shadow mb-4">
                                <div class="card-header d-flex justify-content-between align-items-center">
                                    <h6 class="text-primary font-weight-bold m-0">Earnings Overview</h6>
                                    <div class="dropdown no-arrow"><button class="btn btn-link btn-sm dropdown-toggle" data-toggle="dropdown" aria-expanded="false" type="button"><i class="fas fa-ellipsis-v text-gray-400"></i></button>
                                        <div class="dropdown-menu shadow dropdown-menu-right animated--fade-in">
                                            <p class="text-center dropdown-header">dropdown header:</p><a class="dropdown-item" href="#">&nbsp;Action</a><a class="dropdown-item" href="#">&nbsp;Another action</a>
                                            <div class="dropdown-divider"></div><a class="dropdown-item" href="#">&nbsp;Something else here</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="chart-area"><canvas data-bs-chart="{&quot;type&quot;:&quot;line&quot;,&quot;data&quot;:{&quot;labels&quot;:[&quot;Jan&quot;,&quot;Feb&quot;,&quot;Mar&quot;,&quot;Apr&quot;,&quot;May&quot;,&quot;Jun&quot;,&quot;Jul&quot;,&quot;Aug&quot;],&quot;datasets&quot;:[{&quot;label&quot;:&quot;Earnings&quot;,&quot;fill&quot;:true,&quot;data&quot;:[&quot;0&quot;,&quot;10000&quot;,&quot;5000&quot;,&quot;15000&quot;,&quot;10000&quot;,&quot;20000&quot;,&quot;15000&quot;,&quot;25000&quot;],&quot;backgroundColor&quot;:&quot;rgba(78, 115, 223, 0.05)&quot;,&quot;borderColor&quot;:&quot;rgba(78, 115, 223, 1)&quot;}]},&quot;options&quot;:{&quot;maintainAspectRatio&quot;:false,&quot;legend&quot;:{&quot;display&quot;:false},&quot;title&quot;:{},&quot;scales&quot;:{&quot;xAxes&quot;:[{&quot;gridLines&quot;:{&quot;color&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;zeroLineColor&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;drawBorder&quot;:false,&quot;drawTicks&quot;:false,&quot;borderDash&quot;:[&quot;2&quot;],&quot;zeroLineBorderDash&quot;:[&quot;2&quot;],&quot;drawOnChartArea&quot;:false},&quot;ticks&quot;:{&quot;fontColor&quot;:&quot;#858796&quot;,&quot;padding&quot;:20}}],&quot;yAxes&quot;:[{&quot;gridLines&quot;:{&quot;color&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;zeroLineColor&quot;:&quot;rgb(234, 236, 244)&quot;,&quot;drawBorder&quot;:false,&quot;drawTicks&quot;:false,&quot;borderDash&quot;:[&quot;2&quot;],&quot;zeroLineBorderDash&quot;:[&quot;2&quot;]},&quot;ticks&quot;:{&quot;fontColor&quot;:&quot;#858796&quot;,&quot;padding&quot;:20}}]}}}"></canvas></div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-5 col-xl-4">
                            <div class="card shadow mb-4">
                                <div class="card-header d-flex justify-content-between align-items-center">
                                    <h6 class="text-primary font-weight-bold m-0">Revenue Sources</h6>
                                    <div class="dropdown no-arrow"><button class="btn btn-link btn-sm dropdown-toggle" data-toggle="dropdown" aria-expanded="false" type="button"><i class="fas fa-ellipsis-v text-gray-400"></i></button>
                                        <div class="dropdown-menu shadow dropdown-menu-right animated--fade-in">
                                            <p class="text-center dropdown-header">dropdown header:</p><a class="dropdown-item" href="#">&nbsp;Action</a><a class="dropdown-item" href="#">&nbsp;Another action</a>
                                            <div class="dropdown-divider"></div><a class="dropdown-item" href="#">&nbsp;Something else here</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="chart-area"><canvas data-bs-chart="{&quot;type&quot;:&quot;doughnut&quot;,&quot;data&quot;:{&quot;labels&quot;:[&quot;Direct&quot;,&quot;Social&quot;,&quot;Referral&quot;],&quot;datasets&quot;:[{&quot;label&quot;:&quot;&quot;,&quot;backgroundColor&quot;:[&quot;#4e73df&quot;,&quot;#1cc88a&quot;,&quot;#36b9cc&quot;],&quot;borderColor&quot;:[&quot;#ffffff&quot;,&quot;#ffffff&quot;,&quot;#ffffff&quot;],&quot;data&quot;:[&quot;50&quot;,&quot;30&quot;,&quot;15&quot;]}]},&quot;options&quot;:{&quot;maintainAspectRatio&quot;:false,&quot;legend&quot;:{&quot;display&quot;:false},&quot;title&quot;:{}}}"></canvas></div>
                                    <div class="text-center small mt-4"><span class="mr-2"><i class="fas fa-circle text-primary"></i>&nbsp;Direct</span><span class="mr-2"><i class="fas fa-circle text-success"></i>&nbsp;Social</span><span class="mr-2"><i class="fas fa-circle text-info"></i>&nbsp;Refferal</span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                                        
                    <div class="row">
                        <div class="col-lg-6 mb-4">                  
                    </div>
                </div>
             </div>
            <footer class="bg-white sticky-footer">
                <div class="container my-auto">
                <div class="text-center my-auto copyright"><span>Copyright © KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</span></div>

                </div>
            </footer>
        </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/chart.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>