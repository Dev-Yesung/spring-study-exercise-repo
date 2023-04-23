<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/26
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%
    request.setAttribute("k", 10);
    request.setAttribute("m", true);
%>
<html>
<head>
    <title>el02.jsp</title>
</head>
<body>
<h1>operations for k value</h1>
<p>
    k : ${requestScope.k}<br/>
    <br/>
    k + 5 : ${requestScope.k + 5}<br/>
    k - 5 : ${requestScope.k - 5}<br/>
    k * 5 : ${requestScope.k * 5}<br/>
    k / 5 : ${requestScope.k / 5}<br/>
</p>

<h1>operations for k, m value</h1>
<p>
    k : ${requestScope.k}<br/>
    m : ${requestScope.m}<br/>
    <br/>
    k > 5 : ${requestScope.k > 5}<br/>
    k < 5 : ${requestScope.k < 5}<br/>
    k >= 5 : ${requestScope.k >= 5}<br/>
    k <= 5 : ${requestScope.k <= 5}<br/>
    !m : ${!m}<br/>
</p>


</body>
</html>
