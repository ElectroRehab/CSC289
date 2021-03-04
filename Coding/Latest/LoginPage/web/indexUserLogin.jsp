<%-- 
    Document   : indexUserLogin
    Created on : Feb 7, 2021, 5:39:52 PM
    Author     : Anthony
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta http-equiv="Content-Security-Policy" content="default-src;  
        script-src 'self' 'unsafe-eval' 'unsafe-inline'; 
        'report-sample'; style-src 'report-sample' 'self' 'unsafe-inline' https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
        img-src 'self'; data; base-uri 'self'; object-src 'self';
        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com; frame-src 'self';  manifest-src 'self'; media-src 'self'; 
        worker-src 'self'; report-uri https://603fa0ec0e0d6cb74f6e96a4.endpoint.csper.io">
        <title>User Login</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="assetsJSP/css/loginStyleSheet.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        
    </head>     
    <body>
         <div class="image">
            
            <div><img src="assetsJSP/css/images/mainPageBackgroundv2.png" class="image " alt=”K&OLogo” >    </div> 
             
        </div>
        
        <div class="flex-container">        
        <div class="login-clean">    
            <form action="indexUserLoginAction.jsp" method="post" >  
                <div style="text-align: left"><h1>User Login</h1></div>                
                <div class="illustration">                     
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
                    <a href="indexUserRegistration.jsp"> Create a user Account</a>
                    <a class="forgot" href="indexUserRegistration.jsp"> Forgot username or pin?</a>         
            </form>
        </div>
        </div >
        <div class="flex-container">
           <nav>
               <div  >                    
                        <a href="index.jsp">Home</a>             
               </div>           
           </nav>   
       </div>          
        <div class="sticky-footer">
         <footer>      
                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>           
        </footer>             
        </div>   
    </body>
</html>

