<%-- 
    Author: Fareeda Anderson
    Programme  : Java III
    Document: login
    Created on : 28-Aug-2022, 11:17:15
    I Promise I wrote this code
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Chatt Bank Account Lookup</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style> 

            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Outfit', sans-serif;
            }

            main {
                background-color: #f1f4f8;
                height: 100vh;
                width: 100%;
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .main-container {
                width: 30%;
                min-height: 4rem;
                display: flex;
                flex-direction: column;
                gap: .7rem;
            }

            .nav {
                display: flex;
                flex-direction: row;
                align-content: center;
                justify-content: center;
            }

            .nav img {
                height: 70px;
                width: 80px;  
            }

            h1 {
                font-size: 28px;
                color: #042f62;
                align-self: center;
            }

            .card{
                display: flex;
                gap: .5rem;
                flex-direction: column;
                width: 100%;
                min-height: 7rem;
                background-color: white;
                box-shadow: 0px 8px 16px -4px rgba(22, 34, 51, 0.08);
                border-radius: 4px;
                padding: 32px 48px;
            }

            .input-container {
                width: 100%;
                flex-direction: column;
                gap: .7rem;
            }

            input {
                padding: 20px 24px;
                width: 100%;
            }

            input::placeholder{
                font-size: 16px;
            }

            .submit-button {
                width: 100%;

            }

            .submit-button button {
                padding: 20px 24px;
                width: 100%;
                background-color: #095fc3;
                color: white;
                border: none;
            }

        </style>
    </head>
    <body>
        <main> 

            <div class="main-container">
                <nav class="nav"> 
                    <img class="img" src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.pngmart.com%2Ffiles%2F5%2FBank-PNG-Pic.png&f=1&nofb=1" alt='bank-logo'>
                    <h1>ChattBank Account Lookup</h1>
                </nav>
                <form action="http://localhost:31328/ChattBank/AccountLookupServlet" method="post" class="card">
                    <input name="accountNumber" type="text" Placeholder="Enter account number"/>
                    <input name="password" type="text" Placeholder="Enter your customer ID"/>
                    <input name="email" type="text" Placeholder="Enter account type"/>
                    <input name="balance" type="text" Placeholder="Enter your balance"/>
                    <input type="submit" value="Lookup"/>
                    <input type="button" value="Clear" />
                </form>
            </div>
        </main>
    </body>
</html>
