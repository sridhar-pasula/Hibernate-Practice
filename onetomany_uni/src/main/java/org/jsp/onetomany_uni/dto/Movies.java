package org.jsp.onetomany_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {
	@Id
	private int movieId;
	private String movieName;
	private double rating;
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}
	public Movies(int movieId, String movieName, double rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
