
<!DOCTYPE HTML>
<html>
<head>
<title>Sheekshuk</title>
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
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 900);
		});
	});
</script>


</head>
<body>
	<!--start-home-->
	<!-- header_top -->

	<!-- header -->
	<%
		//@include file="header1.jsp"
	%>
	<%
		//@include file="header_user.jsp"
	%>
	<%@include file="components/header.jsp"%>



	<!--start-content-->
	<!--account-->
	<div class="account">
		<div class="container">
			<div class="account-bottom">
				<div class="col-md-6 account-left">
					<div class="col-md-6 account-left second">

						<div class="account-top heading">

							<h3>REGISTERED USERS</h3>
						</div>
						<form action="dologin" method="post">
							<div class="address">
								<span>Email Address</span> <input type="text"
									name="emailid" id="emailid">
							</div>
							<div class="address">
								<span>Password</span> <input type="password" name="password"
									id="password">
							</div>
							<div class="address">
								<input type="submit" class="link-style" value="Login"> <a
									href="user_sign_up.jsp"> <input type="submit"
									class="link-style" value="Register ">
								</a>

							</div>
						</form>


						Admin???
						<div class="address">
							<a href="admin_login.jsp"> <input type="submit"
								class="link-style" value="Login as Admin">
							</a>
						</div>


						Login as institute
						<div class="address">
							<a href="store_login.jsp"> <input type="submit"
								class="link-style" value="Login as Store">
							</a>
						</div>

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

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<a href="#home" id="toTop" class="scroll" style="display: block;">
		<span id="toTopHover" style="opacity: 1;"> </span>
	</a>


	<%@ 
	include file="components/footer.jsp"%>
</body>
</html>