package com.jsftemplate.bean;

import java.util.List;

import com.jsftemplate.utils.SHAHash;
import com.jsftemplate.utils.SesionUtils;
import com.orlando.ws.City;
import com.orlando.ws.Person;
import com.orlando.ws.State;

public class Update extends Form{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person person;

	private String name; 

	private String lastName;

	private String email;

	private Integer age;

	private String address;

	private State state;

	private City personCity;

	private String password;

	private String confirmPassword;

	private List<State> stateList;

	private List<City> cityList;
	
	public Update() {
		person = SesionUtils.getUserToUpdate();
		
		name = person.getName();
		lastName = person.getLastName();
		email = person.getEmail();
		age = person.getAge();
		address = person.getAddress();
		
		state = new State();
		state.setId(1);
	}
	
	
	public void update() {
		person.setName(name);
		person.setLastName(lastName);
		person.setAge(age);
		person.setAddress(address);
		person.setState(state.getName());
		person.setCity(personCity.getName());
		if(password.equals(confirmPassword)) {
			person.setPassword(SHAHash.hash(password));
		}
		getWebService().getUpdatePersonService().updatePerson(person);
		redirect("/pages/home.xhtml");
	}
	
	public void cancel() {
		redirect("/pages/home.xhtml");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public List<State> getStateList() {
		stateList = getWebService().getRetrieveStatesService().getAllStates();
		return stateList;
	}


	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}


	public List<City> getCityList() {
		cityList = getWebService().getRetrieveCitiesService().findAllByState(state.getId());
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	public City getPersonCity() {
		return personCity;
	}


	public void setPersonCity(City personCity) {
		this.personCity = personCity;
	}



}
