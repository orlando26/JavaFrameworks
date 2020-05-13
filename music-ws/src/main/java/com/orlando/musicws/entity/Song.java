package com.orlando.musicws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.orlando.musicws.exceptions.EmptyValuesException;

@Entity(name = "songs")
public class Song {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
	private Integer id;
	
	@Column(name = "Album_Id")
	private Integer albumId;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Time")
	private String time;
	
	public void checkEmpty() throws EmptyValuesException{
		if(this.albumId.equals(null) || this.title.equals("") ||  this.time.equals("")) throw new EmptyValuesException();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", albumId=" + albumId + ", title=" + title + ", time=" + time + "]";
	}
	
	

}
