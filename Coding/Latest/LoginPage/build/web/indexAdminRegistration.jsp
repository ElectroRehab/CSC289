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
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin Registration</title>  
    </head>
    <body>
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
        <nav>
            <div class= "main_home" >                    
                <a href="index.jsp">Home</a>    
                <a href="indexAdminLogin.jsp">Login</a>  
            </div>           
        </nav>       
            <h1>Admin Registration</h1>
            <div class="reg-box">             
            <h1>Complete the Registration Form</h1>
           <form onsubmit="return validationForm()" action="indexAdminRegistrationAction.jsp" method="post" >   
                <div class="section-one">
                    <p>First Name</p>     
                    <input type="text" name="fname" placeholder="Enter first name" required=""><br>                 
                    <p>Address</p>     
                    <input type="text" name="address" placeholder="Enter address" required=""><br>                 
                    <p>State</p>   
                        <input type="text" name="state" placeholder="Enter state" required=""><br>                 
                    <p>Phone Number</p>   
                        <input type="text" name="mobileNo" placeholder="Enter Phone Number" required=""><br>
                    <div class="passwordControl">
                         <h1>Set user Pin#</h1>                    
                             <p>Create Pin</p>  
                                <input name="password_confirm"  type="password" placeholder="Enter pin" id="password"  required="required"  />
                             <p>Confirm Pin:</p>
                                <input name="password_confirm"   type="password" placeholder="Re-enter pin" id="confirm_password"  required="required"  />
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
                </div>                
                <div class="section-two">
                    <p>Last Name</p>     
                          <input class="lastN" type="text" name="lname" placeholder="Enter last name" required=""><br>                 
                    <p>City</p>   
                        <input type="text" name="city" placeholder="Enter city" required=""><br>                 
                    <p>Zip code</p>   
                        <input type="text" name="zipcode" placeholder="Enter zip code" required=""><br>                 
                    <p>Enter Email</p>     
                        <input   type="text" name="email" placeholder="Enter email" required=""><br>        
                    <p>Unique ID</p>     
                        <input   type="text" name="rand_num" value="<%out.print(linked);%>" readonly="readonly">
                    <div class="image-control">
                    
                    </div>
                            <button type="submit" class="pure-button pure-button-primary">Confirm</button>                    
               </div>
            </form>      
        </div>
    </body>
</html>
