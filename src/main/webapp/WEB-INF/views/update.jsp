<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="update">

	<input type="hidden" name="name" value="${name}" > 
	<table>		
		<tr>
			<td>Name  </td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Description </td>
			<td><input type="text" name="description"></td>
		</tr>
        <tr>
			<td>Quantity</td>
			<td><input type="number" name="quantity"></td>
		</tr>
			<tr>
			<td>Price </td>
			<td><input type="number" name="price"></td>
		</tr>
        <tr>
			<td>Picture Name</td>
			<td><input type="text" name="picturename"></td>
		</tr>
			
	</table>

	<input id="submitBtn" type="submit" value="Update">
	
	</form>
</body>
</html>