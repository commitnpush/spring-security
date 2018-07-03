<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<h2 class="jumbotron col-sm-3 col-sm-offset-3">Log In</h2>
			<div class="error">
				<c:if test="${not empty error }"></c:if>
			</div>
		</div>
		<div class="row">
			<form class="form-horizontal" action=""
				action="j_spring_security_check" method="post">
				<div class="form-group">
					<label for="" class="control-label col-sm-3">아이디</label>
					<div class="col-sm-3">
						<input type="text" name="id" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label for="" class="control-label col-sm-3">패스워드</label>
					<div class="col-sm-3">
						<input type="password" name="password" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-3 col-sm-offset-3">
						<button class="btn btn-default btn-block">로그인</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- script libary -->
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>