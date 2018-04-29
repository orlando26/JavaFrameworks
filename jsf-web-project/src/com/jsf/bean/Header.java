package com.jsf.bean;

import com.jsf.utils.SessionUtil;

public class Header extends Form{

	/**
	 * Header bean
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean sess;
	
	
	public void logout(){
		System.out.println("Log out!");
		SessionUtil.getSession().invalidate();
		redirect("/index.xhtml");
	}


	public boolean getSess() {
		return SessionUtil.isValid();
	}


	public void setSess(boolean sess) {
		this.sess = sess;
	}
	
	

}
