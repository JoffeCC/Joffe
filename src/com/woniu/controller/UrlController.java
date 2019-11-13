package com.woniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @RequestMapping(path="/test", method=RequestMethod.GET)
 *  路由映射注解 
 *   位置 ： 类和方法上  path/value
 *   请求方式 ： method=RequestMethod.GET     method=RequestMethod.POST  当没有设置此属性时： 接收所有请求
 *	  参数限定 ：  params= {"city","!uname"}   此请求一定需要带city的参数,一定不能有uanme
 */
@Controller
@RequestMapping("/url")
public class UrlController {

	// 普通的路由
	@RequestMapping(path="/test", method=RequestMethod.GET)
	public String demo1() {
		System.out.println("服务器进入了");
		return "success";
	}
	
	// 参数限定
	@RequestMapping(path="/test_param", params= {"city","!uname"})
	public String demo2(String city) {
		System.out.println("服务器进入了 city："+city);
		return "success";
	}
	
//	User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0
	@RequestMapping(path="/test_param", headers= {"User-Agent"})  // 请求头中必须携带User-Agent参数
	public String demo3() {
		System.out.println("服务器进入了");
		return "success";
	}
	
	// Ant 风格     /user/*   /add*  /**/admin
	@RequestMapping("/user/*")
	public String demo4() {
		System.out.println("服务器进入了");
		return "success";
	}
	
	@RequestMapping("/add*")
	public String demo5() {
		System.out.println("服务器进入了");
		return "success";
	}
	
	//    /*/admin 表示在admin前只有一级目录
	@RequestMapping("/*/admin")
	public String demo6() {
		System.out.println("服务器进入了");
		return "success";
	}
	
	//    /**/admin 表示在admin前只有一级目录或多级目录
	@RequestMapping("/**/admin")
	public String demo7() {
		System.out.println("服务器进入了");
		return "success";
	}
	
}










