package com.manpower.test.jpa;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.manpower.entity.Ingredients;
import com.manpower.jpa.IngredientsRepository;
import com.manpower.service.ServiceIngredient;
import com.manpower.test.config.TestSpringApplication;




@RunWith(SpringRunner.class)
@ContextConfiguration(classes={TestSpringApplication.class})
@DataJpaTest
@SpringBootTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestMyService {
	
	@Autowired
	ServiceIngredient myServ;

	@MockBean
	IngredientsRepository myRepo;

	Ingredients ingredient;
	Ingredients ingredient1;
	Ingredients ingredient3;
	List<Ingredients> allListe;

	
	@Before
	public void setUp() {
		
		
		System.out.println("This method is @before");
		
		
		 allListe = new ArrayList<Ingredients>();
		 allListe.add(new Ingredients(1, "Tomatoe", 23));
		 allListe.add(new Ingredients(2, "yam", 3));
		 allListe.add(new Ingredients(3, "Rice", 66));
		 Mockito.when(myRepo.findAll()).thenReturn(allListe);
		
	}

	@Test
	public void testAddIngredient() {
	
		Ingredients newIngre = new Ingredients();
		newIngre.setNom("poison");
		newIngre.setQuantity(9);
	
		
		
	}
	
	
	
	@Test
	public void saveTest() {
		ingredient = new Ingredients();
		ingredient.setNom("Pepper");
		ingredient.setQuantity(5);
		
		Mockito.when(myRepo.save(ingredient)).thenReturn(ingredient);
		
		Ingredients result = myServ.addIngre(ingredient);
		assertNotNull(result);
		
	
	}
	@Test
	public void listIngreMOKITO(){
		
		List<Ingredients> result = myServ.findMyIngredient(); 
		assertTrue(result.size() == allListe.size());
		assertThat(allListe, is(result));
		 
	}

	

}
