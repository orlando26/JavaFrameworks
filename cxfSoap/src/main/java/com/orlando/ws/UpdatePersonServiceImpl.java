package com.orlando.ws;

import com.orlando.loginDao.dao.PersonDAO;
import com.orlando.loginDao.daoImpl.PersonDAOImpl;
import com.orlando.loginDao.model.Person;

public class UpdatePersonServiceImpl implements UpdatePersonService{

	@Override
	public String updatePerson(Person person) {
		PersonDAO personDao = new PersonDAOImpl();
		personDao.updatePerson(person);
		return "Person updated!";
	}

}
