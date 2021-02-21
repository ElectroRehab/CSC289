<%-- 
    Document   : indexUserLogoutAction
    Created on : Feb 11, 2021, 6:13:48 PM
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
    Date sqlDate=new java.sql.Date(date.getTime());
    Timestamp timeOut =new java.sql.Timestamp(date.getTime());
    Timestamp totalTime =new java.sql.Timestamp(date.getTime());
    String userID=request.getParameter("userID");    
    String pinCode=request.getParameter("pinCode");
    
    //Declare and initialize status variable
    String status = "Out";     
    //Display error page if input is null
    if(userID == "" || pinCode == ""){
    response.sendRedirect("error.jsp");
}
else
{
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try{// Create a new clean conneciton.
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
     
        String query1 = "update employeetimetracker set timeOut=?, status=?  where userID=?";    
        String queryTimDif = "update employeetimetracker set totalTime = CAST(totalTime as time) + timediff (timeIn,timeOut) where userID=?";
        //String queryTimDif = "update employeetimetracker set totalTime = totalTime + timeDiff( timeIn,timeOut)";
        PreparedStatement ps = con.prepareStatement(query1);   
        ps.setTimestamp(1,timeOut);
        ps.setString(2,status);               
        ps.setString(3,userID);           
        ps.executeUpdate();       
        ps = con.prepareStatement(queryTimDif); 
        ps.setString(1,userID);  
        ps.executeUpdate();       
        response.sendRedirect("indexUserLogin.jsp");            
        //Close connections
        ps.close();        
        con.close();
    }
    catch(Exception e){     
        out.println(e); 
    }   
}
%> 
</html>