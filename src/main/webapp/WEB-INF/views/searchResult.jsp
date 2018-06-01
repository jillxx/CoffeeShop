<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> //
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>searchResult</title>
</head>
<body>
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
				<c:forEach var="searchItem" items="${searchItems}">
					<tr>
						<td>${searchItem.name}</td>
						<td>${searchItem.description}</td>
						<td>${searchItem.quantity}</td>
						<td>$ ${searchItem.price}</td>
						<img src = "image/${searchItem.picturename}.jpg" height = "200px"/>
					</tr>
					<br>
					
				</c:forEach>
			</tbody>
		</table>

</body>
</html>