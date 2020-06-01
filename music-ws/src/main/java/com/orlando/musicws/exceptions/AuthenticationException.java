package com.orlando.musicws.exceptions;

public class AuthenticationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2925786576036217776L;
	
	public AuthenticationException() {
		super("Correo o contraseña incorrecta!");
	}

}
