package com.orlando.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/name/{str}")
	public String helloWithParameters(@PathVariable(name = "str") String name) { //@PathVariable busca variable n el url
		return "Hello " + name;
	}
	
}
