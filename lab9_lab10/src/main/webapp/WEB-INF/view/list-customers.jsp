<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
/* Style for the Add Customer button */
.btn-add-customer {
	border: none;
	border-radius: 5px;
	font-size: 16px;
	padding: 10px 20px;
	transition: background-color 0.3s ease, color 0.3s ease;
}

.btn-add-customer:hover {
	background-color: #0056b3;
	color: white;
}

/* Style for the Customer List heading */
.heading-custom {
	font-size: 2rem;
	font-weight: 700;
	color: #343a40;
	border-bottom: 2px solid #007bff;
	padding-bottom: 0.5rem;
	margin-bottom: 1.5rem;
}
</style>
</head>
<body>
	<div class="container mt-4">
		<h2 class="heading-custom">Customer List</h2>

		<button type="button" class="btn btn-primary btn-add-customer mb-3"
			onclick="window.location.href='show-form-for-add'">Add
			Customer</button>

		<table class="table table-striped table-bordered table-hover">
			<thead class="thead-dark">
				<tr>
					<th>Index</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="index" value="1" />

				<c:forEach var="tempCustomer" items="${customers}">
					<c:url var="updateLink" value="show-form-for-update">
						<c:param name="customerId" value="${tempCustomer.id}"></c:param>
					</c:url>
					<c:url var="deleteLink" value="delete">
						<c:param name="customerId" value="${tempCustomer.id}"></c:param>
					</c:url>
					<tr>
						<td>${index}</td>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${updateLink}">Update</a> | <a
							href="${deleteLink}" onclick="return confirmDelete();">Delete</a>
						</td>
					</tr>
					<c:set var="index" value="${index + 1}" />
				</c:forEach>
			</tbody>
		</table>

	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
<script>
	function confirmDelete() {
		return confirm('Are you sure you want to delete this customer?');
	}
</script>

</html>
