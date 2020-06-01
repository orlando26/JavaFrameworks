package com.orlando.jsf.bean;

import java.util.Set;

import com.orlando.jsf.model.Album;
import com.orlando.jsf.restclient.AlbumRest;

public class MainBean extends Form{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void print() {
		System.out.println("Print");
		AlbumRest albumApi = new AlbumRest();
		Set<Album> albums = albumApi.getAll();
		albums.forEach(System.out::println);
	}

}
