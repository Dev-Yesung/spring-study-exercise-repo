<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/26
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("p1", "page scope value");
    request.setAttribute("r1", "request scope value");
    session.setAttribute("s1", "session scope value");
    application.setAttribute("a1", "application scope value");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section style="text-align: center; color: cadetblue">
    <h2>Explicit scope values</h2>
    <p>pageContext.getAttribute("p1") : <b>${pageScope.p1}</b></p>
    <p>request.getAttribute("r1") : <b>${requestScope.r1}</b></p>
    <p>session.getAttribute("s1") : <b>${sessionScope.s1}</b></p>
    <p>application.getAttribute("a1") : <b>${applicationScope.a1}</b></p>
</section>


<section style="text-align: center; color: burlywood">
    <h2>Implicit scope values</h2>
    <p>pageContext.getAttribute("p1") : <b>${p1}</b></p>
    <p>request.getAttribute("r1") : <b>${r1}</b></p>
    <p>session.getAttribute("s1") : <b>${s1}</b></p>
    <p>application.getAttribute("a1") : <b>${a1}</b></p>
</section>

<section>
    is that true?<br>
    yes!
</section>
</body>
</html>
