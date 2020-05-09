package com.orlando.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations") //endpoint padre
public class OperationsController {
	
	//localhost:8080/operations/sum/num1/5/num2/10
	//   /user/findById/6 
	// String num1 = 5
	@GetMapping("/sum/num1/{num1}/num2/{num2}")
	public String sum(@PathVariable(name = "num1") Integer num1,@PathVariable(name = "num2") Integer num2) { // Wrapper classes(int Integer - double Double - char Character)
		return "Sum = " + (num1 + num2);
	}
	
	@GetMapping("/subtract/num1/{num1}/num2/{num2}")
	public String operationSubtract(@PathVariable(name = "num1") Integer num1,@PathVariable(name = "num2") Integer num2) { // Wrapper classes(int Integer - double Double - char Character)
		return "subtract = " + (num1 - num2);
	}
	
	@GetMapping("/divide/num1/{num1}/num2/{num2}")
	public String divide(@PathVariable(name = "num1") Integer num1,@PathVariable(name = "num2") Integer num2) { // Wrapper classes(int Integer - double Double - char Character)
		return "divide = " + (num1 / num2);
	}
	
	@GetMapping("/multiply/num1/{num1}/num2/{num2}")
	public String multiplY(@PathVariable(name = "num1") Integer num1,@PathVariable(name = "num2") Integer num2) { // Wrapper classes(int Integer - double Double - char Character)
		return "multiply = " + (num1 * num2);
	}
	
}
