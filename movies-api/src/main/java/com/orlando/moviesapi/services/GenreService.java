package com.orlando.moviesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.moviesapi.bo.Genre;
import com.orlando.moviesapi.repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository genreRepository;
	
	public void saveGenre(Genre genre) {
		genreRepository.save(genre);
	}
	
	public List<Genre> getGenres(){
		return genreRepository.findAll();
	}
	
	public Genre getGenre(Long id) {
		return genreRepository.getOne(id);
	}
	
}
