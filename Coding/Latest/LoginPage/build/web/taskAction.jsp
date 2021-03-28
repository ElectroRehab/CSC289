<%-- 
    Document   : taskAction
    Created on : Mar 23, 2021, 2:24:03 PM
    Author     : Anthony
--%>
<%@page import="readfile.ReadSessions"%>
<%@page import="java.security.NoSuchAlgorithmException"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.math.BigInteger"%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.*"%>
<%@page import="com.itextpdf.text.pdf.BarcodeEAN"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Random"%>
<%@page import="readfile.HashSHA512Encryption"%>
<%@page import="readfile.ReadFile"%>
<%@page import="readfile.ReadSQL"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1252">    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">    
    <title>K & O Tracks</title>    
</head>

<%
    ReadSessions r = new ReadSessions();
    r.getPost(request, response, session);
    HashSHA512Encryption hashText = new HashSHA512Encryption();
    int sqlInt = 0;
    // Get Parameters from previous page of user inputted information.
    String task=request.getParameter("task"); 
    task = "\u002D " + task;
    String uid = (String)session.getAttribute("adminID");
    String timeBase = "00:00:00";
   
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
        //Class.forName(rf.getClassDriver());
        //con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
         
        Class.forName("com.mysql.jdbc.Driver");
     
        con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5400998","sql5400998","7xWESpbAN5");
        //Statement st=con.createStatement();
        String query = "insert into admintask(adminID,task) values('"+uid+"','"+task+"')";
        
        Statement st=con.createStatement();
        st.executeUpdate(query);
        //ResultSet rs=st.executeQuery(query);
        
       
        response.sendRedirect("taskList.jsp");  
    }
        
        
         /*if(rs.next())
        {
             
             if((String)rs.getString("task1")== null ||(String)rs.getString("task1")== "" ){
                 st.executeUpdate("update admintask set task1 ='"+task+"' where task1 IS NULL or task1 = 'null'"
           
                   +" and adminID = '"+uid+"'");
                 
            }
            
            else if((String)rs.getString("task2") == null ||(String)rs.getString("task2")== "" ){
                 st.executeUpdate("update admintask set task2 ='"+task+"' where task2 IS NULL"
           
                   +" and adminID = '"+uid+"'");
                
            }
            else if((String)rs.getString("task3") == null || (String)rs.getString("task3")== "null") {
                 st.executeUpdate("update admintask set task3 ='"+task+"' where task3 IS NULL or task3 = 'null'"
           
                   +" and adminID = '"+uid+"'");
                  
            }
         
           
      
        } 
         */
    // Catch
    catch(Exception e){ 
        out.println(e); 
    }
    
  
%> 
</html>