<%-- 
    Document   : index
    Created on : Feb 3, 2021, 6:43:26 AM
    Author     : Anthony
--%>
<%@page import="readfile.ReadSQL"%>
<%@page import="readfile.ReadFile"%>
<%@page import="java.util.Random"%>
<%@page import ="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assetsJSP/css/saveStyleSheet.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css"> 
        <title>JSP Page</title>
        <script type="text/javascript" src="jsBarcode.all.min.js"></script>
    </head>  
    <body>    
          <div class="image">            
            <div><img src="assetsJSP/css/images/mainPageBackgroundv3.png" class="image " alt=”K&OLogo”>    </div>              
        </div>
        <div class= "flex-container"> 
        <nav style="height: 65px">
        <script>
            function printDiv(divName) {
                var printContents = document.getElementById(divName).innerHTML;
                var originalContents = document.body.innerHTML;
                document.body.innerHTML = originalContents;                
                window.print();
                
            }
            
        </script>
        <div class= "main_home" >                              
                <a href="index.jsp" style="text-decoration: none">Home</a>                 
                <a><input class="btn-print" type="button" name="btn" onclick="printDiv('printableArea')" value="Print Barcode" /></a>  
        </div>         
        </nav> 
            <div class="form-container">             
                <div id="printableArea" class="reg-box"> 
                     <h1><br>Registration Accepted</h1>
           
<%
                int sqlInt = 0;
                // Create string to be used after reading through database.
                String userBarCode = "";
                // Connect to database and find the most recent ID
                try{
                    // Create a new clean conneciton.
                    Connection con = null;
                    // Create object
                    ReadFile rf = new ReadFile();
                    // Create object
                    ReadSQL s = new ReadSQL();
                    // Run the CSV Reader Class
                    rf.ReadFile();
                    // Connect to Database
                    Class.forName(rf.getClassDriver());
                    con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
                    // String used for SQL Query
                    sqlInt = 1;
                    s.ReadSQL(sqlInt);
                    
                    Statement st=con.createStatement();
                    ResultSet rs = st.executeQuery(s.getSQLAll());
                    
                    while(rs.next()){
                        userBarCode = rs.getString("userID");
%>
            <table class="table my-0" id="dataTable">  
                
                <div><img src="assetsJSP/css/images/formBG_Image.png" class="image " alt=”K&OLogo” style="opacity: .1" >    </div> 
                <h1><br>Registration Accepted</h1>
                <thead>
                            <tr>
                                <th>Unique ID</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Email</th>
                                <th>&nbsp;&nbsp;PIN#</th>
                                <th>&nbsp;&nbsp;&nbsp;&nbsp;Identifier</th>
                            </tr><br>
                        <tr>
                            
                            <td>&nbsp;&nbsp;<%=rs.getString("userID") %></td>
                            <td>&nbsp;&nbsp;<%=rs.getString("firstName") %></td>
                            <td>&nbsp;&nbsp;<%=rs.getString("lastName") %></td>
                            <td>&nbsp;&nbsp;<%=rs.getString("email") %></td>
                            <td>&nbsp;&nbsp;<%=rs.getString("pinNum") %></td>
                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getString("identifier") %></td>
                        </tr>
                </thead>
            </table>
<%
                    }
                    con.close();
                }
                catch(Exception e){
                    out.println(e);
                }
%>
                <!--Display Unique User Barcode-->
                 <br><br>
                 <img id="barcode"/>
                 <script>
                    JsBarcode("#barcode", "<%out.print(userBarCode);%>");
                 </script>
                  <div class="email-ins"><p>Check your email for further instructions. <i class="fas fa-exclamation-triangle" style="color: red"></i></p></div>        
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


 
