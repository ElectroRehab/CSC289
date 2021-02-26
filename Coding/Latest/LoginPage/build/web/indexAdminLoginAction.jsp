 <%@page import="readfile.ReadSQL"%>
<%@page import="readfile.ReadFile"%>
<%-- 
    Document   : indexMain.jsp
    Created on : Feb 3, 2021, 6:40:30 AM
    Author     : Anthony
--%>
<%@page import ="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1252">    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">    
    <title>Dashboard - Brand</title>
    
</head>
<%
    String adminID=request.getParameter("adminID");
    
    String pinNum=request.getParameter("pinNum");
    if(adminID == "" || pinNum == ""){
        response.sendRedirect("error.jsp");
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
            // run the CSV Reader Class
            s.ReadSQL();
            // String for the JBDC Driver Info
            String classDriver = rf.getClassDriver();
            // String used for link to the Remote Database
            String link = rf.getLink();
            // String used for username of the Remote Database
            String user = rf.getUser();
            // String used for password to the Remote Database
            String pass = rf.getPass();
            // String used for SQL Query
            String sqlText = s.getSQLTwo();
            // Coneect to Database
            Class.forName(classDriver);
            con = DriverManager.getConnection(link,user,pass);
            
            String query = sqlText;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,adminID );
            ps.setString(2,pinNum );    
            ResultSet rs = ps.executeQuery();    
            if (rs.next()){
                response.sendRedirect("indexAdminControl.jsp");              
            }
            else{
                response.sendRedirect("error.jsp");
            }
            ps.close();
            rs.close();
            con.close();
            }
        catch(Exception e){     
            out.println(e); 
        }   
    }
%> 
</html>