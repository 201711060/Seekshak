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
	<div class="products">
		<div class="container">
			<div class="products-grids">
				<div class="col-md-8 products-grid-left">

					<div class="account-top heading">
						<h3>ADMIN Institute Approval</h3>
					</div>

					<c:if test="${empty instituteList}"> 
					<p align="center"> No Institutes to Approve <p/> 
					</c:if>

					<table width="100%" bgcolor="#f1f1f1">
						<c:forEach items="${instituteList}" var="institute">
							<form action="doapproveinstitute" method="post">
								<tr>
									<td>${institute.institutename }</td>
									<td>${institute.institutecategory }</td>
									<td>${institute.institutewebsite }</td>
									<td>${institute.email }</td>
									<td><input type="hidden" name="idinstitute"
										value="${institute.idinstitute }"> <input
										type="submit" class="link-style" value="Approve "></td>
							</form>

							<td>
								<form action="dorejectinstitute" method="post">
									<input type="hidden" name="idinstitute"
										value="${institute.idinstitute }"> <input
										type="submit" class="link-style" value="Reject ">
								</form>
							</td>
							</tr>

						</c:forEach>
					</table>
					<br> <br> <br> <br> <br> <br> <br>
					<br> <br>
				</div>

			</div>
			<%@include file="components/admin_side_left.jsp"%>
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

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<a href="#home" id="toTop" class="scroll" style="display: block;">
		<span id="toTopHover" style="opacity: 1;"> </span>
	</a>


	<%
		//@include file="footer.jsp"
	%>
</body>
</html>
