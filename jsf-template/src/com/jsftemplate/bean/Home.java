package com.jsftemplate.bean;

import java.util.ArrayList;
import java.util.List;

import com.jsftemplate.utils.SesionUtils;
import com.orlando.ws.Person;

public class Home extends Form{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person person;
	
	private List<Person> persons = new ArrayList<Person>();
	
	public Home() {
		person = SesionUtils.getUser();
		
	}
	
	public void delete(int id) {
		System.out.println(id);
		getWebService().getDeletePersonService().deletePerson(id);
	}
	
	public void update(int id) {
		System.out.println(id);
		Person person = getWebService().getRetrievePersonservice().findById(id);
		SesionUtils.setUserToUpdate(person);
		redirect("/pages/update.xhtml");
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Person> getPersons() {
		persons = getWebService().getRetrievePersonservice().findAll();
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
	
	

}
