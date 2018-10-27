package com.orlando.moviesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.moviesapi.bo.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
