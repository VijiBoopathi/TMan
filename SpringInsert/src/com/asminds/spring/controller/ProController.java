package com.asminds.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asminds.spring.daoimpl.StudentDaoImpl;
import com.asminds.spring.model.LoginPojo;
import com.asminds.spring.model.StudentPojo;

@Controller
public class ProController {
	@RequestMapping("/")
	public String A() {
		System.out.println("I'm in index page");
		return "index";
	}
	@RequestMapping("/Validation")
	public String B(@ModelAttribute ("q") LoginPojo lp) {
		String user=lp.getUsername();
		String pass=lp.getPassword();
		if(user.equals("Admin")==pass.equals("124")) {
		System.out.println("I'm in validation");
		return "student";	
	}
		else {
		return "error";
		}
	}
	@RequestMapping("/Registration")
	public String C() {
		return "register";
	}
	
	@RequestMapping("/RegistrationSave")
	public String D(@ModelAttribute ("w") StudentPojo sp) {
		StudentDaoImpl a=new StudentDaoImpl();
		a.save(sp);
		System.out.println("Saving Process");
		return "regsav";
		
	}
	


}

