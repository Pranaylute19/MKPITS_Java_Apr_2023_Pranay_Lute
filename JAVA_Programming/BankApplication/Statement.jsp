<%@ page import="java.sql.Statement" %>
<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-11-2023
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="s" class="com.example.bankapplicationbyusing_jsp.Transaction" scope="application"/>
<jsp:setProperty name="s" property="userid" />
<jsp:setProperty name="s" property="date"/>
<jsp:setProperty name="s" property="amountType"/>
<jsp:setProperty name="s" property="amount"/>



<html>
<head>
    <title>$Title$</title>
</head>
<body>
   <table>
     <tr>
       <td>Username</td>
       <td>Date</td>
       <td>Amount</td>
       <td>Transaction type</td>
     </tr>
     <%
         Services services=new Services();
      ResultSet result= services.Statement(s);

      while(result.next())
       out.println()


   </table>
</body>
</html>
