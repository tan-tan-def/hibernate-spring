<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action ="/lab5/student/process-form" method = "post" modelAttribute="student">
		1) First Name: <form:input path="firstName"/>
		<br>
		<br>
		2) Last Name: <form:input path="lastName"/>
		<br>
		<br>
		3) Country:
		<form:select path="country">
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="India" label="India"></form:option>
		</form:select>
		<br>
		<br>
		4) Country Option:
		<form:select path="anotherCountry">
			<form:options items="${student.countryOption}"/>
		</form:select>
		<br>
		<br>
		5) Language:<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/><br>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/><br>
		PHP <form:radiobutton path="favoriteLanguage" value="php"/><br>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/><br>
		<br>
		<br>
		6) Operation System: <br>
		MacOs <form:checkbox path="operatingSystems" value= "MacOs"/><br>
		Linus <form:checkbox path="operatingSystems" value= "Linus"/><br>
		MS Window <form:checkbox path="operatingSystems" value= "MS"/><br>
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>