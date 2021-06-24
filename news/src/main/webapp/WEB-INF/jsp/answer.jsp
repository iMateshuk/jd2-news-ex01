<%@ page language="java" contentType="text/html; charset=utf-8"
	import="by.http.news.bean.User" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<%
	User user = (User) request.getAttribute("user");

	StringBuilder answer = new StringBuilder(request.getParameter("action").toUpperCase());

	if (user == null || user.getLogin().isEmpty() || user.getPassword().isEmpty()) {

		answer.append(" failed");

	} else {

		answer.append(" success").append("<br/>");

		if (!(user.getName().equals("noName") || user.getName().isEmpty())) {

			answer.append("name: " + user.getName()).append("<br/>");

		}

		answer.append("login: " + user.getLogin()).append("<br/>");

		answer.append("password: " + request.getParameter("password")).append("<br/>");

	}

	out.println(answer.toString());
	%>
	<br/> <br/>  
	<form action="Controller" method="post">
	
		<button type="submit" name="command" value="back">На главную</button>
		
	</form>

</body>
</html>