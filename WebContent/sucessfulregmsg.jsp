<%@page import="com.arbs.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="shortcut icon" type="image/png" href="image/favicon.png" />
<link rel="stylesheet" type="text/css" href="css/deposit.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<body>
	<div class="row">
		<jsp:include page="header.jsp" />
	</div>
	<%Customer customer=(Customer)request.getAttribute("msg");
		if(customer.getId()!=null)
		{
	%>
	<div class="container-fullwidth">
		<div class="row" style="margin-top: 50px;">
			<div class="alert alert-success col-md-4 col-md-offset-4" role="alert">
				<h4 class="alert-heading">Success! thank you for Your interest </h4>
				<p>
					<strong>Your Account request has been listed. Admin will approve it.</strong>
				</p>
				<p class="mb-0">
					<b>Customer Number: </b>
					<%=customer.getId()%>
				</p>
			</div>
			</div>
		</div>
		<%} else
		{
			%><div class="container-fullwidth">
				<div class="row" style="margin-top: 50px;">
						<div class="alert alert-danger col-md-4 col-md-offset-4" role="alert">
								<strong>Oh snap!</strong> Sometime wrong with Database insert.
						</div>
				</div>
			</div>

		<%
			}
		%>
		
		
		<!-- Footer start here -->
		<div class="row" style="margin-top: 50px;">
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	
</body>
</html>