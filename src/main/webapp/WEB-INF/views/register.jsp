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
		<fieldset>
			<legend>Personal info:</legend>
			<table>
				<tr>
					<td>First Name:</td>
					<td><input id="fName" type="text" name="fName"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lName"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Phone Number:</td>
					<td><input type="number" name="phoneNum"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" id ="password" onchange = 'check_pass();'/></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name ="comfirm_password" id = "confirm_password"onchange = 'check_pass();'/></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td><select name="gender">
							<option value="male">Male</option>
							<option value="female">Female</option>
					</select></td>
				</tr>
				<tr>
					<td>Zipcode</td>
					<td><input type="number" name="zipcode"></td>
				</tr>
				<tr>
					<td>Favorite :</td>
					<td><input type="checkbox" name="favorite" value="Espresso">Espresso<br>
						<input type="checkbox" name="favorite" value="Capuccino">Capuccino<br>
						<input type="checkbox" name="favorite" value="Latte">Latte<br>
					</td>

				</tr>


			</table>

			<input id="submitBtn" type="submit" value="Register">
		</fieldset>
	</form>


<script src="testing.js"></script>
	<!--  <script type="text/javascript" src="js/register.js"></script>-->

</body>
</html>