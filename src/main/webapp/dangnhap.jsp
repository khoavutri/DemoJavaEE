<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Đăng nhập</title>
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
	integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
	crossorigin="anonymous"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
		body {
			font-family: Arial, Helvetica, sans-serif;
			background-color: #f1f1f1;
		}

		.container {
			background-color: #fff;
			margin: 5% auto 15% auto;
			border: 1px solid #ccc;
			border-radius: 10px;
			width: 40%;
			padding-bottom: 50px;
		}

		.header {
			text-align: center;
			background-color: #4267B2;
			color: white;
			padding: 30px;
			border-top-left-radius: 10px;
			border-top-right-radius: 10px;
		}

		input[type=text], input[type=password] {
			width: 100%;
			padding: 12px 20px;
			margin: 8px 0;
			display: inline-block;
			border: 1px solid #ccc;
			box-sizing: border-box;
			border-radius: 4px;
		}

		button {
			background-color: #4267B2;
			color: white;
			padding: 14px 20px;
			margin: 8px 0;
			border: none;
			cursor: pointer;
			width: 100%;
			border-radius: 4px;
		}

		button:hover {
			background-color: #3e5ca1;
		}

		.cancelbtn {
			width: auto;
			padding: 10px 18px;
			background-color: #f44336;
			color: white;
			border-radius: 4px;
			border: none;
			cursor: pointer;
			float: left;
		}

		.imgcontainer {
			text-align: center;
			margin: 24px 0 12px 0;
			position: relative;
		}

		img.avatar {
			width: 40%;
			border-radius: 50%;
		}

		.container {
			padding: 16px;
		}

		span.psw {
			float: right;
			padding-top: 16px;
		}

		/* Change styles for span and cancel button on extra small screens */
		@media screen and (max-width: 300px) {
			span.psw {
				display: block;
				float: none;
			}
			.cancelbtn {
				width: 100%;
			}
		}
	</style>
</head>
<body>
<%
String ob = (String) request.getAttribute("mou");
if (ob==null){ob="";};
%>
<% if (ob.equals("0")) { %>
    <script>
    alert("Tên đăng nhập hoặc mật khẩu sai!");
  </script>
<% } %>
<%String so = (String)request.getAttribute("dangkythanhcong"); %>
<%if (so!=null){ %>  <script>
    alert("Đăng ký thành công đăng nhập để sử dụng dịch vụ!");
  </script> <%}; %>
 
 <%String su = request.getParameter("quenthanhcong"); %>
 <%if (su!=null){ %><script>
    alert("Nhớ thành công!");
  </script> <%}; %>
	<form action="dangnhap" method="post">
		<div class="container">
			<div class="header">
				<img src="img/dangnhap/dangnhap.png" alt="Avatar" class="avatar">
				<h2>Đăng nhập</h2>
			</div>

			<label for="uname"><b>Tên đăng nhập</b></label>
			<input type="text" placeholder="Nhập tên đăng nhập" name="uname" required>

			<label for="psw"><b>Mật khẩu</b></label>
			<input type="password" placeholder="Nhập mật khẩu" name="psw" required>

			<button type="submit">Đăng nhập		</button>

	
			<span ><a href="dangky.jsp"> Đăng Ký</a></span>
		
			<span ><a href="quenmatkhau.jsp">Quên mật khẩu </a></span>
			
	</div>

</form>

<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>
			
