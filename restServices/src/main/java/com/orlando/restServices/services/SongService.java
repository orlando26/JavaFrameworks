package com.orlando.restServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.entity.Song;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.repository.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private SongRepository songRepository;
	
	
	public List<Song> findAll(){
		return songRepository.findAll();
	}
	
	public StandardResponse<Song> create(Song song){
		StandardResponse<Song> response = new StandardResponse<>();
		try {
			response.setEntity(songRepository.save(song));
			response.setStatus("SUCCESS");
			response.setResponseText("song saved!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
	public List<Song> findByAlbumId(Integer albumId){
		return songRepository.findByAlbumId(albumId);
	}
	
}
