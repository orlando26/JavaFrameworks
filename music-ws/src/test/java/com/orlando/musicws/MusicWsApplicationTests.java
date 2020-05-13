package com.orlando.musicws;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.repository.SongRepository;

@SpringBootTest
class MusicWsApplicationTests {
	
	@Autowired
	private SongRepository songRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetSongsById() {
		List<Song> songs = songRepository.findAllByAlbumId(1);
		songs.forEach(System.out::println);
	}

}
