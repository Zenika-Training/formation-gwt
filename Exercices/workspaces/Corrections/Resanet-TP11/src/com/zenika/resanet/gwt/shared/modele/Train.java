package com.zenika.resanet.gwt.shared.modele;

import java.util.Date;

/**
 * <p>
 * </p>
 * 
 */
public class Train extends Transport {

	private static final long serialVersionUID = 1L;

	// Nombre de wagons
	private int nbWagons;

	// Presence voiture bar
	private boolean voitureBar;

	/**
	 * 
	 */
	public Train() {
		super();
	}

	/**
	 * @param villeDepart
	 * @param villeArrivee
	 * @param dateDepart
	 */
	public Train(Ville villeDepart, Ville villeArrivee, Date dateDepart) {
		super(villeDepart, villeArrivee, dateDepart);
	}

	public int getNbWagons() {
		return nbWagons;
	}

	public void setNbWagons(int nbWagons) {
		this.nbWagons = nbWagons;
	}

	public boolean isVoitureBar() {
		return voitureBar;
	}

	public void setVoitureBar(boolean voitureBar) {
		this.voitureBar = voitureBar;
	}
}
