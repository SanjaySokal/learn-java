<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="body-center">
		<form method="post" action="register">
			<h2>Register</h2>
			<input type="text" placeholder="Name" name="name" required>
			<input type="email" placeholder="Email" name="email" required>
			<input type="password" placeholder="Password" name="password" required>
			<button type="submit">Register</button>
			<a href="login.jsp">Login</a>
		</form>
	</div>
</body>
</html>