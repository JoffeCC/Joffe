package com.woniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestfulController {
	// query_list/admin/0/021
	//	http://localhost:8888/SpringMVC/query_list/admin/0/021
	@RequestMapping("/query_list/{uname}/{gender}/{city_no}")
	public String demo(@PathVariable String uname, @PathVariable Integer gender,@PathVariable("city_no")String cityNo) {
		System.out.println("用户名:"+uname);
		System.out.println("性别:"+gender);
		System.out.println("城市代号:"+cityNo);
		return "success";
	}
	
	@RequestMapping("/list/{city_no},{kw},{current_page}")
	public String findList(@PathVariable("city_no") String cityNo, 
			@PathVariable String kw, @PathVariable("current_page") Integer currentPage) {
		System.out.println("城市:"+cityNo);
		System.out.println("关键字："+kw);
		System.out.println("当前页码"+currentPage);
		return "success";
	}
	
	//  @RequestParam  接收请求参数的  required  false 表示此参数可有可无
	@RequestMapping("/login")
	public String testParam(@RequestParam(name="a") String uname, 
			@RequestParam(name="b")String password, @RequestParam(name="c", required=false) String code) {
		System.out.println("用户名:"+uname);
		System.out.println("密码:"+password);
		System.out.println("授权码:"+code);
		return "success";
	}
}












