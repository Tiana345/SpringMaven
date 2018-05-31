package com.manpower.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.manpower.entity.Ingredients;

@SpringBootApplication
@EntityScan("com")
@EnableJpaRepositories("com")
@ComponentScan("com")
public class TestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
	}
	
	@Autowired
	EntityManagerFactory emf;
	@Autowired
	EntityManager em;
	
	/*@EventListener
	public void start(ContextRefreshedEvent event) {

		EntityManager em = emf.createEntityManager();

		em.getTransaction();
		EntityTransaction trans = em.getTransaction();

		try {
		trans.begin();
			Ingredients newIngre = new Ingredients();
			newIngre.setNom("tomate");
			newIngre.setQuantity(3);
			em.persist(newIngre);
			trans.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}

		em.close();
		emf.close();


	}*/
}
