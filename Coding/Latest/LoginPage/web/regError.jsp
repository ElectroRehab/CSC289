<%-- 
    Document   : regError
    Created on : Mar 5, 2021, 1:23:18 PM
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         
        <title>JSP Page</title>
    </head>
    <body>
    <% 
            String uid = (String)session.getAttribute("adminID");
            if (uid == null)
            {
		%><!-- NOT A VALID USER, IF THE USER TRIES TO EXECUTE LOGGED IN PAGE DIRECTLY, ACCESS IS RESTRICTED -->
                     <jsp:forward page="index.jsp"/>
		<%	
		}
		else
		{//IF THE VALUE IN SESSION IS NOT NULL THEN THE IS USER IS VALID
					 
		%>
		<!-- WE HAVE GIVEN LOGOUT.JSP FILE INORDER TO LOGOUT THE SESSION -->					 
		<%}
    %>
        <h1>Pins must match/User Pin Not Long Enough!</h1>
        <script>
        setTimeout(function() {
      document.location = "indexUserRegistration.jsp";
        }, 3000); // <-- this is the delay in milliseconds
</script>
    </body>
</html>
