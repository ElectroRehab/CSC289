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
        <link rel="stylesheet" href="assetsJSP/css/mainPage.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
       
    <body>
        
        <nav>
		<a class="active" href="">Home</a>
		<div class="dropdown">
			<button class="dropbtn">Account
      				<i class="fa fa-caret-down"></i>
    			</button>
                    
    			<div class="dropdown-content">
      				<a href="indexAdminLogin.jsp">Admin Login </a>
                                <a href="indexUserLogin.jsp">User Login</a>
                                <a href="indexAdminRegistration.jsp">Create Admin Account</a>
                                <a href="indexUserRegistration.jsp">Create User Account</a>
   			</div>
		</div>
	 
        
		<a href="about">About</a>
		<a href="contact">Contact</a>
		<div class="dropdown">
			<button class="dropbtn">Blank
      				<i class="fa fa-caret-down"></i>
    			</button>
    			<div class="dropdown-content">
      				<a href="https://www.udemy.com/">Udemy </a>
      				<a href="https://www.w3schools.com/">W3Schools</a>
      				<a href="https://www.codecademy.com/">Code Academy</a>
   			 </div>
		</div>
	</nav>

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
