<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="by.http.news.bean.User" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	User user = (User) request.getAttribute("user");

	if (user == null || user.getLogin().isEmpty() || user.getPassword().isEmpty()) {

		out.println(request.getParameter("action").toUpperCase() + " failed");
		
	} else {

		out.println(request.getParameter("action").toUpperCase() + " success");
	}
	%>

	<br />

	<%
	if (user != null && !user.getLogin().isEmpty() && !(user.getName().equals("noName") || user.getName().isEmpty())) {

		out.println("name: " + user.getName());

	}
	%>

	<br />

	<%
	if (!(user == null || user.getLogin().isEmpty())) {

		out.println("login: " + user.getLogin());
	}
	%>

	<br />

	<%
	if (user != null && !user.getLogin().isEmpty()) {

		out.println("password: " + request.getParameter("password"));
	}
	%>

</body>
</html>