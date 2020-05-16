package com.orlando.musicws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.orlando.musicws.entity.Album;
// JAPRepository implementa DAO.
public interface AlbumRepository extends JpaRepository<Album, Integer>{
	
	@Query(value = "call FIND_ALBUM_BY_SONG_ID(:songId)", nativeQuery = true)
	public Album findAlbumBySongIdSP(@Param("songId") Integer id);
	
	@Query(value = "call FIND_ALBUM_BY_SONG_TITLE(:songTitle)", nativeQuery = true)
	public Album findAlbumBySongTitleSP(@Param("songTitle") String songTitle);
	
	// GET_TOTAL_SONGS_IN_ALBUM
	@Query(value = "call GET_TOTAL_SONGS_IN_ALBUM(:albumId)", nativeQuery = true)
	public Integer totalSongs(@Param("albumId") Integer albumId);
}
