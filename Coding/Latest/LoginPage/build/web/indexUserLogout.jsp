<%-- 
    Document   : indexUserLogout
    Created on : Feb 11, 2021, 6:06:26 PM
    Author     : Anthony
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="assetsJSP/css/loginStyleSheet.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>     
    <body class="body2">
        <nav>
            <div class= "main_home" >                    
                <a href="index.jsp">Home</a>             
            </div>           
        </nav>  
        <div class="login-clean">            
            <form action="indexUserLogoutAction.jsp" method="post" >  
                <h1>User Logout</h1>                
                <div class="illustration">                    
                    <img src="assetsJSP/css/images/iconfinder_Account_1891016.png" width="60" height="60">
                </div>
                <div class="form-group">                  
                    <input class="form-control" type="text" name="userID" placeholder="Scan ID"><br>
                </div>   
                <div class="form-group">
                    <input class="form-control"  type="password" name="pinCode" placeholder="Enter pin"  required=""><br>                    
                </div>  
                <div class="form-group">
                    <button class="btn btn-primary btn-block" type="submit">Log Out</button>             
                </div>                        
            </form>   
        </div>          
    </body>
</html>
