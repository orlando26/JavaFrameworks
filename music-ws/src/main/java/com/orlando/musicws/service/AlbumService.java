package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.repository.AlbumRepository;
import com.orlando.musicws.util.StandardResponse;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;//Dependancy Injction
	
	
	public StandardResponse<Album> save(Album album) {
		StandardResponse<Album> response = new StandardResponse<>();
		try {
			response.setEntity(albumRepository.save(album));
			response.setStatus("SUCCESS");
			response.setResponseText("album saved!");
		}catch (Exception e) {
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
	
}
