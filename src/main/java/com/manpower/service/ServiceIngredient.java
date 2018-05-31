package com.manpower.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manpower.entity.Ingredients;
import com.manpower.jpa.IngredientsRepository;


@Service
public class ServiceIngredient {
	
	@Autowired
	IngredientsRepository myIngr;
	


	
		public Ingredients addIngre(Ingredients g)  {
			
			if(g.getNom().equalsIgnoreCase("poison")) {
				System.out.println("Not Allowed");
				return null;
			
			}
			
			else {
				myIngr.save(g);
				return g;			
			}
		}
		
		public List<Ingredients> findMyIngredient() {
			return myIngr.findAll();
		}

}
