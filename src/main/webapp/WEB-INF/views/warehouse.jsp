<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 10:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="item" items="${warehouseList}">
  <div>
    <img src="${item.seeds.imageUrl}" width="100"/>
    <p>${item.seeds.seedsName} - SL: ${item.quantity}</p>
  </div>
</c:forEach>
</body>
</html>
