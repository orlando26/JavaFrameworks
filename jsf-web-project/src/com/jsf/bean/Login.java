package com.jsf.bean;



public class Login extends Form{

	/**
	 * Login bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String password;
	
	
	/* Methods */
	public void login(){
		System.out.println("Username: " + username + "\nPassword: " + password);
	}
	
	public void regPage(){
		redirect("/pages/register.xhtml");
	}
	
	/* Getters & Setters */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
