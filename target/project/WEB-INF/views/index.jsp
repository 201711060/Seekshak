<%@include file="components/include_jsp.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Sheekshuk</title>
<%@include file="components/include.jsp"%>

<link href="resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
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
	<%@include file="components/header.jsp"%>

	<!--start-content-->
	<div class="row">
		<div class="col-md-2">
			<img src="resources/images/profile.jpg" alt="Profile Picture"
				style="margin: 10%"></img>
			<p class="cdetails">Sanjay Patel</p>
			<p class="cdetails">Ph.D. IIT Kanpur</p>
			<p class="cdetails">M.Tech IIT Roorkee</p>
			<p class="cdetails">B.Tech IIT Delhi</p>
		</div>
		<div class="col-md-8">
			<h3>Latest Jobs</h3>
			<div class="container">
				<c:forEach items="${joblist}" var="job">
					<div class="panel">
						<div class="panel-heading">
							<c:out value="${job.postedby}" />
							<a style="float: right" class="btn btn-primary" href="#"
								role="button">Apply</a>
							<p style="float: right; margin: 1%">
								LastDate:
								<c:out value="${job.lastdate}" />
							</p>
						</div>
						<div class="panel-body">
							<c:out value="${job.jobtitle}" />
						</div>
						<div class="panel-body">
							<c:out value="${job.jobdescription}" />
						</div>
					</div>
				</c:forEach>

			</div>
		</div>
		<div class="col-md-2">
			<h3>Jobs Applied</h3>
			<br>
			<p class="cdetails">You have not applied to any jobs</p>
		</div>
	</div>

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



	<%
		//@include file="footer.jsp"
	%>
</body>
</html>