<%@page import="readfile.ReadTitles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Security-Policy" content="default-src;        
        script-src 'self' 'sha256-OzqmAO+SFutn2tx7ipegj2ASyYCgLzk+60O8Tb/3fkE=';     
        style-src 'report-sample' 'self' 'unsafe-inline' 
        https://cdnjs.cloudflare.com https://fonts.googleapis.com; 
        img-src 'self' data:; base-uri 'self'; object-src 'self'; 
        connect-src 'self'; font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; 
        frame-src 'self';  
        manifest-src 'self'; media-src 'self';  
        worker-src 'none';">
        <title>Session checks</title>     
    </head>                
    <% 
        ReadTitles t = new ReadTitles();
        t.ReadTitles(1);
        String uid = (String)session.getAttribute(t.getSQLTitles().toString());
        System.out.println(uid);
        if(uid == null){
            //Redirect to the start page of the program.%>
            <jsp:forward page="index.jsp"/>
    <%
        }
        else{
            return;
        }

    %>
    <script>
    function myFunction(){
        return;
        
    }
    </script>
</html>
