<%@ page import="com.example.Rental_Application.entity.Seller" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Property Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        form input[type="text"],
        form input[type="number"],
        form input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        form input[type="submit"] {
            background-color: #28a745;
            color: #fff;
            border: none;
            cursor: pointer;
        }
        form input[type="submit"]:hover {
            background-color: #218838;
        }
        form h2 {
            text-align: center;
            color: #333;
        }
    </style>
</head>
<body>
<%
Seller seller = (Seller) session.getAttribute("user");
%>

<form action="/addproperty" method="post">
    <h2>Add Property</h2>
    <input type="number" name="sellerid" value=<%=seller.getId()%> hidden>
    <input type="text" name="property_type" placeholder="Property Type" required>
    <input type="text" name="looking_for" placeholder="Looking For" required>
    <input type="number" name="mobile_no" placeholder="Mobile Number" required>
    <input type="text" name="name" placeholder="Name" value=<%=((Seller) session.getAttribute("user")).getName()%>  required>
    <input type="text" name="address" placeholder="Address" required>
    <input type="text" name="bhk" placeholder="BHK" required>
    <input type="text" name="sqfeet" placeholder="Area Square Feet" required>
    <input type="text" name="furnishedtype" placeholder="Furnished Type" required>
    <input type="number" name="monthlyvalue" placeholder="Rental Price" required>
    <input type="text" name="securityDeposit" placeholder="Security Deposit" required>

    <input type="submit" value="Submit">
</form>
</body>
</html>
