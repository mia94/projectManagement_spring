<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function(){
		$("#startdate").datepicker();
		$("#enddate").datepicker();
	})
</script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	
	<jsp:include page="header.jsp"></jsp:include>
	
	  <h2>추가 form</h2>
	  <form action="register" method="post">
	    <div class="form-group">
	      <label for="email">프로젝트 이름</label>
	      <input type="text" class="form-control" id="project_name" name="project_name">
	    </div>
	    <div class="form-group">
	      <label for="pwd">프로젝트 내용</label>
	      <input type="text" class="form-control" id="content" name="content">
	    </div>
	    <div class="form-group">
	      <label for="email">시작날짜</label>
	      <input type="text" class="form-control" id="startdate" name="startdate">
	    </div>
	    <div class="form-group">
	      <label for="pwd">종료날짜</label>
	      <input type="text" class="form-control" id="enddate" name="enddate">
	    </div>
	    <div class="form-group">
		 	  <label for="sel1">프로젝트 상태</label>
		      <select class="form-control" id="sel1" name="progress">
		        <option value="준비">준비</option>
		        <option value="진행중">진행중</option>
		        <option value="종료">종료</option>
		        <option value="보류">보류</option>
		      </select>
      </div>
	    <button type="submit" class="btn btn-default">Submit</button>
	  </form>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>