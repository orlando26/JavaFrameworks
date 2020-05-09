package com.orlando.musicws.exceptions;

public class EmptyValueException extends Exception{

	private static final long serialVersionUID = 0L;
	
	public EmptyValueException() {
		super("All fields are required!");
	}

}
