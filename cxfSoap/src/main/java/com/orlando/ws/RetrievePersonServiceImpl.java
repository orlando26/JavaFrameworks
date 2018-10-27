package com.orlando.ws;

import java.util.List;

import javax.jws.WebService;

import com.orlando.loginDao.dao.PersonDAO;
import com.orlando.loginDao.daoImpl.PersonDAOImpl;
import com.orlando.loginDao.model.Person;

@WebService(endpointInterface = "com.orlando.ws.RetrievePersonService")
public class RetrievePersonServiceImpl implements RetrievePersonService{

	@Override
	public Person findById(int id) {
		PersonDAO personDAO = new PersonDAOImpl();
		return personDAO.findById(id);
	}

	@Override
	public Person findByEmail(String email) {
		PersonDAO personDAO = new PersonDAOImpl();
		Person person;
		try{
			person = personDAO.findByEmail(email);
		}catch(IndexOutOfBoundsException e) {
			person = null;
		}
		return person;
	}

	@Override
	public List<Person> findAll() {
		PersonDAO personDAO = new PersonDAOImpl();
		return personDAO.getAllPersons();
	}
	
	

}
