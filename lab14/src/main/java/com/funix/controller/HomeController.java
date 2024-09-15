package com.funix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	 public String showHome() {
		 return "home";
	 }
	@GetMapping("/login-page")
	public String showLoginPage() {
		return "login-page";
	}
	@GetMapping("/leader")
	public String showLeaderPage() {
		return "leader";
	}
	@GetMapping("/system")
	public String showSystemPage() {
		return "systems";
	}
	@GetMapping("/access-denied")
	public String accessDenied() {
		return "access-denied";
	}
}
