package com.orlando.jsf.restclient;

import java.util.List;

import com.orlando.jsf.model.Album;
import com.orlando.jsf.model.StandardResponse;

public interface AlbumRest {
	
	public List<Album> getAll();
	
	public StandardResponse<Album> save(Album album);
	
	public StandardResponse<Album> delete(Integer id);
	
	public StandardResponse<Album> update(Album album);

}
