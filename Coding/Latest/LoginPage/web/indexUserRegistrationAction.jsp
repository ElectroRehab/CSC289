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
    int sqlInt = 0;
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
    String passwordCheck=request.getParameter("password_Check");
    String image="https://drive.google.com/uc?export=view&id=1AhrTHw6xzWn-AOOxnNsPlKyZLX3l9g3i";
    String ident = "user";
    String timeBase = "00:00:00";

     if(password != passwordCheck || password.length() < 4 && passwordCheck.length() < 4  || password.length() > 10 && passwordCheck.length() > 10 ){
       out.print("Pins Do not Match");
       response.sendRedirect("regError.jsp");
    }
    else{
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
        // Connect to Database
        Class.forName(rf.getClassDriver());
        con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
        Statement st=con.createStatement();
        // Execute SQL Code to add information to Database
        sqlInt = 10;
        s.ReadSQL(sqlInt);
        st.executeUpdate(s.getSQLAll() + "('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");
        // Execute SQL Code to add information to Database
        sqlInt = 11;
        s.ReadSQL(sqlInt);
        st.executeUpdate(s.getSQLAll() + "('"+idNum+"','"+timeBase+"','"+timeBase+"','"+timeBase+"','"+password+"','"+"Out"+"')");
        // Show user that the information has been saved and display some
        // of that information.
        response.sendRedirect("save.jsp");
    }
    catch(Exception e){
        out.println(e); 
    }
    }
%>
</html>