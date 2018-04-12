<%@include file="components/include_jsp.jsp"%>

<!DOCTYPE HTML>
<html>
    <head>
        <title> sheekshuk</title>
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
  <div class="products">
                            <div class="container">
                                <div class="products-grids">
                                    <div class="col-md-8 products-grid-left">
<form action="user_dashboard_code.jsp" method="post">
					<div class="account-top heading">
						<h3>User Dashboard</h3>
					</div>
 			<div class="address">
						<span>Post Graduation Branch</span>
						<input type="text" name="grad_branch" id="grad_branch" width="70%">
					</div>
    <div class="address">
        <span>Post Graduation Branch
    </span>                                     <select name="category">
                                                    <option> -- select branch -- </option>
                                                       <%
                                                       %>
  
          
                                               </select>
                                                       </div>
           

    <div class="address">
						<span>Post Graduation CPI/CGPA(out of 10)</span>
						<input type="text" name="pg_cpi" id="pg_cpi" width="70%">
					</div>
    <div class="address">
        <span>Graduation Branch
    </span>                                     <select name="category">
                                                    <option> -- select branch -- </option>
                                                       <%
                                                       %>
  
          
                                               </select>
                                                       </div>
           
    <div class="address">
						<span>Graduation CPI/CGPA(out of 10)</span>
						<input type="text" name="grad_cpi" id="grad_cpi" width="30%">
					</div>
						</form>

                                        <div class="address">
        <span>12 th field
    </span>                                     <select name="category">
                                                    <option> -- select 12th field -- </option>
                                                       <%
                                                       %>
  
          
                                               </select>
                                                       </div>
           <div class="address">
						<span>Percent Obtained</span>
						<input type="text" name="" width="70%">
					</div>
<div class="address">
						<span>No. of Researches(Enter 0 for none)</span>
						<input type="text" name="no_research" id="no_research" width="70%">
					</div>
                                        <div class="address">
						<span>ISSN No.</span>
						<input type="text" name="issn_no" id="issn_no" width="70%">
					</div>
                                        <div class="address">
						<span>Impact Factor</span>
						<input type="text" name="impact_factor" width="70%">
					</div>
                                        <div class="address">
        <span>Select year of publication
    </span>                                     <select name="category">
                                                    <option> -- year -- </option>
                                                       <%
                                                       %>
  
          
                                               </select>
                                                       </div>
           
                                        <div class="address">
						<span>No. of participants</span>
						<input type="text" name="no_of_participants" width="70%">
					</div>
                                        <div class="address">
						<span>Fields of Interest(Seperate by commas)</span>
						<input type="text" name="interest" width="70%">
					</div>
                                        <div class="address">
                                                    <a href="update_proffessional_details_code.jsp">
                                                        <input type="submit" class="link-style" value="Update">
                                                    </a>
                                                </div>

                                       <br>
                                      <br>
                                           <br><br><br><br><br><br><br>
                                           


                                        
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
                        <a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


                      <%//@include file="footer.jsp"%></body>
                        </html>