package com.jwtauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping("/welcome")
	public String Welcome() {
		String text="This is private page";
		text+="This page is not allowed to unauthorised users";
		return text;
	}
}
