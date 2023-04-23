<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/23
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>1부터 10까지의 합</title>
    <link rel="stylesheet" href="sum10-style.css">
</head>
<body>
<%
    int total = 0;
    for (int i = 1; i <= 10; i++) {
        total += i;
    }
%>

<h1>1부터 10까지의 합 <%=total%>
</h1>

</body>
</html>
