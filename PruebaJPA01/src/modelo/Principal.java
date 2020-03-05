package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PruebaJPA01");

		EntityManager em = entityManagerFactory.createEntityManager();

		Coche coche = (Coche) em.find(Coche.class, 1);
		
		System.out.println("Coche localizado -> " + coche.getId() + " " + coche.getModelo() + " " +
				coche.getColor());
		
		em.close();

	}

}
