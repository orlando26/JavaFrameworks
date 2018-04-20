package com.jsf.bean;


public class Header extends Form{

	/**
	 * Header bean
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean sess;
	
	
	public void logout(){
		System.out.println("Log out!");
	}


	public boolean getSess() {
		return sess;
	}


	public void setSess(boolean sess) {
		this.sess = sess;
	}
	
	

}
