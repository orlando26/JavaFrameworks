package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.repository.AlbumRepository;
import com.orlando.musicws.util.CommonConstants;
import com.orlando.musicws.util.StandardResponse;
import com.orlando.musicws.util.Validations;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	
	public List<Album> findAll(){
		return albumRepository.findAll();
	}
	
	public StandardResponse<Album> save(Album album) {
		StandardResponse<Album> response = new StandardResponse<>();
		try {
			album.checkEmpty();
			Double.parseDouble(album.getPrice()); // NumberFormatException
			Album albumCheck = albumRepository.findByTitle(album.getTitle());
			Validations.checkUniqueAlbumTitle(albumCheck);
			
			
			response.setEntity(albumRepository.save(album));
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Album " + album.getTitle() + " saved!");
		}catch(NumberFormatException e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText("Price should be a number!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
	public Album findById(Integer id) {
		 //return albumRepository.getOne(id);// - getOne arroja una excepcion si no encuentra el objeto en la bd 
		 return albumRepository.findById(id).orElse(null); // regresa null s no encuentra el objeto
	}
	
	public StandardResponse<Album> deleteById(Integer id){
		StandardResponse<Album> response = new StandardResponse<>();
		
		try {
			response.setEntity(findById(id));
			albumRepository.deleteById(id);
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Album with id " + id + " deleted!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
	public StandardResponse<Album> update(Album album){
		StandardResponse<Album> response = new StandardResponse<>();
		
		try {
			album.checkEmpty();
			Double.parseDouble(album.getPrice());
			albumRepository.getOne(album.getId()); 
			
			response.setEntity(albumRepository.save(album));
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Album with id " + album.getId() + " updated!");
		}catch(NumberFormatException e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText("Price should be a number!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
}
