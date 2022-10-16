<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 9/23/2022
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome admin website</h1>
<form method="post" action="/menu">
    <div class="check">
        <input type="radio" id="System Time" name="choose" value="time">
        <label for="System Time"> System time</label><br>
        <input type="radio" id="convertMoney" name="choose" value="convert">
        <label for="convertMoney"> Convert money</label><br>
        <input type="radio" id="dictionary" name="choose" value="dictionary">
        <label for="dictionary"> Dictionary</label><br>
        <input type="radio" id="pdc" name="choose" value="pdc">
        <label for="pdc"> Product Discount Calculator</label><br>
        <input type="submit" value="Run"/>
    </div>
</form>
</body>
</html>
