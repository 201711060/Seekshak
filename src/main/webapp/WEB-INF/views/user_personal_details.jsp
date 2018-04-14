<%@include file="components/include_jsp.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<title>| seekshuk</title>
<link href="resources/css/bootstrap.css" rel='stylesheet'
	type='text/css' />
<!-- Custom Theme files -->
<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
<!-- start menu -->
<!--web-fonts-->
<!--//web-fonts-->
<!--/script-->
<script type="text/javascript">
            jQuery(document).ready(function($) {
                $(".scroll").click(function(event){		
                    event.preventDefault();
                    $('html,body').animate({scrollTop:$(this.hash).offset().top},900);
                });
            });
        </script>


</head>
<body>
	<!--start-home-->
	<!-- header_top -->

	<!-- header -->
	<%//@include file="header1.jsp"%>
	<%//@include file="header_user.jsp"%>
	<%@include file="components/header.jsp"%>



	<!--start-content-->
	<div class="products">
		<div class="container">
			<div class="products-grids">
				<div class="col-md-8 products-grid-left">
					<form action="doupdatepersonaldetails" method="post">
						<div class="account-top heading">
							<h3>User Details</h3>
						</div>
						<div class="address">
							<span>Name</span> <input type="text" name="name" id="name"
								width="70%" value="${user.fullname}">
						</div>
						<div class="address">
							<span>Experience</span> <input type="text" name="experience" id="name"
								width="70%" value="${user.experience}">
						</div>
						<div class="address">
							<span>City</span> <input type="textbox" name="city" id="addr"
								width="50%" value="${user.location}">
						</div>
						<div class="address">
							<span>Mobile</span> <input type="text" name="mobile" id="contact"
								width="70%" value="${user.mobileno }">
						</div>
						<div class="address">
							<span>Date of birth</span> <input type="text" name="dob" id="dob"
								width="70%" value="${user.dob }">
						</div>
						
						<div class="address">
							<input type="submit" class="link-style" value="Update">
						</div>
					</form>
					<br> <br> <br> <br> <br> <br> <br>
					<br> <br>



				</div>

			</div>
			<%@include file="components/user_side_left.jsp"%>
			<div class="clearfix"></div>
		</div>
	</div>
	</div>

	<!--complete content-->
	<!--account-->
	<!-- checkout -->
	<!--start-bottom-->

	<!--//end-bottom-->

	<!--//end-content-->
	<!--start-smooth-scrolling-->
	<script type="text/javascript">
                            $(document).ready(function() {
                                /*
                                                        var defaults = {
                                                                containerID: 'toTop', // fading element id
                                                                containerHoverID: 'toTopHover', // fading element hover id
                                                                scrollSpeed: 1200,
                                                                easingType: 'linear' 
                                                        };
                                 */
										
                                $().UItoTop({ easingType: 'easeOutQuart' });
										
                            });
                        </script>
	<a href="#home" id="toTop" class="scroll" style="display: block;">
		<span id="toTopHover" style="opacity: 1;"> </span>
	</a>


	<%//@include file="footer.jsp"%>
</body>
</html>