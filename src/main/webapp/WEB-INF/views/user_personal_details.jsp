
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
					<form action="user_dashboard_code.jsp" method="post">
						<div class="account-top heading">
							<h3>User Details</h3>
						</div>
						<div class="address">
							<span>First name</span> <input type="text" name="f_name_user"
								id="f_name_user" width="70%">
						</div>

						<div class="address">
							<span>Last name</span> <input type="text" name="l_name_user"
								id="l_name_user" width="70%">
						</div>
						<div class="address">
							<span>Address</span> <input type="textbox" name="addr" id="addr"
								width="30%">
						</div>
					</form>
					<div class="address">
						<span>Contact No.</span> <input type="text" name="contact"
							id="contact" width="70%">
					</div>
					<div class="address">
						<span>Email_id </span> <input type="text" name="email" id="email"
							width="70%">
					</div>
					<div class="address">
						<span>Date of birth</span> <input type="text" name="dob" id="dob"
							width="70%">
					</div>
					<div class="address">
						<span>Gender</span> <input type="text" name="gender" id="gender"
							width="70%">
					</div>
					<div class="address">
						<a href="update_proffessional_details_code.jsp"> <input
							type="submit" class="link-style" value="Update">
						</a>
					</div>

					<br> <br> <br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>



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