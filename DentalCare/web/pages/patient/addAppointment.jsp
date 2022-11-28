<%-- 
    Document   : addAppointment
    Created on : 27-Nov-2022, 09:56:30
    Author     : muhyideenelias
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Business.*"%>    
<%@page import="java.util.*"%>   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <script src="https://unpkg.com/tailwindcss-jit-cdn"></script>
        <title>Add Appointment</title>
    </head>
    <body class="font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover" style="background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');">        
        <% Patient patient = (Patient)session.getAttribute("patient");
           ProcedureList procedures  = patient.procedures;
           Procedure procedureArray [] = procedures.getProcedure();
        %>
        <%
            if (procedures.counter > 0) {
                response.sendRedirect("/DentalCare/pages/patient/notAllowed.jsp");
            }
        %>
        
        <header><jsp:include page="/pages/patient/components/navBar.jsp"></jsp:include></header>

        <div class="max-w-4xl flex items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0">
            <form action="http://localhost:31328/DentalCare/AddAppointmentServlet" method="post" name="form" class="w-full lg:w-4/5 rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-65 mx-6 lg:mx-0">
                <div class="p-4 md:p-12 text-center lg:text-left">		
                    <h1 class="text-3xl font-bold pt-8 pb-8 lg:pt-0">Add Appointment </h1>
                    <div class="flex -mx-3">
                        <div class="w-1/2 px-3 mb-5 hidden">
                            <label for="" class="text-xs font-semibold px-1"></label>
                            <div class="flex">
                                <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-account-outline text-gray-400 text-lg"></i></div>
                                <input type="textarea" name="patId" value="<%= patient.getPatId()%>" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none min-h-18 focus:border-indigo-500" placeholder="">
                            </div>
                        </div>
                        <div class="w-full px-3 mb-5">
                            <select class="form-select appearance-none
                                block
                                w-full
                                px-3
                                py-1.5
                                text-base
                                font-normal
                                text-gray-700
                                bg-white bg-clip-padding bg-no-repeat
                                border border-solid border-gray-300
                                rounded
                                transition
                                ease-in-out
                                m-0
                                focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none" aria-label="Default select example" name="procName">
                                  <option selected>Select a procedure</option>
                                  <option value="Cleaning/Examinations">Cleaning/Examinations</option>
                                  <option value="X-rays">X-rays</option>
                                  <option value="Whitening">Whitening</option>
                                  <option value="Cavity">Cavity</option>
                                  <option value="Top Dentures">Top Dentures</option>
                                  <option value="Bottom Dentures">Bottom Dentures</option>
                                  <option value="Crown">Crown</option>
                                  <option value="Root Canal">Root Canal</option>
                            </select>
                        </div>
                    </div>
                    <div class="flex -mx-3">
                        <div class="w-full px-3 mb-5">
<!--                            <label for="" class="text-xs font-semibold px-1">Email</label>-->
                            <div class="flex">
                                <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-email-outline text-gray-400 text-lg"></i></div>
                                <input type="text" name="procDesc" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500" placeholder="Enter Procedure Description">
                            </div>
                        </div>
                    </div>
                    <div class="flex -mx-3">
                        <div class="w-full px-3 mb-5">
<!--                            <label for="" class="text-xs font-semibold px-1">Address</label>-->
                            <div class="flex">
                                <div class="w-10 z-10 pl-1 text-center pointer-events-none flex items-center justify-center"><i class="mdi mdi-email-outline text-gray-400 text-lg"></i></div>
                                <input type="text" name="apptDateTime" class="w-full -ml-10 pl-10 pr-3 py-2 rounded-lg border-2 border-gray-200 outline-none focus:border-indigo-500" placeholder="Enter Appointment date and time (May 14, 2022, 1pm)">
                            </div>
                        </div>
                    </div>
                    <div class="flex -mx-3">
                        <div class="w-full px-3 mb-5">
                            <div class="flex">
                                <select class="form-select appearance-none
                                block
                                w-full
                                px-3
                                py-1.5
                                text-base
                                font-normal
                                text-gray-700
                                bg-white bg-clip-padding bg-no-repeat
                                border border-solid border-gray-300
                                rounded
                                transition
                                ease-in-out
                                m-0
                                focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none" aria-label="Default select example" name="dentId">
                                  <option selected>Select Your Dentist</option>
                                  <option value="D201">Frank Martin</option>
                                  <option value="D202">Susan Cassidy</option>
                                  <option value="D203">Jerry York</option>
                                  <option value="D204">Wayne Pettersen</option>

                            </select>
                            </div>
                        </div>
                    </div>
                    <div class="pt-12 pb-8 flex items-center justify-center">
                        <button class="bg-green-700 hover:bg-green-1000 text-white font-bold py-2 px-4 rounded">
                            Add Appointment
                        </button> 
                    </div>
                </div>
            </form>
        </div>


        <script src="https://unpkg.com/popper.js@1/dist/umd/popper.min.js"></script>
        <script src="https://unpkg.com/tippy.js@4"></script>
    
    </body>
</html>
