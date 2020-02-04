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

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.entity.StandardResponse;
import com.orlando.restServices.services.AlbumService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/album")
@Api(tags = "Album api controller", value = "albumController", description = "API info for album service")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@PostMapping
	@CrossOrigin
	@ApiOperation(value = "Creates an album in the database")
	public StandardResponse<Album> createAlbum(@RequestBody Album album) {
		return albumService.createAlbum(album);
	}
	
	@GetMapping
	@CrossOrigin
	@ApiOperation(value = "Retrieves all albums in database")
	public List<Album> findAll(){
		return albumService.findAll();
	}
	
	@GetMapping("/{albumId}")
	@CrossOrigin
	@ApiOperation(value = "Gets an album by its Id")
	public Album findById(@PathVariable("albumId") Integer id) {
		return albumService.findById(id);
	}
	
	@DeleteMapping("/{albumId}")
	@CrossOrigin
	@ApiOperation(value = "Deletes an album in db by its Id")
	public StandardResponse<Album> deleteById(@PathVariable("albumId") Integer id) {
		return albumService.deleteById(id);
	}
	
	@GetMapping("/count")
	@CrossOrigin
	@ApiOperation(value = "Retrieves the total of objects in albums table")
	public Long count() {
		return albumService.count();
	}
	
	@PutMapping
	@CrossOrigin
	@ApiOperation(value = "Updates an existing album with the given inforamtion")
	public StandardResponse<Album> updateAlbum(@RequestBody Album album){
		return albumService.updateAlbum(album);
	}
}
