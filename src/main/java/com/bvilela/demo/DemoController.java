package com.bvilela.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/method1")
	public String method1() {
		return "Greetings from Spring Boot! - 1";
	}
	
	@GetMapping("/method2")
	public String method2() {
		return "Greetings from Spring Boot! - 2";
	}
	
}
