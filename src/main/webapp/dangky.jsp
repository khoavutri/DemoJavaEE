<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Đăng ký</title>
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
	<style>
		body {
			background-color: #7FFF00;
		}
		form {
			margin: 50px auto;
			padding: 20px;
			width: 500px;
			background-color: #FFF;
			border-radius: 10px;
		}
		label {
			display: block;
			margin-bottom: 5px;
		}
		input[type="text"],
		input[type="password"],
		input[type="email"],
		input[type="tel"],
		select,
		input[type="date"] {
			width: 100%;
			padding: 8px;
			border-radius: 5px;
			border: none;
			margin-bottom: 10px;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: #FFF;
			padding: 10px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			float: right;
		}
		input[type="submit"]:hover {
			background-color: #3e8e41;
		}
	</style>
	<script>
		function validateForm() {
			if (!document.getElementById("agree").checked) {
				alert("Bạn cần đồng ý với điều khoản và điều kiện của trang web.");
				return false;
			}
		}
	</script>
	<style>
	.custom-input {
  border: 1px solid #ccc;0
}</style>
</head>
<body>
<%String s1 =(String) request.getAttribute("cucu");%>
<%String s2 =(String) request.getAttribute("cuca");%>
<%String s = "";

if (s1!=null){
	s += "Tên đăng nhập đã tồn tại ";
}
if (s2!=null){
	s += "Email đã được sử dụng ";
}
%>
	<div style="text-align:center;">
			<h1>FORM ĐĂNG KÝ</h1>
<%if (!s.equals("")){ %> <span style="color:red;"><%=s %></span>   <%}; %>
		

		</div>
	<form action="buocdem" method="post" >
		<label for="username">Tên đăng nhập:</label>
		<input class="custom-input" type="text" id="username" name="username" required>
		<input type="hidden" name="from" value="dangky1"/>
		<label for="password">Mật khẩu:</label>
		<input type="password" id="password" name="password" required>

		<label for="email">Email:</label>
		<input type="email" id="email" name="email" required>

		<label for="phone">Số điện thoại:</label>
		<input type="tel" id="phone" name="phone" required>

		<label for="fullname">Họ và tên:</label>
		<input type="text" id="fullname" name="fullname" required>

		<label for="gender">Giới tính:</label>
		<select id="gender" name="gender" required>
			<option value="">-- Chọn giới tính --</option>
			<option value="male">Nam</option>
			<option value="female">Nữ</option>
			<option value="other">Khác</option>
		</select>

		<label for="address">Địa chỉ:</label>
		<input type="text" id="address" name="address" required>

		<label for="shipping_address">Địa chỉ nhận hàng:</label>
		<input type="text" id="shipping_address" name="shipping_address" required/>
		<label for="billing_address">Địa chỉ đặt hàng:</label>
	<input type="text" id="billing_address" name="billing_address" required>

	<label for="dob">Ngày sinh:</label>
	<input type="date" id="dob" name="dob" required>

	<label>
		<input type="checkbox" id="agree" name="agree" required> Tôi đồng ý với <a href="#">điều khoản và điều kiện</a> của trang web.
	</label>

	<input type="submit" value="Đăng ký">
</form>
	<jsp:include page="footer.jsp"></jsp:include>	
</body>
</html>