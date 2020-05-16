package com.orlando.musicws.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.entity.Song;

@SpringBootTest
public class MusicAppRepositoryTests {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(MusicAppRepositoryTests.class);
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	@Test
	public void findAlbumBySongIdSPTest() {
		Album album = albumRepository.findAlbumBySongIdSP(1);
		//System.out.println(album);
		logger.info("log de album " + album.toString());
	}
	
	@Test
	public void findAlbumBySongTitleSPTest() {
		Album album = albumRepository.findAlbumBySongTitleSP("Canción 10");
		logger.info("FIND_ALBUM_BY_SONG_TITLE - " + album.toString());
	}
	
	@Test
	public void findSongsByAlbumSP() {
		List<Song> songs = songRepository.findSongsByAlbumSP(1);
		songs.forEach(s -> logger.info(s.toString()));
	}
	
	@Test
	public void totalSongsTest() {
		Integer total = albumRepository.totalSongs(1);
		logger.info("Total songs: " + total);
	}
	
}
