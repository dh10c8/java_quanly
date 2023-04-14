<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sach sinh vien</title>
</head>
<body>
	<table border="1px">
		<tr>
			<td>Mã Sinh Viên</td>
			<td>Tên</td>
			<td>Email</td>
			<td>Chức nắng</td>
		</tr>
		<c:forEach items="${listSv}" var="x">
			<tr>
				<td>${x.id}</td>
				<td>${x.name}</td>
				<td>${x.email}</td>
				<td> 
					<a href="edit?id=${x.id}">Sửa</a>
					<a href="delete?id=${x.id}">Xóa</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="create.jsp">Thêm</a>
</body>
</html>