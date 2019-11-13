<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 采用CDN加速服务来导入jQuery -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	<!-- RestFul 风格的路由 ： 传参使用方便，并且可以完成代码混淆  -->
	<a href="query_list/admin/0/021">1. 测试Rest 风格路由</a> <br>
	<a href="list/020,java,1">2. 模仿51job的Rest 风格路由</a> <br>
	
	<hr/>
	<h3>参数混淆</h3>
	<form action="login"  method="post" enctype="application/x-www-form-urlencoded">
		用户名 ： <input type="text" name="a">  <br/>
		密码 ： <input type="password" name="b">  <br/>
		授权认证码 ： <input type="text" name="cc">  <br/>
		<input type="submit" value="登录">
	</form>
	
	<h3 id="test">测试ajax请求(正常的url传参)</h3>
	
	<h3 id="test1">测试ajax请求(传递是JSON字符串)</h3>
	
	<a href="ajax2/find3">测试同步请求使用@ResponseBody</a> <br>
	
	<script type="text/javascript">
		$(function(){
			$('#test').click(function(){
				// 发送Ajax请求
				$.ajax({
					url : "ajax2/test5",
					type: "POST",
					async: true,
					data: {"uname":"admin","password":"123"},
					dataType: "json",
					success: function(data){
						alert(data[1].uname);
					}
				});
			});
			
			$('#test1').click(function(){
				var msg = {"uname":"admin","password":"123"};  // json对象
				// 发送Ajax请求
				 $.ajax({
					url : "ajax2/find2",
					type: "POST",  // post请求参数在请求体中
					async: true,
					data: JSON.stringify(msg),  // 发送的是字符串
					contentType: "application/json;charset=utf-8",  // 修改请求编码方式
					dataType: "text",
					success: function(data){
						alert(data);
					}
				}); 
			});
		});
	</script>
</body>
</html>










