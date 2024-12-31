package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchCarDetails {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("car");
		EntityManager em= emf.createEntityManager();
		System.out.println("Enter Car Id: ");
		int carId= sc.nextInt();
	
		
		Car c=em.find(Car.class, carId);
		if(c!=null) {
			System.out.println(c);
		}else {
			System.out.println("car does not exist");
		}
	
		
		
	}

}
