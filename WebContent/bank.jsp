<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pranjal's online banking application</title>
</head>
<style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
</style>
<body>
<h1 style="text-align:center;">
<form action="BankController" method="POST">
    Customer ID: <input type="text" name="customerId">
    <input type="submit" value="Submit"/>
</form>
</h1>
</body>
</html>