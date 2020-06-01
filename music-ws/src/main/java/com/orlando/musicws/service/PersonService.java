package com.orlando.musicws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.AuthenticationBean;
import com.orlando.musicws.entity.Person;
import com.orlando.musicws.exceptions.AuthenticationException;
import com.orlando.musicws.repository.PersonRepository;
import com.orlando.musicws.util.CommonConstants;
import com.orlando.musicws.util.StandardResponse;
import com.orlando.musicws.util.Validations;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public StandardResponse<Person> save (Person person){
		StandardResponse<Person> response = new StandardResponse<>();
		try {
			person.checkEmpty();
			Validations.checkEmail(personRepository.findByEmail(person.getEmail()));
			String passwordHash = Validations.hash(person.getPassword());
			person.setPassword(passwordHash);
			
			response.setEntity(personRepository.save(person));
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Person " + person.getName() + " saved!");
		} catch (Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
	public StandardResponse<Person> auntheticate(AuthenticationBean auth){
		StandardResponse<Person> response = new StandardResponse<>();
		try {
			auth.checkEmpty();
			
			Person person = personRepository.findByEmail(auth.getEmail());
			if (person != null) {
				if(person.getPassword().equals(Validations.hash(auth.getPassword()))) {
					response.setEntity(person);
					response.setStatus(CommonConstants.SUCCESS_MSG);
					response.setResponseText("login");
				} else {
					throw new AuthenticationException();
				}
			} else {
				throw new AuthenticationException();
			}
			
		} catch (Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}

}
