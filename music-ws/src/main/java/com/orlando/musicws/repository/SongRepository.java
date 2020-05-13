package com.orlando.musicws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.orlando.musicws.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer>{
	// devops - CI/CD (continuos integration, continuo delivery)
	@Query(value = "select title from songs where Album_Id = :albumId", nativeQuery = true)
	public List<Song> findAllByAlbumId(@Param("albumId") Integer id);
	
}
