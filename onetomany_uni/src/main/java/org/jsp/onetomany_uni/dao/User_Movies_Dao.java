package org.jsp.onetomany_uni.dao;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomany_uni.dto.Movies;
import org.jsp.onetomany_uni.dto.NetflixUser;



public class User_Movies_Dao {

	EntityManager manager= Persistence.createEntityManagerFactory("onetomany").createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void saveUser(NetflixUser user) {

		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}
	public void saveOrder(NetflixUser user) {
		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}
	public void updateMovie(int accountId, List<Movies> newMovies) {
		
		transaction.begin();
		NetflixUser netflixUser = manager.find(NetflixUser.class, accountId);
		
		if(netflixUser!=null) {
			 List<Movies> movies= netflixUser.getMovies();
			 movies.addAll(newMovies);
			 manager.merge(netflixUser);
			 transaction.commit();
		}else {
			System.out.println("No user Found");
		}
	}
		public void deleteMovieFromUser(int accountId, int movieId) {
		NetflixUser netflixUser = manager.find(NetflixUser.class, accountId);
		
		if(netflixUser!=null) {
			 List<Movies> movies= netflixUser.getMovies();
			 ListIterator<Movies> iterator = movies.listIterator();
			 while(iterator.hasNext()) {
				 Movies movie= iterator.next();
				 if(movie.getMovieId()==movieId) {
					 iterator.remove();
				 }
			 }
			 netflixUser.setMovies(movies);
			 transaction.begin();
			 manager.merge(netflixUser);
			 transaction.commit();
		}
	}
}
