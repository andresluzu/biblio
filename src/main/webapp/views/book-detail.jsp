<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Struts2</title>
</head>
<body>
	<s:if test="hasActionErrors()">
		<s:actionerror/>
	</s:if>
	<s:else>
	<table>
		<caption>
			<strong><s:text name="message.bookDetail"/></strong>
		</caption>
		<tbody>
			<tr>
				<th><s:text name="label.id"/></th>
				<td><s:property value="book.id"/></td>
			</tr>
			<tr>
				<th><s:text name="label.title"/></th>
				<td><s:property value="book.title"/></td>
			</tr>
			<tr>
				<th><s:text name="label.description"/></th>
				<td><s:property value="book.description"/></td>
			</tr>
			<tr>
				<th><s:text name="label.author"/></th>
				<td><s:property value="book.author"/></td>
			</tr>
			<tr>
				<th><s:text name="label.year"/></th>
				<td><s:property value="book.year"/></td>
			</tr>
			<tr>
				<th><s:text name="label.language"/></th>
				<td><s:property value="%{getText('label.'+ book.language.name())}"/></td>
			</tr>
		</tbody>
	</table>
	</s:else>
	<p>
		<s:url var="urlBack" action="list-books"/>
		<s:a href="%{urlBack}"><s:text name="button.back"/></s:a>
	</p>
	
</body>
</html>