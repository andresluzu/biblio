<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca Struts2</title>
</head>
<body>
	<div>
		<form action="/biblio/HelloWorldServlet" method="post">
			<ul>
				<li><label for="nameId">Nombre:</label>
				<li><input id="nameId" name="name" type="text" value="" size="150" /></li>
			</ul>
			<input type="submit"/>
		</form>
	</div>
	<br>
	<b>
		<%= request.getParameter("message") !=null ? "Hola: " + request.getParameter("message"): "" %>
		<br>
		<%= new java.util.Date() %>
	</b>
</body>
</html>