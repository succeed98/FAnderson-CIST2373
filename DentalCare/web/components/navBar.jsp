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
        <title>JSP Page</title>
    </head>
    <body>
        <section class="w-full border-4 p-4 font-['Open Sans,sans-serif'] border-y-white-200">
            <div class="w-full flex items-center justify-between">
                <div>
                    <h1 class="text-[#48487f] text-3xl font-['Libre Baskerville,serif']">Faris Dental</h1>
                </div>
                <div>
                    <ul class="text-[#48487f] flex gap-6 text-xl">
                        <li>Sign In</li>
                        <li>Sign Up</li>
                        <li>Call Now</li>
                        <li>Get Directions</li>
                    </ul>
                </div>
            </div>
        </section>
    </body>
</html>