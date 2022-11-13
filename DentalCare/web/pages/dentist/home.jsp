<%-- 
    Document   : dentistDasboard
    Created on : 07-Nov-2022, 11:05:04
    Author     : muhyideenelias
--%>

<%@page import="Dentist.Dentist"%>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <title>Dentist Home Page</title>
    </head>
<body class="font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover" style="background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');">        
    <header><jsp:include page="/pages/dentist/components/navBar.jsp"></jsp:include></header>
    
    <% Dentist dentist = (Dentist)session.getAttribute("dentist");%>
    
    <div class="max-w-4xl flex items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0">
        <form action="http://localhost:31328/ChattBank/LoginServlet" method="post" name="form" class="w-full lg:w-4/5 rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-65 mx-6 lg:mx-0">
            <div class="p-4 md:p-12 text-center lg:text-left">		
                <h1 class="text-3xl font-bold pt-8 lg:pt-0">Update Your Information </h1>
                <div class="flex -mx-3">
                    <div class="w-1/2 px-3 mb-5">
                        <label for="" class="text-xs font-semibold px-1">First name</label>
                        <div class="flex">
                            <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-account-outline text-gray-400 text-lg"></i></div>
                            <input type="text" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500" placeholder="<%= dentist.getFirstName()%>">
                        </div>
                    </div>
                    <div class="w-1/2 px-3 mb-5">
                        <label for="" class="text-xs font-semibold px-1">Last name</label>
                        <div class="flex">
                            <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-account-outline text-gray-400 text-lg"></i></div>
                            <input type="text" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500" placeholder="<%= dentist.getLastName()%>">
                        </div>
                    </div>
                </div>
                <div class="flex -mx-3">
                    <div class="w-full px-3 mb-5">
                        <label for="" class="text-xs font-semibold px-1">Email</label>
                        <div class="flex">
                            <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-email-outline text-gray-400 text-lg"></i></div>
                            <input type="text" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500" placeholder="<%= dentist.getEmail()%>">
                        </div>
                    </div>
                </div>
                <div class="flex -mx-3">
                    <div class="w-full px-3 mb-5">
                        <label for="" class="text-xs font-semibold px-1">Office</label>
                        <div class="flex">
                            <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-email-outline text-gray-400 text-lg"></i></div>
                            <input type="text" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500" placeholder="<%= dentist.getOffice()%>">
                        </div>
                    </div>
                </div>
                <div class="pt-12 pb-8 flex items-center justify-center">
                    <button class="bg-green-700 hover:bg-green-1000 text-white font-bold py-2 px-4 rounded-full">
                        Get In Touch
                    </button> 
                </div>
            </div>
        </form>
    </div>
            

    </div>
	<script src="https://unpkg.com/popper.js@1/dist/umd/popper.min.js"></script>
	<script src="https://unpkg.com/tippy.js@4"></script>
        
    </body>
</html>
