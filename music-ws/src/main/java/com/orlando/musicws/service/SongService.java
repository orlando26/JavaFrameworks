package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.repository.SongRepository;
import com.orlando.musicws.util.CommonConstants;
import com.orlando.musicws.util.StandardResponse;

@Service
public class SongService {
	// JUnit
	@Autowired
	private SongRepository songRepository;
	
	public List<Song> findAll(){
		return songRepository.findAll();
	}
	
	public StandardResponse<Song> save(Song song){
		StandardResponse<Song> response = new StandardResponse<>();
		
		try {
			song.checkEmpty();
			
			song = songRepository.save(song);
			response.setEntity(song);
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Song " + song.getTitle() + " saved!");
		}catch (Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
}