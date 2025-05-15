<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 14/05/2025
  Time: 4:39 CH
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>List customer</h4>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Gender</td>
        <td>Customer Type</td>
    </tr>
    <c:forEach items="${customers}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.fullName}</td>
            <td>${c.email}</td>
            <td>${c.gender}</td>
            <td>${c.customerType}</td>
        </tr>
    </c:forEach>
</table>
<a href="customer-add">Thêm mới customer</a>
</body>
</html>