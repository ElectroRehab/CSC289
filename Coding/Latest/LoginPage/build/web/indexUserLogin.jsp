<%-- 
    Document   : indexUserLogin
    Created on : Feb 7, 2021, 5:39:52 PM
    Author     : Anthony
--%>
<%@page import="readfile.ReadSessions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <%--Allows for screen responsiveness for other devices--%>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <%--Controls the content security policy for the webpage--%>
        <meta http-equiv="Content-Security-Policy" content="default-src;        
        script-src 'self' 'sha256-OzqmAO+SFutn2tx7ipegj2ASyYCgLzk+60O8Tb/3fkE=';     
        style-src 'report-sample' 'self' 'unsafe-inline' 
        https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
        img-src 'self' data:; base-uri 'self'; object-src 'self'; 
        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; 
        frame-src 'self';  
        manifest-src 'self'; media-src 'self';  
        worker-src 'none';">
        <title>User Login</title>
        <%--Linked stylesheets control the display output of the entire webpage--%>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="assetsJSP/css/loginStyleSheet.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">     
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/Footer-Dark.css">
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/Navigation-with-Button.css">
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/styles.css">
        <link rel="stylesheet" href="assetsJSP/css/popupLoginStyleSheet.css">   
        
    </head>     
    <body>
  
        <%--Clock-In Container Form--%>
        <div class="flex-container">        
            <div class="login-clean-user-login">    
                <form action="indexUserLoginAction.jsp" method="post" >  
                    <div ><h1>Clock-In</h1></div>                
                        <div class="illustration">   
                            <%--Icon image for clock-in form--%>
                            <img src="assetsJSP/css/images/iconfinder_Account_1891016.png" alt="accountIcon" width="60" height="60">
                        </div>
                        <div class="form-group">                  
                            <input class="form-control" type="text" name="userID" placeholder="Scan ID"><br>
                        </div>   
                        <div class="form-group">
                            <input class="form-control"  type="password" name="pinCode" placeholder="Enter pin"  required=""><br>                    
                        </div>  
                        <div class="form-group">
                            <button class="btn btn-primary btn-block" type="submit">Login</button>             
                        </div>                        
                </form>
            </div>
        </div >
        <%--Navigation Menu--%>
        <nav class="navbar navbar-light navbar-expand-md navigation-clean-button">
        <div class="container"><img class="item-co-logo" src="assetsJSP/css/images/CompanyLogo.png" height="60" width="60">&nbsp;&nbsp;&nbsp;<a class="home-main" href="indexUserLogin.jsp">K&O</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navcol-1">                
                <ul class="nav navbar-nav mr-auto">                    
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Access </a>
                        <div class="dropdown-menu"><a class="dropdown-item" href="indexUserLogin.jsp">Clock-In</a><a class="dropdown-item" href="indexUserLogout.jsp">Clock-Out</a> </div>
                    </li>
                    <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Create Account </a>
                        <div class="dropdown-menu"> <a class="dropdown-item" href="indexUserRegistration.jsp">Create User Account</a></div>
                    </li>                   
                </ul>
                <span class=" "> <a class="home-system-logout" href="index.jsp"data-target="#user-logout" data-toggle="modal" >Portal Logout</a></span> 
            </div>
        </div>
        </nav>  
        <%--Main page background image--%>
        <div><img class="image-main"  src="assetsJSP/css/images/mainPageBackgroundv2.png"</div>
        <div class="footer-dark">
            <footer>
                <div class="container">
                    <div class="row">                    
                        <div class="col item social">
                            <h3>Connect With Us</h3>
                                <a  href="https://www.facebook.com/" target="blank"><i class="fa  fa-facebook"></i></a>
                                <a href="https://twitter.com/?lang=en" target="blank"><i class="fa  fa-twitter"></i></a>
                                <a href="https://myaccount.google.com/intro/profile" target="blank"><i class="fa  fa-google-plus"></i></a>
                                <a href="https://www.youtube.com/" target="blank"><i class="fa  fa-youtube"></i></a>
                        </div>
                    </div>
                    <p class="copyright">&nbsp;© 2021 KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>
                </div>
            </footer>
        </div>  
        <%--Modal controller for portal logout popup menu ///////////////////////////////////////////////////////////////////////--%>
        <div id="user-logout" class="modal fade" role="dialog">
            <div class="modal-dialog">
    
                 <div class="modal-content">
                    <div class="modal-body">
                        <button data-dismiss="modal" class="close">&times;</button>
                            <form action="indexUserSystemLogoutAction.jsp" method="post" >
                                <div ><h2>System Logout</h2></div>              
                                    <div class="form-group" >                  
                                        <input class="form-control" type="text" name="userID" placeholder="Scan User ID"><br>
                                    </div>   
                                    <div class="form-group">
                                        <input class="form-control"  type="password" name="pinNum" placeholder="Enter pin"  required=""><br>                    
                                    </div>  
                                    <div class="form-group">
                                        <button class="home-popup-login" type="submit">Logout</button>             
                                    </div>  
                            </form>
                    </div>
                </div>
            </div>  
        </div>
        <%--Scripts control the display output of the form and popup form features --%>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/bs-init.js"></script>
    </body>
</html>

