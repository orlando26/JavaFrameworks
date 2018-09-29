package com.orlando.ws;

import javax.jws.WebService;

import com.orlando.loginDao.model.Person;

@WebService
public interface CreatePersonService {
	
	public String createPerson(Person person);
	
}
