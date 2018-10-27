package com.jsftemplate.bean;

import java.util.List;

import com.jsftemplate.utils.SHAHash;
import com.orlando.ws.City;
import com.orlando.ws.Person;
import com.orlando.ws.State;

public class Register extends Form{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9179514316230377659L;
	
	private String name; 
	
	private String lastName;
	
	private String email;
	
	private Integer age;
	
	private String address;
	
	private State state;
	
	private City city;
	 
	private String password;
	
	private String confirmPassword;
	
	private List<State> stateList;
	
	private List<City> cityList;
	
	public Register() {
		state = new State();
		state.setId(1);
	}
	
	public void register() {
		if(getWebService().getRetrievePersonservice().findByEmail(email) == null) {
			Person person = new Person();
			System.out.println(city);
			person.setName(name);
			person.setLastName(lastName);
			person.setAge(age);
			person.setAddress(address);
			person.setState(state.getName());
			person.setCity("Nuevo Leon");
			
			if(password.equals(confirmPassword)) {
				person.setPassword(SHAHash.hash(password));
			}else {
				System.out.println("passwords doesnt match!");
			}
			
			

			String response = getWebService().getCreatePersonService().createPerson(person);
			System.out.println(response);
		}else {
			System.out.println("email " + email + "already exist.");
			showMsg("email " + email + "already exist.");
		}
		
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
}
