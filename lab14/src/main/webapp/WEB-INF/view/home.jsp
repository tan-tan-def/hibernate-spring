<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab12</title>
</head>
<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	Welcome to the luv2code company home page

	<br>
	
	<div>User: <security:authentication property="principal.username"/></div>
	<div>Role(s): <security:authentication property = "principal.authorities"/></div>
	<hr>
	
	<security:authorize access="hasRole('MANAGER')">
	<div>
	<a href="leader">Leadership Meeting(Only for Manager peeps)</a>
	</div>
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
	<div>
	<a href="system">IT Systems Meeting(Only for Admin peeps)</a>
	</div>
	</security:authorize>
	
	<%-- <div>
	<a href="/leaders">Leadership Meeting(Only for Manager peeps)</a>
	</div>

	<div>
	<a href="/system">IT Systems Meeting(Only for Admin peeps)</a>
	</div> --%> 
	
	<form:form action="logout" method="post">
		<input type="submit" value="logout" />
	</form:form>

</body>
</html>