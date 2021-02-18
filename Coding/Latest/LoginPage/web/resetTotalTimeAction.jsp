<%-- 
    Document   : resetTotalTimeAction
    Created on : Feb 13, 2021, 8:02:32 PM
    Author     : Anthony
--%>
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
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391908","sql5391908","FpyLREFiQE");
    //Connection con=DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391930","sql5391930","ZWDuzeTXhR");
    String query = "update employeetimetracker set totalTime =  timediff(totalTime,totalTime)";
    //String query2 = "update * employeetimetracker set totalTime = '"+totalTime+"'";
    //String query2 = "update employeetimetracker set userID =?,timeIn=?,timeOut=?,totalTime=?,pincode=?, status=? where userID=? && pincode=?";
    //String query2 = "update employeetimetracker (userID,timeIn,pincode ) values(?,?,?)";
    Statement st=con.createStatement();
    PreparedStatement ps = con.prepareStatement(query);         
     
    ps.executeUpdate();  
    
    response.sendRedirect("indexAdminControl.jsp");   
    ps.close();     
    con.close();
    
    }
    catch(Exception e)
    {     
        out.println(e); 
    } 
%>
</html>