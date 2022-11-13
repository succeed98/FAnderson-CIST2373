<%-- 
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : ErrorPage
    Created on : 19-Sep-2022, 09:08:32
    I Promise I wrote this code
--%>

<%@page import="Patient.Patient"%>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        <style>
            body {
                display: flex;
                justify-content: center;
            }
            h1 {
                color: red;
                font-size: 40px;
            }
        </style>
    </head>
    <body>
        <%
            Patient patient = (Patient)session.getAttribute("patient");
        %>
        <h1>Error Logging in for User with ID <%= patient.getLastName()%></h1>
    </body>
</html>
