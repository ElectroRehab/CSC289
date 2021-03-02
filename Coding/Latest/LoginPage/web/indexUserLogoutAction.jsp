<%-- 
    Document   : indexUserLogoutAction
    Created on : Feb 11, 2021, 6:13:48 PM
    Author     : Anthony
--%> 
<%@page import="readfile.ReadSQL"%>
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
    int sqlInt = 0;
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
        // Create object
        ReadSQL s = new ReadSQL();
        // Run the CSV Reader Class
        rf.ReadFile();
        // Connect to Database
        Class.forName(rf.getClassDriver());
        con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
        //String queryTimDif = s.ReadSQL(14);        
        sqlInt = 5;
        s.ReadSQL(sqlInt);
        PreparedStatement ps = con.prepareStatement(s.getSQLAll());   
        ps.setTimestamp(1,timeOut);
        ps.setString(2,status);               
        ps.setString(3,userID);           
        ps.executeUpdate();
        sqlInt = 6;
        s.ReadSQL(sqlInt);
        ps = con.prepareStatement(s.getSQLAll()); 
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