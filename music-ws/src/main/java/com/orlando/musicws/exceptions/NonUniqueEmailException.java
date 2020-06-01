package com.orlando.musicws.exceptions;

public class NonUniqueEmailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 599727301776604932L;
	
	public NonUniqueEmailException() {
		super("Ya existe un usuario con ese correo!");
	}
	
}
