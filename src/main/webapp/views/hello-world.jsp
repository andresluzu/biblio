<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca Struts2</title>
</head>
<body>
	<s:form action="hello-world">
		<s:textfield name="name" key="Nombre"/>
		<s:submit></s:submit>
	</s:form>
	
	<br>
	<b>
		Hola: <s:property value="name"/>
	</b>
</body>
</html>