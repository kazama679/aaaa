<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 15/05/2025
  Time: 8:17 SA
  To change this template use File | Settings | File Templates.
--%>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm Người Dùng</title>
    <script>
        function validateForm() {
            const name = document.forms["userForm"]["name"].value.trim();
            const email = document.forms["userForm"]["email"].value.trim();
            const phone = document.forms["userForm"]["phone"].value.trim();
            const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            const phonePattern = /^[0-9]{10,15}$/;

            if (name === "") {
                alert("Tên không được để trống");
                return false;
            }
            if (email === "" || !emailPattern.test(email)) {
                alert("Email không hợp lệ");
                return false;
            }
            if (phone === "" || !phonePattern.test(phone)) {
                alert("Số điện thoại phải là số và từ 10-15 ký tự");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<h2>Thêm Người Dùng</h2>
<form name="userForm" action="saveUser" method="post" onsubmit="return validateForm()">
    Tên: <input type="text" name="name"> <br>
    Email: <input type="text" name="email"> <br>
    Số: <input type="text" name="phone"> <br>
    <button type="submit">Thêm</button>
</form>
</body>
</html>