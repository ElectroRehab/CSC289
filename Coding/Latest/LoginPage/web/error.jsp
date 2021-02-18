<%-- 
    Document   : error
    Created on : Feb 2, 2021, 7:07:57 PM
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assetsJSP/css/errorPageStyleSheet.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
        <title>404! Page Error</title><%-- Webpage tab title--%>
    </head>  
    <body>  
        <nav>
             <%-- Creates an active link home button in the nav section--%>   
            <div>                    
                <a href="index.jsp">Home</a>         
            </div>           
        </nav> 
        <header class="error"> 
            <%-- Displays page title using heading style one --%>
            <h1> 404</h1>
            <%-- Set paragraph to display message--%>
            <p>Oops! The page you requested wasn't found. <i class="fas fa-exclamation-triangle"></i></p>                      
        </header>
            
    </body>
</html>

