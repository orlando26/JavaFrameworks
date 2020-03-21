package com.orlando.restServices.services;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.exceptions.EmptyValueException;
import com.orlando.restServices.repository.AlbumRepository;
import com.orlando.restServices.repository.SongRepository;
import com.orlando.restServices.util.UtilConstants;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	public StandardResponse<Album> createAlbum(Album album) {
		System.out.println(album);
		album.setReleaseDate(album.getReleaseDate().substring(0, 4));
		StandardResponse<Album> response = new StandardResponse<Album>();
		
		try {
			Double.parseDouble(album.getPrice());
			if(album.checkEmpty()) throw new EmptyValueException("All fields are required");
			
			response.setEntity(albumRepository.save(album)); 
			response.setStatus("SUCCESS");
			response.setResponseText("album saved!");
		}catch(EmptyValueException e) {
			response.setEntity(album);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}

		catch(NumberFormatException e) {
			response.setEntity(null);
			response.setStatus("ERROR");
			response.setResponseText("double");
		}
		catch(Exception e) {
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
			if(!songRepository.findByAlbumId(id).isEmpty()) throw new SQLIntegrityConstraintViolationException();
			albumRepository.deleteById(id);
			response.setStatus(UtilConstants.SUCCESS_MSG);
			response.setResponseText("album with id:  " + id + " deleted!" );
		}catch (SQLIntegrityConstraintViolationException e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText("Album with id " + id + " has songs saved!");
		}catch (Exception e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
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
