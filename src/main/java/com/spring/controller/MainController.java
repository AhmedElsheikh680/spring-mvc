package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main-page";
	}
	//http://127.0.0.1:8085/spring-mvc/profile
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/loginprecess")
	public String loginprecess(HttpServletRequest request, Model model) {
		String username = request.getParameter("username").toUpperCase();
		String password = request.getParameter("password");
		model.addAttribute("Username", username);
		model.addAttribute("Password", password);
		return "home";
	}

}
