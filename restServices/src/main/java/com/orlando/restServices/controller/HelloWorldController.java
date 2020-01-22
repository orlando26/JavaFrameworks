package com.orlando.restServices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/helloworld")
public class HelloWorldController {
	
	/**
	 * web methods:
	 * GET: retrieve data
	 * POST: send info and do logic
	 * PUT: update to an existing value in DB
	 * DELETE: delete data on DB
	 */
	
	@GetMapping
	public String helloworld() {
		return "Hello world!";
	}
	
	@GetMapping("/sum/{a}/{b}")
	public String sum(@PathVariable("a") Integer a,@PathVariable("b") Integer b) {
		return "The sum is " + (a + b);
	}
	
}
