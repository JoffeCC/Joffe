package com.woniu.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  // 实现Spring的IOC   控制器
@RequestMapping("/test")
public class TestController {
	
	//可以采用原始的ServletAPI (一般不会再使用原始的API)
	@RequestMapping("/t1")
	public void  test(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String uname = req.getParameter("uname");
		System.out.println("成功访问服务器了,接收到uname:"+uname);
		req.setAttribute("msg", "你好呀，我是服务器");
		req.getRequestDispatcher("success.jsp").forward(req, resp); 
		// SpringMVC默认帮我们处理了响应乱码，但是请求乱码并没有处理（单独配置Filter）
//		String path = req.getContextPath();
//		resp.sendRedirect(path+"/success.jsp");
	}
	
	// 约定优于编程
	@RequestMapping("/t2")
	public String  test2(String uname, Map<String, Object> map) {
		System.out.println("服务器接收到了: uname="+uname);
		map.put("msg", "Hello SpringMVC");  // 默认存放在req.setAttribute("msg", val");
		return "success"; // 逻辑视图名（默认是以转发的形式返回响应的）
	}
	
	@RequestMapping("/t3")
	public String  test3(String uname, ModelMap map) {
		System.out.println("服务器接收到了: uname="+uname);
		map.put("msg", "Hello SpringMVC2");  // 默认存放在req.setAttribute("msg", val");
		return "success"; // 逻辑视图名（默认是以转发的形式返回响应的）
	}
	
	@RequestMapping("/t4")
	public ModelAndView  test4(String uname) {
		System.out.println("服务器接收到了: uname="+uname);
		ModelAndView model = new ModelAndView();
		model.setViewName("success"); // 设计逻辑视图名（默认调用视图解析器来解析成物理路径）
		model.addObject("msg", "Hello ModelAndView");
		return model; 
	}

	@RequestMapping("/t5")
	public String test5(String uname) {
		System.out.println("服务器接收到了: uname="+uname);
		return "forward:/index.jsp";   //转发
		// SpringMVC自定义转发 :  forward:/资源路径      /表示本工程下
	}
	
	@RequestMapping("/t6")
	public String test6(String uname) {
		System.out.println("服务器接收到了: uname="+uname);
		return "redirect:/index.jsp";   //重定向
	}
	
	/**
	 *  SpringMVC 返回值形式
	 *  	void : 响应自行解决
	 *  	String :  逻辑视图名 （调用视图解析器组装）
	 *      ModelAndView :  模型和逻辑视图名绑定在一起返回
	 * 		特定格式的String
	 * 			forward:/资源路径        转发
	 * 			redirect:/资源路径     重定向
	 * 	    	返回json？
	 * 
	 *  返回向request域中存放数据
	 *  	Map<String,Object>  map
	 *  	ModelMap  map
	 *  	ModelAndView  mv
	 *  
	 *  SpringMVC自动处理了响应乱码
	 */
	
}













