<%-- 
    Document   : indexUserLogin
    Created on : Feb 7, 2021, 5:39:52 PM
    Author     : Anthony
--%> 
<%@page import="readfile.ReadFile"%>
<%@page import ="java.sql.*"%>
<%@page import ="java.time.LocalDateTime"%>
<%@page import ="java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1252">    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">    
    <title>Dashboard - Brand</title>
    
</head>
<%
    //Get Current date and time   
    java.util.Date date=new java.util.Date();
    // Date and Time Check 
    Timestamp timeIn =new java.sql.Timestamp(date.getTime());
    // Starting Time Format
    String timeOut = "00:00:00";
    //Get parameters from login form
    String userID=request.getParameter("userID");    
    String pinCode=request.getParameter("pinCode");
    //Declare and initialize status variable
    String status = "In";    
    //Display error page if input is null
    if(userID == "" || pinCode == ""){
        // Go to error page
        response.sendRedirect("error.jsp");
    }
    else{
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
            // SQL Query Statements
            String query = "select * From userdatamain where userID=? && pinNum=?";
            String query2 = "update employeetimetracker set userID =?,timeIn=?,timeOut=?, pinCode=?, status=? where userID=? && pinCode=?";     
            // Create a Prepared Statement to run query from database.
            PreparedStatement ps = con.prepareStatement(query);
            // Set Strings to locations in the database.
            ps.setString(1,userID );
            ps.setString(2,pinCode );
            // Iterate through database to set new fields
            ResultSet rs = ps.executeQuery( );
            if(rs.next()){
                ps = con.prepareStatement(query2);
                ps.setString(1,userID );
                ps.setTimestamp(2,timeIn ); 
                ps.setString(3,timeOut ); 
                ps.setString(4,pinCode ); 
                ps.setString(5,status );  
                ps.setString(6,userID );  
                ps.setString(7,pinCode );      
                ps.executeUpdate();  
                response.sendRedirect("indexUserLogin.jsp");              
            }     
            else{
                response.sendRedirect("error.jsp");
            }
            // Close all recently opened connections. 
            ps.close();
            rs.close();
            con.close();   
        }
        catch(Exception e){
            out.println(e);
        }   
    }
%>
</html>