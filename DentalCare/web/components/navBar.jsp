<%-- 
    Document   : navBar
    Created on : 06-Nov-2022, 13:39:34
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <script src="https://cdn.tailwindcss.com"></script>
          <script>
            tailwind.config = {
              theme: {
                extend: {
                  colors: {
                    'faris': '#4a4a59',
                  }
                }
              }
            }
          </script>
        <title>Register</title>
    </head>
    <body>
        <section class="w-full border-4 p-4 font-['Open Sans,sans-serif'] border-y-white-200">
            <div class="w-full flex items-center justify-between">
                <div>
                    <a href="../index.jsp"<h1 class="text-[#1967d2] hover:text-[#1967d2] text-3xl font-['Libre Baskerville,serif'] cursor-pointer">Fareeda's Dental Centre</h1></a>
                </div>
                <div>
                    <ul class="text-[#1967d2] flex gap-6 text-xl cursor-pointer">
                        <a href="../pages/logIn.jsp"><li class="hover:text-[#48487f]">Log In</li></a>
                        <a href="../pages/register.jsp"><li class="hover:text-[#48487f]">Register</li></a>
                        <li class="hover:text-[#48487f]">Call Now</li>
                        <li class="hover:text-[#48487f]">Get Directions</li>
                    </ul>
                </div>
            </div>
        </section>
    </body>
</html>

