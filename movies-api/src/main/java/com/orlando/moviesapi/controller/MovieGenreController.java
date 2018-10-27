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

import com.orlando.moviesapi.bo.MovieGenre;
import com.orlando.moviesapi.services.MovieGenreService;

@RestController
@RequestMapping("/api/v1/movieGenre")
public class MovieGenreController {
	
	@Autowired
	private MovieGenreService movieGenreService;
	
	@PostMapping
	@CrossOrigin
	public void saveMovieGenre(@RequestBody MovieGenre movieGenre) {
		movieGenreService.saveMovieGenre(movieGenre);
	}
	
	@GetMapping("/byMovie/{movieId}")
	@CrossOrigin
	public List<MovieGenre> getGenresByMovie(@PathVariable("movieId") Long movieId){
		return movieGenreService.getGenresByMovie(movieId);
	}
	
}
