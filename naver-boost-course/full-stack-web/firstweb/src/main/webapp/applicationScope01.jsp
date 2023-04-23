<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/26
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application Scope</title>
</head>
<body>
<%
    try {
        int value = (Integer) application.getAttribute("value");
        value += 2;
        application.setAttribute("value", value);
%>
<h1><%=value %></h1>
<%
    } catch (NullPointerException e) {
%>
<h1>설정된 값이 없습니다.</h1>
<%
    }
%>
</body>
</html>
