<%-- 
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : login
    Created on : 28-Aug-2022, 11:17:15
    I Promise I wrote this code
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dental Care Home</title>
        <style>
            * {
                padding: 0;
                margin: 0;
                box-sizing: border-box;
            }
            
            body {
                  background-color: #f1f4f8; ;
            }
            
            header {
                display: flex;
                justify-content: space-between;
                align-content: center;
                background-color: #fff;
            }
            
            .nav-left {
                display: flex;
                flex-direction: row;
                gap: 2px;
                width: 100%;
            }
            
            img {
                height: 70px;
                width: 80px;  
            }
            
            .nav-left h1 {
                align-self: center;
                color: #61dafb;
            }
            
            .nav-right {
                display: flex;
                align-content: center;
                justify-content: center;
                align-self: center;
                font-size: 24px;
            }
            
            .nav-right a {
                align-self: center;
                   color: #61dafb;
            }
            
            .custom-padding {
                padding: 0 1% 0 1%;
            }
            
            
            .container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            margin: auto;
            width: 800px;
            height: 600px;
        }
        /* ----- end of container stylings ----- */
  
        /* provides padding to main heading */
        .main-heading {
            padding: 2rem 0 2rem 0;
        }
  
        .content {
            position: relative;
        }
  
        /* ----- carousel content stylings ----- */
        /* places the carousel content on center of the carousel */
        .carousel-content {
            position: absolute;
            /*to center the content horizontally and vertically*/
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%); 
            text-align: center;
            z-index: 50;
        }
        .carousel-heading {
            font-size: 3rem;
            color: #308d46;
            margin-bottom: 1rem;
        }
        /*----- end of carousel content stylings ----- */
  
        /* ----- slideshow stylings ----- */
        .slideshow {
            height: 100%;
            overflow: hidden; /* to hide slides in x-direction */
            position: relative;
        }
        /* wrapper which wraps all the slideshow images stylings */
        .slideshow-wrapper {
            display: flex;
            /* We give it width as 400% because we are making a 
               4 image carousel. If you want to make for example, 
               5 images carousel, then give width as 500%. */
            width: 400%;
            height: 100%;
            position: relative;
            /* you can change the animation settings from below */
            animation: slideshow 20s infinite;
         }
        /* define width and height for images*/
        .slide {
            width: 100%;
            height: 100%;
        }
        .slide-img {
            width: 100%;
            height: 100%;
            object-fit: cover; 
        }
        /* @keyframes are used to provide animations
           We make these settings for 4 image carousel.
           Make modification according to your needs. */
        @keyframes slideshow {
            0%  { left: 0; }
            10% { left: 0; }
            15% { left: -100%; }
            25% { left: -100%; }
            30% { left: -200%; }
            40% { left: -200%; }
            45% { left: -300%; }
            55% { left: -300%; }
            60% { left: -200%; }
            70% { left: -200%; }
            75% { left: -100%; }
            85% { left: -100%; }
            90% { left: 0%; }
        }
        /* ----- end of slideshow stylings ----- */
  
        /* ----- carousel control buttons stylings ----- */
        .slide-btn {
            background-color: #bbb;
            border-radius: 50%;
            border: .2rem solid #d38800;
            width: 1.2rem;
            height: 1.2rem;
            outline: none;
            cursor: pointer;
            /* stylings for positioning the buttons at
               the bottom of the carousel */
            position: absolute;
            bottom: 3%;
            left: 50%;
            transform: translateX(-50%);
            z-index: 70;
        }
        /* As we provide position as absolute, 
        the buttons places one over the other. 
        So, we have to place them individually
        at their correct positions. */
        .slide-btn-1 {
            left: 45%;
        }
        .slide-btn-2 {
            left: 50%;
        }
        .slide-btn-3 {
            left: 55%;
        }
        .slide-btn-4 {
            left: 60%;
        }
        /* When we focus on the particular button, 
        the animation stops to that particular image 
        to which the button is associated. */
        .slide-btn-1:focus~.slideshow-wrapper {
            animation: none;
            left: 0;
        }
        .slide-btn-2:focus~.slideshow-wrapper {
            animation: none;
            left: -100%;
        }
        .slide-btn-3:focus~.slideshow-wrapper {
            animation: none;
            left: -200%;
        }
        .slide-btn-4:focus~.slideshow-wrapper {
            animation: none;
            left: -300%;
        }
        /* when we focus on the button, the background color changes */
        .slide-btn:focus {
            background-color: #308d46;
        }
        /* ----- end of carousel control buttons stylings ----- */
        </style>
    </head>
    <body>
        <header class="custom-padding"> 
            <div class="nav-left">
                <img class="img" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstatic.vecteezy.com%2Fsystem%2Fresources%2Fpreviews%2F000%2F562%2F550%2Foriginal%2Fdental-care-logo-template-illustration-design-vector-eps-10.jpg&f=1&nofb=1&ipt=3084998807994cedd8263f8c039c0c7b5ec35dc62a96591f50fb3eb07dea61b1&ipo=images" alt='bank-logo'>
                <h1>Welcome To Dental Care</h1>
            </div>
            <div class="nav-right">
                <a href="./pages/Login.jsp">Login</a>
            </div>
        </header>
        <div class="container">
        <h1 class="main-heading">A smile remains the most inexpensive gift...</h1>
        <div class="content">
            <!-- The content which is placed at the center of the carousel -->

            <div class="slideshow">
                <!-- carousel control buttons -->
                <button class="slide-btn slide-btn-1"></button>
                <button class="slide-btn slide-btn-2"></button>
                <button class="slide-btn slide-btn-3"></button>
                <button class="slide-btn slide-btn-4"></button>
                <!-- carousel wrapper which contains all images -->
                <div class="slideshow-wrapper">
                    <div class="slide">
                        <img class="slide-img"
                            src=
"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fyegfitness.ca%2Fwp-content%2Fuploads%2F2019%2F03%2FGive-Your-Kids-Great-Dental-Care-e1552401648429.jpg&f=1&nofb=1&ipt=0b5e6704cbbcd85a145a49fbeec66e232075d0fd71c126f72dda1601d2e5102f&ipo=images">
                    </div>
                    <div class="slide">
                        <img class="slide-img"
                            src=
"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.trbimg.com%2Fimg-5a4c0021%2Fturbine%2Fct-perspec-dental-therapists-dentists-teeth-health-care-0103-20180102&f=1&nofb=1&ipt=0d65958712a0d72125477ff6d33b0601a295323a32cc58fbf53c7283e07481ee&ipo=images">
                    </div>
                    <div class="slide">
                        <img class="slide-img" src=
"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.2kXody5fehHa3zHaj-sEoAHaE8%26pid%3DApi&f=1&ipt=c5750cfa59e4b9be528f672c05e4bf82da61333a18ea66ad78d19ed0f732cadf&ipo=images">
                    </div>
                    <div class="slide">
                        <img class="slide-img" src=
"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.deansdentalcare.com%2Fwp-content%2Fuploads%2F2016%2F10%2FDeansDentalCareMens.jpg&f=1&nofb=1&ipt=df90b58eb5d0080f04a42a5187fd34c725a3d35bdf2204207f69e6bf0928fde9&ipo=images">
                    </div>
                </div>
            </div>
        </div>
    </div>

    </body>
</html>
