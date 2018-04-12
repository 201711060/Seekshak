<!DOCTYPE HTML>
<html>
    <head>
        <title> Sheekshuk</title>
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
					<form action="doregisterinstitute" method="post" >
					<div class="account-top heading">
						<h3>Register as Institute</h3>
					</div>
					<div class="address">
						<span>Institute Name</span>
						<input type="text" name="institutename" title="only name" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>Institute Category</span>
						<input type="text" name="institutecategory" title="only category" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>Institute Website</span>
						<input type="text" name="institutewebsite" title="website" type="text"  required />
					</div>
					<div class="address">
						<span>Affiliated University</span>
						<input type="text" name="affiliateduniversity" title="university" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>Ranking</span>
						<input type="text" name="ranking" title="only name" type="text" pattern="[a-zA-Z0-9 ]*$" required />
					</div>
					<div class="address">
						<span>Institute Type</span>
						<input type="text" name="institutetype" title="only name" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>City</span>
						<input type="text" name="city_name" title="only name" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>State</span>
						<input type="text" name="state" title="only name" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>Address</span>
						<input type="text" name="address" title="only name" type="text" pattern="[a-zA-Z ]*$" required />
					</div>
					<div class="address">
						<span>Contact No</span>
						<input type="text" name="contactno" title="only name" type="text" pattern="[0-9 ]*$" required />
					</div>
					
					<div class="address">
						<span>Email Address</span>
						<input type="text" name="email" id="email" title="email" required pattern="[^@]+@[^@]+\.[a-zA-Z]{2,6}" />
					</div>
					<div class="address">
						<span>Password</span>
						<input type="password" name="pwd" id="pwd" title="at least eight symbols containing at least one number, one lower, and one upper letter" type="text" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required />
					</div>
					<div class="address">
						<span>Re-enter Password</span>
						<input type="password" name="pwd_re" id="pwd_re">
					</div>
					<div class="address new">
						<input type="submit" class="link-style" value="submit">
					</div>
					</form>
				</div> 
				
				<div class="clearfix"></div>
	</div></div></div>
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
                        <a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


                      <%//@include file="footer.jsp"%></body>
                        </html>