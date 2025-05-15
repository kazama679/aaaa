<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 8:41 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Danh sách người dùng</title>
  <style>
    table {
      width: 60%;
      border-collapse: collapse;
      margin: 20px auto;
    }
    th, td {
      border: 1px solid #ddd;
      padding: 8px;
      text-align: center;
    }
    th {
      background-color: #4CAF50;
      color: white;
    }
  </style>
</head>
<body>
<h2 style="text-align: center;">Danh sách người dùng</h2>
<table>
  <thead>
  <tr>
    <th>Tên</th>
    <th>Tuổi</th>
    <th>Ngày sinh</th>
    <th>Email</th>
    <th>Số điện thoại</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.name}</td>
      <td>${user.age}</td>
      <td>${user.birthday}</td>
      <td>${user.email}</td>
      <td>${user.phone}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>