<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Form HTML</title>
	<style>
		/* Định dạng phần tử cha */
		.container {
			display: flex;
			justify-content: center;
			align-items: center;
			height: 100vh;
		}

		/* Định dạng form */
		form {
			width: 400px;
			padding: 20px;
			background-color: #f2f2f2;
			border-radius: 10px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
		}

		label {
			display: inline-block;
			width: 150px;
			font-weight: bold;
			margin-bottom: 10px;
		}

		input[type=text] {
			width: 250px;
			padding: 5px;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
			margin-bottom: 10px;
		}

		input[type=file] {
			margin-bottom: 10px;
		}

		input[type=submit] {
			background-color: #4CAF50;
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 4px;
			cursor: pointer;
			font-size: 16px;
		}

		input[type=submit]:hover {
			background-color: #45a049;
		}
	</style>
</head>
<body>
	<div class="container">
		<form action="#" method="post" enctype="multipart/form-data">
			<label for="imageUpload">Upload ảnh:</label>
			<input type="file" id="imageUpload" name="imageUpload"><br>

			<label for="productName">Tên sản phẩm:</label>
			<input type="text" id="productName" name="productName"><br>

			<label for="productCode">Mô tả sản phẩm:</label>
			<input type="text" id="productCode" name="productCode"><br>

			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>

