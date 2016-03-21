<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Tour Bus Agent</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/lightbox.css">
<!-- jQuery (necessary JavaScript plugins) -->
<script src="js/bootstrap.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/style4.css" />
<script type="text/javascript" src="js/modernizr.custom.79639.js"></script>
<!--//theme style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<script src="js/jquery.min.js"></script>


</head>
<body>
<!-- header -->
<div class="top-header">
	 <div class="container">
		 <div class="logo">
		 </div>		 
	 </div>
</div>
<!---->
<div class="about">
	 <div class="container">
	 	<h2>Tour Bus Agent</h2>
		 <div class="about-top-sec">
			 <br/>
			 <p><span>Wonder Tours is a travel agency specializing in bus tours between Hong Kong and various locations in China. The company owns 50 large buses, each of which has a capacity of between 25 to 50 passengers. The company has three categories of business operations,</span> Regularly Scheduled Bus Trips, Specialty Sight-Seeing Tours and Private Bus Rentals.</p>
			 <p>
				Following part provides ADD, DELETE, ALTER AND SELECT operations of these three tables in the Database.
			</p>
		 </div>	
		 <br/> 
		 	<h4>
				Private Bus Rentals
			</h4>
			<table class="table">
				<thead>
				<tr>
					<th>
						Bus No.
					</th>
					<th>
						Seat Capacity
					</th>
					<th>
						Driver No.
					</th>
					<th>
						Depart Date
					</th>
					<th>
						Depart Time
					</th>
					<th>
						Depart Location
					</th>
					<th>
						Return Date
					</th>
					<th>
						Return time
					</th>
					<th>
						Return Location
					</th>
					<th>
						Contact Person
					</th>
					<th>
						Contact Tel
					</th>
					<th>
						Operations
					</th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<td>
						1
					</td>
					<td>
						TB - Monthly
					</td>
					<td>
						01/04/2012
					</td>
					<td>
						Default
					</td>
				</tr>
				</tbody>
			</table>

		<br/> 
		 	<h4>
				Regularly Scheduled Bus Trips
			</h4>
			<table class="table">
				<thead>
				<tr>
					<th>
						Tour Code
					</th>
					<th>
						Destination
					</th>
					<th>
						Description
					</th>
					<th>
						Bus No.
					</th>
					<th>
						Driver No.
					</th>
					<th>
						Depart Location
					</th>
					<th>
						Depart Date
					</th>
					<th>
						Depart Time
					</th>
					<th>
						Max Participants
					</th>
					<th>
						No. of Participants
					</th>
					<th>
						Operations
					</th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<td>
						1
					</td>
					<td>
						TB - Monthly
					</td>
					<td>
						01/04/2012
					</td>
					<td>
						Default
					</td>
				</tr>
				</tbody>
			</table>


			<br/> 
		 	<h4>
				Sight-Seeing Tours
			</h4>
			<table class="table">
				<thead>
				<tr>
					<th>
						Tour Code
					</th>
					<th>
						Guide No.
					</th>
					<th>
						Guide Name
					</th>
					<th>
						Operations
					</th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<td>
						1
					</td>
					<td>
						TB - Monthly
					</td>
					<td>
						01/04/2012
					</td>
					<td>
						Default
					</td>
				</tr>
				</tbody>
			</table>
	 </div>

</div>
<!-- footer -->

<div class="copywrite">
	 <div class="container">
			 <p>Copyright &copy; 2016 Team10 CUHK All rights reserved.</p>
	 </div>
</div>

<!--/animatedcss-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<!--/script-->
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
				});
			});
</script>
<!--script-->
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
<a href="#to-top" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!---->
<script src="js/responsiveslides.min.js"></script> 
</body>
</html>