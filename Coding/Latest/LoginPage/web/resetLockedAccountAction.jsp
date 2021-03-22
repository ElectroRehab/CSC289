<%-- 
    Document   : resetTotalTimeAction
    Created on : Feb 13, 2021, 8:02:32 PM
    Author     : Anthony
--%>
<%@page import="readfile.HashSHA512Encryption"%>
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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <meta http-equiv="Content-Security-Policy" content="default-src;  
         
        script-src 'self'  'sha256-JE0280krcqkShSI9tiB7uYMolH2Mp4kLOi+tnmU+JI4='    
        ;style-src 'report-sample' 'self' 'unsafe-inline' 
        https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
        img-src 'self' data:; base-uri 'self'; object-src 'self';
        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; 
        frame-src 'self';
        manifest-src 'self'; media-src 'self'; 
        worker-src 'none';">
        
         
        <link rel="stylesheet" href="assetsJSP/css/registrationStyleSheet.css">        
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/Navigation-with-Button.css">
        <link rel="stylesheet" href="assetsJSP/mainPageCSS/styles.css">
        <link rel="stylesheet" href="assets/css/styles.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assetsJSP/css/popupLoginStyleSheet.css"> 
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    <title>Current Locked Accounts</title>    
</head>
<%
    HashSHA512Encryption hashText = new HashSHA512Encryption();
    String idInfo=request.getParameter("user_id");
    String password=request.getParameter("password");
    hashText.setHashText(password);
    password = hashText.getHashText();
    out.println(idInfo);
    out.println(password);
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