package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloWebController {
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}

	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message");
		return "message";
	}
}