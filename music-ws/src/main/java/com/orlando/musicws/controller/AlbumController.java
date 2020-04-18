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

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.service.AlbumService;
import com.orlando.musicws.util.StandardResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/album")
@Api(tags = "Album API Controller", value = "albumController", description = "API Info for Album Service")
public class AlbumController {
	//Swagger
	@Autowired
	private AlbumService albumService;
	
	@PostMapping
	@ApiOperation(value = "Creates an album in the database.")
	public StandardResponse<Album> save(@RequestBody Album album) {
		return albumService.save(album);
	}
	
	@GetMapping
	@CrossOrigin
	@ApiOperation(value = "Retrieves all albums in database.")
	public List<Album> findAll(){
		return albumService.findAll();
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Retrieves an album by a given id.")
	public Album findById(@PathVariable(name = "id") Integer id) {
		return albumService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deletes an album by a given id.")
	public StandardResponse<Album> deleteById(@PathVariable(name = "id")  Integer id){
		return albumService.deleteById(id);
	}
	
	@PutMapping
	@ApiOperation(value = "updates an album by a given id.")
	public StandardResponse<Album> updateAlbum(@RequestBody Album album){
		return albumService.updateAlbum(album);
	}

}
