<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="userAction" /> 

		Enter Name:<br /> <input type="text" name="name" value="" /><br />

		Enter login*:<br /> <input type="text" name="login" value="" /><br />

		Enter password*:<br /> <input type="password" name="password" value="" /><br />
		<em> * - поля, обязательные для заполнения </em>

		<br /> <button type="submit" name="action" value="registration">Отправить</button>
		<br /> <br />
	</form>
	
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="jsp" />
		
		<button type="submit" name="action" value="userAction">Вернуться</button>
		
	</form>

</body>
</html>