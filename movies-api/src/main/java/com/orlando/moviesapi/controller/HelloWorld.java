package com.orlando.moviesapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorld {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/sum/{num1}/{num2}")
	public int sum(@PathVariable("num1") int a,@PathVariable("num2") int b) {
		return a + b;
	}
	
}
