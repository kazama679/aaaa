<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 14/05/2025
  Time: 5:13 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Bài tập 2</h4>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Tên</td>
        <td>Giá</td>
        <td>Mô tả</td>
        <td>hành động</td>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.description}</td>
            <td>
                <a href="product/${p.id}">Chi tiết</a>
                <a href="product-delete/${p.id}">Xóa</a>
                <a href="product-update/${p.id}">Sửa</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="addProduct">Thêm</a>
</body>
</html>