<%-- 
    Document   : logout
    Created on : 22-Nov-2022, 08:28:15
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("../pages/index.jsp");
        %>
    </body>
</html>
