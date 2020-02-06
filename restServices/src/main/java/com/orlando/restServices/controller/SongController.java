package com.orlando.restServices.controller;

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

import com.orlando.restServices.entity.Song;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.services.SongService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/songs")
@Api(tags = "Song api controller", value = "songController", description = "API info for song service")
public class SongController {
	
	@Autowired
	private SongService songService;
	
	@GetMapping
	@ApiOperation(value = "Retrieves all the songs in the database.")
	public List<Song> findAll(){
		return songService.findAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	@ApiOperation(value = "Gets a song by its Id.")
	public Song findById(@PathVariable("id") Integer id) {
		return songService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deletes a song by its id.")
	public StandardResponse<Song> deleteById(@PathVariable("id") Integer id){
		return songService.deleteById(id);
	}
	
	@PutMapping
	@ApiOperation(value = "Updates an existing song with the given info.")
	public StandardResponse<Song> update(@RequestBody Song song){
		return songService.update(song);
	}
	
	@PostMapping
	@CrossOrigin
	@ApiOperation(value = "Creates a song in the database.")
	public StandardResponse<Song> createSongs(@RequestBody Song song){
		return songService.create(song);
	}
	
	@GetMapping("/album/{albumId}")
	@CrossOrigin
	@ApiOperation(value = "Retrieves all songs from an album by the album id.")
	public List<Song> findByAlbumId(@PathVariable("albumId") Integer albumId){
		return songService.findByAlbumId(albumId);
	}
	
	
	
	
}
