<%-- 
    Document   : resetTotalTimeAction
    Created on : Feb 13, 2021, 8:02:32 PM
    Author     : Anthony
--%>
<%@page import="readfile.ReadFile"%>
<%@page import ="java.sql.*"%>
<%@page import ="java.time.LocalDateTime"%>
<%@page import ="java.time.format.DateTimeFormatter"%>
<%@page import ="javax.swing.*"%>
<%@page import ="javax.swing.JOptionPane"%>
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
    String totalTime = "00:00:00";  

    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try
    {
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
        String query = "update employeetimetracker set totalTime =  timediff(totalTime,totalTime)";
        //String query2 = "update * employeetimetracker set totalTime = '"+totalTime+"'";
        //String query2 = "update employeetimetracker set userID =?,timeIn=?,timeOut=?,totalTime=?,pincode=?, status=? where userID=? && pincode=?";
        //String query2 = "update employeetimetracker (userID,timeIn,pincode ) values(?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);         
     
        ps.executeUpdate();  

        response.sendRedirect("indexAdminControl.jsp");   
        ps.close();     
        con.close();
    
    }
    catch(Exception e){     
        out.println(e); 
    } 
%>
</html>