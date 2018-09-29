package com.orlando.ws;

import com.orlando.loginDao.dao.PersonDAO;
import com.orlando.loginDao.daoImpl.PersonDAOImpl;
import com.orlando.loginDao.model.Person;

public class CreatePersonServiceImpl implements CreatePersonService{

	@Override
	public String createPerson(Person person) {
		PersonDAO personDao = new PersonDAOImpl();
		try{
			personDao.insert(person);
			return "Person saved correctly!";
		}catch (Exception e) {
			return e.getMessage();
		}
	}

}
