package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.exceptions.EmptyValueException;
import com.orlando.musicws.repository.SongRepository;
import com.orlando.musicws.util.StandardResponse;
import com.orlando.musicws.util.UtilConstants;

@Service
public class SongService {
	
	@Autowired
	private SongRepository songRepository;
	
	/**
	 * returns list of every song in db
	 * 
	 * @return repository findAll
	 */
	public List<Song> findAll(){
		return songRepository.findAll();
	}
	
	/**
	 * saves in db the song object given in resquest body
	 * 
	 * @param Song: song entity
	 * @return StandardResponse<Song>
	 */
	public StandardResponse<Song> save(Song song){
		StandardResponse<Song> response = new StandardResponse<>();
		try {
			
			song.checkEmpty();
			
			Double.parseDouble(song.getTime());
			
			response.setEntity(songRepository.save(song));
			response.setStatus(UtilConstants.SUCCESS_MSG);
			response.setResponseText("song saved!");
		}catch(NumberFormatException e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText("Time should be a number!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(UtilConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		return response;
	}
	
	/**
	 * updates in db the song object given in resquest body
	 * 
	 * @param Song: song entity
	 * @return StandardResponse<Song>
	 */
	public StandardResponse<Song> updateSong(Song song){
		StandardResponse<Song> response = new StandardResponse<>();

		try {
			song.checkEmpty();
			
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
	
	/**
	 * returns song object by given id
	 * 
	 * @param id: Integer
	 * @return Song
	 */
	public Song findById(Integer id) {
		return songRepository.getOne(id);
	}
	
	/**
	 * deletes song object by given id
	 * 
	 * @param id: Integer
	 * @return StandardResponse<Song>
	 */
	public StandardResponse<Song> deleteById(Integer id) {
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
	
	public List<Song> findAllByAlbumId(Integer albumId){
		return songRepository.findByAlbumId(albumId);
	}
	
}
