package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;

/**
 * Voyageurs prévu pour un transport
 * 
 */
public class Voyageur implements Serializable {

	private static final long serialVersionUID = 1L;

	// Nom du voyageur
	private String nom;

	// Prénom du voyageur
	private String prenom;

	// Date de naissance du voyageur
	private String dateNaissance;

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
