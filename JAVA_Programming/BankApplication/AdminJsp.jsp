<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSetMetaData" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="admin" class="com.example.bankapplicationbyusing_jsp.AdminEntity"/>
<jsp:setProperty name="admin" property="adminUsername" param="username"/>
<jsp:setProperty name="admin" property="adminPassword" param="password"/>
<jsp:useBean id="bank" scope="application" class="com.example.bankapplicationbyusing_jsp.AccountCreation.Bank"/>
    <%
        Services services=new Services();
        ResultSet resultSet=services.admin(admin);
        if (resultSet.next()){
            ResultSet resultSet1=services.Display_IsApproved(bank);
            ResultSetMetaData resultSetMetaData =resultSet1.getMetaData();
            while (resultSet1.next())
                resultSet1.getString(1);
                resultSet1.getTimestamp(2);
                resultSet1.getString(3);
                out.println(resultSet1);
        }else{
            out.println("username or password incorrect");
        }


        %>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
