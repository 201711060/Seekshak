<%@include file="components/include_jsp.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<title>| seekshuk</title>
<%@include file="components/include.jsp"%>

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
					<form action="doshortlist" method="get">
						<div class="account-top heading">
							<h3>Institute dashboard</h3>
						</div>
						<select name="job_id">
							<c:forEach items="${joblist}" var="job">
								<option value="${job.idjobs}">${job.idjobs}-
									${job.jobtitle}</option>
							</c:forEach>
						</select> <input type="Submit">
					</form>
					<br>
					<form action="doshortlist" method="post">
						<table width="100%" bgcolor="#f1f1f1" border="1">
							<c:forEach items="${userlist}" var="user" varStatus="status">
								<tr>
									<td><input type="checkbox" name="selected"
										value="${user.iduserinfo}"></td>
									<td>${user.fullname}</td>
									<td>${user.qualification}</td>
									<td>${user.experience}</td>
									<td>${user.emailid}</td>
									<td>${user.mobileno}</td>
								</tr>
							</c:forEach>
							<tr><td></td></tr>						
						</table>
						<br/>
						<input type="Submit" value="Mail Shortlisted Candidates">
					</form>





					<br> <br> <br> <br> <br> <br> <br>
					<br> <br>



				</div>

			</div>
			<%@include file="components/institute_side_left.jsp"%>
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
