package com.orlando.musicws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.musicws.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
