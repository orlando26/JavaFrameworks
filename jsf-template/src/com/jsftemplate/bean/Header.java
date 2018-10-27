package com.jsftemplate.bean;

import com.jsftemplate.utils.SesionUtils;

public class Header extends Form{

	/**
	 * Header bean
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean session;
	
	public void logOut(){
		SesionUtils.getSession().invalidate();
		System.out.println("Logged out!");
		redirect("/index.xhtml");
	}

	public boolean getSession() {
		session = SesionUtils.isValid();
		return session;
	}

	public void setSession(boolean session) {
		this.session = session;
	}

}
