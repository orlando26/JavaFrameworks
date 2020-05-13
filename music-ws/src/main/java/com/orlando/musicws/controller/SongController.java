package com.orlando.musicws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.service.SongService;
import com.orlando.musicws.util.StandardResponse;

@RestController
@RequestMapping("/api/v1/song")
public class SongController {
	
	@Autowired
	private SongService songService;
	
	@GetMapping
	public List<Song> findByAll(){
		return songService.findAll();
	}
	
	@PostMapping
	public StandardResponse<Song> save(@RequestBody Song song){
		return songService.save(song);
	}
	
	
}
