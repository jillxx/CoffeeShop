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

.table {
	padding: 10px 20px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to GC COFFEE</h1>
		<h3>
			<a href="preRegister" style="color: green">Create an account</a>
		</h3>
		<br>
		<form action="/search">

			<h4>
				Please enter the product you want:<input type="text" name="name" />

				<button type="submit" class="btn btn-primary">Search!</button>
			</h4>
		</form>
		<br> <br>
		<h3>Our Menu</h3>
		<h4>From Classics to Kid's Treats</h4>
	<form action="edit">
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
						<td>${item.quantity}</td>
						<td>$ ${item.price}</td>
						<td><a
						href="editItems?name=${item.name}">Edit</a></td>
						<td><a title='deleteItem?name=${item.name}'
						onclick="if(confirm('Are you sure that you want to delete this item?')){this.href=title;}" href="/" >Delete</a></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</form>
		
		<h3>
			<a href="addItem" style="color: green">Add a new item</a>
		</h3>	
	</div>
	
<script src="testing.js"></script>
</body>

</html>