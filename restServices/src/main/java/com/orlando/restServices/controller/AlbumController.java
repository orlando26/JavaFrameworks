package com.orlando.restServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.services.AlbumService;

@RestController
@RequestMapping("/api/v1/album")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@PostMapping
	public void createAlbum(@RequestBody Album album) {
		albumService.createAlbum(album);
	}
	
	@GetMapping
	public List<Album> findAll(){
		return albumService.findAll();
	}
	
}
