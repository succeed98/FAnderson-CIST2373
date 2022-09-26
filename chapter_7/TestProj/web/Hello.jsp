/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : Hello
    Created on : 26-Sep-2022, 17:50:05
    I Promise I wrote this code
*/

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello</title>
    </head>
    <body>
        <%
            for(int i = 0; i < 6; i++){
                out.print("<H"+ i +">");
                out.print("I am working");
                out.print("</H"+ i +">");
            }
        %>
    </body>
</html>
