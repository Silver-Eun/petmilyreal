package com.petmily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/userform")
	public String userform() {
		return "/user/Userform" ;
	}
}
