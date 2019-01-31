<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	  <h2>Hover Rows</h2>
	  <p>The .table-hover class enables a hover state on table rows:</p>            
	  <table class="table table-hover">
	    <thead>
	      <tr>
	       	<th>프로젝트이름</th>
			<th>시작날짜</th>
			<th>종료날짜</th>
			<th>상태</th>
	      </tr>
	    </thead>
	    <tbody>
		     <c:forEach var="item" items="${list }">
				<tr>
					<td><a href="read.do?no=${item.project_no }">${item.project_name }</a></td>
					<td><fmt:formatDate value="${item.startdate }" type="date" dateStyle="long"/></td>
					<td><fmt:formatDate value="${item.enddate }" type="date" dateStyle="long"/></td>
					<td>${item.progress }</td>
				</tr>
			 </c:forEach>
	    </tbody>
	  </table>
	</div>

</body>
</html>