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

@RestController
@RequestMapping("/api/v1/song")
public class SongController {
	
	@Autowired
	private SongService songService;
	
	@GetMapping
	public List<Song> findAll(){
		return songService.findAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	public Song findById(@PathVariable("id") Integer id) {
		return songService.findById(id);
	}
	 
	@DeleteMapping("/{id}")
	@CrossOrigin
	public StandardResponse<Song> deleteById(@PathVariable("id") Integer id){
		return songService.deleteById(id);
	}
	
	@PutMapping
	@CrossOrigin
	public StandardResponse<Song> update(@RequestBody Song song){
		return songService.updateSong(song);
	}
	
	@PostMapping
	@CrossOrigin
	public StandardResponse<Song> createSongs(@RequestBody Song song){
		return songService.save(song);
	}
	
	
}
