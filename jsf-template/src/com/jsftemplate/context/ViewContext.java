package com.jsftemplate.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jsftemplate.bean.Home;
import com.jsftemplate.bean.Login;
import com.jsftemplate.bean.Register;
import com.jsftemplate.bean.Update;

@ManagedBean
@ViewScoped
public class ViewContext implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Login login;
	
	private Register register;
	
	private Home home;
	
	private Update update;

	/**
	 * @return the login
	 */
	public Login getLogin() {
		
		if(login == null) {
			login = new Login();
		}
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/**
	 * @return the register
	 */
	public Register getRegister() {
		if (register == null) {
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

	public Home getHome() {
		if(home == null) {
			home = new Home();
		}
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public Update getUpdate() {
		if (update == null) {
			update = new Update();
		}
		return update;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}
	
	

}
