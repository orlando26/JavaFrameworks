package com.jsf.bean;

import com.jaxws.ws.User;

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

	private String state;

	private String city;
	
	private User user;
	
	public Update(){
		//user = getServices().getRetrieveUserService()
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
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


}
