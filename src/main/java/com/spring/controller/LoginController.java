package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/process")
public class LoginController {
	// 127.0.0.1:8085/spring-mvc/login
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
//	@RequestMapping("/loginprecess")
//	public String loginprecess(HttpServletRequest request, Model model) {
//		String username = request.getParameter("username").toUpperCase();
//		String password = request.getParameter("password");
//		model.addAttribute("Username", username);
//		model.addAttribute("Password", password);
//		return "home";
//	}
	
	@RequestMapping("/loginprecess")
	public String loginprecess(@RequestParam("username")String username, @RequestParam("password") String password, Model model) {
		
		model.addAttribute("Username", username);
		model.addAttribute("Password", password);
		return "home";
	}

}
