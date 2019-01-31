<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">
	<h1>
	Project Management  
	</h1>
		<ul class="nav nav-pills nav-stacked">
			<li class="active"><a>Menu</a></li>
			<li><a href="${pageContext.request.contextPath }/project/list">Project 리스트 보기</a></li>
			<li><a href="${pageContext.request.contextPath }/project/register">Project 추가</a></li>
		</ul>
	</div>
</body>
</html>
