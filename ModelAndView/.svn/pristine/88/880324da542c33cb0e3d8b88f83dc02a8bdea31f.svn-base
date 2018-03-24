<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功!</title>
</head>
<body>
	用户名:<input  id="username" type="text" name="username" >
	<br>
	密&nbsp;&nbsp;&nbsp;码:<input  id="password" type="password" name="password">
	<br>
	<button>ddd</button>

	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">	
	$("button").click(function(){
	
		alert("sfds");
		var pwd=$("#password").val();
		pwd=hex_sha1(pwd);
		alert("pwd");
		$.post('login.do',{username:$('#username').val(),pass:pwd},function(data){
			if(data=="1"){
				window.location.href="user";
			}else{
				$.messager.alert('error','用户名和密码不匹配请确认!','error');
			}
		})
	});  
	</script>
</body>
</html>