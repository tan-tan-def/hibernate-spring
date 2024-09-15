<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Customer</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .btn-back {
            margin-left: auto;
            display: block;
            border: 1px solid #007bff;
            color: #007bff;
            background-color: #fff;
        }
        .btn-back:hover {
            background-color: #007bff;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="container mt-4">
        <div class="d-flex justify-content-between align-items-center mb-4">
            <h2>Add Customer</h2>
            <a href="list" class="btn btn-outline-primary btn-back">Back To List</a>
        </div>
        
        <form:form action="add-customer" method="post" modelAttribute="customer">
        <form:hidden path="id"/>
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <form:input id="firstName" path="firstName" class="form-control" placeholder="Enter your first name"/>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <form:input id="lastName" path="lastName" class="form-control" placeholder="Enter your last name"/>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <form:input id="email" path="email" class="form-control" placeholder="Enter your email"/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
