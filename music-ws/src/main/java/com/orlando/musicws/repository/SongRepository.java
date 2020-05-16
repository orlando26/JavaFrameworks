package com.orlando.musicws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.orlando.musicws.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer>{
	// devops - CI/CD (continuos integration, continuo delivery)
	@Query(value = "select * from songs where Album_Id = :albumId", nativeQuery = true)
	public List<Song> findAllByAlbumId(@Param("albumId") Integer id);
	
	public List<Song> findByAlbumIdOrderByTime(Integer id); 
	// Spring - spring boot, python - flask, Node s - express js, 
	//FIND_SONGS_BY_ALBUM_ID
	@Query(value = "call FIND_SONGS_BY_ALBUM_ID(:albumId)", nativeQuery = true)
	public List<Song> findSongsByAlbumSP(@Param("albumId") Integer albumId);
	
	
}
