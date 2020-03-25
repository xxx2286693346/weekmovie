<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body> 
	<table class="table">
		<tr>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
		</tr>
		<c:forEach items="${moList}" var="s">
			<tr>
				<td>${s.mname}</td>
				<td>${s.dao}</td>
				<td>${s.price}</td>
				<td>
				${s.time}
				</td>
				<td>${s.longtime}</td>
				<td>${s.lx}</td>
				<td>${s.nd}</td>
				<td>${s.qy}</td>
				<td>${s.zt}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>