package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;

/**
 * Classe repr�sentant les Pays
 */
public class Pays extends AbstractBusinessObject implements Serializable {

	private static final long serialVersionUID = 1L;

	// Nom du pays
	private String nom;

	/**
	 * Constructeur par défaut
	 */
	public Pays() {
		super();
	}

	/**
	 * Constructeur prenant le nom en entr�e
	 * 
	 * @param unNom
	 */
	public Pays(String unNom) {
		this.nom = unNom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
