<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Quên mật khẩu</title>
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f4f4f4;
		}
		form {
			margin: 0 auto;
			max-width: 400px;
			padding: 20px;
			background-color: #fff;
			box-shadow: 0 0 10px rgba(0,0,0,0.3);
			border-radius: 5px;
		}
		h1 {
			text-align: center;
			color: #333;
			margin-bottom: 20px;
		}
		label {
			display: block;
			margin-bottom: 8px;
			color: #666;
		}
		input[type="text"],
		input[type="email"],
		input[type="password"] {
			width: 100%;
			padding: 10px;
			border: 1px solid #ccc;
			border-radius: 3px;
			margin-bottom: 20px;
			box-sizing: border-box;
			font-size: 16px;
			color: #555;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: #fff;
			padding: 10px 20px;
			border: none;
			border-radius: 3px;
			font-size: 16px;
			cursor: pointer;
		}
		input[type="submit"]:hover {
			background-color: #3e8e41;
		}
	</style>
</head>
<body>

<%String s = (String)request.getAttribute("caca"); %>
	<form action="buocdem" method="post">
		<h1>Lấy lại mật khẩu:</h1>
		<label for="username">Tên đăng nhập:</label>
		<input type="text" id="username" name="username" required>
		<label for="email">Email:</label>
		<input type="email" id="email" name="email" required>
<%if (s!=null){ %> <span style="color: red;">Tên đăng nhập hoặc email không trùng khớp!</span><%}; %>
		<input type="hidden" name="from" value="quenmatkhau1"/>
		<input type="submit" value="Gửi">
	</form>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
