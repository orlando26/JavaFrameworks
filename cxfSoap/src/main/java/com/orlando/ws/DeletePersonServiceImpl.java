package com.orlando.ws;

import com.orlando.loginDao.dao.PersonDAO;
import com.orlando.loginDao.daoImpl.PersonDAOImpl;
import com.orlando.loginDao.model.Person;

public class DeletePersonServiceImpl implements DeletePersonService{

	@Override
	public String deletePerson(int id) {
		PersonDAO personDao = new PersonDAOImpl();
		Person person = personDao.findById(id);
		System.out.println(person);
		personDao.deletePerson(person);
		return "Person deleted!";
	}

}
