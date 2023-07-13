<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Đổi mật khẩu</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
    <style>
      /* Thiết lập các thuộc tính font chung */
      body {
        font-family: Arial, sans-serif;
        font-size: 14px;
        line-height: 1.5;
        color: #333;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
      }

      /* Thiết lập khu vực đổi mật khẩu */
      .password-change {
        background-color: #fff;
        border: 1px solid #ddd;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.2);
        margin: 50px auto;
        padding: 20px;
        max-width: 500px;
      }

      /* Thiết lập tiêu đề trang */
      .title {
        font-size: 24px;
        font-weight: bold;
        margin: 0 0 20px;
      }

      /* Thiết lập các trường đầu vào */
      label {
        display: block;
        font-weight: bold;
        margin-bottom: 5px;
      }

      input[type="password"] {
        border: 1px solid #ccc;
        border-radius: 3px;
        padding: 10px;
        width: 100%;
        margin-bottom: 20px;
        box-sizing: border-box;
      }

      input[type="submit"] {
        background-color: #4CAF50;
        color: #fff;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        cursor: pointer;
        float: right;
      }

      input[type="submit"]:hover {
        background-color: #3e8e41;
      }

      /* Thiết lập thông báo lỗi */
      .error {
        color: #f00;
        font-size: 12px;
        margin-top: 10px;
      }
    </style>
  </head>
  <body>
    <div class="password-change">
      <div class="title">Đổi mật khẩu</div>
      <form method="post" action="quennmatkhau">
        <label for="new_password">Mật khẩu mới:</label>
        <input type="password" id="new_password" name="new_password" required>
        <label for="confirm_password">Xác nhận mật khẩu:</label>
        <input type="password" id="confirm_password" name="confirm_password" onkeyup="fuc()" required>
        <div id="mlml" style="color:red"></div>
        <input type="submit" value="Đổi mật khẩu" id ="so">
      </form>
      <div class="error"><!-- Hiển thị thông báo lỗi ở đây nếu có --></div>
    </div>
    <script type="text/javascript">
	function fuc() {
	var submit = document.getElementById("so");
		var s1 = document.getElementById("new_password").value;
		var s2 = document.getElementById("confirm_password").value;
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
