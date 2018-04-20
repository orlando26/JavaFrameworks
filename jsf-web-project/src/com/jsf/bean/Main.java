package com.jsf.bean;

public class Main {
	
	private String username;
	
	private String password;
	
	public void login(){
		System.out.println("Username: " + username + "\nPassword: " + password);
	}
	
	public void test(){
		System.out.println("Test :D!");
	}



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
