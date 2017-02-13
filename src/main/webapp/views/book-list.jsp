<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Struts2</title>
</head>
<body>
	<table>
		<caption>
			<strong><s:text name="message.booksList"/></strong>
		</caption>
		<thead>
			<tr>
				<th><s:text name="label.id"/></th>
				<th><s:text name="label.title"/></th>
				<th><s:text name="label.description"/></th>
				<th><s:text name="label.author"/></th>
				<th><s:text name="label.year"/></th>
				<th><s:text name="label.language"/></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="books">
				<tr>
					<td><s:property value="id"/></td>
					<td>
						<s:url var="urlDetail" action="view-book-detail">
							<s:param name="bookId" value="%{id}"/>
						</s:url>
						<s:a href="%{urlDetail}">
							<s:property value="title"/>		
						</s:a>
					</td>
					<td><s:property value="description"/></td>
					<td><s:property value="author"/></td>
					<td><s:property value="year"/></td>
					<td><s:property value="%{getText('label.'+ language.name())}"/></td>
					<td>
						<s:url var="urlEdit" action="view-book-form">
							<s:param name="bookId" value="%{id}"/>
						</s:url>
						<s:a href="%{urlEdit}"><s:text name="button.edit"/></s:a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<p>
		<s:url var="urlNew" action="view-book-form"/>
		<s:a href="%{urlNew}"><s:text name="button.new"/></s:a>
	</p>
	
</body>
</html>