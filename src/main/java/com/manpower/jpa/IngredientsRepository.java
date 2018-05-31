package com.manpower.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manpower.entity.Ingredients;



public interface IngredientsRepository extends JpaRepository<Ingredients, Integer> {
	
	public Ingredients save(Ingredients entity);
	public List<Ingredients> findAll();
	public Ingredients findById(int id);
	
	default public boolean deleteOne(Ingredients ingredient) {
		
		return true;
	}

	
	
	

}
