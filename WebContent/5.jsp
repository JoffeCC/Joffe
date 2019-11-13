<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>文件上传</h2>
	<form action="file/upload" method="post" enctype="multipart/form-data">
		用户名 ：<input type="text" name="uname">  <br>
			  <input type="file" name="myFile"> <br>
			 <input type="submit" value="开始上传"> 
	</form>
	
	<!-- 
		Servlet3新特新的文件上传（直接加注解即可获取Part）
		SpringMVC 在处理文件上传的时候，默认采用的是  commons-io  commson-fileupload
			注意点：
				前端 ： POST enctype="multipart/form-data"  name属性要写
				后端： 配置一个通用的文件解析器
				<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
					<property name="defaultEncoding" value="utf-8"></property>
					<property name="maxUploadSize" value="104857600"></property>
				</bean>
				
				bug解决 ： id="multipartResolver"  框架对这个multipartResolver实现了引用
				上传bug： 注意一下文件大小
	 -->
</body>
</html>