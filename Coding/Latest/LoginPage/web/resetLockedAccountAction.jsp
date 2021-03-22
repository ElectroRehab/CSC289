<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="readfile.ReadSQL"%>
<%@page import="readfile.ReadFile"%>
<%@page import="java.sql.Connection"%>
<%@page import="readfile.HashSHA512Encryption"%>
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
    // Get locked account info to unlock with new password.
    String idInfo=request.getParameter("user_id");
    String password=request.getParameter("password");
    String identify=request.getParameter("identifier");
    // Encrypt the password to be stored in database. 
    HashSHA512Encryption hashText = new HashSHA512Encryption();
    hashText.setHashText(password);
    password = hashText.getHashText();
    // Create variable to change the SQL statements.
    int sqlInt = 0;
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
        // Update PIN in the user database.
        sqlInt = 24;
        s.ReadSQL(sqlInt);
        PreparedStatement userPS = con.prepareStatement(s.getSQLAll());   
        userPS.setString(1,password);
        userPS.setString(2,idInfo);           
        userPS.executeUpdate();
        // Check to see if user's locked account is in the admin database too.
        if(identify.equalsIgnoreCase("admin")){
            // Update PIN for user in admin database
            sqlInt = 25;
            s.ReadSQL(sqlInt);
            PreparedStatement adminPS = con.prepareStatement(s.getSQLAll()); 
            adminPS.setString(1,password);
            adminPS.setString(2,idInfo);
            adminPS.executeUpdate();
            // Reset wrong choices
            sqlInt = 22;
            s.ReadSQL(sqlInt);
            Statement psps = con.createStatement();
            psps.executeUpdate(s.getSQLAll() + idInfo);
        }
        else{
            // Reset wrong choices
            sqlInt = 22;
            s.ReadSQL(sqlInt);
            Statement lockedPS = con.createStatement();
            lockedPS.executeUpdate(s.getSQLAll() + idInfo);
        }
        // Return to to the admin page to show that the user has been removed
        // from the list of locked accounts.
        response.sendRedirect("resetLockedAccount.jsp");
    }
    catch(Exception e){
        out.println(e);
    }
%>
</html>