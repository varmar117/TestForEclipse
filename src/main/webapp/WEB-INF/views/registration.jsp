<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration_Page</title>
</head>
<body>
	<div align="center">
		<h2>User Registration Form</h2>
		<form action="/register" method="post">
			<table style="with: 50%">
				<tr>
					<td>PhoneNumber</td>
					<td><input type="text" name="phonenumber" /><br>
				</tr>
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="firstname" /><br>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lastname" /><br>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /><br>
				</tr>
				<tr>
					<td>Profession</td>
					<td><input type="text" name="profession" /><br>
				</tr>
				<tr>
					<td>Married</td>
					<td><input type="text" name="married" /><br>
				</tr>

			</table>
			<input type="submit" value="submit" />
		</form>
	</div>

</body>
</html>