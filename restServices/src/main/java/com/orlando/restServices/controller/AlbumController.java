package com.orlando.restServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.services.AlbumService;

@RestController
@RequestMapping("/api/v1/album")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@PostMapping
	public StandardResponse<Album> createAlbum(@RequestBody Album album) {
		return albumService.createAlbum(album);
	}
	
	@GetMapping
	public List<Album> findAll(){
		return albumService.findAll();
	}
	
	@GetMapping("/{albumId}")
	public Album findById(@PathVariable("albumId") Integer id) {
		return albumService.findById(id);
	}
	
	@DeleteMapping("/{albumId}")
	public StandardResponse<Album> deleteById(@PathVariable("albumId") Integer id) {
		return albumService.deleteById(id);
	}
}
