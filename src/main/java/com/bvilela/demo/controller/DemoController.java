package com.bvilela.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/method-1")
	public String method1() {
		return "Greetings from Spring Boot! - 1";
	}
	
	@GetMapping("/method-2")
	public String method2() {
		return "Greetings from Spring Boot! - 2";
	}
	
	@GetMapping("/version")
	public String version() {
		return "0.0.1";
	}
	
}
