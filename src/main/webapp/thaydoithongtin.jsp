`<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Cập nhập thông tin</title>
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
		.container {
			display: grid;
			grid-template-columns: repeat(2, 1fr);
			grid-gap: 20px;
		}

		form {
			background-color: #f2f2f2;
			padding: 20px;
			border-radius: 10px;
			display: flex;
			flex-direction: column;
			align-items: center;
		}

		label {
			display: block;
			margin-bottom: 5px;
		}

		input, select {
			padding: 10px;
			border-radius: 5px;
			border: none;
			margin-bottom: 10px;
			width: 100%;
			box-sizing: border-box;
		}

		input[type="submit"] {
			background-color: #4CAF50;
			color: white;
			cursor: pointer;
			width: 100%;
			margin-top: 10px;
		}
	</style>
	
	
	
	<style>
		header {
			display: flex;
			justify-content: center;
			align-items: center;
			height: 100px;
			background-color: #4CAF50;
			color: white;
			font-size: 36px;
			font-weight: bold;
		}
	</style>
	
<style>
	label {
  display: inline-block;
  margin-right: 10px;
}

input[type="checkbox"] {
  margin-right: 5px;
}
</style>
	
</head>
<body>

	<header>
		Thay đổi thông tin
	</header>

	<form action="buocdem" method="post">
		<div class="container">
			<div>
	
				<label for="fullname">Họ và tên:</label>
				<input type="text" id="fullname" name="fullname">
				<input type="hidden" name="from" value="capnhapthongtin1"/>
			

				<label for="gender">Giới tính:</label>
				<select id="gender" name="gender">
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
					<option value="other">Khác</option>
				</select>

				<label for="birthday">Ngày sinh:</label>
				<input type="date" id="birthday" name="birthday">

	
				<label for="billing_address">Số điện thoại:</label>
				<input type="tel" id="bii" name="bi">
			</div>

			<div>
				
				<label for="address">Địa chỉ:</label>
				<input type="text" id="address" name="address">

				<label for="shipping_address">Địa chỉ nhận hàng:</label>
				<input type="text" id="shipping_address" name="shipping_address">

				<label for="billing_address">Địa chỉ mua hàng:</label>
				<input type="text" id="billing_address" name="billing_address"/>
			
			
					<input type="submit" value="Thay đổi">
				
			</div>
		</div>
	</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>