package com.orlando.restservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.restservices.entity.Person;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
	
	@GetMapping("/mock")
	public Person getMockPerson() {
		return new Person("Orlando", "Loza", "orlando@a.com", 26);
	}
	
	@GetMapping
	public List<Person> getAllPersons(){
		List<Person> persons = new ArrayList<>();
		
		Person p1 = new Person("Orlando", "Loza", "orlando@a.com", 26);
		Person p2 = new Person("person1", "last name", "asd@a.com", 20);
		
		persons.add(p1);
		persons.add(p2);
		
		return persons;
	}
	
	@PostMapping
	public String savePerson(@RequestBody Person person) {
		System.out.println(person);
		return "success";
	}
	
}
