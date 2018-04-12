<%@include file="components/include_jsp.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Sheekshuk Post Job</title>
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
	<%@include file="components/header.jsp"%>

	<!--start-content-->
	<div class="products">
		<div class="container">
			<div class="products-grids">
				<div class="col-md-8 products-grid-left">
					<form action="dopostjob" method="post">
						<div class="account-top heading">
							<h2>Post a Job</h2>
						</div>

						<div class="address">
							<span>Job Title</span> <input type="text" name="jobtitle" />
						</div>

						<div class="address">
							<span>Job Category</span> <select name="jobcategory">
								<option value="IIT">IIT</option>
								<option value="IIIT">IIIT</option>
								<option value="NIT">NIT</option>
								<option value="CentralUniversity">Central University</option>
								<option value="DeemedUniversity">Deemed University</option>
								<option value="StateUniversity">State University</option>
								<option value="PrivateUniversity">Private University</option>
								<option value="GovtCollege">Govt. College</option>
								<option value="PrivateCollege">Private College</option>
								
							</select>
						</div>
						
						<div class="address">
							<span>Job Description</span>
							<textarea name="jobdescription"
								style="height: 100px; width:100%">Enter text here...</textarea>
						</div>

						<div class="address">
							<span>Required Qualification</span> <select name="requiredqualification">
								<option value="Doctorate">Doctorate</option>
								<option value="Masters">Masters</option>
								<option value="Bachelors">Bachelors</option>
							</select>
						</div>

						<div class="address">
							<span>Job Location</span> <input type="text" name="joblocation">
						</div>

						<div class="address">
							<span>Salary</span> <input type="text" name="salary" size="50">
						</div>

						<div class="address">
							<span>Experience</span> <select name="experience">
								<option value="volvo">0-1</option>
								<option value="saab">1-2</option>
								<option value="mercedes">2-3</option>
								<option value="mercedes">3 or more</option>
							</select>
						</div>

						<div class="address">
							<span>Last Date</span> <input type="text" name="lastdate" />
						</div>

						<div class="address">
							<span>Specialization</span> <input type="text"
								name="specialization">
						</div>
						<div class="address">
							<input type="submit" name="submit">
						</div>

					</form>
				</div>

			</div>
			<%@include file="components/institute_side_left.jsp"%>
			<div class="clearfix"></div>
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

	<%@include file="components/footer.jsp"%>
</body>
</html>