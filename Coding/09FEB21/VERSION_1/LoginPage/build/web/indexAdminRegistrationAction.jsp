<%@page import ="java.sql.*"%>
<%
    String idNum=request.getParameter("idNum");
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String address=request.getParameter("address");
    String state=request.getParameter("state");
    String city=request.getParameter("city");
    String zipcode=request.getParameter("zipcode");    
    String mobileNo=request.getParameter("mobileNo");
    String email=request.getParameter("email");
    String password=request.getParameter("password_confirm");
    String image=request.getParameter("myimg");
    
    String ident = "admin";
    Connection con = null;
    PreparedStatement statement = null;
     
    
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
try{
     Class.forName("com.mysql.jdbc.Driver");
     
    con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5391908","sql5391908","FpyLREFiQE");
    Statement st=con.createStatement();
     
    st.executeUpdate("insert into userdatamain(userID,firstName,lastName,address,city,state,zipcode,phoneNumber,email,password,imageID,identifier)values('"+idNum+"','"+fname+"','"+lname+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+mobileNo+"','"+email+"','"+password+"','"+image+"','"+ident+"')");
    
     
    response.sendRedirect("save.jsp");
    
    
}catch(Exception e){
    
    
   out.println(e); 
}
 

%> 