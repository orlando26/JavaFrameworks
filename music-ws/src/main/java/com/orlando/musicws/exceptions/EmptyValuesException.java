package com.orlando.musicws.exceptions;

public class EmptyValuesException extends Exception{
	
	public EmptyValuesException(String msg) {
		super(msg);
	}
	
	public EmptyValuesException() {
		super("Todos los campos son requeridos!");
	}
	
}
