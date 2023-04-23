<%--
  Created by IntelliJ IDEA.
  User: ysng_ysng
  Date: 2023/03/23
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lifecycle</title>
</head>
<body>
hello~!
<%
    System.out.println("jspService()");
%>

<%!
    public void jspInit() {
        System.out.println("jspInit()");
    }
%>

<%!
    public void jspDestroy() {
        System.out.println("jspDestroy()");
    }
%>
</body>
</html>
