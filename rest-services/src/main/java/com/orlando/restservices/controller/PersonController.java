package com.orlando.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.restservices.entity.Person;

@RestController
@RequestMapping("/api/v1/person") // String API, Collection API,  API
public class PersonController {
	
	@GetMapping
	public Person getPerson(@RequestParam String name, @RequestParam String lastName,@RequestParam(required = false) String email) {
		Person person = new Person();
		person.setName(name);
		person.setLastName(lastName);
		person.setEmail(email);
		System.out.println(person);
		return person;
	}
	
}
