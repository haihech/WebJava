<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Đăng nhập</title>
<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>

	<div class="container">
		<div class="main">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<h1>Đăng nhập</h1>
					<c:if test="${param.error == 'true'}">
						<div class="alert alert-danger">
							Login Failed!!!<br /> Reason :
							${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
						</div>
					</c:if>
					<form action="j_spring_security_check" method="post">
						<div class="form-group">
							<label for="username">User name</label> <input type="text"
								name="username" id="username" class="form-control">
						</div>
						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								name="password" id="password" class="form-control">
						</div>

						<button type="submit" class="btn btn-success pull-right">Đăng
							nhập</button>

					</form>
				</div>
			</div>
		</div>

	</div>
	
</body>
</html>