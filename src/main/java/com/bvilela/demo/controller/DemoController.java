package com.bvilela.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bvilela.demo.entity.Test1;
import com.bvilela.demo.service.Test1Service;

@RestController
public class DemoController {
	
	private Test1Service service;
	
	@Autowired
	public DemoController(Test1Service service) {
		this.service = service;
	}

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
	
	@GetMapping("/all-itens-test1")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Test1> getAllItensTest1() {
		return service.getAllItens();
	}
	
}
