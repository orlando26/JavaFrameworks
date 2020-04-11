package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.repository.SongRepository;
import com.orlando.musicws.util.StandardResponse;

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
		return null;
	}
	
	/**
	 * saves in db the song object given in resquest body
	 * 
	 * @param Song: song entity
	 * @return StandardResponse<Song>
	 */
	public StandardResponse<Song> save(Song song){
		return null;
	}
	
	/**
	 * updates in db the song object given in resquest body
	 * 
	 * @param Song: song entity
	 * @return StandardResponse<Song>
	 */
	public StandardResponse<Song> updateSong(Song song){
		return null;
	}
	
	/**
	 * returns song object by given id
	 * 
	 * @param id: Integer
	 * @return Song
	 */
	public Song findById(Integer id) {
		return null;
	}
	
	/**
	 * deletes song object by given id
	 * 
	 * @param id: Integer
	 * @return StandardResponse<Song>
	 */
	public StandardResponse<Song> deleteById(Integer id) {
		return null;
	}
	
}
