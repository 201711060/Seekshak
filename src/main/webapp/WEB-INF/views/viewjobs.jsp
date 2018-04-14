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
		<div class="col-md-2"></div>
		<div class="col-md-7">
			<h3>Latest Jobs</h3>
			<c:if test="${empty joblist}"> 
					<p align="center"> No Jobs in posted this category<p/> 
					</c:if>
			<c:forEach items="${joblist}" var="job">
				<form action="doapply" method="post">
					<div class="panel1">
						<div class="panel-title">
							<h3 style="padding: 1%; width:600px; float:left"><c:out value="${job.jobtitle}" /> - 
							<c:out value="${job.postedby}" /></h3>
							<div style="float: right; margin: 1%; width:100px">
								<input type="Submit" class="link-style" value="Apply"/>
							</div>
							<p style="float: right; margin: 1%; width:100px">
								LastDate:
								<c:out value="${job.lastdate}" />
								<br>
							</p>
					</div>
					<div class="panel-body">
						<p style="float:left; clear:both"><c:out value="${job.jobdescription}" /></p>
					</div>
					
				</div>
				<input type="hidden" name="job_id" value="${job.idjobs}">
				</form>
			</c:forEach>

		</div>
		<div class="col-md-3">
			
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