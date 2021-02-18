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
           <nav>
               <div  >                    
                        <a href="index.jsp">Home</a>             
               </div>           
           </nav>   
          <div class="login-clean">          
            <form action="indexAdminLoginAction.jsp" method="post" >  
                <h1>Admin Login</h1>                
                <div class="illustration">                       
                    <img src="assetsJSP/css/images/iconfinder_Account_1891016.png" alt="accountIcon" width= "60"  height="60" >
                </div>
                <div class="form-group" >                  
                    <input class="form-control" type="text" name="adminID" placeholder="Scan ID"><br>
                </div>   
                <div class="form-group">
                    <input class="form-control"  type="password" name="pinNum" placeholder="Enter pin"  required=""><br>                    
                </div>  
                <div class="form-group">
                    <button class=" btn-primary" type="submit">Login</button>             
                </div>                        
                <a href="indexAdminRegistration.jsp"> Create an Admin Account</a>
                        <a class="forgot" href="indexAdminRegistration.jsp"> Forgot username or pin?</a>
            </form>        
        </div>        
        <div class="sticky-footer">
         <footer>      
                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>           
        </footer>             
        </div>        
    </body>
</html>

