package com.orlando.restServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.restServices.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {
	
	public List<Song> findByAlbumId(Integer albumId);
	
}
