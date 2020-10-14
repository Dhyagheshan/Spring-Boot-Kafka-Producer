package com.sbkafkaproducer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moviesdata")
public class MoviesModel {
	
	
	@Id
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="lanuage")
	private String language;
	
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="released_date")
	private String releasedDate;
	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}
	
	@Override
	public String toString() {
		return "MoviesModel [movieName=" + movieName + ", language=" + language + ", genre=" + genre + ", releasedDate="
				+ releasedDate + "]";
	}

	


}
