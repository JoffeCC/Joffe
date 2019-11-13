package com.woniu.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.woniu.entity.User;

//@ResponseBody   响应体  依赖 jackson的jar
//@Controller
@RestController   // @RestController  = @ResponseBody +  @Controller  整个类中的方法返回的类型都非页面的
@RequestMapping("/ajax2")
public class AjaxController2 {
	
	@RequestMapping("/test2")  // 采用SpringMVC处理方式来返回非页面的数据
	public String demo1(String uname, String password) {
		System.out.println(uname + ":" +  password);
		return "ok";
	}
	
	@RequestMapping("/test4")  // 采用SpringMVC处理方式来返回非页面的数据
	public Object demo1(User user) {
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/test5")  // 采用SpringMVC处理方式来返回非页面的数据
	public Object demo1() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new User(1L,"admin","123"));
		list.add(new User(2L,"jack","666"));
		list.add(new User(3L,"mark","888"));
		return list;
	}
	
	@RequestMapping("/find")
	public String demo2(@RequestBody String str) {
		// str 是一个json字符串，恢复成java对象
		User user = JSON.parseObject(str, User.class);
		System.out.println(user);
		return "ok";
	}
	
	@ResponseBody   // 响应体 ： 响应正文【真实内容】
	@RequestMapping("/find2")
	public User demo3(@RequestBody User user) {
		// str 是一个json字符串，恢复成java对象
		System.out.println(user);
		return user;
	}
	
	// @RequestBody 获取的是请求体中的参数： json格式的字符串
	// User user是如何自动封装的： 通过jackson来实现封装的
	
	
	@RequestMapping("/find3")
	public String demo4() {
		// str 是一个json字符串，恢复成java对象
		System.out.println("find3进来了");
		return "Hello World";
	}
}








