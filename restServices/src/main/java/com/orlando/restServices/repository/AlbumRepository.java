package com.orlando.restServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.restServices.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
