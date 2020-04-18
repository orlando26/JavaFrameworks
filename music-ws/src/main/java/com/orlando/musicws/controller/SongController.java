package com.orlando.musicws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.service.SongService;
import com.orlando.musicws.util.StandardResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/song")
@Api(tags = "Song API Controller", value = "songController", description = "API Info for Song Service")
public class SongController {
	
	@Autowired
	private SongService songService;
	
	@GetMapping
	public List<Song> findAll(){
		return songService.findAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	@ApiOperation(value = "Retrieves a Song by a given id.")
	public Song findById(@PathVariable("id") Integer id) {
		return songService.findById(id);
	}
	 
	@DeleteMapping("/{id}")
	@CrossOrigin
	@ApiOperation(value = "deletes a Song by a given id.")
	public StandardResponse<Song> deleteById(@PathVariable("id") Integer id){
		return songService.deleteById(id);
	}
	
	@PutMapping
	@CrossOrigin
	@ApiOperation(value = "Updates a Song by a given id.")
	public StandardResponse<Song> update(@RequestBody Song song){
		return songService.updateSong(song);
	}
	
	@PostMapping
	@CrossOrigin
	@ApiOperation(value = "Creates a Song in the database.")
	public StandardResponse<Song> createSongs(@RequestBody Song song){
		return songService.save(song);
	}
	
	@GetMapping("/album/{albumId}")
	@ApiOperation(value = "Retrieves all songs in database.")
	public List<Song> findByAlbumId(@PathVariable("albumId") Integer albumId){
		return songService.findAllByAlbumId(albumId);
	}
	
	
}
