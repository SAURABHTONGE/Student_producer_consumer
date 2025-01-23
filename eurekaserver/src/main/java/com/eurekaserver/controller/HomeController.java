package com.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/getadm")
	public String preLog() {
		return "Welcome to Addmission !!!!";
		
	}
}
