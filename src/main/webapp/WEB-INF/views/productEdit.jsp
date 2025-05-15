<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 4:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/editProduct" method="post">
    Id <input readonly type="text" name="id" value="${product.id}"> <br>
    Tên <input type="text" name="name" value="${product.name}"> <br>
    Giá <input type="text" name="price" value="${product.price}"> <br>
    Mô tả <input type="text" name="des" value="${product.description}"> <br>
    <button type="submit">Sửa</button>
</form>
</body>
</html>
