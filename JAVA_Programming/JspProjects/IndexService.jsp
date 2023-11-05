<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03-11-2023
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.example.bankapplicationbyusing_jsp.Login.indexDataLoader" %>
<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>

<jsp:useBean id="b" scope="application" class="com.example.bankapplicationbyusing_jsp.Login.IndexLogin" />
    <jsp:setProperty name="b" property="userid" param="userid"/>
    <jsp:setProperty name="b" property="password" param="password"/>

    <%
        Services services = new Services();
    if (services.)
        out.println("deposit");

    %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
