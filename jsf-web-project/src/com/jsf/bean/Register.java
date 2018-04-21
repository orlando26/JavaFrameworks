package com.jsf.bean;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.jaxws.ws.CreateUserService;
import com.jaxws.ws.CreateUserServiceImplServiceLocator;
import com.jaxws.ws.User;

public class Register extends Form{

	/**
	 * Register Bean
	 */
	private static final long serialVersionUID = -5945512854016826921L;
	
	private String name;

	private String lastName;

	private String email;

	private Integer age;

	private String address;

	private String state;

	private String city;

	private String password;
	
	public void register(){
		String data = "Name: " + name + 
						"\nLast Name: " + lastName +
						"\nEmail: " + email +
						"\nAge: " + age +
						"\nAddress: " + address +
						"\nState: " + state +
						"\nCity: " + city +
						"\nPassword: " + password;
		
		CreateUserServiceImplServiceLocator service = new CreateUserServiceImplServiceLocator();
		try {
			CreateUserService createUser = service.getCreateUserServiceImplPort();
			User user = new User();
			user.setName(name);
			user.setLastName(lastName);
			user.setAge(age);
			user.setCity(city);
			user.setAddress(address);
			user.setState(state);
			user.setEmail(email);
			createUser.insertUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(data);
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
