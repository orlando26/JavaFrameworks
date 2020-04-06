package com.orlando.musicws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.service.AlbumService;
import com.orlando.musicws.util.StandardResponse;

@RestController
@RequestMapping("/api/v1/album")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@PostMapping
	public StandardResponse<Album> save(@RequestBody Album album) {
		return albumService.save(album);
	}
	
	@GetMapping
	public List<Album> findAll(){
		return albumService.findAll();
	}
	
	@GetMapping("/{id}")
	public Album findById(@PathVariable(name = "id") Integer id) {
		return albumService.findById(id);
	}

}
