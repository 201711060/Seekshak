<%@include file="components/include_jsp.jsp"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Seekshuk</title>
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
       


                        <!--start-content--><div id="banner"><img src="images/YourCareer.png" width="1000" height="361" alt="" /></div>
	<div id="welcome">
		<h1>Our Vision</h1>
		<div class="entry">
			<p>The SeekShak job portal project is an implementation of a Academic recruitment job portal. It helps the candidates in finding academic jobs at institutes according to their capability.Also this application project helps in making the recruitment process of academic jobs easy and transparent for academician convenience of institutes.</p>
		</div>
	</div>
	<div id="welcome">
		<h1>Our Mission</h1>
		<div class="entry">
			<p>It allows an institute to register themself on our portal. Once the institute verification has been done, it allows the institute to post job requirement in their institute. The institute then posts the job details like job type, job description, preferred skill set last date etc. The candidates also register on the job portal and is then allowed to apply for the jobs posted in the job portal by the institute.</p>
		</div>
	</div>
	
<div id="footer">
	<p>All rights reserved. Design by Mtech Advance Software Engineering Team 2</p>
</div>
<!-- end #footer -->
                  
                                          
                                                
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
                        <a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


                      <%//@include file="footer.jsp"%></body>
                        </html>
