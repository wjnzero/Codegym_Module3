<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 9/23/2022
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/display-discount" method="get">
    <input type="text" name="productDes" placeholder="Product Description: "/><br>
    <input type="number" name="listPrice" placeholder="List Price: " min="0"/><br>
    <input type="number" name="discountPercent" placeholder="Discount Percent: " min="0" max="100"/><br>
    <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
