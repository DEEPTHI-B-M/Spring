<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="registeruser" method="post">
		Name: <input type="text" name="name" required="required" /> <br>
		Email: <input type="email" name="email" required="required" /> <br>
		Password: <input type="password" name="password" required="required" /> <br>
		<input type="submit" value="Sign Up" />
	</form>
	
	<ul>
		<c:forEach items="${users}">
			<li>${user.id} | ${user.name} | ${user.email} | ${user.password}</li>
		</c:forEach>
	</ul>
</body>
</html>