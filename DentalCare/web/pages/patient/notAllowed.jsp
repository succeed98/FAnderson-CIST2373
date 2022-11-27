<%-- 
    Document   : addAppointmentComponent
    Created on : 27-Nov-2022, 14:51:16
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover" style="background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');">        
        <header><jsp:include page="/pages/patient/components/navBar.jsp"></jsp:include></header>
        <div class="max-w-4xl flex items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0">
            <div class="w-full flex items-center justify-center lg:w-4/5 rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-65 mx-6 lg:mx-0">
                <h1 class="text-3xl font-bold text-red-600">You already have an appointment!!</h1>
            </div>
        </div>

    </body>
</html>
