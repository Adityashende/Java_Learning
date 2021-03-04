<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final</title>
</head>
<body>
	<h2 class="text-center">${ Header}</h2>
	<h3 class="text-center">${Desc}</h3>
	<h3>${msg}</h3>
	<h1>Welcome , ${user.username}</h1>
	<h3>Email: ${user.email}</h3>



</body>
</html>