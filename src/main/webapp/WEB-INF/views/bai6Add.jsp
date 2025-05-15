<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 8:52 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/employees/save" method="post">
    Tên <input type="text" name="name"> <br>
    Email <input type="text" name="email"> <br>
    Vị trí <input type="text" name="position"> <br>
    <button type="submit">Thêm</button>
</form>
</body>
</html>
