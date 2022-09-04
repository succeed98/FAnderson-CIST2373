<%-- 
    Document   : DisplayAccount
    Created on : Jun 13, 2016, 2:57:40 PM
    Author     : renz
--%>

<%@page import="Business.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form>
        
        <%
            Account a1;
            
            a1 = (Account)session.getAttribute("a1");
            
            a1.display();
            
        %>
        
        
        <h1> Account Lookup Page  </h1>
        <table border="3">
            <tr>
                <td>Acct No:</td>
                <td><input type="text" name="antb" value="<%=a1.getAcctNo() %>" /></td>
            </tr>
            <tr>
                <td>Customer ID:</td>
                <td><input type="text" name="custtb" value="<%=a1.getCid()%>" /></td>
            </tr>
            <tr>
                <td>Type:</td>
                <td><input type="text" name="typetb" value="<%=a1.getType() %>" /></td>
            </tr>
            <tr>
                <td>Balance:</td>
                <td><input type="text" name="baltb" value="<%=a1.getBalance() %>" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Find" /></td>
                <td><input type="reset" value="Clear" /></td>
            </tr>
        </table>
            
    </form>
</html>
