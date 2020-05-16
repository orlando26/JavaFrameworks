package com.orlando.musicws.exceptions;

public class NotPersistedObjectException extends Exception {
	
	public NotPersistedObjectException() {
		super("Object doesnt exist in Database!");
	}

}
