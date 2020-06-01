package com.orlando.jsf.bean;

import java.util.Set;

import com.orlando.jsf.model.Album;
import com.orlando.jsf.restclient.AlbumRest;

public class MainBean extends Form{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Set<Album> albums;

	public void print() {
		System.out.println("Print");
		AlbumRest albumApi = new AlbumRest();
		Set<Album> albums = albumApi.getAll();
		albums.forEach(System.out::println);
	}

	public Set<Album> getAlbums() {
		AlbumRest albumApi = new AlbumRest();
		albums = albumApi.getAll();
		return albums;
	}

	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}
	
	

}
