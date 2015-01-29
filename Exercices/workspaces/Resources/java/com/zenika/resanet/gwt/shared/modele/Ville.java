package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;

/**
 * Classe représentant les Villes
 */
public class Ville extends AbstractBusinessObject implements Serializable {

	private static final long serialVersionUID = 1L;

	// Nom de la ville
	private String nom;

	// Pays dans lequel se trouve la ville
	public Pays pays;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}
}
