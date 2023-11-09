<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="b" class="com.example.bankapplicationbyusing_jsp.AccountCreation.Bank" scope="application"/>
<jsp:setProperty name="b" property="user_id" param="userid"/>
<jsp:setProperty name="b" property="password" param="password"/>
<jsp:setProperty name="b" property="name" param="name"/>
<jsp:setProperty name="b" property="address" param="address"/>
<jsp:setProperty name="b" property="city" param="city"/>
<jsp:setProperty name="b" property="amount" param="amount"/>
<jsp:setProperty name="b" property="createdOn" value="<%=new java.sql.Timestamp(session.getCreationTime())%>"/>


<%
    Services services=new Services();
        if (services.insertdata(b)!=0)
            out.println("inserted");
        else
            out.println("unable to insert");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    
</body>
</html>
