package com.orlando.ws;

import java.util.List;

import javax.jws.WebService;

import com.orlando.loginDao.model.Person;

@WebService
public interface RetrievePersonService {
	
	public Person findById(int id);
	
	public Person findByEmail(String email);
	
	public List<Person> findAll();

}
