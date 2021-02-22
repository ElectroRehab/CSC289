<%-- 
    Document   : indexRegistration
    Created on : Feb 2, 2021, 6:27:44 PM
    Author     : Anthony
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="assetsJSP/css/registrationStyleSheet.css">
         <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <title>Admin Registration</title>  
    </head>
    <body>
        <div class="image">            
            <div><img src="assetsJSP/css/images/mainPageBackgroundv3.png" class="image " alt=”K&OLogo” ></div>              
        </div>
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
    <div class="flex-container" > 
        <nav>
            <div class= "main_home" >                    
                <a href="index.jsp">Home</a>    
                <a href="indexAdminLogin.jsp">Login</a>  
            </div>           
        </nav>  
    </div>
    <div class="form-container" >            
            <div class="reg-box">             
            <h1>Complete the Admin Registration Form</h1>
           <form onsubmit="return validationForm()" action="indexAdminRegistrationAction.jsp" method="post" >   
               <div class="form-image">            
                    <div><img src="assetsJSP/css/images/formBG_Image.png" class="image " alt=”K&OLogo” >    </div>              
                </div>   
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
                  <p>Create Pin#</p>
                  <input class="form-control" name="password_confirm"  type="password" placeholder="Enter pin" id="password"  required="required"  />
               </div>
               <div class="form-group">
                    <input class="form-control" name="password_confirm"   type="password" placeholder="Re-enter pin" id="confirm_password"  required="required"  />
                </div>                
                    <script language='javascript' type='text/javascript'>
                        var password = document.getElementById("password")
                        , confirm_password = document.getElementById("confirm_password");

                        function validatePassword(){
                            if(password.value !== confirm_password.value) 
                            {
                                confirm_password.setCustomValidity("Passwords Don't Match");
                            } 
                            else
                            {
                                confirm_password.setCustomValidity('');
                            }
                        }

                        password.onchange = validatePassword;
                        confirm_password.onkeyup = validatePassword;
                        </script>
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
                       <p>Unique ID</p>
                        <input class="form-control" type="text" name="rand_num" value="<%out.print(linked);%>" readonly="readonly">
                    </div>                    
                            <button type="submit" class="pure-button pure-button-primary">Confirm</button>     
                </div>              
            </form>
        </div> 
    </div>               
    <div class="flex-container">             
        <footer>            
            <div class = "sticky-footer">           
                <p>&copy; KandOPersonnelManagementSystems.com | Designed by Jon King/Anthony Orengo</p>
            </div>
        </footer>              
    </div>
            
    </body>
</html>
