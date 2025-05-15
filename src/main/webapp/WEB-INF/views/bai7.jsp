<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 9:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--private String answer;--%>
<%
    String correctAnswer = (String) request.getAttribute("question.answer");
    String userAnswer = request.getParameter("answer");
%>
<img src="${question.imageUrl}" alt="">
<br>
<h3>đây là quả gì? </h3>
<form method="get">
    <input type="text" name="a" value="<%= (userAnswer != null) ? userAnswer : "" %>">
    <button type="submit">Kiểm tra</button>
</form>
<%
    if (userAnswer != null) {
        if (userAnswer.trim().equalsIgnoreCase(correctAnswer)) {
%>
<h3 style="color: green;">Đúng</h3>
<%
} else {
%>
<h3 style="color: red;">Sai, thử lại!</h3>
<%
        }
    }
%>
</body>
</html>
