<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Trình tạo mã</title>
    
    <style>
      body {
        display: flex;
        justify-content: center;
      }
      
     form {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 50px;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-shadow: 0 0 10px #ccc;
  background-color: #fff;
  font-family: Arial, sans-serif;
}
label {
  font-weight: bold;
  margin-bottom: 10px;
}
input[type="text"] {
  width: 300px;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 16px;
  margin-bottom: 20px;
}
span {
  font-weight: bold;
  font-size: 20px;
}
#number-display {
  margin-left: 5px;
}
input[type="submit"] {
  padding: 10px 20px;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
}
input[type="submit"]:hover {
  background-color: #3e8e41;
}
    </style>
  </head>
  <body onload="countdown(60)">
    <form action="trinhtaoma"  method="post" id="myForm">
      <label for="text-input">Nhập mã gồm chữ 6 số:</label>
      <input type="text" id="text-input" name="text-input">
      <span>Mã sẽ tự động gửi lại sau: </span>
      <span id="number-display" style="color:red">60</span>
      <br>
      <input type="submit" value="Submit">
    </form>
    
<script type="text/javascript">
function countdown(seconds) {
	const form = document.getElementById("myForm");
	var count = seconds;
	var countdownId = setInterval(function() {
        if (count > 0) {
            count--;
            document.getElementById("number-display").innerHTML = count;
        } else {
            clearInterval(countdownId);
           form.submit();
        }
    }, 1000);
}
</script>
    
    
    
   
  </body>
</html>