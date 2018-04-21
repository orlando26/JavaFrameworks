package com.jsf.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jsf.bean.Home;
import com.jsf.bean.Login;
import com.jsf.bean.Register;

@ManagedBean
@ViewScoped
public class ViewContext implements Serializable{

	/**
	 * ViewContext bean
	 */
	private static final long serialVersionUID = 1L;

	private Login login; 
	
	private Register register;
	
	private Home home;

	public Login getLogin() {
		if (login == null){
			login = new Login();
		}
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	/**
	 * @return the register
	 */
	public Register getRegister() {
		if (register == null){
			register = new Register();
		}
		return register;
	}

	/**
	 * @param register the register to set
	 */
	public void setRegister(Register register) {
		this.register = register;
	}

	/**
	 * @return the home
	 */
	public Home getHome() {
		if (home == null){
			home = new Home();
		}
		return home;
	}

	/**
	 * @param home the home to set
	 */
	public void setHome(Home home) {
		this.home = home;
	}

	
	
}
