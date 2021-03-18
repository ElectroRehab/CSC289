<%-- 
    Document   : indexUserLogin
    Created on : Feb 7, 2021, 5:39:52 PM
    Author     : Anthony
--%> 
<%@page import="readfile.ReadTitles"%>
<%@page import="readfile.ReadSQL"%>
<%@page import="readfile.ReadFile"%>
<%@page import ="java.sql.*"%>
<%@page import ="java.time.LocalDateTime"%>
<%@page import ="java.time.format.DateTimeFormatter"%>
<%@page import="java.security.NoSuchAlgorithmException"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.math.BigInteger"%>
<%@page import="readfile.HashSHA512Encryption"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1252">    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">    
    <title>Dashboard - Brand</title>
    
</head>
<%
    HashSHA512Encryption hashText = new HashSHA512Encryption();
    int sqlInt = 0;
    int locked = 3;
    int reset = 0;
    
    //Get Current date and time   
    java.util.Date date=new java.util.Date();
    // Date and Time Check 
    Timestamp timeIn =new java.sql.Timestamp(date.getTime());
    // Starting Time Format
    String timeOut = "00:00:00";
    //Get parameters from login form
    String userID=request.getParameter("userID");    
    String pinCode=request.getParameter("pinCode");
    //Declare and initialize status variable
    String status = "In";    
    //Display error page if input is not a proper input
    if(userID == "" || pinCode == ""){
        // Go to error page
        response.sendRedirect("error.jsp");
    }
    else{
        //Reset hashText
        hashText.hashText = "";
        //Set hashText to pinCode input
        hashText.setHashText(pinCode);
        //Return hashText and set pinCode to hash
        pinCode = hashText.getHashText();
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
                if(r.getString(t.getSQLTitles().toString()).equals(userID)){
                    // Check for locked account and count.
                    sqlInt = 19;
                    t.ReadTitles(sqlInt);
                    int check = Integer.parseInt(r.getString(t.getSQLTitles().toString()));
                    if(check == locked){
                        // Alert User it is locked return to index.
                        response.sendRedirect("lockedAccount.jsp");
                    }
                    else{
                        // Check for correct pin
                        sqlInt = 11;
                        t.ReadTitles(sqlInt);
                        if(r.getString(t.getSQLTitles().toString()).equals(pinCode)){
                            // Good PIN Check
                            // Continue with clock-in process
                            sqlInt = 22;
                            s.ReadSQL(sqlInt);
                            Statement psps = con.createStatement();
                            psps.executeUpdate(s.getSQLAll() + userID);
                        }
                        else{
                            // --Bad PIN check--
                            sqlInt = 21;
                            s.ReadSQL(sqlInt);
                            Statement psps = con.createStatement();
                            psps.executeUpdate(s.getSQLAll() + userID);
                            response.sendRedirect("unacceptable.jsp");                                                
                        }
                    }
                    
                }
            }
            // Create a Prepared Statement to run query from database.
            sqlInt = 3;
            s.ReadSQL(sqlInt);            
            PreparedStatement ps = con.prepareStatement(s.getSQLAll());
            // Set Strings to locations in the database.
            ps.setString(1,userID );
            ps.setString(2,pinCode );
            // Iterate through database to set new fields
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                sqlInt = 4;
                s.ReadSQL(sqlInt);
                ps = con.prepareStatement(s.getSQLAll());
                ps.setString(1,userID );
                ps.setTimestamp(2,timeIn ); 
                ps.setString(3,timeOut ); 
                ps.setString(4,pinCode ); 
                ps.setString(5,status );  
                ps.setString(6,userID );  
                ps.setString(7,pinCode );      
                ps.executeUpdate();  
                response.sendRedirect("indexUserLoginSuccess.jsp");              
            }     
            else{
                
                response.sendRedirect("errorUserLogin.jsp");
            }
            // Close all recently opened connections. 
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