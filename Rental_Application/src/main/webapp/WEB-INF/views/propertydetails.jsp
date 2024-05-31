<%@ page import="com.example.Rental_Application.entity.Addproperty" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Property Details</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Rental Application</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Login</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-4">
    <%
        Addproperty property = (Addproperty) request.getAttribute("records");
        if (property != null) {
    %>
    <h1 class="mb-4"><%= property.getProperty_type() %></h1>
    <div class="row">
        <div class="col-md-8">
            <div class="card mb-4">
                <div class="card-body">
                    <h5 class="card-title">Details</h5>
                    <p class="card-text">
                        <strong>Location:</strong> <%= property.getAddress() %><br>
                        <strong>BHK:</strong> <%= property.getBhk() %><br>
                        <strong>Rent:</strong> <%= property.getMonthlyvalue() %><br>
                        <strong>Furnished:</strong> <%= property.getFurnishedtype() %><br>
                        <strong>Mobile number:</strong> <%= property.getMobile_no() %>
                    </p>
                </div>
            </div>
            <a href="contactLandlord?propertyId=<%= property.getId() %>" class="btn btn-primary">Contact</a>
            <a href="contactLandlord?propertyId=<%= property.getId() %>" class="btn btn-primary">Book Now</a>
        </div>
    </div>
    <%
    } else {
    %>
    <p>Property not founds.</p>
    <%
        }
    %>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
