package com.orlando.jsf.restclient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.orlando.jsf.model.Album;

public class AlbumRest {
	
	WebClient client; 
	public AlbumRest() {
		List<Object> providers = new ArrayList<Object>();
		  providers.add(new JacksonJsonProvider());
		  
		  client = WebClient.create("http://localhost:8080/api/v1/album", providers);
		  
	}
	
	
	
	public Set<Album> getAll(){
		
		Set<Album> albums = new HashSet<>(client.accept("application/json").getCollection(Album.class));
		return albums;
	}
}
