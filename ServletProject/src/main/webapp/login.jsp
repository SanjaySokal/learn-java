<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="body-center">
		<form method="post" action="login">
			<h2>Login</h2>
			<input type="email" placeholder="Email" name="email" required>
			<input type="password" placeholder="Password" name="password" required>
			<button type="submit">Login</button>
			<a href="register.jsp">Register</a>
		</form>
	</div>
</body>
</html>