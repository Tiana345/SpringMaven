package com.manpower.dto;

import java.util.List;

public class RecetteDTO {
	
	private int id;
	private String nom;
	private List<IngredientDTO> liste;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<IngredientDTO> getListe() {
		return liste;
	}
	public void setListe(List<IngredientDTO> liste) {
		this.liste = liste;
	}
	
	

}
