<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script>
/*
	function formValidate(){
	var firstName = document.getElementById(fName);
		if (firstName === null || firstName ===""){
		alert("Please enter your first name");
		return false;
		}
	}
	
	alert('before validate');
	var submitBtn = document.getElementById(submitBtn);
	submitBtn.onClick = alert('teest');
*/
</script>
</head>
<body>
<h1>Please fill the form to register!</h1>
	<br>
	<form action="register">
	<table>
		
		<tr>
			<td>First Name: </td>
			<td><input id="fName" type="text" name="fName"></td>
		</tr>
		<tr>
			<td>Last Name: </td>
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

	<input id="submitBtn" type="submit" value="Register">
	
	</form>
</body>
</html>