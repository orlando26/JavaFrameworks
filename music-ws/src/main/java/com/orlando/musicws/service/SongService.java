package com.orlando.musicws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.entity.Song;
import com.orlando.musicws.repository.AlbumRepository;
import com.orlando.musicws.repository.SongRepository;
import com.orlando.musicws.util.CommonConstants;
import com.orlando.musicws.util.StandardResponse;

@Service
public class SongService {
	// JUnit
	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private AlbumService albumService;
	
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
	
	public List<Song> findAllByAlbumId(Integer albumId){
		return songRepository.findByAlbumIdOrderByTime(albumId);
	}
	
	public Song findById(Integer id) {
		// Optional java 8
		return songRepository.findById(id).orElse(null);
	}
	
	public StandardResponse<Song> deleteById(Integer id){
		StandardResponse<Song> response = new StandardResponse<>();
		
		try {
			Song.checkObjectIsNotNull(findById(id));
			
			response.setEntity(findById(id));
			songRepository.deleteById(id);
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Song with id " + id + " deleted!");
		} catch (Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
	public StandardResponse<Song> update(Song song){
		StandardResponse<Song> response = new StandardResponse<>();
		
		try {
			song.checkEmpty();
			Song.checkObjectIsNotNull(findById(song.getId()));
			Album album = albumService.findById(song.getAlbumId());
			Album.checkObjectIsNotNull(album); 
			
			response.setEntity(songRepository.save(song));
			response.setStatus(CommonConstants.SUCCESS_MSG);
			response.setResponseText("Song " + song.getId() + " updated!");
		}catch(Exception e) {
			response.setEntity(null);
			response.setStatus(CommonConstants.ERROR_MSG);
			response.setResponseText(e.getMessage());
		}
		
		return response;
	}
	
	
	

	
	//	public Song findById(Integer id) {
//		return songRepository.getOne(id);
//	}
//	
//	public StandardResponse<Song> updateSong(Song song){
//		StandardResponse<Song> response = new StandardResponse<>();
//
//		try {
//			song.checkEmpty();
//			
//			songRepository.getOne(song.getId());
//			response.setEntity(songRepository.save(song));
//			response.setStatus("SUCCESS");
//			response.setResponseText("song with id " + song.getId() + " update!d");
//		}catch (Exception e) {
//			response.setEntity(song);
//			response.setStatus("ERROR");
//			response.setResponseText(e.getMessage());
//		}
//		return response;
//	}
//	
//	public StandardResponse<Song> deleteById(Integer id) {
//		StandardResponse<Song> response = new StandardResponse<>();
//		try {
//			response.setEntity(findById(id));
//			songRepository.deleteById(id);
//			response.setStatus("SUCCESS");
//			response.setResponseText("song with id: " + id + " deleted!" );
//		}catch(Exception e) {
//			response.setEntity(null);
//			response.setStatus("ERROR");
//			response.setResponseText(e.getMessage());
//		}
//		return response;
//	}
	
}