import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Book.dto.Book;

public class Controller {

	
	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("book");
		 EntityManager entityManager= entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		public void saveEmploye(Book book) {
			
			entityTransaction.begin();
			entityManager.persist(book);
			entityTransaction.commit();
		}
	}

}
