<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="deposit" class="com.example.bankapplicationbyusing_jsp.Transaction" scope="application"/>

<jsp:setProperty name="deposit" property="amount" param="amount"/>
<jsp:setProperty name="deposit" property="userid" value='<%=session.getAttribute("userId")%>'/>
<jsp:setProperty name="deposit" property="amountType" value="deposit"/>
<jsp:setProperty name="deposit" property="date" value="<%= new java.sql.Date(session.getCreationTime())%>"/>

   <%
       Services services=new Services();
       int resultSet=services.depositmoney(deposit);

       if (resultSet!=0 )
           out.println("Deposit Succesful");
       else
           out.println("Deposit unsuccess");

   %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
