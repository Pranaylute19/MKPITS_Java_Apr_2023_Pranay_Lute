<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03-11-2023
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<jsp:useBean id="bank" scope="application" class="com.example.bankapplicationbyusing_jsp.AccountCreation.Bank" />
    <jsp:setProperty name="bank" property="user_id" param="userid"/>
    <jsp:setProperty name="bank" property="password" param="password"/>

    <%
        Services services = new Services();
        try (ResultSet resultSet = services.loginAccount(bank)) {
            if (resultSet.next()) {
                    out.println("login successfully");
                    RequestDispatcher requestDispatcher=request.getRequestDispatcher("Welcome.html");
                    requestDispatcher.forward(request,response);

                    session.setAttribute("userId",bank.getUser_id());
                } else {
                    out.println("unable to login");
                RequestDispatcher requestDispatcher=request.getRequestDispatcher("DuplicateIndex.jsp");
                requestDispatcher.forward(request,response);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);

        }
    %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
