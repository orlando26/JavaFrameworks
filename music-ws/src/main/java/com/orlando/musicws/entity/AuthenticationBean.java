package com.orlando.musicws.entity;

import com.orlando.musicws.exceptions.EmptyValuesException;

public class AuthenticationBean {
	
	private String email;
	
	private String password;

	public String getEmail() {
		return email;
	}
	
	public void checkEmpty() throws EmptyValuesException{
		if (this.email.equals("") || this.password.equals("")) throw new EmptyValuesException(); 
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
	
	
	
	
}
