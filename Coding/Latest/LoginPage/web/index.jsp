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
        <div class="image">            
            <div><img src="assetsJSP/css/images/mainPageBackgroundv2.png" class="image " alt=”K&OLogo” ></div>              
        </div>
        <div class="flex-container" >            
            <nav>              
                <a class="active" href="">Home</a>                
		<div class="dropdown">
		    <button class="dropbtn">Account
      		        <i class="fa fa-caret-down"></i>
    		    </button>                    
    	        <div class="dropdown-content">
      		    <a href="indexAdminLogin.jsp">Admin Login </a>
                    <a href="indexUserLogin.jsp">User Login</a>
                    <a href="indexUserLogout.jsp">User LogOut</a>
                    <a href="indexAdminRegistration.jsp">Create Admin Account</a>
                    <a href="indexUserRegistration.jsp">Create User Account</a>
   	        </div>
		</div>     
                    <a href="ohNo.jsp">About</a>
                    <a href="ohNo.jsp">Contact</a>
		<div class="dropdown" id="wrapper">
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
        </div>        
        <div class="flex-container"> 
            
            <footer>
             
                <div class = "sticky-footer">
             
                    <h4 > Connect via social media</h4>
                        <ul>                
                            <li><a  href="https://www.facebook.com/" target="blank"><i class="fa  fa-facebook"></i></a></li>
                            <li><a href="https://twitter.com/?lang=en" target="blank"><i class="fa  fa-twitter"></i></a></li>
                            <li><a href="https://myaccount.google.com/intro/profile" target="blank"><i class="fa  fa-google-plus"></i></a></li>
                            <li><a href="https://www.youtube.com/" target="blank"><i class="fa  fa-youtube"></i></a></li>               
                        </ul>
                    <div class="copy-right"><p>&nbsp; &copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p></div>            
                </div>
            </footer>              
        </div>      
    </body>
</html>
