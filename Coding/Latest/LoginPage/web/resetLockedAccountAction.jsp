<%-- 
    Document   : resetTotalTimeAction
    Created on : Feb 13, 2021, 8:02:32 PM
    Author     : Anthony
--%>
<%@page import="readfile.ReadTitles"%>
<%@page import="readfile.ReadSQL"%>
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
    String idInfo=request.getParameter("user_id");
    out.println(idInfo);
    out.println("Currently resets the number back to zero. \nStill need to create a pin reset portion.");
    int sqlInt = 0;
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try{
            // Create a new clean conneciton.
            Connection con = null;
            // Create object
            ReadFile rf = new ReadFile();
            // Create object
            ReadSQL s = new ReadSQL();
            // Create Object 
            ReadTitles t = new ReadTitles();
            // Run the CSV Reader Class
            rf.ReadFile();
            // Connect to Database
            Class.forName(rf.getClassDriver());
            con = DriverManager.getConnection(rf.getLink(),rf.getUser(),rf.getPass());
            // Create a Statement to run query from database.
            sqlInt = 15;
            s.ReadSQL(sqlInt);
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(s.getSQLAll().toString());
            // Read through database for user's currently inputted info
            while(r.next()){
                // User Name
                sqlInt = 2;
                t.ReadTitles(sqlInt);
                // Check for current user input info
                if(r.getString(t.getSQLTitles().toString()).equals(idInfo)){
                    // Check for locked account and count and reset to 0.                   
                    sqlInt = 22;
                    s.ReadSQL(sqlInt);
                    Statement psps = con.createStatement();
                    psps.executeUpdate(s.getSQLAll() + idInfo);
                    response.sendRedirect("indexAdminControl.jsp"); 
                }
                else{
                }
            }
        }
        catch(Exception e){
            out.println(e);
        }
%>
</html>