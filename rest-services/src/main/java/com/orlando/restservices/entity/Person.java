package com.orlando.restservices.entity;

//POJO (Plain Old Java Object)
public class Person {

	// Variables de instancia, Getters & Setters, toString(), equals, hash
	
	
	private String name;
	
	private String lastName;
	
	private String email;

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

	@Override
	public String toString() { // referencia en memoria x0daaf
		return "Person [name=" + name + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
}
