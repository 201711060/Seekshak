<%@include file="components/include_jsp.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<title>sheekshuk</title>
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
					<form action="doupdateproffesionaldetails" method="post">
						<div class="account-top heading">
							<h3>User Dashboard</h3>
						</div>
						<div class="address">
							<span>Ph.D. Subject</span> <input type="text"
								name="phd_subject" id="grad_branch" width="70%" value="${userDetail.phd_subject}">
						</div>
						<div class="address">
							<span>Post Graduation Branch </span> <select name="postgrad_branch" value="${userDetail.postgrad_branch}">
								<option value="CE">CE</option>
								<option value="CSE">CSE</option>
								<option value="CSIT">CSIT</option>
								<option value="ICT">ICT</option>
								<option value="Mechanical">Mechanical</option>
								<option value="Electrical">Electrical</option>
								<option value="Electronics">Electronics</option>
							</select>
						</div>
						<div class="address">
							<span>Post Graduation CPI/CGPA(out of 10)</span> <input
								type="text" name="pg_cpi" id="pg_cpi" width="70%" value="${userDetail.pg_cpi}">
						</div>
						<div class="address">
							<span>Graduation Branch </span> <select name="grad_branch" selected="${userDetail.grad_branch}">
								<option value="CE">CE</option>
								<option value="CSE">CSE</option>
								<option value="CSIT">CSIT</option>
								<option value="ICT">ICT</option>
								<option value="Mechanical">Mechanical</option>
								<option value="Electrical">Electrical</option>
								<option value="Electronics">Electronics</option>
							</select>
						</div>

						<div class="address">
							<span>Graduation CPI/CGPA(out of 10)</span> <input type="text"
								name="grad_cpi" id="grad_cpi" width="30%" value="${userDetail.grad_cpi}">
						</div>

						<div class="address">
							<span>12th Percentage Obtained</span> <input type="text" name="twelve"
								width="70%" value="${userDetail.twelve}">
						</div>
						<div class="address">
							<span>10th Percentage Obtained</span> <input type="text" name="tenth"
								width="70%" value="${userDetail.tenth}">
						</div>
						<div class="address">
							<span>No. of Researches(Enter 0 for none)</span> <input
								type="text" name="no_research" id="no_research" width="70%" value="${research.no_research}">
						</div>
						<div class="address">
							<span>Paper Title</span> <input type="text" name="paper_title"
								id="paper_title" width="70%" value="${research.issn}">
						</div>
						<div class="address">
							<span>Paper Type</span> <select name="paper_type" value="${research.paper_type}">
							<option value="Conference">Conference</option>
							<option value="Journal">Journal</option>
							</select>
						</div>
						
						<div class="address">
							<span>ISSN No.</span> <input type="text" name="issn_no"
								id="issn_no" width="70%" value="${research.issn}">
						</div>
						<div class="address">
							<span>Impact Factor</span> <input type="text"
								name="impact_factor" width="70%" value="${research.impact_factor}">
						</div>
						<div class="address">
							<span>Select year of publication </span> <input type="text"
								name="year_publication" width="70%" value="${research.year_publication}">
						</div>
						<div class="address">
							<span>Fields of Interest(Separate by commas)</span> <input
								type="text" name="tagline" width="70%" value="${user.tagline}">
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