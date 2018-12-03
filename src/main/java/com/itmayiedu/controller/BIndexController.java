package com.itmayiedu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@SpringBootApplication
@RestController
public class BIndexController {

	// 请求头方式
//	@RequestMapping("/getBInfo")
//	public Map<String, Object> getBInfo(HttpServletResponse response) {
//		// 告诉浏览器允许跨域访问，*表示所有的域名都允许的，在公司正常代码放在过滤器中
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		Map<String, Object> result = new HashMap<>();
//		System.out.println("这是B项目");
//		result.put("respCode", "200");
//		result.put("respMsg", "操作成功");
//		return result;
//	}
	
	// jsonp方式
//	@RequestMapping("/getBInfo")
//	public void getBInfo(HttpServletResponse response, String jsonpCallback) throws IOException {
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("respCode", "200");
//		jsonObject.put("respMsg", "操作成功");
//		PrintWriter printWriter = response.getWriter();
//		printWriter.write(jsonpCallback + "(" + jsonObject.toJSONString() + ")");
//		printWriter.close();
//	}
	
	// httpclient方式
	@RequestMapping("/getBInfo")
	public Map<String, Object> getBInfo(HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		System.out.println("这是B项目");
		result.put("respCode", "200");
		result.put("respMsg", "操作成功");
		return result;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BIndexController.class, args);
	}
	
}
