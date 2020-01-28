package com.orlando.restServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.repository.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	public StandardResponse<Album> createAlbum(Album album) {
		StandardResponse<Album> response = new StandardResponse<Album>();
		try {
			response.setEntity(albumRepository.save(album));
			response.setStatus("SUCCESS");
			response.setResponseText("album saved!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
	public List<Album> findAll(){
		return albumRepository.findAll();
	}
	
	public Album findById(Integer id) {
		return albumRepository.getOne(id);
	}
	
	public StandardResponse<Album> deleteById(Integer id) {
		StandardResponse<Album> response = new StandardResponse<Album>();
		try {
			response.setEntity(findById(id));
			albumRepository.deleteById(id);
			response.setStatus("SUCCESS");
			response.setResponseText("album with id: " + id + " deleted!" );
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
	public Long count() {
		return albumRepository.count();
	}
	
	public StandardResponse<Album> updateAlbum(Album album){
		StandardResponse<Album> response = new StandardResponse<>();
		
		try {
			albumRepository.getOne(album.getId());
			response.setEntity(albumRepository.save(album));
			response.setStatus("SUCCESS");
			response.setResponseText("album with id " + album.getId() + " update!d");
		}catch (Exception e) {
			response.setEntity(album);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
}
