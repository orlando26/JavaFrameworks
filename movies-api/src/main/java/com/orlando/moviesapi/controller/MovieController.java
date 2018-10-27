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

import com.orlando.moviesapi.bo.Movie;
import com.orlando.moviesapi.services.MovieService;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping
	public void saveMovie(@RequestBody Movie movie) {
		movieService.saveMovie(movie);
	}
	
	@GetMapping
	@CrossOrigin
	public List<Movie> getAll(){
		return movieService.getAllMovies();
	}
	
	@GetMapping("/{id}")
	public Movie getMovie(@PathVariable("id") Long id) {
		return movieService.getMovie(id);
	}
	
}
