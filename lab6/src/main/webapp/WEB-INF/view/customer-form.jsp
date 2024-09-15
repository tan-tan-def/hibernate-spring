<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>

<style>
.error {
	color: red;
}
</style>
</head>
<body>

	<form:form action="process-form" method="post" modelAttribute="customer">
First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error">
		</form:errors>
		<br>
		<br>
Course Code:<form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error">
		</form:errors>
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>