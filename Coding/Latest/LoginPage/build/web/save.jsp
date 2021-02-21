<%-- 
    Document   : index
    Created on : Feb 3, 2021, 6:43:26 AM
    Author     : Anthony
--%>
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
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css"> 
        <title>JSP Page</title>
        <script type="text/javascript" src="jsBarcode.all.min.js"></script>
    </head>  
    <body>    
        <nav>
            <div class= "main_home" >                    
                <a href="index.jsp">Home</a>             
            </div>           
        </nav> 
            <h1><br>Registration Accepted</h1>
            <p>Check your email for further instructions. <i class="fas fa-exclamation-triangle"></i></p>   
<%
                // Create string to be used after reading through database.
                String userBarCode = "";
                // Connect to database and find the most recent ID
                try{
                    // Create a new clean conneciton.
                    Connection con = null;
                    // Create object
                    ReadFile rf = new ReadFile();
                    // Run the CSV Reader Class
                    rf.ReadFile();
                    // String for the JBDC Driver Info
                    String classDriver = rf.getClassDriver();
                    // String used for link to the Remote Database
                    String link = rf.getLink();
                    // String used for username of the Remote Database
                    String user = rf.getUser();
                    // String used for password to the Remote Database
                    String pass = rf.getPass();
                    // Coneect to Database
                    Class.forName(classDriver);
                    con = DriverManager.getConnection(link,user,pass);
                    Statement st=con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM userdatamain WHERE ID = (SELECT MAX(ID) FROM userdatamain)");
                    
                    while(rs.next()){
                        userBarCode = rs.getString("userID");
%>
                        <table style="width:35%">
                            <tr>
                                <th>Unique ID</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Email</th>
                                <th>PIN #</th>
                                <th>Identifier</th>
                            </tr><br>
                        <tr>
                            
                            <td><%=rs.getString("userID") %></td>
                            <td><%=rs.getString("firstName") %></td>
                            <td><%=rs.getString("lastName") %></td>
                            <td><%=rs.getString("email") %></td>
                            <td><%=rs.getString("pinNum") %></td>
                            <td><%=rs.getString("identifier") %></td>
                        </tr>
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
    </body>
</html>


 
