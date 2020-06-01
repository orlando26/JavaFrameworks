package com.orlando.musicws.exceptions;

public class NonUniqueAlbumException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2493577359684466345L;

	public NonUniqueAlbumException() {
		super("Ya existe un album con ese titulo! :(");
	}
	
}
