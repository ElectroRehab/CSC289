<%-- 
    Document   : indexUserRegistration
    Created on : Feb 7, 2021, 7:21:53 PM
    Author     : Anthony
--%>
<%@page import="readfile.ReadSQL"%>
<%@page import="readfile.ReadFile"%>
<%@page import="java.util.Random"%>
<%@page import ="java.sql.*"%>
<%@page import ="com.itextpdf.text.pdf.BarcodeEAN"%>
<%@page import ="java.io.FileOutputStream"%>
<%@page import ="java.io.IOException"%>
<%@page import ="java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1252">    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">    
    <title>Dashboard - Brand</title>    
</head> 
<%  
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
    String image="https://drive.google.com/uc?export=view&id=1AhrTHw6xzWn-AOOxnNsPlKyZLX3l9g3i";
    String ident = "user";
    String timeBase = "00:00:00";

    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try{
        // Create a new clean conneciton.
        Connection con = null;
        // Create object
        ReadFile rf = new ReadFile();
        // Create object
        ReadSQL s = new ReadSQL();
        // Run the CSV Reader Class
        rf.ReadFile();
        // Run the CSV Reader Class
        s.ReadSQL();
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
        // Execute SQL Code to add information to Database
        st.executeUpdate(s.getSQLTen() + "('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");
        st.executeUpdate(s.getSQLEleven() + "('"+idNum+"','"+timeBase+"','"+timeBase+"','"+timeBase+"','"+password+"','"+"Out"+"')");
        // Show user that the information has been saved and display some
        // of that information.
        response.sendRedirect("save.jsp");
    }
    catch(Exception e){
        out.println(e); 
    }
%>
</html>