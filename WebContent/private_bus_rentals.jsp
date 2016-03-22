<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="DAO.*,Model.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Private Bus Rentals</title>
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
<style type="text/css">
.long3{
	width:120px;
}
.long2{
	width:80px;
}
.long1{
	width:60px;
}
</style>
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
			 <p><span>Wonder Tours is a travel agency specializing in bus tours between Hong Kong and various locations in China. The company owns 50 large buses, each of which has a capacity of between 25 to 50 passengers. The company has three categories of business operations,</span> 
			 <a href="regular_scheduled_bus.jsp"> Regularly Scheduled Bus Trips</a>, 
			 <a href= "sight_seeing_tours.jsp"> Specialty Sight-Seeing Tours</a>
			  and 
			 <a href="private_bus_rentals.jsp"> Private Bus Rentals</a>.
				ADD, DELETE, ALTER and SELECT operations of these three tables are provided in each pages.
			</p>
			<h3>
				Private Bus Rentals
			</h3>
			<p>Aside from organizing tours, buses are available for private hire. 
			Prices will vary with season, distance, organization, 
			and any special requirements.</p>
		 </div>	
		 <br/> 
		 	<a href="javascript:void(0);" onclick="addRow()"><span class="label label-primary"> Add new item </span></a>
			<table id="tb" class="table table-hover">
				<thead>
				<tr>
					<th>Bus No.</th>
					<th>Seat Capacity</th>
					<th>Driver No.</th>
					<th>Depart Date</th>
					<th>Depart Time</th>
					<th>Depart Location</th>
					<th>Return Date</th>
					<th>Return time</th>
					<th>Return Location</th>
					<th>Contact Person</th>
					<th>Contact Tel</th>
					<th>Operations</th>
				</tr>
				</thead>
				<% ArrayList<PrivBookBusModel> privList = new PrivBookBusAO().getAllPrivBookBus(); %>
				<tbody>
				<% for(PrivBookBusModel privTemp: privList) {%>
				<tr>
					<td><input type="text" class="long1" readonly="readonly" value="<%=privTemp.getBus_no() %>"></td>
					<td><input type="text" class="long1" readonly="readonly" value="<%=privTemp.getSeat_capacity() %>"></td>
					<td><input type="text" class="long1" readonly="readonly" value="<%=privTemp.getDriver_no() %>"></td>
					<td><input type="text" class="long2" readonly="readonly" value="<%=privTemp.getDepart_date() %>"></td>
					<td><input type="text" class="long2" readonly="readonly" value="<%=privTemp.getDepart_time() %>"></td>
					<td><input type="text" class="long3" readonly="readonly" value="<%=privTemp.getDepart_location() %>"></td>
					<td><input type="text" class="long2" readonly="readonly" value="<%=privTemp.getReturn_date() %>"></td>
					<td><input type="text" class="long2" readonly="readonly" value="<%=privTemp.getReturn_time() %>"></td>
					<td><input type="text" class="long3" readonly="readonly" value="<%=privTemp.getReturn_location() %>"></td>
					<td><input type="text" class="long2" readonly="readonly" value="<%=privTemp.getContact_person() %>"></td>
					<td><input type="text" class="long2" readonly="readonly" value="<%=privTemp.getContact_tel() %>"></td>
					<td><a href="javascript:void(0);" onclick="editItem(this)">Edit</a> &nbsp;<a href="javascript:void(0);" onclick="deleteItem(this)">Delete</a></td>
				</tr>
				<% } %>
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
<script>
function editItem(obj){
	var rowIndex = obj.parentNode.parentNode.rowIndex;
	var table_row = document.getElementById("tb").rows[rowIndex];
	var inputs = table_row.getElementsByTagName("input");
	var as = table_row.getElementsByTagName("a");
	
	if (as[0].text == "Save"){	
		for(var i = 0; i < inputs.length; i++){
			inputs[i].readOnly = true;
		}
		
		var bus_no = inputs[0].value;
		var seat_capacity = inputs[1].value;
		var driver_no = inputs[2].value;
		var depart_date = inputs[3].value;
		var depart_time = inputs[4].value;
		var depart_location = inputs[5].value;
		var return_date = inputs[6].value;
		var return_time = inputs[7].value;
		var return_location = inputs[8].value;
		var contact_person = inputs[9].value;
		var contact_tel = inputs[10].value;
		
		var paras = "bus_no=" + bus_no + "&seat_capacity=" + seat_capacity + "&driver_no=" + driver_no 
		+ "&depart_date=" + depart_date + "&depart_time=" + depart_time + "&depart_location=" + depart_location
		+ "&return_date=" + return_date + "&return_time=" + return_time + "&return_location=" + return_location
		+ "&contact_person=" + contact_person + "&contact_tel=" + contact_tel;
		// new Item
		if (as[1].text == "Cancel"){		
			$.ajax({
			     url: "PrivBookBusAdd?" + paras,              
			     type: "POST", 
			     success: function(data){} 
			     });
			as[1].text = " Delete";
		}else{
			$.ajax({
			     url: "PrivBookBusUpdate?" + paras,              
			     type: "POST", 
			     success: function(data){} 
			     });
		}
		as[0].text = "Edit";
		
	}else{ // Edit
		as[0].text = "Save";
		for(var i = 1; i < inputs.length; i++){
			inputs[i].readOnly = false;
		}
	}
}


function deleteItem(obj){
	var rowIndex = obj.parentNode.parentNode.rowIndex;
	var table_row = document.getElementById("tb").rows[rowIndex];
	var inputs = table_row.getElementsByTagName("input");
	var as = table_row.getElementsByTagName("a");
	
	if (as[1].text == "Cancel"){		
		document.getElementById("tb").deleteRow(rowIndex);
	}else{
		var bus_no = inputs[0].value;
		var seat_capacity = inputs[1].value;
		var driver_no = inputs[2].value;
		var depart_date = inputs[3].value;
		var depart_time = inputs[4].value;
		var depart_location = inputs[5].value;
		var return_date = inputs[6].value;
		var return_time = inputs[7].value;
		var return_location = inputs[8].value;
		var contact_person = inputs[9].value;
		var contact_tel = inputs[10].value;
		
		var paras = "bus_no=" + bus_no + "&seat_capacity=" + seat_capacity + "&driver_no=" + driver_no 
		+ "&depart_date=" + depart_date + "&depart_time=" + depart_time + "&depart_location=" + depart_location
		+ "&return_date=" + return_date + "&return_time=" + return_time + "&return_location=" + return_location
		+ "&contact_person=" + contact_person + "&contact_tel=" + contact_tel;
				
		$.ajax({
		     url: "PrivBookBusDelete?" + paras,              
		     type: "POST", 
		     success: function(data){} 
		     });
		document.getElementById("tb").deleteRow(rowIndex);
	}
}


function addRow(){
	var tb = document.getElementById("tb");
	var row = tb.insertRow(1);//在表格的第一行插入
	var c1 = row.insertCell(0);
	c1.innerHTML = '<input type="text" class="long1" />';
	var c2 = row.insertCell(1);
	c2.innerHTML = '<input type="text" class="long1" />';
	var c3 = row.insertCell(2);
	c3.innerHTML = '<input type="text" class="long1" />';
	var c4 = row.insertCell(3);
	c4.innerHTML = '<input type="text" class="long2" />';
	var c5 = row.insertCell(4);
	c5.innerHTML = '<input type="text" class="long2" />';
	var c6 = row.insertCell(5);
	c6.innerHTML = '<input type="text" class="long3" />';
	var c7 = row.insertCell(6);
	c7.innerHTML = '<input type="text" class="long2" />';
	var c8 = row.insertCell(7);
	c8.innerHTML = '<input type="text" class="long2" />';
	var c9 = row.insertCell(8);
	c9.innerHTML = '<input type="text" class="long3" />';
	var c10 = row.insertCell(9);
	c10.innerHTML = '<input type="text" class="long2" />';
	var c11 = row.insertCell(10);
	c11.innerHTML = '<input type="text" class="long2" />';
	var c12 = row.insertCell(11);
	c12.innerHTML = '<a href="javascript:void(0);" onclick="editItem(this)">Save</a><a href="javascript:void(0);" onclick="deleteItem(this)">Cancel</a>';
}
</script>
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