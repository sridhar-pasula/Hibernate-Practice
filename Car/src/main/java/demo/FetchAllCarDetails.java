package demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchAllCarDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("car");
		EntityManager em= emf.createEntityManager();
		
		Query query= em.createQuery("select c from Car c");
		List list =query.getResultList();
		System.out.println(list);

	}

}
