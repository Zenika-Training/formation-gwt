package com.zenika.resanet.gwt.shared.modele;

import java.util.Date;

/**
 * <p>
 * </p>
 * 
 */
public class Avion extends Transport {

	private static final long serialVersionUID = 1L;

	// Compagnie
	private String compagnie;

	// Type d'appareil
	private String typeAppareil;

	/**
	 * 
	 */
	public Avion() {
		super();
	}

	/**
	 * @param villeDepart
	 * @param villeArrivee
	 * @param dateDepart
	 */
	public Avion(Ville villeDepart, Ville villeArrivee, Date dateDepart) {
		super(villeDepart, villeArrivee, dateDepart);
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public String getTypeAppareil() {
		return typeAppareil;
	}

	public void setTypeAppareil(String typeAppareil) {
		this.typeAppareil = typeAppareil;
	}

}
