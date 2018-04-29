package com.jsf.bean;

import com.jaxws.ws.User;
import com.jsf.utils.SHAHash;
import com.jsf.utils.SessionUtil;

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
		User user = getServices().getRetrieveUserService().getUserByEmail(username);
		if(user != null){
			if(user.getPassword().equals(SHAHash.hash(password))){
				System.out.println("User logged!");
				SessionUtil.setUserLogged(user);
				redirect("/pages/home.xhtml");
			}
		}
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
