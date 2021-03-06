package com.orlando.jsf.model;

import java.io.Serializable;

public class Album implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String title;

	private String releaseDate;

	private String price;

	private String genre;
	
	public Album() {
		
	}

	public Album(String title, String releaseDate, String price, String genre) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.price = price;
		this.genre = genre;
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