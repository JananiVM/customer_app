<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 20px;
  background-color: red;
}

li a {
  display: block;
  color: green;
  padding: 8px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #555;
  color: purple;
}
#addcustomer {
	background-color: purple;
	color: white;
	padding: 8px 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-weight: bold;
	margin: auto;
}

#logout {
	background-color: #82b74b;
	color: white;
	padding: 5px 7px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-weight: bold;
	margin: auto;
}
</style>
</head>
<body>

<h1>welcome! ${user.name }</h1>

	<br />
	<br />
	<div class="container">
		<div class="row">
			<div class="col-sm-6">

				<table class="table table-striped" border="1" style="margin:auto">

					<thead>
						<tr>
							<th>id</th>
							<th>name</th>
							<th>address</th>
							<th>phoneNo</th>
							<th>email</th>
							<th>update</th>
				            <th>delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customers }" var="customer">
							<tr>
								<td>${customer.id }</td>
								<td>${customer.name }</td>
								<td>${customer.address }</td>
								<td>${customer.phoneNo }</td>
								<td>${customer.email }</td>

								<c:if test="${user.profile == 'admin'}">
									<td><a href="update?id=${customer.id }">update</a></td>
									<td><a href="delete?id=${customer.id }">delete</a></td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	

	<c:if test="${user.profile == 'admin' || user.profile == 'mgr'}">
		<ul>
		<li><a href="addcustomer" id="addcustomer">addcustomer</a></li>
		</ul>
	</c:if>
	
	<br />
	<ul>
	<li><a href="logout" id="logout">logout</a></li>
	
	</ul>
	<br />
</body>
</html>


