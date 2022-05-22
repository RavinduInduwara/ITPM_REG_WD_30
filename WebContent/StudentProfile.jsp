<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>

		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>EDUclue</title>
		<meta name="description" content="Unika - Responsive One Page HTML5 Template">
		<meta name="keywords" content="HTML5, Bootsrtrap, One Page, Responsive, Template, Portfolio" />
		<meta name="author" content="imransdesign.com">

		<!-- Mobile Metas -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
        
        <!-- Google Fonts  -->
		<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,500' rel='stylesheet' type='text/css'> <!-- Body font -->
		<link href='http://fonts.googleapis.com/css?family=Lato:300,400' rel='stylesheet' type='text/css'> <!-- Navbar font -->

		<!-- Libs and Plugins CSS -->
		<link rel="stylesheet" href="inc/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="inc/animations/css/animate.min.css">
		<link rel="stylesheet" href="inc/font-awesome/css/font-awesome.min.css"> <!-- Font Icons -->
		<link rel="stylesheet" href="inc/owl-carousel/css/owl.carousel.css">
		<link rel="stylesheet" href="inc/owl-carousel/css/owl.theme.css">

		<!-- Theme CSS -->
        <link rel="stylesheet" href="css/reset.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/mobile.css">

		<!-- Skin CSS -->
		<!-- <link rel="stylesheet" href="css/skin/cool-gray.css">-->
         <link rel="stylesheet" href="css/skin/ice-blue.css">
        <!-- <link rel="stylesheet" href="css/skin/summer-orange.css"> -->
        <!-- <link rel="stylesheet" href="css/skin/fresh-lime.css"> -->
        <!-- <link rel="stylesheet" href="css/skin/night-purple.css"> -->

		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

	</head>

    <body data-spy="scroll" data-target="#main-navbar">
        <div class="page-loader"></div>  <!-- Display loading image while page loads -->
    	<div class="body">
        
            <!--========== BEGIN HEADER ==========-->
            <header id="header" class="header-main">

                <!-- Begin Navbar -->
                <nav id="main-navbar" class="navbar navbar-default navbar-fixed-top" role="navigation"> <!-- Classes: navbar-default, navbar-inverse, navbar-fixed-top, navbar-fixed-bottom, navbar-transparent. Note: If you use non-transparent navbar, set "height: 98px;" to #header -->

                  <div class="container">

                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                      </button>
                      <!--a class="navbar-brand page-scroll" href="index.html"> </a-->
                     <h1> <a class="page-scroll" href="index.html">EDUclue</a></h1>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                           <li><a class="page-scroll" href="dashboardS.html">Student Dashboard</a></li>
                            <li><a class="page-scroll" href="index.html">Log Out</a></li>
        
                        </ul>
                    </div><!-- /.navbar-collapse -->
                  </div><!-- /.container -->
                </nav>
                <!-- End Navbar -->

            </header>
            <!-- ========= END HEADER =========-->
            
    <section id="payment-section" class="page text-white parallax" data-stellar-background-ratio="0.5" style="background-image: url(img/slider-bg.jpg);">
            <div class="cover"></div>
            
                 <!-- Begin page header-->
                <div class="page-header-wrapper">
                    <div class="container">
                        <div class="page-header text-center wow fadeInDown" data-wow-delay="0.4s">
                            <br><br>
                            <h2>STUDENT profile</h2>
                            <div class="devider"></div>
                            <p class="subtitle"></p>
                        </div>
                    </div>
                </div>
                <!-- End page header-->
                
                <div class="contact wow bounceInRight" data-wow-delay="0.4s">
                    <div class="container">
                        <div class="row">
                        
                            
                        
                            <div class="col-sm-6">
                                <div class="contact-form">          
            
    <br><br><br><br>     
	<table>
	<c:forEach var = "std" items = "${stdDetails}">
	
	<c:set var = "id" value = "${std.id}"/>
	<c:set var = "name" value = "${std.name}"/>
	<c:set var = "boy" value = "${std.boy}"/>  
	<c:set var = "gender" value = "${std.gender}"/>
	<c:set var = "age" value = "${std.age}"/>
	<c:set var = "grade" value = "${std.grade}"/>
	<c:set var = "email" value = "${std.email}"/>
	<c:set var = "contact" value = "${std.contact}"/>
	<c:set var = "address" value = "${std.address}"/>
	<c:set var = "gname" value = "${std.gname}"/>
	<c:set var = "gtype" value = "${std.gtype}"/>
	<c:set var = "gemail" value = "${std.gemail}"/>
	<c:set var = "gcontact" value = "${std.gcontact}"/>
	<c:set var = "gaddress" value = "${std.gaddress}"/>
	<c:set var = "occupation" value = "${std.occupation}"/>
	<c:set var = "username" value = "${std.userName}"/>
	<c:set var = "password" value = "${std.password}"/>	
	
	<tr>
		<td>Student ID : </td>
		<td>${std.id}</td>
	</tr>
	
	
	<tr>
		<td>Student Name : </td>
		<td>${std.name}</td>
	</tr>
	
	<tr>
		<td>Date of Birth : </td>
		<td>${std.boy}</td>
	</tr>
	
	<tr>
		<td>gender : </td>
		<td>${std.gender}</td>
	</tr>
	
	<tr>
		<td>age : </td>
		<td>${std.age}</td>
	</tr>
	
	<tr>
		<td>Grade : </td>
		<td>${std.grade}</td>
	</tr>
	
	<tr>
		<td>Email : </td>
		<td>${std.email}</td>
	</tr>
	
	<tr>
		<td>Contact : </td>
		<td>${std.contact}</td>
	</tr>
	
	<tr>
		<td>Address : </td>
		<td>${std.address}</td>
	</tr>
	
	<tr>
		<td>Guardian Name : </td>
		<td>${std.gname}</td>
	</tr>
	
	<tr>
		<td>Guardian Type : </td>
		<td>${std.gtype}</td>
	</tr>
	
	<tr>
		<td>Guardian Email : </td>
		<td>${std.gemail}</td>
	</tr>
	
	<tr>
		<td>Guardian Address : </td>
		<td>${std.gaddress}</td>
	</tr>
	
	<tr>
		<td>Guardian Contact :</td>
		<td>${std.gcontact}</td>
	</tr>
	
	<tr>
		<td>Guardian Occupation : </td>
		<td>${std.occupation}</td>
	</tr>
	
	<tr>
		<td>UserName : </td>
		<td>${std.userName}</td>
	</tr>
	
	<tr>
		<td>Student Password : </td>
		<td>${std.password}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value = "updatestudent.jsp" var= "stdupdate">
		<c:param name = "id" value = "${id}"/>
		<c:param name = "name" value = "${name}"/>
		<c:param name = "boy" value = "${boy}"/>
		<c:param name = "gender" value = "${gender}"/> 
		<c:param name = "age" value = "${age}"/>
		<c:param name = "grade" value = "${grade}"/>
		<c:param name = "email" value = "${email}"/>
		<c:param name = "contact" value = "${contact}"/>
		<c:param name = "address" value = "${address}"/>
		<c:param name = "gname" value = "${gname}"/>
		<c:param name = "gtype" value = "${gtype}"/>
		<c:param name = "gemail" value = "${gemail}"/>
		<c:param name = "gcontact" value = "${gcontact}"/>
		<c:param name = "gaddress" value = "${gaddress}"/>
		<c:param name = "occupation" value = "${occupation}"/>
		<c:param name = "uname" value = "${userName}"/>
		<c:param name = "pass" value = "${password}"/>
	</c:url>
	<br>
	<a href = "${stdupdate}">
	<br>
	<input type = "button" name = "update" value = "UPDATE"  class="btn wow bounceInRight" data-wow-delay="0.8s"><br>
	</a>
	<br>
	<br>
	
	<c:url value = "deletestudent.jsp" var= "stddelete">
		<c:param name = "id" value = "${id}"/>
		<c:param name = "name" value = "${name}"/>
		<c:param name = "boy" value = "${boy}"/>
		<c:param name = "gender" value = "${gender}"/> 
		<c:param name = "age" value = "${age}"/>
		<c:param name = "grade" value = "${grade}"/>
		<c:param name = "email" value = "${email}"/>
		<c:param name = "contact" value = "${contact}"/>
		<c:param name = "address" value = "${address}"/>
		<c:param name = "gname" value = "${gname}"/>
		<c:param name = "gtype" value = "${gtype}"/>
		<c:param name = "gemail" value = "${gemail}"/>
		<c:param name = "gcontact" value = "${gcontact}"/>
		<c:param name = "gaddress" value = "${gaddress}"/>
		<c:param name = "occupation" value = "${occupation}"/>
		<c:param name = "uname" value = "${userName}"/>
		<c:param name = "pass" value = "${password}"/>
	</c:url>
	
	<a href = "${stddelete}">
	<input type = "button" name = "delete" value = "DELETE"  class="btn wow bounceInRight" data-wow-delay="0.8s"><br>
	</a>
	<br><br>
	<a href="dashboard.jsp"><button type="button" class="btn wow bounceInRight" data-wow-delay="0.8s">Student Dashboard</button></a>
	<br><br><br><br>
	</div>  
                            </div>
                                                                                
                        </div> <!-- /.row -->

                    </div> <!-- /.container -->
                </div>
            </section>
            <!-- End payment section
                
            <!-- Begin footer -->
            <footer class="text-off-white">
            
                <div class="footer-top">
                
                
                <div class="footer">
                    <div class="container text-center wow fadeIn" data-wow-delay="0.4s">
                        <p class="copyright">Copyright &copy; 2022 - Designed By <a href="https://www.behance.net/poljakova" class="theme-author"> </a> &amp; Developed by <a href="http://www.imransdesign.com/" class="theme-author"></a></p>
                    </div>
                </div>

            </footer>
            <!-- End footer -->

            <a href="#" class="scrolltotop"><i class="fa fa-arrow-up"></i></a> <!-- Scroll to top button -->
                                              
        </div><!-- body ends -->
        
        
        
        
        <!-- Plugins JS -->
		<script src="inc/jquery/jquery-1.11.1.min.js"></script>
		<script src="inc/bootstrap/js/bootstrap.min.js"></script>
		<script src="inc/owl-carousel/js/owl.carousel.min.js"></script>
		<script src="inc/stellar/js/jquery.stellar.min.js"></script>
		<script src="inc/animations/js/wow.min.js"></script>
        <script src="inc/waypoints.min.js"></script>
		<script src="inc/isotope.pkgd.min.js"></script>
		<script src="inc/classie.js"></script>
		<script src="inc/jquery.easing.min.js"></script>
		<script src="inc/jquery.counterup.min.js"></script>
		<script src="inc/smoothscroll.js"></script>

		<!-- Theme JS -->
		<script src="js/theme.js"></script>

    </body> 
        
            
</html>
