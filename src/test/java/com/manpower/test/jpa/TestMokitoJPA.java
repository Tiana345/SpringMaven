package com.manpower.test.jpa;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
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
public class TestMokitoJPA {

	
	//@Autowired
	IngredientsRepository ingreRep;

	
	@Autowired
	TestEntityManager em;
	
	/*Make the ingredients static*/
	Ingredients ingredient;
	Ingredients ingredient1;
	Ingredients ingredient3;
	
	
	/*This method runs before any test*/
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
	
	@Test
	public void usingMokitoFindAll() {
		 ingreRep = mock(IngredientsRepository.class);
		 
		 List<Ingredients> allListe = new ArrayList<Ingredients>();
		 allListe.add(ingredient);
		 allListe.add(ingredient1);
		 allListe.add(ingredient3);
		 
	
			
		 when(ingreRep.findAll()).thenReturn(allListe);
		 assertEquals(3, allListe.size());
		
	}
	
	@Test
	public void saveIngredients() {
		ingreRep = mock(IngredientsRepository.class);
		Ingredients newIngre = new Ingredients();
		newIngre.setNom("Peanut");
		newIngre.setQuantity(13);
		when(ingreRep.save(newIngre)).thenReturn(newIngre);
		
		assertEquals("Peanut", newIngre.getNom());
		System.out.println(newIngre.getNom());
	}
	
	@Test (expected=IOException.class)
	public void saveIngredientsPoison() {
		ingreRep = mock(IngredientsRepository.class);
		Ingredients newIngre = new Ingredients();
		newIngre.setNom("poison");
		newIngre.setQuantity(2);
		when(ingreRep.save(newIngre)).thenReturn(newIngre);
		
		assertEquals("poison", newIngre.getNom());
		System.out.println(newIngre.getNom());
	}
	
	
	
}
