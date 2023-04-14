<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sửa Sinh Viên</title>
</head>
<body>
	<form action="edit" method="post">
		<lable> Mã sinh viên: </lable>
		<input type="text" name="id" value="${s.id}" readonly>
		<lable> Họ và Tên: </lable>
		<input type="text" name="name" value="${s.name}">
		<lable> Email: </lable>
		<input type="text" name="email" value="${s.email}">
		<button type="submit">Sửa</button>
	</form>
</body>
</html>