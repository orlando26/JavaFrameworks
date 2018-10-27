package com.orlando.moviesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.moviesapi.bo.Movie;
import com.orlando.moviesapi.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
		
	}
	
	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public Movie getMovie(Long id) {
		return movieRepository.getOne(id);
	}
	
}
