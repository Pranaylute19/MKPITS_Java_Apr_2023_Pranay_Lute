<%@ page import="com.example.bankapplicationbyusing_jsp.AccountCreation.Services" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="tranfer" scope="application" class="com.example.bankapplicationbyusing_jsp.Transaction"/>
<jsp:useBean id="bank" scope="application" class="com.example.bankapplicationbyusing_jsp.AccountCreation.Bank"/>
<jsp:setProperty name="bank" property="user_id" param="userName"/>

<jsp:setProperty name="tranfer" property="date" value="<%= new java.sql.Date(session.getCreationTime())%>"/>
<jsp:setProperty name="tranfer" property="amount" param="amount"/>
<jsp:setProperty name="tranfer" property="amountType" value="TransferIn"/>

<jsp:setProperty name="tranfer" property="userid" value='<%=session.getAttribute("userId").toString()%>'/>

<%
  Services services=new Services();
  int re=services.Transfer(tranfer, bank.getUser_id());
  if (re!=0)
    out.println("Transfer in");
  else
      out.println("Transfer failed");

%>

<html>
<head>
    <title>$Title$</title>
</head>
<body>

</body>
</html>
