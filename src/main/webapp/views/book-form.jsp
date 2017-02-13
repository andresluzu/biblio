<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Struts2</title>
</head>
<body>
	<s:form action="save-book">
		<s:text name="message.bookForm"/>
		<s:hidden name="id" value="%{book.id}"/>
		<s:textfield name="title" value="%{book.title}" key="label.title" requiredLabel="true"/>
		<s:textarea name="description" value="%{book.description}" key="label.description"/>
		<s:textfield name="author" value="%{book.author}" key="label.author" requiredLabel="true"/>
		<s:textfield name="year" value="%{book.year}" key="label.year" requiredLabel="true"/>
		<s:select name="language" list="languages" value="%{book.language}" key="label.language" requiredLabel="true"/>
		<s:submit key="button.save"/>
	</s:form>
	<p>
		<s:url var="urlBack" action="list-books"/>
		<s:a href="%{urlBack}"><s:text name="button.back"/></s:a>
	</p>
	
</body>
</html>