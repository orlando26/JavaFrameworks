package com.orlando.moviesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.moviesapi.bo.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	
}
