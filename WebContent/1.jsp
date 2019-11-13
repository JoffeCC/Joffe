<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/test/t1?uname=管理员">测试原始的ServletAPI</a> <br>
	<a href="${pageContext.request.contextPath}/test/t2?uname=张三">测试SpringMVC替代方案1</a> <br>
	<a href="${pageContext.request.contextPath}/test/t3?uname=李四">测试SpringMVC替代方案2</a> <br>
	<a href="${pageContext.request.contextPath}/test/t4?uname=王五">测试SpringMVC替代方案3</a> <br>
	<a href="${pageContext.request.contextPath}/test/t5?uname=赵六">测试SpringMVC替代方案4</a> <br>
	<a href="${pageContext.request.contextPath}/test/t6?uname=小七">测试SpringMVC替代方案5</a> <br>
</body>
</html>