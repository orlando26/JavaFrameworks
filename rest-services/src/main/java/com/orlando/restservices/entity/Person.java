package com.orlando.restservices.entity;

/*
 * POJO (Plain Old Java Object)
 */
public class Person {
	
	private String name;
	
	private String lastname;
	
	private String email;
	
	private Integer age;
	 

	public Person(String name, String lastname, String email, Integer age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	
	

	

	
	
	
	
	

}
