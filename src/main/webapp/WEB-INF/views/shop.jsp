<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 10:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="s" items="${seedsList}">
    <div>
        <img src="${s.imageUrl}" width="100"/>
        <p>${s.seedsName} - ${s.price}</p>
        <form action="buy" method="post">
            <input type="hidden" name="seedId" value="${s.id}"/>
            Quantity: <input type="number" name="quantity"/>
            <input type="submit" value="Mua"/>
        </form>
    </div>
</c:forEach>
</body>
</html>
