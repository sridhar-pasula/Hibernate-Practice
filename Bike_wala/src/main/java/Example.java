import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Example {
	@Id
	private int bid;
	private String name;
	private String color;
	private double cost;

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Example [bid=" + bid + ", name=" + name + ", color=" + color + ", cost=" + cost + "]";
	}
	public static void main(String[] args) {
		
		Example e= new Example();
		e.setBid(102);
		e.setColor("white");
		e.setName("Activa");
		e.setCost(100000);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("sree");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
     	//save/Insert
//		et.begin();
//		em.persist(e);
//		et.commit();
		
		//update
//		et.begin();
//		em.merge(e);
//		et.commit();
		
		Example e1= em.find(Example.class, 102);
		System.out.println(e1);
		
		Example e2 = em.find(Example.class, 103);
		et.begin();
		em.remove(e2);
		et.commit();
	}
}
