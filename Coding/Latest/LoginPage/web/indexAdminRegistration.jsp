<%-- 
    Document   : indexRegistration
    Created on : Feb 2, 2021, 6:27:44 PM
    Author     : Anthony
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <meta http-equiv="Content-Security-Policy" content="default-src;        
        script-src 'self'  'sha256-awguPNVIIbmCEbxJooc+Chn+d3lL519kkt42gCq2fyA='    
        ;style-src 'report-sample' 'self' 'unsafe-inline' 
        https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
        img-src 'self' data:; base-uri 'self'; object-src 'self';
        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; 
        frame-src 'self';
        manifest-src 'self'; media-src 'self'; 
        worker-src 'none';">      
         
        <link rel="stylesheet" href="assetsJSP/css/registrationStyleSheet.css">        
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/Navigation-with-Button.css">
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/styles.css">
        <link rel="stylesheet" href="assets/css/styles.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
        <title>Admin Registration</title>  
    </head>
    <body>
        <nav class="navbar navbar-light navbar-expand-md navigation-clean-button">
            <div class="container"><img class="item-co-logo" src="assetsJSP/css/images/CompanyLogo.png" height="60" width="60"><a class="navbar-brand" href="index.jsp" >Home</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav mr-auto">
                    
                    </ul><span class="navbar-text actions"> <a class="login" href="indexAdminLogin.jsp">Admin Log In</a><a class="btn btn-light action-button" role="button" href="indexAdminRegistration.jsp">Admin Sign Up</a></span>
                </div>
            </div>
        </nav>
        <div ><img class="image-reg" src="assetsJSP/css/images/mainPageBackgroundv3.png"</div>     
    <p id="random_number"></p>
    <%
        // Long Integer for first 6 digits of random barcode
        long first = Math.round(Math.random() *999999);
       // Long Integer for second 6 digits of random barcode
        long second = Math.round(Math.random() *999999);
        // Link integers into one 12 character string barcode. 
        String linked = Long.toString(first) + 
                Long.toString(second);
    %> 
    <div class="form-container" >        
        <form onsubmit="return validationForm()" action="indexAdminRegistrationAction.jsp" method="post" >   
            <h1 class="reg-form-title">Complete the Admin Registration Form</h1>  
            <div class="section-one">
                <div class="form-group">
                    <input class="form-control" type="text" name="fname" placeholder="Enter first name" required="" id="holder"><br>                     
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="address" placeholder="Enter address" required=""><br>  
                </div>
                <div class="form-group">
                     <input class="form-control" type="text" name="state" placeholder="Enter state" required=""><br>      
                </div>
                <div class="form-group">
                   <input class="form-control" type="text" name="mobileNo" placeholder="Enter Phone Number" required=""><br>
                </div>
                 <div class="form-group">
                    <div class="pass-inst "><p  > 
                     Create your Pin#</p></div>
                     
                  <input class="form-control" name="password_confirm"  type="password" placeholder="Enter pin" id="plainText1"  required="required"  />
                </div>
                <div class="form-group">
                    <input class="form-control" name="password_Check"   type="password" placeholder="Re-enter pin" id="plainText2"  required="required"  />
                </div>                
                     
            </div>  
            <div class="section-two">
                <div class="form-group">
                    <input class="form-control" type="text" name="lname" placeholder="Enter last name" required=""><br> 
                </div>                   
                <div class="form-group">
                    <input class="form-control" type="text" name="city" placeholder="Enter city" required=""><br> 
                </div>  
                <div class="form-group">                     
                    <input class="form-control" type="text" name="zipcode" placeholder="Enter zip code" required=""><br>
                </div>  
                <div class="form-group">                        
                    <input class="form-control" type="text" name="email" placeholder="Enter email" required=""><br>   
                </div>  
                
                <div class="form-group">                    
                    <input class="form-control" type="text" name="rand_num" value="<%out.print(linked);%>" readonly="readonly">
                </div>    
                <div class="unique-title"><p>Unique ID#</p></div>                
                <button type="submit" class="form-submit-button">Confirm</button>     
            </div>              
        </form>         
    </div>               
    <div class="flex-container">             
        <footer>            
            <div class = "sticky-footer">           
                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>
            </div>
        </footer>              
    </div>
     <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>       
    </body>
</html>
