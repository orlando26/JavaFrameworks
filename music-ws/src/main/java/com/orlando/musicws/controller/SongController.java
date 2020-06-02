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
@Api(description = "API Info for song service", tags = "Song API Controller")
public class SongController {
	//Jsp, JSF(Java server faces - xhtml), ionic(html, js), react(html, js)
	//Java Swing, Java FX, windows forms
	@Autowired
	private SongService songService;
	
	@GetMapping
	@CrossOrigin
	@ApiOperation(value = "Retrieves all songs in database")
	public List<Song> findByAll(){
		return songService.findAll();
	}
	
	@PostMapping
	@CrossOrigin
	@ApiOperation(value = "Creates an album in database")
	public StandardResponse<Song> save(@RequestBody Song song){
		return songService.save(song);
	}
	
	@GetMapping("/albumId/{albumId}")
	@CrossOrigin
	@ApiOperation(value = "Retrieves all songs by a given album id")
	public List<Song> findSongsByAlbumId(@PathVariable(name = "albumId") Integer albumId){
		return songService.findAllByAlbumId(albumId);
	}
	
	@GetMapping("/songId/{id}")
	@CrossOrigin
	@ApiOperation(value = "Retrieves a song by a given id")
	public Song findById(@PathVariable(name = "id") Integer id) {
		return songService.findById(id);
	}
	
	@DeleteMapping("/songId/{id}")
	@CrossOrigin
	@ApiOperation(value = "deletes a song by a given id")
	public StandardResponse<Song> deleteById(@PathVariable(name = "id") Integer id){
		return songService.deleteById(id);
	}
	
	@PutMapping
	@CrossOrigin
	@ApiOperation(value = "Updates an existing song in database")
	public StandardResponse<Song> update(@RequestBody Song song){
		return songService.update(song);
	}
	
	
	
}
