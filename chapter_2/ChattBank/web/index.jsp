<%-- 
    Document   : index
    Created on : 28-Aug-2022, 11:00:45
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ChattBank Home</title>
        <style>
            * {
                padding: 0;
                margin: 0;
                box-sizing: border-box;
            }
            
            body {
                  background-color: #f1f4f8; ;
            }
            
            header {
                display: flex;
                justify-content: space-between;
                align-content: center;
                background-color: #F9F9F8;
            }
            
            .nav-left {
                display: flex;
                flex-direction: row;
                gap: 2px;
                width: 100%;
            }
            
            img {
                height: 70px;
                width: 80px;  
            }
            
            .nav-left h1 {
                align-self: center;
                color: #61dafb;
            }
            
            .nav-right {
                display: flex;
                align-content: center;
                justify-content: center;
                align-self: center;
                font-size: 24px;
            }
            
            .nav-right a {
                align-self: center;
                   color: #61dafb;
            }
            
            .custom-padding {
                padding: 0 1% 0 1%;
            }
            
            
            
        </style>
    </head>
    <body>
        <header class="custom-padding"> 
            <div class="nav-left">
                <img class="img" src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.pngmart.com%2Ffiles%2F5%2FBank-PNG-Pic.png&f=1&nofb=1" alt='bank-logo'>
                <h1>Welcome To ChattBank</h1>
            </div>
            <div class="nav-right">
                <a href="./pages/login.jsp">Login</a>
            </div>
        </header>

    </body>
</html>
