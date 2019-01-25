<%@ page import="lab8t4.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer details</title>
</head>
<style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
</style>
<body>

<% Customer customer = (Customer)request.getAttribute("customer");
%>
<h3 ><%= customer.getId()%></h3>
<h3><%= customer.getName()%></h3>
<h3><%= customer.getSurname()%></h3>
<h3><%= customer.getBankAccountBalance()%></h3>

</body>
</html>