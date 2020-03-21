package com.orlando.restServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.entity.Song;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.exceptions.EmptyValueException;
import com.orlando.restServices.repository.SongRepository;
import com.orlando.restServices.util.UtilConstants;

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
			Double.parseDouble(song.getTime());
			if(song.checkEmpty()) throw new EmptyValueException("All fields are required");
			
			response.setEntity(songRepository.save(song));
			response.setStatus(UtilConstants.SUCCESS_MSG);
			response.setResponseText("song saved!");
		}catch(EmptyValueException e) {
			response.setEntity(song);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}catch(NumberFormatException e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText("Invalid time value!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		return response;
	}

	public List<Song> findByAlbumId(Integer albumId){
		return songRepository.findByAlbumId(albumId);
	}

	public Song findById(Integer id) {
		return songRepository.getOne(id);
	}

	public StandardResponse<Song> deleteById(Integer id){
		StandardResponse<Song> response = new StandardResponse<>();
		try {
			response.setEntity(findById(id));
			songRepository.deleteById(id);
			response.setStatus("SUCCESS");
			response.setResponseText("song with id: " + id + " deleted!" );
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}
		return response;
	}

	public StandardResponse<Song> update(Song song){
		StandardResponse<Song> response = new StandardResponse<>();

		try {
			songRepository.getOne(song.getId());
			response.setEntity(songRepository.save(song));
			response.setStatus("SUCCESS");
			response.setResponseText("song with id " + song.getId() + " update!d");
		}catch (Exception e) {
			response.setEntity(song);
			response.setStatus("ERROR");
			response.setResponseText(e.getMessage());
		}
		return response;
	}


}
