<%-- 
    Document   : connection
    Created on : Feb 5, 2021, 10:42:51 PM
    Author     : miste
--%>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String phone=request.getParameter("phone");
    String email=request.getParameter("email");
    String pin=request.getParameter("pin");
    String job=request.getParameter("job");
    
    Connection con=null;
    Statement st=null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acct_info/store_accts","root","password1");
    st=con.createStatement();
    
    String qry="insert into register values(null,'"+pin+"','"+job+"','"+fname+"','"+lname+"','"+phone+"','"+email+"')";
    
    st.executeUpdate(qry);
    
    out.print("data is inserted");
    }
    catch(Exception e){
        out.print(e.getMessage());
    }
    

%>