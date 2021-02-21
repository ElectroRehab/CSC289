<%-- 
    Document   : indexRegistration
    Created on : Feb 2, 2021, 6:27:44 PM
    Author     : Anthony
--%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.*"%>
<%@page import="com.itextpdf.text.pdf.BarcodeEAN"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Random"%>
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
    // Get Parameters from previous page of user inputted information.
    String idNum=request.getParameter("rand_num"); 
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String address=request.getParameter("address");
    String state=request.getParameter("state");
    String city=request.getParameter("city");
    String zipcode=request.getParameter("zipcode");    
    String mobileNo=request.getParameter("mobileNo");
    String email=request.getParameter("email");
    String password=request.getParameter("password_confirm");
    String image="https://drive.google.com/uc?export=view&id=1dYZ2xxA1DIwNcwdEwqRypTDkc4danQos";
    String ident = "admin";
    
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
        // Execute SQL Code to add information to Databases
        st.executeUpdate("insert into userdatamain(userID,firstName,lastName,address,city,state,zipcode,phoneNumber,email,pinNum,imageID,identifier)values('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");
        st.executeUpdate("insert into adminuserdata(adminID,firstName,lastName,address,city,state,zipcode,phoneNumber,email,pinNum,imageID,identifier)values('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");
        // Show user that the information has been saved and display some
        // of that information. 
        response.sendRedirect("save.jsp");    
    }
    // Catch
    catch(Exception e){ 
        out.println(e); 
    }
%> 
</html>