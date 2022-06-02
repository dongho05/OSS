<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Information Product</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="assets/img/favicon.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">

        <!-- =======================================================
        * Template Name: OnePage - v4.7.0
        * Template URL: https://bootstrapmade.com/onepage-multipurpose-bootstrap-template/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
        <style>
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
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top">
            <div class="container d-flex align-items-center justify-content-between">

                <h1 class="logo"><a href="home">Stickey Shoes</a></h1>
                <!-- Uncomment below if you prefer to use an image logo -->
                <!-- <a href="index.html" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
                <!--                <div class="container h-100">
                                    <div class="d-flex justify-content-center h-100">
                                        <div class="">
                                            <form action="" method="post">
                                                <input class="" type="text" name="search" placeholder="Search...">
                                                <button onclick="this.form.submit()"><img src="image/search-icon-png-21.png" alt="" width="20px" height="20px"/></button>
                                                <a href="search" type="submit" class="search_icon"><i class="fas fa-search"></i></a>
                                            </form>
                                        </div>
                <c:set var="k" value="${requestScope.search}"/>

            </div>
        </div>-->
                <nav id="navbar" class="navbar">
                    <ul>

                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <!--<li><a class="nav-link scrollto" href="#about">About</a></li>-->
                        <!--<li><a class="nav-link scrollto" href="#services">Services</a></li>-->
                        <!--<li><a class="nav-link scrollto o" href="#portfolio">Portfolio</a></li>-->
                        <!--<li><a class="nav-link scrollto" href="#team">Team</a></li>-->
                        <!--<li><a class="nav-link scrollto" href="#pricing">Pricing</a></li>-->
                        <li class="dropdown"><a href="#"><span>Brand</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <c:set var="bid" value="${requestScope.bid}"/>
                                <c:forEach items="${requestScope.brand}" var="b">
                                    <li><a class="${b.brand_id==bid?"active":""}" href="home?bid=${b.brand_id}">${b.brand_name}</a></li>
                                    </c:forEach>
                            </ul>
                            <ul>
                            </ul>
                        </li>
                        <li class="dropdown"><a href="#"><span>Menu</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <c:set var="cid" value="${requestScope.cid}"/>
                                <c:forEach items="${requestScope.cate}" var="c">
                                    <li><a class="${c.cate_id==cid?"active":""}" href="home?cid=${c.cate_id}">${c.cate_name}</a></li>
                                    </c:forEach>
                            </ul>
                        </li>
                        <!--<li><a class="nav-link scrollto" href="#contact">Contact</a></li>-->

                        <%--<c:set value="${requestScope.admin}"></c:set>--%>
                        <c:if test="${sessionScope.admin==null}"><li><a class="getstarted scrollto" href="login">Sign in</a></li></c:if>
                        <c:if test="${sessionScope.admin!=null}"><li><a class="getstarted scrollto" href="logout">${sessionScope.admin.username}</a></li></c:if>

                            <li><a class="getstarted scrollto" href="logout">Sign out</a></li>
                            <c:set var="size" value="${sessionScope.size}"/>
                        <li><a class="nav-link scrollto" href="MyCart.jsp"><img src="image/shopping-cart.png" width="40px" height="40px" alt=""/>MY ORDER (${size})</a></li>    
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

            <!-- ======= Breadcrumbs ======= -->
            <section id="breadcrumbs" class="breadcrumbs">
                <div class="container">

                    <div class="d-flex justify-content-between align-items-center">
                        <h2>Information Product</h2>
                        <ol>
                            <li><a href="home">Home</a></li>
                            <li>Information Product</li>
                        </ol>
                    </div>
                </div>
            </section><!-- End Breadcrumbs -->

            <!-- ======= Portfolio Details Section ======= -->
            <section id="portfolio-details" class="portfolio-details">
                <div class="container">

                    <div class="row gy-4">

                        <div class="col-lg-8">
                            <div class="portfolio-details-slider swiper">
                                <div class="swiper-wrapper align-items-center">
                                    <c:set var="im" value="${requestScope.image}"/>

                                    <c:forEach items="${requestScope.image}" var="i">
                                        <div class="swiper-slide">
                                            <img src="image/${i.url}" alt=""> </div>
                                        </c:forEach>



                                    <!--                <div class="swiper-slide">
                                                      <img src="assets/img/portfolio/portfolio-2.jpg" alt="">
                                                    </div>
                                    
                                                    <div class="swiper-slide">
                                                      <img src="assets/img/portfolio/portfolio-3.jpg" alt="">
                                                    </div>-->

                                </div>
                                <div class="swiper-pagination"></div>
                            </div>
                        </div>

                        <div class="col-lg-4">

                            <div class="portfolio-info">
                                <c:set var="c" value="${requestScope.detail}"/>
                                <h3>${c.name}</h3>
                                <ul>
                                    <li><strong>Category</strong>: ${c.cate.cate_name}</li>
                                    <li><strong>Brand</strong>: ${c.brand.brand_name}</li>
                                    <li><strong>Status</strong>: ${c.statusId.status}</li>
                                    <li><strong>Price</strong>: ${c.price} VND</li>
                                    <form name="f" action="" method="post">
                                        <c:if test="${c.statusId.status_id==1}">
                                        <div >
                                            Enter number of product: <input type="number"  name="number" width="10px"  value="1" style="margin-bottom: 15px;border-radius: 10px"/>
                                        </div></c:if>
                                        <div style="float: left"><a href="MyShop.jsp">
                                                <button class="btn btn-block btn-light">Continue Shopping</button></a>
                                        </div>
                                        <c:if test="${c.statusId.status_id==1}">
                                        <div style="float: right">
                                            <input class="btn btn-success btn-block" type="submit" onclick="buy('${c.id}')" value="Add To Cart"/>
                                        </div></c:if>
                                    </form>
                                </ul>
                            </div>
                            <div class="portfolio-description">
                                <h2>More information about ${c.name}</h2>
                                <p>
                                    ${c.info}
                                </p>
                            </div>
                        </div>

                    </div>

                </div>
            </section><!-- End Portfolio Details Section -->

        </main><!-- End #main -->



        <main id="main" >
            <h2 style="padding-left: 13%">Related Products</h2>
                <div class="col-sm-9" style="text-align: center; padding-left: 25%;justify-content: space-around">
                    <div class="row">
                        <c:forEach begin="1" end="3" items="${requestScope.cateProduct}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card" style="height: 450px">
                                    <img class="card-img-top" src="image/${o.imageUrl}" alt="Card image cap" height="286px">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                        <p class="card-text show_txt"></p>
                                        <div class="row">
                                            <div style="padding-bottom: 15px">
                                                ${o.cate.cate_name}
                                            </div>
                                            <div class="col" >
                                                <p class="btn btn-danger btn-block">${o.price} VND</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div> 
        </main>        


        <!-- ======= Footer ======= -->
        <footer id="footer" style="padding-top: 30px">

            <div class="footer-top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-3 col-md-6 footer-contact">
                            <h3>Stickey Shop</h3>
                            <p>
                                Thuan Thanh District <br>
                                Bac Ninh, <br>
                                Viet nam <br><br>
                                <strong>Phone:</strong> +84 5589 488 55<br>
                                <strong>Email:</strong> dong@gmail.com<br>
                            </p>
                        </div>

                        <div class="col-lg-2 col-md-6 footer-links">
                            <h4>Useful Links</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="https://www.adidas.com.vn/vi">Adidas</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Nike</a></li>
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
                            <h4>Subcribe with us</h4>
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
<script type="text/javascript">
                                                function buy(id) {
                                                    document.f.action = "buy?proid=" + id;
                                                    document.f.submit();
                                                }
</script>