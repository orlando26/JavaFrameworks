package com.orlando.jsf.bean;

import java.util.List;
import java.util.Set;

import com.orlando.jsf.model.Album;
import com.orlando.jsf.restclient.AlbumRestImpl;

public class MainBean extends Form{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Album> albums;

	public void print() {
		System.out.println("Print");
		AlbumRestImpl albumApi = new AlbumRestImpl();
		List<Album> albums = albumApi.getAll();
		albums.forEach(System.out::println);
	}

	public List<Album> getAlbums() {
		AlbumRestImpl albumApi = new AlbumRestImpl();
		albums = albumApi.getAll();
		return albums;
	}

	public void redirectUpdate() {
		redirect("/pages/update-album");
	}
	
	

}
