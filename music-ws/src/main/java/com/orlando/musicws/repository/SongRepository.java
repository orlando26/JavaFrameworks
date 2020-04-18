package com.orlando.musicws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.musicws.entity.Song;

//JPA(Java Persistance API)
public interface SongRepository extends JpaRepository<Song, Integer>{
	
	public List<Song> findByAlbumId(Integer albumId); 
	
}

