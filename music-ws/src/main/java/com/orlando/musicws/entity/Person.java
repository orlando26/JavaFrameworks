package com.orlando.musicws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.orlando.musicws.exceptions.EmptyValuesException;

@Entity(name = "Persons")
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	public void checkEmpty() throws EmptyValuesException{
		if ( this.name.equals("") 
				|| this.lastName.equals("") 
				|| this.email.equals("") 
				|| this.password.equals("") ) throw new EmptyValuesException();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + "]";
	}

}
