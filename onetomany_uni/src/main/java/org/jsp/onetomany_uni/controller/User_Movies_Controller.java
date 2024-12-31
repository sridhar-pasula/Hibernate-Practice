package org.jsp.onetomany_uni.controller;

import java.util.ArrayList;

import java.util.List;

import org.jsp.onetomany_uni.dao.User_Movies_Dao;
import org.jsp.onetomany_uni.dto.Movies;
import org.jsp.onetomany_uni.dto.NetflixUser;

public class User_Movies_Controller {

	public static void main(String[] args) {
		
		User_Movies_Dao dao= new User_Movies_Dao();
		
		List<Movies> movie = new ArrayList<Movies>();
		Movies movie1= new Movies(1001,"Salar",7.9);
		Movies movie2= new Movies(1002,"Kalki",8.3);
		Movies movie3= new Movies(1003,"Hanuman",8.5);
		
		movie.add(movie1);
		movie.add(movie2);
		movie.add(movie3);
		
		NetflixUser netflixUser = new NetflixUser(101,"abc@123", "gold", movie);
		
		
		List<Movies> newMovies = new ArrayList<Movies>();
		newMovies.add(new Movies(1004,"777",8.6));
		newMovies.add(new Movies(1005,"karthikeya",8.0));
		newMovies.add(new Movies(1006,"Devara",7.8));
//		dao.saveUser(netflixUser);
		 
//		dao.updateMovie(101, newMovies);
		dao.deleteMovieFromUser(101, 1003);
		
		
		
	}
	
	
	 
	

	
}
