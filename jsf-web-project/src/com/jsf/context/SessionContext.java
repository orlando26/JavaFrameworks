package com.jsf.context;

import java.io.Serializable;

import javax.annotation.ManagedBean;

import com.jsf.bean.Main;

@ManagedBean
public class SessionContext implements Serializable{

	/**
	 * 	SessionContext Bean
	 */
	private static final long serialVersionUID = 1L;

	private Main main;

	public Main getMain() {
		if (main == null){
			main = new Main();
		}
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
		
}
