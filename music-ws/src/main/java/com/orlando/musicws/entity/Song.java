package com.orlando.musicws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.orlando.musicws.exceptions.EmptyValueException;
import com.orlando.musicws.exceptions.TimeFormatException;

@Entity
@Table(name = "songs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Album_Id")
	private Integer albumId;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Time")
	private String time;
	
	public void checkEmpty() throws EmptyValueException{
		if(this.title.equals("") ||  this.time.equals("")) throw new EmptyValueException();
	}
	
	public void checkTime() throws TimeFormatException {
		try {
			Double.parseDouble(time);
		}catch (NumberFormatException e) {
			throw new TimeFormatException();
		}
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
