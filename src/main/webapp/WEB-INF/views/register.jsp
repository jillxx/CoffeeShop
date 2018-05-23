<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>

</head>
<body>
<h1>Please fill the form to register!</h1>
	<br>
	<form action="register">
	<table border="0">
		
		<tr>
			<td>First Name: </td>
			<td><input type="text" name="fName"></td>
		</tr>
		<tr>
			<td>Lirst Name: </td>
			<td><input type="text" name="lName"></td>
		</tr>
        <tr>
			<td>Email:</td>
			<td><input type="text" name="email"></td>
		</tr>
		 <tr>
			<td>Phone Number:</td>
			<td><input type="text" name="phoneNum"> </td>
		</tr>
		
		 <tr>
			<td>Password:</td>
			<td><input type="text" name="password"> </td>
		</tr>
		
	</table>

	<input type="submit" value="Register">
	
	</form>
</body>
</html>