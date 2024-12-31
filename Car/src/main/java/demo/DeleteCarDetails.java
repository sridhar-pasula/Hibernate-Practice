package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCarDetails {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("car");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		System.out.println("Enter Car Id: ");
		int carId= sc.nextInt();
	
		
		Car c=em.find(Car.class, carId);
		if(c!=null) {
			et.begin();
			em.remove(c);
			et.commit();
		}else {
			System.out.println("car does not exist");
		}
	
		
		
	}
}
