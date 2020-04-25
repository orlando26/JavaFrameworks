package com.orlando.musicws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "albums")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Release_Date")
	private String releaseDate;
	
	@Column(name = "Price")
	private String price;
	
	@Column(name = "Genre")
	private String genre;
	
	public boolean checkEmpty() {
		if(this.title.equals("") || this.releaseDate.equals("") || this.price.equals("") || this.genre.equals("")) return true;
		
		return false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", price=" + price + ", genre="
				+ genre + "]";
	}
	
}
