<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function(){
		$("#delBtn").click(function(){
			var del = confirm("정말 삭제하시겠습니까?");
			if(del==true){
				location.href="${pageContext.request.contextPath }/project/delete?project_no=${vo.project_no }";
			}
			return false;
		})
	})
</script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	
	<jsp:include page="header.jsp"></jsp:include>
	
	  <h2>Basic Table</h2>
	  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
	  <table class="table">
	    <tr>
			<th>프로젝트 이름</th>
			<td>${vo.project_name }</td>
		</tr>
		<tr>
			<th>프로젝트 내용</th>
			<td>${pVO.content }</td>
		</tr>
		<tr>
			<th>시작날짜</th>
			<td><fmt:formatDate value="${vo.startdate }" type="date" dateStyle="long"/></td>
		</tr>
		<tr>
			<th>종료날짜</th>
			<td><fmt:formatDate value="${vo.enddate }" type="date" dateStyle="long"/></td>
		</tr>
		<tr>
			<th>상태</th>
			<td>${vo.progress }</td>
		</tr>
	  </table>
	  <p>
		<a href="${pageContext.request.contextPath }/project/modify?project_no=${vo.project_no }">[수정]</a>
		<a href="${pageContext.request.contextPath }/project/delete?project_no=${vo.project_no }" id="delBtn">[삭제]</a>
		<a href="${pageContext.request.contextPath }/project/list">[돌아가기]</a>
	</p>
	</div>
</body>
</html>