<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/24
  Time: 1:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StringBuffer url = request.getRequestURL();
    out.print("url : " + url.toString());
    out.print("<br>");
%>
</body>
</html>
