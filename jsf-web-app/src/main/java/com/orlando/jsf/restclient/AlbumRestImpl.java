package com.orlando.jsf.restclient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.orlando.jsf.model.Album;
import com.orlando.jsf.model.StandardResponse;

public class AlbumRestImpl implements AlbumRest {
	
	WebClient client; 
	public AlbumRestImpl() {
		List<Object> providers = new ArrayList<Object>();
		  providers.add(new JacksonJsonProvider());
		  
		  client = WebClient.create("http://localhost:8080/api/v1/album", providers).accept("application/json");
	}
	
	
	
	public List<Album> getAll(){
		List<Album> albums;
		try {
			albums = new ArrayList<>(client.getCollection(Album.class));
		} catch (Exception e) {
			albums = null;
		}
		return albums;
	}



	@Override
	public StandardResponse<Album> save(Album album) {
		Response res = client.type("application/json").post(album);
		StandardResponse<Album> response = res.readEntity(StandardResponse.class);
		return response;
	}



	@Override
	public StandardResponse<Album> delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public StandardResponse<Album> update(Album album) {
		// TODO Auto-generated method stub
		return null;
	}
}
