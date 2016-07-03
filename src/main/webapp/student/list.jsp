<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>学生列表</title>
		<!-- Bootstrap -->
		<link  href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
		<script src="${pageContext.request.contextPath}/bootstrap/js/jquery-1.10.2.min.js"></script>
		<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
	</head>
	<body>
		<table class="table">
		   <thead>
		      <tr><th>编号</th><th>姓名</th><th>性别</th><th>年龄</th></tr>
		   </thead>
		   <tbody>
		   <c:forEach items="${stulist}" var="stu">
		      <tr><td>${stu.id}</td><td>${stu.name}</td><td>${stu.sex}</td><td>${stu.age}</td></tr>
		   </c:forEach>
		   </tbody>
		</table>		
	</body>
</html>