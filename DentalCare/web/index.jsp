<%-- 
    Document   : index
    Created on : 06-Nov-2022, 13:33:24
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <script src="https://cdn.tailwindcss.com"></script>

        <title>Welcome Page</title>
    </head>
    <body>
        <header><jsp:include page="components/navBar.jsp"></jsp:include></header>
        <section class="w-full p-4">
            <div class="w-full flex flex-col items-center pt-12 gap-6">
                <div class="w-full flex flex-col items-center justify-center gap-6">
                    <h2 class="text-[#1967d2] text-6xl font-['Libre Baskerville,serif']"> Fareeda's Dental Centre </h2>
                    <p>Best Dental Clinic In Georgia</p>
                    <p>Open 24/7</p>
                    <button class="border-2 w-1/6 bg-[#1967d2] hover:bg-[#48487f] text-white p-6">Call Now 212 345 21</button>
                </div>
                <div class="w-3/4 p-12">
                    <img src="https://neighborhoodmedicalcenter.org/wp-content/uploads/2018/03/bigstock-Portrait-Of-Dentist-And-Dental-92589275.jpg" alt="employees"/>
                </div>
            </div>
        </section>
    </body>
</html>
