<%-- 
    Document   : indexRegistration
    Created on : Feb 2, 2021, 6:27:44 PM
    Author     : Anthony
--%>
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
    String image="https://drive.google.com/uc?export=view&id=1dYZ2xxA1DIwNcwdEwqRypTDkc4danQos";
    //String image=request.getParameter("myimg");
    String ident = "admin";
    Connection con = null;
    PreparedStatement statement = null;
         
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
try
{
    Class.forName("com.mysql.jdbc.Driver");     
    con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391908","sql5391908","FpyLREFiQE");
    //con=DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391930","sql5391930","ZWDuzeTXhR");
    Statement st=con.createStatement();     
    st.executeUpdate("insert into userdatamain(userID,firstName,lastName,address,city,state,zipcode,phoneNumber,email,pinNum,imageID,identifier)values('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");
    st.executeUpdate("insert into adminuserdata(adminID,firstName,lastName,address,city,state,zipcode,phoneNumber,email,pinNum,imageID,identifier)values('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");    
    response.sendRedirect("save.jsp");    
}catch(Exception e)
{ 
   out.println(e); 
}
%> 
</html>