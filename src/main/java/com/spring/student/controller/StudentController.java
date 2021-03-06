package com.spring.student.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
	// 127.0.0.1:8085/spring-mvc/student/account
//	@RequestMapping("/account")
//	public String account() {
//		return "students/account";
//	}
	@RequestMapping("/account")
	public String account(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "students/account";
	}
//	@RequestMapping("/studentprocess")
//	public String studentprocess(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName, @RequestParam("age")String age, Model model) {
//		Student student = new Student();
//		student.setfName(firstName);
//		student.setlName(lastName);
//		student.setAge(age);
//		model.addAttribute("myStudent", student);
//		return "students/show";
//	}
	@RequestMapping("/studentprocess")
	public String studentprocess(@Valid @ModelAttribute("student")Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "students/account";
		} else {
			return "students/show";
		}
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
