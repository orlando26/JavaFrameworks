package com.orlando.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	/*
	 * get variable from PathVariable ("/{variable}")
	 */
	@GetMapping("/personByName/{value}")
	public String helloWorld(@PathVariable(name = "value") String name) {
		return "Hello World " + name;
	}
	
	@GetMapping("/second")
	public String helloWorld2() {
		return "second Hello World!";
	}
	
	/*
	 * get variable from RequestParam 
	 */
	@GetMapping("/personInfo")
	public String getParameterValues(@RequestParam String name, @RequestParam String lastname) {
		return "Name: " + name + ", Lastname: " + lastname;
	}
	
	
}

/**
 * 
 * REST web service
 * 
 *  POST, GET, PUT, DELETE
 */  
