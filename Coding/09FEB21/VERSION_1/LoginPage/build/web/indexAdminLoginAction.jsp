 
<%@page import ="java.sql.*"%>
<%
    String adminID=request.getParameter("adminID");
    
    String pinNum=request.getParameter("pinNum");
    if(adminID == "" || pinNum == ""){
    response.sendRedirect("error.jsp");
}
else
{
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391908","sql5391908","FpyLREFiQE");
    String query = "select * From adminuserdata where adminID=? && pinNum=?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1,adminID );
    ps.setString(2,pinNum );    
    ResultSet rs = ps.executeQuery();    
    if (rs.next()){
    response.sendRedirect("indexAdminControl.html");              
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