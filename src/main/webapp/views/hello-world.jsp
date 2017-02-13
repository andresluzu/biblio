<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Struts2</title>
</head>
<body>
	<s:form action="hello-world">
		<s:textfield name="name" key="label.name"/>
		<s:radio name="request_locale" key="label.request_locale" 
			list="languages"/>
		<s:submit></s:submit>
	</s:form>
	
	<br>
	<b>
		<s:property value="greeting"/>
	</b>
	
</body>
</html>