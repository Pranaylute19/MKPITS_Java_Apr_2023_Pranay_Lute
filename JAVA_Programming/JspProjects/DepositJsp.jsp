<%@ page import="com.example.bankapplicationbyusing_jsp.Deposit.Deposit" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04-11-2023
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="b" class="com.example.bankapplicationbyusing_jsp.Transaction" scope="application"/>

<jsp:setProperty name="b" property="amount" param="amount"/>
 <jsp:setProperty name="b" property="userid" value='<%=session.getAttribute("")%>'/>

   <%
          Deposit deposit=new Deposit();
          if (deposit.depositmoney(b)!=0)
              out.println("deposit");
   %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
