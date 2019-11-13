package com.woniu.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.woniu.entity.User;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@RequestMapping("/test1")  // 基于传统的Servlet实现的 （也要会用）
	public void demo1(String uname, String password, HttpServletResponse resp) throws IOException {
		System.out.println(uname + ":" +  password);
		resp.getWriter().write("ok");
	}
	
	@ResponseBody
	@RequestMapping("/test2")  // 采用SpringMVC处理方式来返回非页面的数据
	public String demo1(String uname, String password) {
		System.out.println(uname + ":" +  password);
		return "ok";
	}
	
	// 使用传统的ServletAPI来处理json
	@RequestMapping("/test3")  // 采用SpringMVC处理方式来返回非页面的数据
	public void demo1(User user, HttpServletResponse resp) throws IOException {
		System.out.println(user);
		resp.getWriter().write(JSON.toJSONString(user));
	}
	
	@ResponseBody  // SpringMVC对于json的处理默认采用jackson来处理， 需要引入jackson的jar
	@RequestMapping("/test4")  // 采用SpringMVC处理方式来返回非页面的数据
	public Object demo1(User user) {
		System.out.println(user);
		return user;
	}
	
	@ResponseBody  // SpringMVC对于json的处理默认采用jackson来处理， 需要引入jackson的jar
	@RequestMapping("/test5")  // 采用SpringMVC处理方式来返回非页面的数据
	public Object demo1() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new User(1L,"admin","123"));
		list.add(new User(2L,"jack","666"));
		list.add(new User(3L,"mark","888"));
		return list;
	}
	
}








