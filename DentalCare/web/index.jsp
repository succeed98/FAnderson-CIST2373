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
            <link rel="stylesheet" href="css/tailus.css">
    <link href="https://fonts.googleapis.com/css2?family=Urbanist:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400&display=swap" rel="stylesheet">
  
    <style>
        body {
            font-family : Urbanist, sans-serif;
/*            @apply bg-white dark:bg-gray-900*/
        }

        .navbar-active .hamburger div:first-child {
/*            @apply rotate-45 translate-y-1.5;*/
        }
        .navbar-active .hamburger div:last-child {
/*            @apply -rotate-45 -translate-y-1;*/
        }
        .navbar-active div:first-child div:first-child div:last-child{
/*            @apply block lg:flex*/
        }
    </style>  
        <title>Welcome Page</title>
    </head>
<body class="bg-white dark:bg-gray-900">
    <header>
        <input type="checkbox" name="hbr" id="hbr" class="hbr peer" hidden aria-hidden="true">
        <nav class="fixed z-20 w-full bg-white/90 dark:bg-gray-900/80 backdrop-blur navbar shadow-2xl shadow-gray-600/5 border-b border-gray-100 dark:border-gray-800 peer-checked:navbar-active dark:shadow-none">
            <div class="xl:container m-auto px-6 md:px-12 lg:px-6">
                <div class="flex flex-wrap items-center justify-between gap-6 md:py-3 md:gap-0 lg:py-5">
                    <div class="w-full items-center flex justify-between lg:w-auto">
                        <a class="flex gap-4 items-center" href="#" aria-label="logo">
                            <img class="h-12 w-12" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fclipground.com%2Fimages%2Fcartoon-tooth-clipart-6.jpg&f=1&nofb=1&ipt=2f79236994fc46546c8d90f44da9c80d75e4fbf6efa86359754e4c252b9d8973&ipo=images"  alt="logo" loading="lazy" >
                            <h4 class=" font-black text-blue-900 text-2xl  text-center  dark:text-white relative text-transparent bg-clip-text bg-gradient-to-r from-blue-600 to-cyan-500 dark:from-blue-400 dark:to-cyan-300">Farees Dental Care </h4>
                        </a>
                        <label for="hbr" class="peer-checked:hamburger block relative z-20 p-6 -mr-6 cursor-pointer lg:hidden">
                            <div aria-hidden="true" class="m-auto h-0.5 w-5 rounded bg-gray-900 dark:bg-gray-300 transition duration-300"></div>
                            <div aria-hidden="true" class="m-auto mt-2 h-0.5 w-5 rounded bg-gray-900 dark:bg-gray-300 transition duration-300"></div>
                        </label>
                    </div>
                    <div class="navmenu hidden w-full flex-wrap justify-end items-center mb-16 space-y-8 p-6 border border-gray-100 rounded-3xl shadow-2xl shadow-gray-300/20 bg-white dark:bg-gray-800 lg:space-y-0 lg:p-0 lg:m-0 lg:flex md:flex-nowrap lg:bg-transparent lg:w-7/12 lg:shadow-none dark:shadow-none dark:border-gray-700 lg:border-0">
                        <div class="text-gray-600 dark:text-gray-300 lg:pr-4">
                            <ul class="space-y-6 tracking-wide font-medium text-base lg:text-sm lg:flex lg:space-y-0">
                                <li>
                                    <a href="#" class="block md:px-4 transition hover:text-primary dark:hover:text-primaryLight">
                                        <span>Home</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="block md:px-4 transition hover:text-primary dark:hover:text-primaryLight">
                                        <span>Portfolio</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="block md:px-4 transition hover:text-primary dark:hover:text-primaryLight">
                                        <span>Services</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
    
                        <div class="w-full space-y-2 border-primary/10 dark:border-gray-700 flex flex-col -ml-1 sm:flex-row lg:space-y-0 md:w-max lg:border-l">
                            <a href="/DentalCare/pages/register.jsp" class="relative flex h-9 ml-auto items-center justify-center sm:px-6 before:absolute before:inset-0 before:rounded-full focus:before:bg-sky-600/10 dark:focus:before:bg-sky-400/10 before:transition before:duration-300 hover:before:scale-105 active:duration-75 active:before:scale-95">
                                <span class="relative text-sm font-semibold text-primary dark:text-primaryLight">Sign Up</span>                    
                            </a>
                            <a href="/DentalCare/pages/log_in.jsp" class="relative flex h-9 ml-auto items-center justify-center sm:px-6 before:absolute before:inset-0 before:rounded-full before:bg-sky-600 dark:before:bg-sky-400 before:transition before:duration-300 hover:before:scale-105 active:duration-75 active:before:scale-95">
                                <span class="relative text-sm font-semibold text-white dark:text-gray-900">Login</span>                    
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </header>
    
    <div class="bg-white relative pt-40 pb-20 lg:pt-44 dark:bg-gray-900">
        <div class="relative xl:container m-auto px-6 md:px-12 lg:px-6">
            <h1 class="sm:mx-auto sm:w-10/12 md:w-2/3 font-black text-blue-900 text-4xl text-center sm:text-5xl md:text-6xl lg:w-auto lg:text-left xl:text-7xl dark:text-white">A better life starts with a beautiful smile. <br class="lg:block hidden"> <span class="relative text-transparent bg-clip-text bg-gradient-to-r from-blue-600 to-cyan-500 dark:from-blue-400 dark:to-cyan-300">Laugh more, stress less</span>.</h1>
            <div class="lg:flex">
                <div class="relative mt-8 md:mt-16 space-y-8 sm:w-10/12 md:w-2/3 lg:ml-0 sm:mx-auto text-center lg:text-left lg:mr-auto lg:w-7/12">
                    <p class="sm:text-lg text-gray-700 dark:text-gray-300 lg:w-11/12">
                        Many adults cannot afford dental care, especially our community’s most vulnerable<br> residents.
                        From clearing up painful dental infections and being able to eat again to <br> rejoining the workforce,
                        Farees Dental Care helps those desperately in need of <br>dental care become pain-free and smile confidently again.
                    </p>
                    <span class="block font-semibold text-gray-500 dark:text-gray-400">The best live changing dental care.</span>
                    
                </div>
                <div class="mt-12 md:mt-0 lg:absolute -right-10 lg:w-7/12">
                    <div class="relative w-full">
                        <div aria-hidden="true" class="absolute scale-75 md:scale-110 inset-0 m-auto w-full h-full md:w-96 md:h-96 rounded-full rotate-45 bg-gradient-to-r from-sky-500 to-cyan-300 blur-3xl"></div>
                        <img src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fclipground.com%2Fimages%2Fcartoon-tooth-clipart-6.jpg&f=1&nofb=1&ipt=2f79236994fc46546c8d90f44da9c80d75e4fbf6efa86359754e4c252b9d8973&ipo=images" class="relative w-full" alt="wath illustration" loading="lazy" width="320" height="280">
                    </div>
                </div>
            </div>
        </div>
    </div>
  </body>
</html>
