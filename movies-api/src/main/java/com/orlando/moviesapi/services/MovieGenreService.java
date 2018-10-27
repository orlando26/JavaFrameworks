package com.orlando.moviesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.moviesapi.bo.MovieGenre;
import com.orlando.moviesapi.repository.MovieGenreRepository;

@Service
public class MovieGenreService {
	
	@Autowired
	private MovieGenreRepository movieGenreRepository;
	
	public void saveMovieGenre(MovieGenre movieGenre) {
		movieGenreRepository.save(movieGenre);
	}
	
	public List<MovieGenre> getGenresByMovie(Long movieId){
		return movieGenreRepository.findByMovieId(movieId);
	}
}
