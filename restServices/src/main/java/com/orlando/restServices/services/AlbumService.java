package com.orlando.restServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.restServices.entity.Album;
import com.orlando.restServices.repository.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	public void createAlbum(Album album) {
		albumRepository.save(album);
	}
	
	public List<Album> findAll(){
		return albumRepository.findAll();
	}
	
}
