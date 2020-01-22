package com.orlando.restServices.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.orlando.restServices.entity.Album;

@SpringBootTest
public class AlbumRepositoryTest {
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Test
	public void testSelect() {
		List<Album> albums = albumRepository.findAll();
	
		albums.forEach(System.out::println);
	}
	
}
