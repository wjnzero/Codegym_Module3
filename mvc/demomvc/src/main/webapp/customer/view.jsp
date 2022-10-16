<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 9/27/2022
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
  <a href="/customers">Back to customer list</a>
</p>
<table>
  <tr>
    <td>Name: </td>
    <td>${requestScope["customer"].getName()}</td>
  </tr>
  <tr>
    <td>Email: </td>
    <td>${requestScope["customer"].getEmail()}</td>
  </tr>
  <tr>
    <td>Address: </td>
    <td>${requestScope["customer"].getAddress()}</td>
  </tr>
</table>
<div id="map" style="width:500px;height:500px;">
  <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3723.9242911494403!2d105.76602881445477!3d21.03571509291783!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b9444c676b%3A0xe713200541b7456d!2sCodeGym!5e0!3m2!1sen!2s!4v1664253291899!5m2!1sen!2s" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
</div>

<!-- Replace YOUR_API_KEY here by your key above -->

</body>
</html>
