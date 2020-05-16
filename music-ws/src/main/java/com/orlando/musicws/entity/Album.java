package com.orlando.musicws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.orlando.musicws.exceptions.EmptyValuesException;
import com.orlando.musicws.exceptions.NotPersistedObjectException;

@Entity(name = "albums")
public class Album {// JDBC - Hibernate - Spring JPA
	// DAO(Data Acces Object) - CRUD - Repository 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
	private Integer id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Release_Date")
	private String releaseDate;
	
	@Column(name="Price")
	private String price;
	
	@Column(name="Genre")
	private String genre;
	
	
	public void checkEmpty() throws EmptyValuesException { // throws - avisar al compilador que la logica puede arrojar una excepcion pero no se valida aqui
		if( title.equals("") || releaseDate.equals("") || price.equals("") || genre.equals("") ) throw new EmptyValuesException("Porfavor llena todos los campos!"); // throw - arroja una excepcion
	}
	
	public static void checkObjectIsNotNull(Album album) throws NotPersistedObjectException{
		if (album == null) throw new NotPersistedObjectException();
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
