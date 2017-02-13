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
	<table>
		<caption><s:text name="message.booksList"/></caption>
		<thead>
			<tr>
				<th><s:text name="label.id"/></th>
				<th><s:text name="label.title"/></th>
				<th><s:text name="label.description"/></th>
				<th><s:text name="label.author"/></th>
				<th><s:text name="label.year"/></th>
				<th><s:text name="label.language"/></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="books">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="title"/></td>
					<td><s:property value="description"/></td>
					<td><s:property value="author"/></td>
					<td><s:property value="year"/></td>
					<td><s:property value="%{getText('label.'+ language.name())}"/></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	
</body>
</html>