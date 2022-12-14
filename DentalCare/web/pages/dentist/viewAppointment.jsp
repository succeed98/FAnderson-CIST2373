<%-- 
    Document   : viewAppointment
    Created on : 13-Nov-2022, 19:50:20
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Business.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointment Page</title>
    </head>
    <body class="font-sans antialiased text-gray-900 leading-normal tracking-wider bg-cover" style="background-image:url('http://www.clipartbest.com/cliparts/4Tb/4zp/4Tb4zp8Tg.jpeg');">
        <%
            Dentist dentist = (Dentist)session.getAttribute("dentist");
            ProcedureList procedures  = dentist.procedures;
            Procedure procedureArray [] = procedures.getProcedure();
        %>
        <header><jsp:include page="/pages/dentist/components/navBar.jsp"></jsp:include></header>
        <div class="max-w-8xl flex justify-center items-center h-auto lg:h-screen flex-wrap mx-auto my-32 lg:my-0">
           <div class="flex flex-col w-full  rounded-lg lg:rounded-l-lg lg:rounded-r-none shadow-2xl bg-white opacity-65 mx-6 lg:mx-0>
                <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
                  <div class="py-2 inline-block min-w-full sm:px-6 lg:px-8">
                    <div class="overflow-hidden">
                      <table class="min-w-full">
                        <thead class="bg-white border-b">
                          <tr>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              #
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                             Patient Name
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              Email
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              Code
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              Date
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              Procedure
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              Description
                            </th>
                            <th scope="col" class="text-xl font-medium text-gray-900 px-6 py-4 text-left">
                              Cost
                            </th>
                          </tr>
                        </thead>
                        <tbody>
                          <% for(int i = 0; i < procedures.counter; i++) {%>
                            <tr class="bg-white border-b transition duration-300 ease-in-out hover:bg-gray-100">
                              <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900"><%= i + 1%></td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                <%= procedureArray[i].getPatientFirstName() + " " + procedureArray[i].getPatientLastName()%>
                              </td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                <%= procedureArray[i].getPatientEmail() %>
                              </td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                <%= procedureArray[i].getProcCode() %>
                              </td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                <%= procedureArray[i].getAptDateTime() %>
                              </td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                  <%= procedureArray[i].getProcName() %>
                              </td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                  <%= procedureArray[i].getProcDesc() %>
                              </td>
                              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                  <%= procedureArray[i].getCost() %>
                              </td>
                            </tr>
                          <%}%>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
            </div>
        </div>
    </body>
</html>
