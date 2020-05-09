package com.orlando.musicws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.orlando.musicws.exceptions.EmptyValueException;
import com.orlando.musicws.exceptions.PriceFormatException;

@Entity
@Table(name = "albums")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Album {
	// AWS - GCP(Google cloud platform) - Azure
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
	
	public void checkEmpty() throws EmptyValueException{
		if(this.title.equals("") || this.releaseDate.equals("") || this.price.equals("") || this.genre.equals("")) throw new EmptyValueException();
	}
	
	public void checkPrice() throws PriceFormatException{
		try {
			Double.parseDouble(price);
		}catch(NumberFormatException e) {
			throw new PriceFormatException();
		}
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
