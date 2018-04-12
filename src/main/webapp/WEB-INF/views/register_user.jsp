<%@include file="components/include_jsp.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Sheekshuk</title>
<link href="resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
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
	<!--account-->
	<div class="account">
		<div class="container">
			<div class="account-bottom">
				<div class="col-md-6 account-left">
					<div class="col-md-6 account-left second">

						<div class="account-top heading">

							<h3>NEW USER?? Register</h3>
						</div>
						<form action="doregisteruser" method="post">
							<div class="address">
								<span>Name</span> <input type="text"
									name="fullname" id="fullname">
							</div>
							<div class="address">
								<span>Mobile</span> <input type="text"
									name="mobile" id="mobile">
							</div>
							<div class="address">
								<span>Email Address</span> <input type="text"
									name="email" id="email_id_user">
							</div>
							<div class="address">
								<span>Password</span> <input type="password" name="password"
									id="pwd_user">
							</div>
							<div class="address">
								<span>Confirm Password</span> <input type="password"
									name="password_re" id="pwd_user1">
							</div>
							<div class="address">
								<input type="submit" class="link-style" value="Register">
							</div>
						</form>





					</div>
				</div>
			</div>

			<div class="clearfix"></div>
		</div>
	</div>
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