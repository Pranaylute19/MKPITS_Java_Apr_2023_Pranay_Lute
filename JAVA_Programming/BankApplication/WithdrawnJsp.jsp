<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-11-2023
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="Withdraw" class="com.example.bankapplicationbyusing_jsp.Transaction" scope="application"/>

<jsp:setProperty name="Withdraw" property="amount" param="amount"/>
<jsp:setProperty name="Withdraw" property="userid" value='<%=session.getAttribute("userId")%>'/>
<jsp:setProperty name="Withdraw" property="amountType" value="deposit"/>
<jsp:setProperty name="Withdraw" property="date" value="<%= new java.sql.Date(session.getCreationTime())%>"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  Services services=new Services();
  int result=services.WitrhdrawnMoney(Withdraw);
  if (result!=0)
    out.println("Withdraw success");
  else
    out.println("Withdraw unsuccess");
%>

<html>
<head>
  <title>$Title$</title>
</head>
<body>

</body>
</html>
