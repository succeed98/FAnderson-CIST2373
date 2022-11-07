<%-- 
    Document   : signIn
    Created on : 07-Nov-2022, 09:31:02
    Author     : muhyideenelias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
         <header><jsp:include page="../components/navBar.jsp"></jsp:include></header>
        <section class="h-screen">
          <div class="container px-6 py-12 h-full">
            <div class="flex justify-center items-center flex-wrap h-full g-6 text-gray-800">
              <div class="md:w-8/12 lg:w-6/12 mb-12 md:mb-0">
                <img
                  src="https://i.ebayimg.com/images/g/xPwAAOSwzMFe09jt/s-l400.jpg"
                  class="w-full"
                  alt="Phone image"
                />
              </div>
              <div class="md:w-8/12 lg:w-5/12 lg:ml-20 flex flex-col gap-16">
                  <div class="text-center mb-10">
                    <h3 class="text-[#1967d2] text-3xl font-['Libre Baskerville,serif'] mx-4 mb-0 font-bold">Sign In</h3>
                    <p>Enter your information to sign in</p>
                  </div>
                <form>
                  <!-- Email input -->
                  <div class="mb-6">
                    <input
                      type="text"
                      class="form-control block w-full px-4 py-2 text-xl font-normal text-gray-700 bg-white bg-clip-padding border border-solid border-gray-300 rounded transition ease-in-out m-0 focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none"
                      placeholder="Email address"
                    />
                  </div>

                  <!-- Password input -->
                  <div class="mb-6">
                    <input
                      type="password"
                      class="form-control block w-full px-4 py-2 text-xl font-normal text-gray-700 bg-white bg-clip-padding border border-solid border-gray-300 rounded transition ease-in-out m-0 focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none"
                      placeholder="Password"
                    />
                  </div>

                  <div class="flex justify-between items-center mb-6">
                    <div class="form-group form-check">
                      <input
                        type="checkbox"
                        class="form-check-input appearance-none h-4 w-4 border border-gray-300 rounded-sm bg-white checked:bg-[#48487f]blue-600 checked:border-blue-600 focus:outline-none transition duration-200 mt-1 align-top bg-no-repeat bg-center bg-contain float-left mr-2 cursor-pointer"
                        id="exampleCheck3"
                        checked
                      />
                      <label class="text-[#48487f] form-check-label inline-block text-gray-800" for="exampleCheck2"
                        >Remember me</label
                      >
                    </div>
                    <a
                      href="#!"
                      class="text-[#48487f] hover:text-blue-700 focus:text-blue-700 active:text-blue-800 duration-200 transition ease-in-out"
                      >Forgot password?</a
                    >
                  </div>

                  <!-- Submit button -->
                  <div class="w-full px-3 mb-5">
                        <button class="block w-full max-w-xs mx-auto bg-[#1967d2] hover:bg-[#48487f] focus:bg-indigo-700 text-white rounded-lg px-3 py-3 font-semibold">SIGN IN</button>
                  </div>

<!--                  <div
                    class="flex items-center my-4 before:flex-1 before:border-t before:border-gray-300 before:mt-0.5 after:flex-1 after:border-t after:border-gray-300 after:mt-0.5"
                  >
                    <p class="text-center font-semibold mx-4 mb-0">OR</p>
                  </div>-->

                </form>
              </div>
            </div>
          </div>
        </section>
    </body>
</html>
