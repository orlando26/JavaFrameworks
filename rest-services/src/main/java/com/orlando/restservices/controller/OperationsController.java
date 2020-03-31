package com.orlando.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperationsController {
	
	@GetMapping("/sum/num1/{num1}/num2/{num2}")
	public String sum(@PathVariable(name = "num1")int a, @PathVariable(name = "num2") int b) {
		return "sum = " + (a+b);
	}
	
	@GetMapping("/subtract/num1/{num1}/num2/{num2}")
	public String subtract(@PathVariable(name = "num1")int a, @PathVariable(name = "num2") int b) {
		return "sum = " + (a-b);
	}
	
	@GetMapping("/divide")
	public String divide(@RequestParam int a, @RequestParam int b) {
		return "sum = " + (a/b);
	}
	
	@GetMapping("/multiply")
	public String multiply(@RequestParam(defaultValue = "10") int a, @RequestParam(defaultValue = "20") int b) {
		return "sum = " + (a*b);
	}
	
}
