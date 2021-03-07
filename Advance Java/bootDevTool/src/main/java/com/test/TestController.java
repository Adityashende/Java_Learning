package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 56;
		int b=78;
		int c= 100;
		
		return "This is testing sum of a & b & c is "+(a+b+c);
	}
}
