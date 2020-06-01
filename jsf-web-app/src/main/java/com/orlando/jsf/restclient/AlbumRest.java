package com.orlando.jsf.restclient;

import java.util.HashSet;
import java.util.Set;

import org.apache.cxf.jaxrs.client.WebClient;

import com.orlando.jsf.model.Album;

public class AlbumRest {
	
	WebClient client = WebClient.create("http://localhost:8080/api/v1/album");
	
	
	public Set<Album> getAll(){
		Set<Album> albums = new HashSet<>(client.accept("application/json").getCollection(Album.class));
		return albums;
	}
}
