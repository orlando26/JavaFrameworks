package com.jsf.bean;

import java.util.List;

import com.jaxws.ws.City;
import com.jaxws.ws.State;
import com.jaxws.ws.User;
import com.jsf.utils.SessionUtil;

public class Update extends Form{

	/**
	 * Update bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	private String lastName;

	private String email;

	private Integer age;

	private String address;

	private State state;

	private String city;
	
	private List<State> states;
	
	private List<City> cities;
	
	private User user;
	
	public Update(){
		user = getServices().getRetrieveUserService().getUserById(SessionUtil.getUserId());
		state = new State();
		state.setId(1);
	}

	public String getName() {
		return user.getName();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return user.getLastName();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return user.getEmail();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return user.getAge();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return user.getAddress();
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public List<State> getStates() {
		states = getServices().getRetrieveStateService().getAll();
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}


	public List<City> getCities() {
		cities = getServices().getRetrieveCitiesService().getAllByState(getState().getId());
		return cities;
	}


	public void setCities(List<City> cities) {
		this.cities = cities;
	}


}
