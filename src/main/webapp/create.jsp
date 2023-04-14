
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Sinh Viên</title>
</head>
<body>
	<form action="add" method="get">
		<lable> Họ và Tên: </lable>
		<input type="text" name="name">
		<lable> Email: </lable>
		<input type="text" name="email">
		<button type="submit">Thêm</button>
	</form>
</body>
</html>