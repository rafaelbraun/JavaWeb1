package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario u = new Usuario(null,"Rafael","1");
		Usuario u2 = new Usuario(null,"Rafael2","12");
		Usuario u3 = new Usuario(null,"Rafael3","123");

		System.out.println(u.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulajavaweb");
		
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
			em.persist(u);
			em.persist(u2);
			em.persist(u3);
		em.getTransaction().commit();
		em.close();
		fabrica.close();
	}

}
