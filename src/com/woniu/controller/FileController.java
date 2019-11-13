package com.woniu.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.entity.JsonData;

@Controller
@RequestMapping("/file")
public class FileController {

	@ResponseBody
	@RequestMapping("/upload")
	public Object fileUpload(@RequestParam("myFile") MultipartFile file, String uname) throws IllegalStateException, IOException {
		//1. 获取上传文件的原名称
		String fileName = file.getOriginalFilename();  // a.txt
		// 辅助1 ： 获取文件后缀名
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		// 辅助2： 获取到不重复的文件名
		String newName = UUID.randomUUID().toString().replace("-", "");
		// 辅助3 ： 拼接新的文件名
		String path = "D:\\software\\upload\\"+newName + suffix;
		//2. 开始文件上传
		file.transferTo(new File(path)); // 分布式文件上传系统
		return new JsonData("文件上传成功", 200, uname+"上传到:"+path);
	}
}
