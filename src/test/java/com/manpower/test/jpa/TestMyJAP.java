package com.manpower.test.jpa;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.manpower.entity.Ingredients;
import com.manpower.jpa.IngredientsRepository;
import com.manpower.test.config.TestSpringApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={TestSpringApplication.class})
@DataJpaTest
@SpringBootTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestMyJAP {

		@Autowired
		IngredientsRepository ingreRep;
	
		
		@Autowired
		TestEntityManager em;
		
		Ingredients ingredient;
		Ingredients ingredient1;
		Ingredients ingredient3;
		@Before
		public void setUp() {
			
			System.out.println("This method is @before");
			ingredient = new Ingredients();
			ingredient.setNom("Pepper");
			ingredient.setQuantity(5);
			em.persistAndFlush(ingredient);
			
			
			ingredient1 = new Ingredients();
			
			ingredient1.setNom("Tomate");
			ingredient1.setQuantity(2);
			em.persistAndFlush(ingredient1);
			
			ingredient3 = new Ingredients();
			
			ingredient3.setNom("Tomate");
			ingredient3.setQuantity(2);
			em.persistAndFlush(ingredient3);
			
		}
		
		@BeforeClass
		public static void beforeClass() {
		    System.out.println("This method is @BeforeClass");
		}
		@AfterClass
		public static void afterClass() {
		    System.out.println("This method is @AfterClass");
		}
		
		@After
		public void after() {
			System.out.println("This method is @After");
		}

	@Test
	public void testSaveIngredient() {

		Ingredients ingredient = new Ingredients();
		ingredient.setNom("Pepper");
		ingredient.setQuantity(5);
		
		Ingredients result = ingreRep.save(ingredient);
		
		Ingredients result2 = em.find(Ingredients.class, result.getId());
		
		assertNotNull(result2);
			//assertTrue(em.contains(myIng));
		
	}
	

	@Test
	public void testFindAllIngredient() {

		/*Ingredients ingredient = new Ingredients();
		Ingredients ingredient1 = new Ingredients();
		ingredient.setNom("Pepper");
		ingredient.setQuantity(5);
		ingreRep.save(ingredient);
		ingredient1.setNom("Tomate");
		ingredient1.setQuantity(2);
		ingreRep.save(ingredient1);*/
		
		List<Ingredients> result = ingreRep.findAll();
		
		//Ingredients result2 = em.find(Ingredients.class, result.getId());
		System.out.println(result);
		assertNotNull(result);
	//	assertTrue(em.contains(ingredient));
			//assertTrue(em.contains(myIng));
		
	}
	
	@Test
	public void testFindById() {
		
		Ingredients newIngre = new Ingredients();

		Ingredients ingredient = new Ingredients();
		
		ingredient.setNom("Pepper");
		ingredient.setQuantity(5);
		ingreRep.save(ingredient);
		Ingredients result = ingreRep.findById(4);
		System.out.println(result.getNom());
		//assertTrue(em.contains(ingredient));
		
		
	}
	
	
	
	
	
	
	
	}

