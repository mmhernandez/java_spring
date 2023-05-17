package com.mmhernandez.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/omikuji";
	}

	@RequestMapping("/omikuji") 
	public String form() {
		return "index.jsp";
	}
	
	@PostMapping("/submit")
	public String formSubmit(@RequestParam(value="num") int num,
					 	 	@RequestParam(value="city") String city,
					 	 	@RequestParam(value="person") String person,
					 	 	@RequestParam(value="hobby") String hobby,
					 	 	@RequestParam(value="thing") String thing,
					 	 	@RequestParam(value="nice") String nice,
					 	 	HttpSession session
			) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show() {
		
		return "show.jsp";
	}
}
