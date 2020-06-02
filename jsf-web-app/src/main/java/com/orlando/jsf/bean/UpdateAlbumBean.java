package com.orlando.jsf.bean;

import com.orlando.jsf.model.Album;
import com.orlando.jsf.model.StandardResponse;
import com.orlando.jsf.restclient.AlbumRest;
import com.orlando.jsf.restclient.AlbumRestImpl;

public class UpdateAlbumBean extends Form{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	
	private String releaseDate;
	
	private String price;
	
	private String genre;
	
	
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

	public void save() {
		Album album = new Album(title, releaseDate, price, genre);
		System.out.println(album);
		AlbumRest albumRest = new AlbumRestImpl();
		StandardResponse<Album> response = albumRest.save(album);
		System.out.println(response);
		message(response.getStatus(), response.getResponseText());
		if (response.getStatus().equals("SUCCESS")) {
			redirectHome();
		}
	}
	
	public void cancel() {
		redirectHome();
	}

}
