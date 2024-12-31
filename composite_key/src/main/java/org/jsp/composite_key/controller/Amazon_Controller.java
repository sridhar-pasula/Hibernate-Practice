package org.jsp.composite_key.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.composite_key.dao.Amazon_Dao;
import org.jsp.composite_key.dto.Amazon;
import org.jsp.composite_key.dto.Amazon_Id;



public class Amazon_Controller {

	public static void main(String[] args) {

		Amazon_Id id= new Amazon_Id("sr@gmail", 939298l);
		Amazon amazon= new Amazon("sri", "abc", "hyd", id);
		
		Amazon_Dao dao=  new Amazon_Dao();
		dao.saveAmazonUser(amazon);

	}

}
