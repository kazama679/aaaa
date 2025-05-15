<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 8:52 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Bài tập 6</h4>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Tên</td>
        <td>Email</td>
        <td>Vị trí</td>
    </tr>
    <c:forEach items="${employees}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.email}</td>
            <td>${p.position}</td>
        </tr>
    </c:forEach>
</table>
<a href="employees/add">Thêm</a>
</body>
</html>
