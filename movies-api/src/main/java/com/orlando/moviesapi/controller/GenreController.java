package com.orlando.moviesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.moviesapi.bo.Genre;
import com.orlando.moviesapi.services.GenreService;

@RestController
@RequestMapping("/api/v1/genre")
public class GenreController {
	
	@Autowired
	private GenreService genreservice;
	
	@PostMapping
	@CrossOrigin
	public void saveGenre(@RequestBody Genre genre) {
		genreservice.saveGenre(genre);
	}
	
	@GetMapping
	@CrossOrigin
	public List<Genre> getAllGenres(){
		return genreservice.getGenres();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	public Genre getGernre(@PathVariable("id") Long id) {
		return genreservice.getGenre(id);
	}
	
	
	
}
