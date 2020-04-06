package com.orlando.musicws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.musicws.entity.Song;

//JPA(Java Persistance API)
public interface SongRepository extends JpaRepository<Song, Integer>{

}
