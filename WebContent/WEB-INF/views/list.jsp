<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- 导入JSTL标签 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">员工信息列表</h1>
	<table align="center" border="1px" width="70%" cellspacing="0px">
		<tr>
			<th>ID</th>
			<th>lastname</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DeptName</th>
			<th>Operation</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr align="center">
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.gender == 0 ? '女':'男' }</td>
				<td>${emp.dept.departmentName }</td>
				<td>
					<a href="#">edit</a>
					<a href="emp/${emp.id}">Delete</a>
				</td>
		</c:forEach>
	</table>
	<h2 align="center"><a href="#">Add New Emp</a>
	</h2>
</body>
</html>