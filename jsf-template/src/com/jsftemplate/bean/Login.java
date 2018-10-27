package com.jsftemplate.bean;

import org.apache.catalina.manager.util.SessionUtils;

import com.jsftemplate.utils.SHAHash;
import com.jsftemplate.utils.SesionUtils;
import com.orlando.ws.Person;

public class Login extends Form{

	/**
	 *  Login Bean
	 */
	private static final long serialVersionUID = 412225508566876207L;
	
	
	private String email;
	
	private String password;
	
	
	/*
	 * Methods
	 */
	public void login() {
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		Person person = getWebService().getRetrievePersonservice().findByEmail(email);
		if(person != null) {
			if(person.getPassword().equals(password)) {
				System.out.println("logged in!");
				SesionUtils.setUserLogged(person);
				redirect("/pages/home.xhtml");
			}else {
				System.out.println("incorrect password!");
			}
		}else {
			System.out.println("user doesnt exist!");
		}
		
		
	}
	
	public void regPage() {
		redirect("/pages/register.xhtml");
	}
	
	

	/*
	 * Getters & Setters
	 */

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

}
