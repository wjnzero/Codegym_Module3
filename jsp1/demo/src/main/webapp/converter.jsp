<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 9/26/2022
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String rateSt = request.getParameter("rate");
    float rate = Float.parseFloat(rateSt);

    String usdSt = request.getParameter("usd");
    float usd = Float.parseFloat(usdSt);

%>
<h1 style="color: red; font-family: 'Adobe Hebrew'">Rate <%=rate
%></h1>
<h1>USD <%=usd
%></h1>
</body>
</html>
