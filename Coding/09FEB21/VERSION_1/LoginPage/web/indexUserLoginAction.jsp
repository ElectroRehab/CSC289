 
<%@page import ="java.sql.*"%>
<%
    String userID=request.getParameter("userID");
    
    String pinCode=request.getParameter("pinCode");
    if(userID == "" || pinCode == ""){
    response.sendRedirect("error.jsp");
}
else
{
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391908","sql5391908","FpyLREFiQE");
    String query = "select * From userdata where UserID=? && pinCode=?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1,userID );
    ps.setString(2,pinCode );    
    ResultSet rs = ps.executeQuery();    
    if (rs.next()){
    response.sendRedirect("indexMain.jsp");              
    }
    else{
         response.sendRedirect("error.jsp");
    }
    ps.close();
    rs.close();
    con.close();
    }catch(Exception e)
    {     
        out.println(e); 
    }   
}

%> 