package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.repository.AlbumRepository;
import com.orlando.musicws.util.StandardResponse;
import com.orlando.musicws.util.UtilConstants;

@Service//Swagger
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;//Dependancy Injction
	
	
	public StandardResponse<Album> save(Album album) {
		StandardResponse<Album> response = new StandardResponse<>();
		try {
			album.checkEmpty();
			album.checkPrice();
			
			response.setEntity(albumRepository.save(album)); 
			response.setStatus(UtilConstants.SUCCESS_MSG);
			response.setResponseText("album saved!");
		}catch (Exception e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
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
	
	//JPA(Java Persistance API) - Hibernate - Spring jpa
	public StandardResponse<Album> deleteById(Integer id){
		StandardResponse<Album> response = new StandardResponse<>();
		Album album = new Album();
		
		try {
			album = findById(id);
			response.setEntity(album);
			albumRepository.deleteById(id);
			response.setStatus(UtilConstants.SUCCESS_MSG);
			response.setResponseText("Album with id " + id + "deleted!" );
		}catch(DataIntegrityViolationException  e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText("Album " + album.getTitle() + " has songs saved!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
	public StandardResponse<Album> updateAlbum(Album album){
		StandardResponse<Album> response = new StandardResponse<Album>();
		
		try {
			album.checkPrice();
			album.checkEmpty();
			
			albumRepository.getOne(album.getId());
			response.setEntity(albumRepository.save(album));
			response.setStatus(UtilConstants.SUCCESS_MSG);
			response.setResponseText("Album with id " + album.getId() + " updated!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
}
