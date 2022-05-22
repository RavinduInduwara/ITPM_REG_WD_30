<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en-US">
	<head>
	
	
	

		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>EDUclue - Teacher Profile</title>
		<meta name="description" content="Unika - Responsive One Page HTML5 Template">
		<meta name="keywords" content="HTML5, Bootsrtrap, One Page, Responsive, Template, Portfolio" />
		<meta name="author" content="imransdesign.com">
		
		
		



<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">

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
		<!--<link rel="stylesheet" href="css/skin/cool-gray.css"> -->
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


		<style>
		.button4 {
		  background-color: Gray ;
  border: none;
  color: white;
  padding: 10px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
		}
		</style>



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
                              <li><a class="page-scroll" href="body">Home</a></li>
                            <li><a class="page-scroll" href="#about-section">About</a></li>
                            <li><a class="page-scroll" href="#services-section">Services</a></li>
                            <li><a class="page-scroll" href="#portfolio-section">Works</a></li>
                            <li><a class="page-scroll" href="#team-section">Team</a></li>                            
                            <li><a class="page-scroll" href="#prices-section">Package</a></li>
                            <li><a class="page-scroll" href="#contact-section">Contact</a></li>
                            <li><a class="page-scroll" href="index.html">log out</a></li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                  </div><!-- /.container -->
                </nav>
                <!-- End Navbar -->

            </header>
            <!-- ========= END HEADER =========-->
            
         
                  
              
       
                
                         
                
            <!-- Begin payment section -->
            <section id="payment-section" class="page text-white parallax" data-stellar-background-ratio="0.5" style="background-image: url(img/slider-bg.jpg);">
            <div class="cover"></div>
            <br><br><br>
                 <!-- Begin page header-->
                <div class="page-header-wrapper">
                    <div class="container">
                        <div class="page-header text-center wow fadeInDown" data-wow-delay="0.4s">
                            <h1> Teacher User Profile </h1>
                            <div class="devider"></div>
                           
                        </div>
                    </div>
                </div>
                <!-- End page header-->
                
	


		
		<c:forEach var="cus" items="${cusDetails}">
		
	    <c:set var="tid" value="${cus.tid}"/>
		<c:set var="name" value="${cus.name}"/>
		<c:set var="nic" value="${cus.nic}"/>
		<c:set var="gender" value="${cus.gender}"/>
		<c:set var="subject" value="${cus.subject}"/>
		<c:set var="address" value="${cus.address}"/>
		<c:set var="email" value="${cus.email}"/>
		<c:set var="phone" value="${cus.phone}"/>
		<c:set var="experience" value="${cus.experience}"/>
		<c:set var="eduqualifications" value="${cus.eduqualifications}"/>
		<c:set var="username" value="${cus.userName}"/>
		<c:set var="password" value="${cus.password}"/>
	
		
	

	
			 
			 
                    
                        <div class="page-header text-center wow fadeInDown" data-wow-delay="0.5s" role="form">
                            <h5> Teacher ID Number:   ${cus.tid}</h5>
                         
                        <br>
                            <h5>Teacher's Name:   ${cus.name} </h5> 
                           
                
          				 <br>
                            <h5>NIC Number:   ${cus.nic}</h5>
                          
                    
							 <br>
		
                            <h5>	Gender:   ${cus.gender}</h5>
                            
							 <br>	
	
                            <h5>	Subject:   ${cus.subject}</h5>
                        
							 <br>

                            <h5>	Home Address: ${cus.address}</h5>
                            
							 <br>

                            <h5>	Email Address: ${cus.email}</h5>
                        
							 <br>
		
                            <h5>Contact Number: ${cus.phone}</h5>
                      
							 <br>
		
                            <h5>Experience: ${cus.experience}</h5>
                            
               				 <br>
		
			 
                            <h5>Education Qualifications: ${cus.eduqualifications}</h5>
                           
							 <br>
                            <h5>Teacher User Name: ${cus.userName}</h5>
                            
             
			
			
			

		</c:forEach>
		
		
		<c:url value="updateteacher.jsp" var="cusupdate">
		<c:param name="tid" value="${tid}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="nic" value="${nic}"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="subject" value="${subject}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="experience" value="${experience}"/>
		<c:param name="eduqualifications" value="${eduqualifications}"/>		
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
		</c:url>
		
		<br>
		
		<a href="${cusupdate}">
		
		<button  type="submit" name="update" class="button4" data-wow-delay="0.4s">Update My Data</button>
		
                                        
		</a>
		
		
		<c:url value="deleteteacher.jsp" var="cusdelete">
		<c:param name="tid" value="${tid}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="nic" value="${nic}"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="subject" value="${subject}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="experience" value="${experience}"/>
		<c:param name="eduqualifications" value="${eduqualifications}"/>	
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
		</c:url>
		<a href="${cusdelete}">
		
		<button type="submit" name="delete" class="button4	" data-wow-delay="0.4s">Delete My Account</button>
		</a>
			   </div>
	</div>
	
	 </div>
</div>
<br>	<br><br>	<br>
	</section>
	
	
	<br><<br><br><br><br><br><br><br><br><br><br>
	    
                                </div>  
                            </div>
                                                                                
                        </div> <!-- /.row -->

                    </div> <!-- /.container -->
                </div>
            </section>
            <!-- End payment section -->
    
                
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