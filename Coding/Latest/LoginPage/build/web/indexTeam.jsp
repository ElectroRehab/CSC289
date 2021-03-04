<%-- 
    Document   : indexTeam
    Created on : Mar 3, 2021, 7:17:28 AM
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="Content-Security-Policy" content="default-src;  
    script-src 'self' 'unsafe-eval' 'unsafe-inline'; 
    'report-sample'; style-src 'report-sample' 'self' 'unsafe-inline' https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
    img-src 'self'; data; base-uri 'self'; object-src 'self';
    connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com; frame-src 'self';  manifest-src 'self'; media-src 'self'; 
    worker-src 'self'; report-uri https://603fa0ec0e0d6cb74f6e96a4.endpoint.csper.io">
    <title>Company Team</title>
     
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assetsJSP/mainPageCSS/fonts/ionicons.min.css">
    <link rel="stylesheet" href="assetsJSP/mainPageCSS/Footer-Dark.css">
    <link rel="stylesheet" href="assetsJSP/mainPageCSS/Navigation-with-Button.css">
    <link rel="stylesheet" href="assetsJSP/mainPageCSS/styles.css">
    <link rel="stylesheet" href="assetsJSP/css/teamStyleSheet.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">  
   
</head>
 
<body>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean-button">
        <div class="container"><a class="navbar-brand" href="index.jsp">K&O</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav mr-auto">
                    
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Access </a>
                        <div class="dropdown-menu"><a class="dropdown-item" href="indexUserLogin.jsp">Clock-In</a><a class="dropdown-item" href="indexUserLogout.jsp">Clock-Out</a><a class="dropdown-item" href="indexAdminLogin.jsp">Admin Login</a></div>
                    </li>
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Create Account </a>
                        <div class="dropdown-menu"><a class="dropdown-item" href="indexAdminRegistration.jsp">Create Admin Account</a><a class="dropdown-item" href="indexUserRegistration.jsp">Create User Account</a></div>
                    </li>
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Info </a>
                        <div class="dropdown-menu"><a class="dropdown-item" href="indexAboutCompany.jsp">About</a><a class="dropdown-item" href="indexCompanyMission.jsp">Mission</a><a class="dropdown-item" href="ohNo.jsp">Contact</a></div>
                    </li>                 
                    
                </ul><span class="navbar-text actions"> <a class="login" href="indexAdminLogin.jsp">Admin Log In</a><a class="btn btn-light action-button" role="button" href="indexAdminRegistration.jsp">Admin Sign Up</a></span>
            </div>
        </div>
    </nav>
    <div class="image-container">
        <h1 style="text-align: center;color:#000000;font-family: microsoft, himalayan;"><b>Company Team</b></h1>
        <div class="image-team-control">
            
            <div><img src="assetsJSP/css/images/Ore_Image.jpg" class="image " alt=”K&OLogo” width="300" height="500" style="border-style: ridge; border-color: gray;border-width: 10px">    </div> 
            <h3 style="color:black;font-family: microsoft, himalayan;"> <b>Anthony Orengo</b></h3>
        </div>
    </div>
  
    <div class="footer-dark">
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-3 item">
                        <h3>Services</h3>
                        <ul>
                            <li><a href="#">Web design</a></li>
                            <li><a href="#">Development</a></li>
                            <li><a href="#">Hosting</a></li>
                        </ul>
                    </div>
                    <div class="col-sm-6 col-md-3 item">
                        <h3>About</h3>
                        <ul>
                            <li><a href="#">Company</a></li>
                            <li><a href="#">Team</a></li>
                            <li><a href="#">Careers</a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 item text">
                        <h3>K&amp;O</h3>
                        <p> K&O Personnel Management System is a web-based application that uses a database to access and store user data, so organizations can better track and monitor their employees.</p>
                    </div>
                    
                    <div class="col item social">
                        <h3>Connect With Us</h3>
                        <a  href="https://www.facebook.com/" target="blank"><i class="fa  fa-facebook"></i></a>
                        <a href="https://twitter.com/?lang=en" target="blank"><i class="fa  fa-twitter"></i></a>
                        <a href="https://myaccount.google.com/intro/profile" target="blank"><i class="fa  fa-google-plus"></i></a>
                        <a href="https://www.youtube.com/" target="blank"><i class="fa  fa-youtube"></i></a></div>
                </div>
                <p class="copyright">&nbsp;© 2021 KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>
            </div>
        </footer>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
</body>

</html>