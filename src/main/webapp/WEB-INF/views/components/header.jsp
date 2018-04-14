<div id="wrapper">
	<div id="header">
		<div style="float: right;">
			<c:choose>
				<c:when test="${sessionScope.instituteSessionValid.equals('true')}">
					<a href="post_job" class="link-style">Post a Job</a> |
					
 			   </c:when>
 			   <c:when test="${sessionScope.SessionValid.equals('true')}">
					<a href="profile" class="link-style">My Profile</a>
 			   </c:when>
 			   <c:when test="${sessionScope.adminSessionValid.equals('true')}">
					<a href="admin_dashboard" class="link-style">Admin Dashboard</a>
 			   </c:when>
				<c:otherwise>
					<a href="institute_login" class="link-style">Institute Login</a> |
					<a href="login" class="link-style">Candidate Login</a> | 
					<a href="admin_login" class="link-style">Admin Login</a> |
			</c:otherwise>
			</c:choose>
			<a href="contact" class="link-style">Contact Us</a> | <a href="about"
				class="link-style">About</a> |
			<c:choose>
				<c:when test="${sessionScope.instituteSessionValid.equals('true')}">
					<a href="dologout" class="link-style">Logout</a>
				</c:when>
				<c:when test="${sessionScope.SessionValid.equals('true')}">
					<a href="dologout" class="link-style">Logout</a>
				</c:when>
				<c:when test="${sessionScope.adminSessionValid.equals('true')}">
					<a href="dologout" class="link-style">Logout</a>
				</c:when>
			</c:choose>
		</div>
		<div id="logo">
			<h1 style="float: left">
				<a href="index">SEEKSHAK</a>
			</h1>
		</div>
		<div style="clear:right;float:right">
			<h2>Welcome ${sessionScope.institutename} ${sessionScope.fullname}
		to Seekshuk Job Portal
			</h2>
		</div>
		
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
			<li class="current_page_item"><a href="index">Home</a></li>
			<li><a href="viewjobs?jobcategory=IIT">IIT Jobs</a></li>
			<li><a href="viewjobs?jobcategory=IIIT">IIIT Jobs</a></li>
			<li><a href="viewjobs?jobcategory=NIT">NIT Jobs</a></li>
			<li><a href="viewjobs?jobcategory=CentralUniversity">Central
					University Jobs</a></li>
			<li><a href="viewjobs?jobcategory=DeemedUniversity">Deemed
					University Jobs</a></li>
			<li><a href="viewjobs?jobcategory=GovtCollege">Govt. College
					Jobs</a></li>
			<li><a href="viewjobs?jobcategory=PrivateCollege">Private
					College Jobs</a></li>

		</ul>
	</div>
</div>
<p align="center" style="color:red">${error}</p>