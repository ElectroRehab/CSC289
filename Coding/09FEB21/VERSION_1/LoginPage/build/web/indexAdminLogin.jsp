<%-- 
    Document   : index
    Created on : Feb 3, 2021, 6:43:26 AM
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="assetsJSP/css/adminLoginStyleSheet.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
          
    <body>
            <button class="home-btn">
            <a href="index.jsp">Home</a>            
            </button>
          <div class="login-clean">            
                    
         </button> 
            <form action="indexAdminLoginAction.jsp" method="post" >  
                <h1>Admin Login</h1>
                
                <div class="illustration">  
                     
                    <img src="assetsJSP/css/images/iconfinder_Account_1891016.png" width=60px height=60px>
                </div>
                <div class="form-group">                  
                    <input class="form-control" type="text" name="adminID" placeholder="Scan ID"><br>
                </div>   
                <div class="form-group">
                    <input class="form-control"  type="password" name="pinNum" placeholder="Enter pin"  required=""><br>                    
                </div>  
                <div class="form-group">
                    <button class="btn btn-primary btn-block" type="submit">Login</button>             
                </div>                        
                <a href="indexAdminRegistration.jsp"> Create an Admin Account</a>
                        <a class="forgot" href="indexAdminRegistration.jsp"> Forgot username or pin?</a>
            </form>        
        </div>
        <div class="footer-dark">
            <footer>                
                <div class="container"> 
                   
                    <div class="row">
                        <div class="col-sm-6 col-md-3 item">
                            <h3>Services</h3>
                            <ul>
                                <li>
                                    <a href="#">Blank</a>                                    
                                </li>
                                <li>
                                    <a href="#">Blank</a>                                    
                                </li>
                                <li>
                                    <a href="#">Blank</a>                                    
                                </li>                                
                            </ul>                           
                        </div>
                        
                    </div> 
                   <div class="row">
                        <div class="col-sm-6 col-md-3 item">
                            <h3>Services</h3>
                            <ul>
                                <li>
                                    <a href="#">Blank</a>                                    
                                </li>
                                <li>
                                    <a href="#">Blank</a>                                    
                                </li>
                                <li>
                                    <a href="#">Blank</a>                                    
                                </li>                                
                            </ul>                           
                        </div>
                        
                    </div> 
                    <div class="col-md-6 item text">
                        <p>Write info</p>                        
                    </div>                   
                </div>
                              
            </footer>                   
        </div> 
        <div class="sticky-footer">
         <footer>
            <h4 > Connect via social media</h4>
            <ul>                
                <li><a  href="https://www.facebook.com/" target="blank"><i class="fa  fa-facebook"></i></a></li>
                <li><a href="https://twitter.com/?lang=en" target="blank"><i class="fa  fa-twitter"></i></a></li>
                <li><a href="https://myaccount.google.com/intro/profile" target="blank"><i class="fa  fa-google-plus"></i></a></li>
                <li><a href="https://www.youtube.com/" target="blank"><i class="fa  fa-youtube"></i></a></li>
                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>
                
            </ul>
            
        </footer>     
            
            
            
        </div>
         
    </body>
</html>
