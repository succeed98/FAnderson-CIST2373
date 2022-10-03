/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : DisplayAccount.jsp
    Created on : 03-Oct-2022, 07:20:05
    I Promise I wrote this code
*/

<%@page import="Business.Customer"%>
<%@page import="Business.AccountList"%>  
<%@page import="Business.Account"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ChattBank Display Account</title>
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

            .output-container {
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

        </style>
    </head>
    <body>
         <%
            Customer customer = (Customer)session.getAttribute("customer");
            AccountList aList  = customer.aList;
            Account accountArray [] = aList.getAccountArray();
        %>
        <main> 

            <div class="main-container">
                <nav class="nav"> 
                    <img class="img" src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.pngmart.com%2Ffiles%2F5%2FBank-PNG-Pic.png&f=1&nofb=1" alt='bank-logo'>
                    <h1>Display Account</h1>
                </nav>
                <div class="card">
                    <c:if condition="${customer != null}">
                        <table>
                            <tr>
                                <td>
                                    First Name:
                                </td>
                                <td>
                                    ${customer.getCustFirstName()}
                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    Last Name:
                                </td>
                                <td>
                                    ${customer.getCustLastName()}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Address:
                                </td>
                                <td>
                                    ${customer.getCustAddress()}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Email:
                                </td>
                                <td>
                                    ${customer.getCustEmail()}
                                </td>
                            </tr>
                        </table>
                    </c:if>
                    
<!--                    <c:if condition="${aList == null}">
                        <h1>No Results Found</h1>
                    </c:if>   -->
                </div>
            </div>
        </main>
    </body>
</html>


