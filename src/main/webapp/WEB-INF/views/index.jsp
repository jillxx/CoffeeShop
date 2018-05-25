<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<style>
h1 {
	color: orange;
}
.table{
padding: 10px 20px;
}
</style>
</head>
<body>
	<h1>
		Welcome to GC COFFEE <a href="preRegister" style="color: orange">Register!</a>
	</h1>
	<br>
	<div class="container">
		<form action="/search">  
			<h4>Search the product you want? </h4>
			<h4>Please enter the name:<input type="text" name="name" /></h4>
		
			<button type="submit" class="btn btn-primary">Search!</button>
		</form>
		<br>
	
		<table class="table" border="1">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Quantity</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
					<tr>
						<td>${item.name}</td>
						<td>${item.description}</td>
						<td>${item.quantity} lb</td>
						<td>$ ${item.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>