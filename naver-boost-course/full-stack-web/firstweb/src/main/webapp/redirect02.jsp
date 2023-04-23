<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/24
  Time: 1:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 1; i < 5; i++) {
%>
<h<%=i%>>리다이렉트된 페이지입니다 :)</h<%=i%>>
<%
    }
%>
</body>
</html>
