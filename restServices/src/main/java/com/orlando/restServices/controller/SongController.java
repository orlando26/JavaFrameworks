package com.orlando.restServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.restServices.entity.Song;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.services.SongService;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {
	
	@Autowired
	private SongService songService;
	
	//POST: to create songs out of songService create method
	@PostMapping
	public StandardResponse<Song> createSongs(@RequestBody Song song){
		return songService.create(song);
	}
	
	@GetMapping("/album/{albumId}")
	public List<Song> findByAlbumId(@PathVariable("albumId") Integer albumId){
		return songService.findByAlbumId(albumId);
	}
	
	
}
