<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>STICKEY SHOES</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="assets/img/favicon.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">


        <!-- Vendor CSS Files -->
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">
        <style>
            .searchbar{
                margin-bottom: auto;
                margin-top: auto;
                height: 60px;
                background-color: #353b48;
                border-radius: 30px;
                padding: 10px;
            }

            .search_input{
                color: white;
                border: 0;
                outline: 0;
                background: none;
                width: 0;
                caret-color:transparent;
                line-height: 40px;
                transition: width 0.4s linear;
            }

            .searchbar:hover > .search_input{
                padding: 0 10px;
                width: 450px;
                caret-color:red;
                transition: width 0.4s linear;
            }

            .searchbar:hover > .search_icon{
                background: white;
                color: #e74c3c;
            }

            .search_icon{
                height: 40px;
                width: 40px;
                float: right;
                display: flex;
                justify-content: center;
                align-items: center;
                border-radius: 50%;
                color:white;
                text-decoration:none;
            }
            .dropbtn {
                background-color: #4CAF50;
                color: white;
                padding: 16px;
                font-size: 16px;
                border: none;
                cursor: pointer;
            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
            }

            .dropdown-content a:hover {background-color: #f1f1f1}

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .dropdown:hover .dropbtn {
                background-color: #3e8e41;
            }
            .col {
                display: block;
                float:left;
                margin: 1% 0 1% 1.6%;
            }

            .col:first-of-type {
                margin-left: 0;
            }

            .container1{
                width: 100%;
                max-width: 940px;
                margin: 0 auto;
                position: relative;
                text-align: center;
            }

            /* CLEARFIX */

            .cf:before,
            .cf:after {
                content: " ";
                display: table;
            }

            .cf:after {
                clear: both;
            }

            .cf {
                *zoom: 1;
            }

            /* GENERAL STYLES */

            .pagination{
                padding: 30px 0;
            }

            .pagination ul{
                margin: 0;
                padding: 0;
                list-style-type: none;
            }

            .pagination a{
                display: inline-block;
                padding: 10px 18px;
                color: #222;
            }

            /* ONE */

            .p1 a{
                width: 40px;
                height: 40px;
                line-height: 40px;
                padding: 0;
                text-align: center;
            }

            .p1 a.is-active{
                background-color: #2ecc71;
                border-radius: 100%;
                color: #fff;
            }

            .height {
                height: 30vh
            }

            .search {
                position: relative;
                box-shadow: 0 0 40px rgba(51, 51, 51, .1)
            }

            .search input {
                height: 60px;
                text-indent: 25px;
                border: 2px solid #d6d4d4
            }

            .search input:focus {
                box-shadow: none;
                border: 2px solid blue
            }

            .search .fa-search {
                position: absolute;
                top: 20px;
                left: 16px
            }

            .search button {
                position: absolute;
                top: 5px;
                right: 5px;
                height: 50px;
                width: 110px;
                background: blue
            }

        </style>
        <!-- =======================================================
        * Template Name: OnePage - v4.7.0
        * Template URL: https://bootstrapmade.com/onepage-multipurpose-bootstrap-template/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top">
            <div class="container d-flex align-items-center justify-content-between">

                <h1 class="logo"><a href="home">Stickey Shoes</a></h1>

                <nav id="navbar" class="navbar">
                    <ul>

                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <li><a class="nav-link scrollto" href="#about">About</a></li>
                        <!--<li><a class="nav-link scrollto" href="#services">Services</a></li>-->
                        <!--<li><a class="nav-link scrollto o" href="#portfolio">Portfolio</a></li>-->
                        <!--<li><a class="nav-link scrollto" href="#team">Team</a></li>-->
                        <li class="dropdown"><a href="#"><span>Sort By</span> <i class="bi bi-chevron-right"></i></a>
                            <ul>
                                <li><a href="sort">Increasing Price</a></li>
                                <li><a href="sort1">Decreasing Price</a></li>
                                <li><a href="sort2">From A-Z</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a href="#"><span>Brand</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <c:set var="bid" value="${requestScope.bid}"/>
                                <c:forEach items="${requestScope.brand}" var="b">
                                    <li><a class="${b.brand_id==bid?"active":""}" href="tab2?bid=${b.brand_id}">${b.brand_name}</a></li>
                                    </c:forEach>
                            </ul>
                            <ul>
                            </ul>
                        </li>
                        <li class="dropdown"><a href="#"><span>Menu</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <c:set var="cid" value="${requestScope.cid}"/>
                                <c:forEach items="${requestScope.cate}" var="c">
                                    <li><a class="${c.cate_id==cid?"active":""}" href="tab?cid=${c.cate_id}">${c.cate_name}</a></li>
                                    </c:forEach>
                            </ul>
                        </li>
                        <li><a class="nav-link scrollto" href="#contact">Contact</a></li>

                        <%--<c:set value="${requestScope.admin}"></c:set>--%>
                        <c:if test="${sessionScope.admin==null}"><li><a class="getstarted scrollto" href="login">Sign in</a></li></c:if>
                        <c:if test="${sessionScope.admin!=null}"><li><a class="getstarted scrollto" href="logout">Hello ${sessionScope.admin.lname}</a></li>
                            <li class="dropdown"><a href="#"><span>Settings</span> <i class="bi bi-chevron-down"></i></a>
                                <ul>
                                    <li><a href="logout">Sign out</a></li>
                                    <li><a href="#">Change password</a></li>
                                    <li><a href="#">Change information personal</a></li>


                                </ul>
                            </li>
                        </c:if>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header><!-- End Header -->


        <div class="row height d-flex justify-content-center align-items-center">
            <div class="col-md-8">
                <form action="home" method="post">
                    <div class="search"> <i class="fa fa-search"></i> <input type="text" name="search" class="form-control" placeholder="Search any products...">
                        <button onclick="this.form.submit()" class="btn btn-primary">Search</button> </div>
                </form>
            </div>
            <c:set var="k" value="${requestScope.search}"/>
        </div>


        <main id="main">
            <div class="col-sm-9" style="text-align: center; padding-left: 25%;justify-content: space-around; padding-top: 100px">
                <div class="row">
                    <c:forEach items="${requestScope.data}" var="o">
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="card">
                                <img class="card-img-top" src="image/${o.imageUrl}" alt="Card image cap">
                                <div class="card-body">
                                    <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                    <p class="card-text show_txt"></p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} VND</p>
                                        </div>
<!--                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                        </div>-->
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>  
        </main><!-- End #main -->


        <c:set var="page" value="${requestScope.page}"/>
        <div class="container1">
            <c:forEach begin="${1}" end="${requestScope.num}"var="i">
                <div class="pagination p1">
                    <ul>
                        <li><a class="${i==page?"active":""}" href="tab?page=${i}&cid=${cid}&key=${search}">${i}</a></li>
                    </ul>
                </div>
            </c:forEach>
        </div>

        <!-- ======= Footer ======= -->
        <footer id="footer">

            <div class="footer-top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-3 col-md-6 footer-contact">
                            <h3>OnePage</h3>
                            <p>
                                A108 Adam Street <br>
                                New York, NY 535022<br>
                                United States <br><br>
                                <strong>Phone:</strong> +1 5589 55488 55<br>
                                <strong>Email:</strong> info@example.com<br>
                            </p>
                        </div>

                        <div class="col-lg-2 col-md-6 footer-links">
                            <h4>Useful Links</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">About us</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Services</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-3 col-md-6 footer-links">
                            <h4>Our Services</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-4 col-md-6 footer-newsletter">
                            <h4>Join Our Newsletter</h4>
                            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
                            <form action="" method="post">
                                <input type="email" name="email"><input type="submit" value="Subscribe">
                            </form>
                        </div>

                    </div>
                </div>
            </div>

            <div class="container d-md-flex py-4">

                
                <div class="social-links text-center text-md-right pt-3 pt-md-0">
                    <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                    <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                    <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                    <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                    <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                </div>
            </div>
        </footer><!-- End Footer -->

        <div id="preloader"></div>
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/purecounter/purecounter.js"></script>
        <script src="assets/vendor/aos/aos.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>

    </body>

</html>