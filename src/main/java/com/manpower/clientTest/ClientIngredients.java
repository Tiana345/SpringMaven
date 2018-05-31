package com.manpower.clientTest;

import java.io.Serializable;

public class ClientIngredients implements Serializable {

	private int id;
	private String nom;
	private int quantity;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Ingredients [nom=" + nom + ", quantity=" + quantity + "]";
	}

}
