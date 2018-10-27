package com.orlando.moviesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.moviesapi.bo.MovieGenre;

public interface MovieGenreRepository extends JpaRepository<MovieGenre, Long>{
	
	public List<MovieGenre> findByMovieId(Long id);
	
}
