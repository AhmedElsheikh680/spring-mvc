package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main-page";
	}
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/loginprecess")
	public String loginprecess() {
		return "home";
	}

}
