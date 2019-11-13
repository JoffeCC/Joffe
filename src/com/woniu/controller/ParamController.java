package com.woniu.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.TestBean;
import com.woniu.entity.User;

@Controller
@RequestMapping("/param")
public class ParamController {

	// 1. 普通参数接收 (约定优于编程： 让键值与方法形参名绑定)
	@RequestMapping("/common")
	public String demo1(String uname, Character gender, Integer age) {
		// HTTP Status 400 – 错误的请求 : 参数类型未绑定 参数类型转换错误
		System.out.println("uname=" + uname);
		System.out.println("gender=" + gender);
		System.out.println("age=" + age);
		return "success";
	}

	@RequestMapping("/date")
	public String demo2(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date time) {
		System.out.println(time);
		return "success";
	}

	// 对象封装
	@RequestMapping("/object")
	public String demo3(User user) { // 创建user对象，对每个属性先校验类型再校验格式，最终通过setX注入值
		System.out.println(user);
		return "success";
	}

	// 对象封装
	@RequestMapping("/objects")
	public String demo4(TestBean tBean) {
		System.out.println(tBean);
		return "success";
	}

}
