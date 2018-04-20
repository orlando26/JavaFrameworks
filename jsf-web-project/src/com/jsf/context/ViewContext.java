package com.jsf.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jsf.bean.Login;

@ManagedBean
@ViewScoped
public class ViewContext implements Serializable{

	/**
	 * ViewContext bean
	 */
	private static final long serialVersionUID = 1L;

	private Login login; 

	public Login getLogin() {
		if (login == null){
			login = new Login();
		}
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	
	
}
