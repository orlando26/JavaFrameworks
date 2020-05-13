package com.orlando.musicws.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.orlando.musicws.entity.Song;
import com.orlando.musicws.util.StandardResponse;

@SpringBootTest
public class SongServiceTests {
	
	@Autowired
	private SongService songService;
	
	public void saveSongsTest() {
		Song song = new Song();
		
		song.setAlbumId(1);
		song.setTitle("junit test");
		song.setTime("2:00");
		
		StandardResponse<Song> response = songService.save(song);
		
		assertNotNull(response.getEntity());
		assertEquals("SUCCESS", response.getStatus());
		System.out.println(response);
	}
	
	public void findAllTest() {
		List<Song> songs = songService.findAll();
		assertNotNull(songs);
	}
	
	
	
	
	
}
