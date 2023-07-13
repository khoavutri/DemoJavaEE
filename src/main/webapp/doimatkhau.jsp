<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Đổi mật khẩu</title>
	<meta charset="utf-8">
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
		.container {
			max-width: 500px;
			margin: auto;
			margin-top: 50px;
		}
		.error-message {
			color: red;
		}
	</style>
</head>
<body>
<%String s = (String) request.getAttribute("coco"); %>
	<div class="container">
		<h2>Đổi mật khẩu</h2>
		<form id="change-password-form" action="buocdem" method="post">
			<div class="form-group">
				<label for="old-password">Mật khẩu hiện tại:</label>
				<input type="password" class="form-control" id="old-password" name="old-password" required>
<%if (s!=null){ %> <span style="color:red;">Nhập sai mật khẩu hiện tại!</span>			<%}; %>	
				
			</div>
			<input type="hidden" name="from" value="doimatkhau1"/>
			<div class="form-group">
				<label for="new-password">Mật khẩu mới:</label>
				<input type="password" class="form-control" id="new-password" name="new-password" required>
			</div>
			<div class="form-group">
				<label for="confirm-password">Xác nhận mật khẩu mới:</label>
				<input type="password" class="form-control" id="confirm-password" name="confirm-password" onkeyup="fuc()"  required >
			<div id="mlml" style="color:red"></div>
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-primary" id="su" >Lưu thay đổi</button>
			</div>
			<div id="error-messages"></div>
		</form>
	</div>
<script type="text/javascript">
	function fuc() {
	var submit = document.getElementById("su");
		var s1 = document.getElementById("new-password").value;
		var s2 = document.getElementById("confirm-password").value;
		var s3 = document.getElementById("mlml");
		if (s1!=s2){
			submit.disabled = true;
			s3.innerHTML = "Nhập lại mật khẩu không đúng!";
		} 
		
		if (s1==s2){
			s3.innerHTML = "";
			if (s1!=""){
				submit.disabled = false;
				s3.innerHTML = "Nhập lại mật khẩu chính xác!";
			}
		}
		console.log(s3.innerHTML);
		
	}

</script>	
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>