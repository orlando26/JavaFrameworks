package com.orlando.jsf.model;

public class Album {
	private Integer id;

	private String title;

	private String releaseDate;

	private String price;

	private String genre;


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