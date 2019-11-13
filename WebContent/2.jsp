<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/param/common?uname=admin&gender=男&age=">SpringMVC接收普通参数</a> <br>
	<a href="${pageContext.request.contextPath}/param/date?time=2019-11-13 14:48:55">SpringMVC接收日期类型</a>  <br>
	<hr>
	<h3>封装单个对象</h3>
	<form action="${pageContext.request.contextPath}/param/object" method="post">  
		用户名： <input type="text" name="uname">  <br/>
		密码： <input type="password" name="password">  <br/>
		性别： <input type="radio" name="gender" value="0"> 男 
			 <input type="radio" name="gender" value="1" checked> 女 <br/>
		生日： <input type="date" name="birthday">  <br/>
		薪资： <input type="number" name="salary">  <br/>
		<input type="submit" value="注册">
	</form>
	
	<hr>
	<h3>批量封装多个对象: 约定优于编程</h3>
	<form action="${pageContext.request.contextPath}/param/objects" method="post">  
		用户名： <input type="text" name="list[0].uname">  <br/>
		密码： <input type="password" name="list[0].password">  <br/>
		性别： <input type="radio" name="list[0].gender" value="0"> 男 
			 <input type="radio" name="list[0].gender" value="1" checked> 女 <br/>
		<hr>
		用户名： <input type="text" name="list[1].uname">  <br/>
		密码： <input type="password" name="list[1].password">  <br/>
		性别： <input type="radio" name="list[1].gender" value="0"> 男 
			 <input type="radio" name="list[1].gender" value="1" checked> 女 <br/>
		<input type="submit" value="注册">
	</form>
	

</body>
</html>