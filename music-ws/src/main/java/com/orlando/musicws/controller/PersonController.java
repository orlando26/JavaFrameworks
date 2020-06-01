package com.orlando.musicws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.musicws.entity.AuthenticationBean;
import com.orlando.musicws.entity.Person;
import com.orlando.musicws.service.PersonService;
import com.orlando.musicws.util.StandardResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/person")
@Api(description = "API Info for person service", tags = "Person API Controller")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping
	@CrossOrigin
	@ApiOperation(value = "Saves a person in db")
	public StandardResponse<Person> save(@RequestBody Person person){
		return personService.save(person);
	}
	
	@PostMapping("/authenticate")
	@CrossOrigin
	public StandardResponse<Person> authenticate(@RequestBody AuthenticationBean auth){
		return personService.auntheticate(auth);
	}
	
}
