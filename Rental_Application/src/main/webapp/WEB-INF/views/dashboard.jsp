<%@ page import="com.example.Rental_Application.entity.Seller" %>
<%@ page import="com.example.Rental_Application.entity.Addproperty" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Landlord Dashboard</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        body {
            padding-top: 56px;
        }
        .sidebar {
            height: 100%;
            position: fixed;
            top: 56px;
            left: 0;
            width: 220px;
            padding-top: 20px;
            background-color: #f8f9fa;
        }
        .content {
            margin-left: 240px;
            padding: 20px;
        }
        .card-header {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="#">Dashboard</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown">
                    <i class="fas fa-user-circle fa-2x"></i>
                </a>
                <div class="dropdown-menu dropdown-menu-right">
                    <a class="dropdown-item" href="#">Settings</a>
                    <a class="dropdown-item" href="#">Logout</a>
                </div>
            </li>
        </ul>
    </div>
</nav>

<div class="container-fluid mt-4">
    <div class="d-flex justify-content-end">
        <%
            Seller seller = (Seller) session.getAttribute("user");
            if (seller != null) {
        %>
        <div class="alert alert-info" role="alert">
            Welcome, <b><%= seller.getName() %></b>
        </div>
        <%
            }
        %>
    </div>
</div>

<div class="sidebar">
    <ul class="nav flex-column">
        <li class="nav-item">
            <a class="nav-link active" href="#">Overview</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Listings</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Requests</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Messages</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Reviews</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Settings</a>
        </li>
    </ul>
</div>
<% List<Addproperty> properties = (List<Addproperty>) session.getAttribute("properties");%>

<div class="content">
    <div class="container-fluid">
        <!-- Overview Section -->
        <div class="row mb-4">
            <div class="col-md-3">
                <div class="card">
                    <div class="card-header">Total Listings</div>
                    <div class="card-body">
<%--                        <h5><%= session.getAttribute("totalListings")%></h5>--%>
                        <h5><%=properties.size()%></h5>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <div class="card-header">Bookings This Month</div>
                    <div class="card-body">
                        <h5>3</h5>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <div class="card-header">Earnings</div>
                    <div class="card-body">
                        <h5>20000</h5>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <div class="card-header">Pending Inquiries</div>
                    <div class="card-body">
                        <h5>2</h5>
                    </div>
                </div>
            </div>
        </div>

        <!-- Listings Management Section -->
        <div class="mb-4">
            <h4>Listings Management</h4>
            <a href="getform"><button class="btn btn-primary mb-2">Add new Listing</button></a>

            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Location</th>
                    <th>BHK</th>
                    <th>Rent</th>
                    <th>Furnished Type</th>
                </tr>
                </thead>
                <tbody>
                <%

                    if (properties != null) {
                        for (Addproperty property : properties) {
                %>
                <tr>
                    <td><%= property.getProperty_type() %></td>
                    <td><%= property.getAddress()%></td>
                    <td><%= property.getBhk() %></td>
                    <td><%= property.getMonthlyvalue() %></td>
                    <td><%= property.getFurnishedtype() %></td>
<%--                    <td><%=properties.size()%></td>--%>
                </tr>
                <%
                        }
                    }
                %>
<%--                <tr></tr>--%>

                </tbody>
            </table>
        </div>

        <!-- Booking Requests Section -->
        <div class="mb-4">
            <h4>Booking Requests</h4>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Renter</th>
                    <th>Property</th>
                    <th>Requested Dates</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <!-- Booking request data here -->
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
