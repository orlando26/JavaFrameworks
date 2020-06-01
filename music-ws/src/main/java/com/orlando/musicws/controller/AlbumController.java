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
// spring security, jsf(web interfaces mvc)
@RestController
@RequestMapping("/api/v1/album")
@Api(description = "API Info for album service", tags = "Album API Controller")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@GetMapping
	@CrossOrigin // permite CORS policy(bloquear peticiones de servidores/puertos externos) 
	@ApiOperation(value = "Retrieves all albums in database")
	public List<Album> findAll(){
		return albumService.findAll();
	}
	// Gradle & maven
	@PostMapping  // - Request - Response
	@CrossOrigin
	@ApiOperation(value = "Creates an album in database")
	public StandardResponse<Album> save(@RequestBody Album album){ // @RequestBody para hacer map del json con el objeto en java
		return albumService.save(album);
	}
	
	@GetMapping("/id/{id}")
	@CrossOrigin
	@ApiOperation(value = "Retrieves an album by a given id")
	public Album findById(@PathVariable(name = "id") Integer id) {
		return albumService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	@CrossOrigin
	@ApiOperation(value = "Deletes an album by a given id")
	public StandardResponse<Album> deleteById(@PathVariable(name = "id") Integer id){
		return albumService.deleteById(id);
	}
	
	@PutMapping
	@CrossOrigin
	@ApiOperation(value = "Updates an existing album in database")
	public StandardResponse<Album> update(@RequestBody Album album){
		return albumService.update(album);
	}
	
}
