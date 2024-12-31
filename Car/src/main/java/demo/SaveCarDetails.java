package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCarDetails {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Car Id: ");
		int carId= sc.nextInt();
		
		System.out.println("Enter Car Name: ");
		String carName= sc.next();
		
		System.out.println("Enter color: ");
		String color= sc.next();
		
		System.out.println("Enter cost: ");
		double cost= sc.nextDouble();
		
		System.out.println("Enter mileage: ");
		double mileage= sc.nextDouble();
		
		Car car= new Car(carId,carName,color,cost,mileage);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("car");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		et.begin(); 
		em.persist(car);
		et.commit();	
	}
}
