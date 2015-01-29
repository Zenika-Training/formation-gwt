package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe abstraite pour les transports.
 */
public abstract class Transport extends AbstractBusinessObject implements
		Serializable {

	private static final long serialVersionUID = 1L;

	// Date de départ
	private Date dateDepart;

	// Prix du transport
	private float prix;

	// Nombre de siège
	private int nbSiegesTotal;

	// Nombre de si�ge disponible
	private int nbSiegesDispo;

	// Ville d'arrivée
	private Ville villeArrivee;

	// Ville de départ
	private Ville villeDepart;

	// Heure de départ
	private String heureDepart;

	// Heure d'arrivée
	private String heureArrivee;

	/**
	 * 
	 */
	public Transport() {

	}

	/**
	 * Constructeur prenant en compte les villes de d�part et d'arriv�e ainsi
	 * que la date
	 * 
	 * @param villeDepart
	 * @param villeArrivee
	 * @param dateDepart
	 */
	public Transport(Ville villeDepart, Ville villeArrivee, Date dateDepart) {
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.dateDepart = dateDepart;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public int getNbSiegesDispo() {
		return nbSiegesDispo;
	}

	public void setNbSiegesDispo(int nbSiegesDispo) {
		this.nbSiegesDispo = nbSiegesDispo;
	}

	public int getNbSiegesTotal() {
		return nbSiegesTotal;
	}

	public void setNbSiegesTotal(int nbSiegesTotal) {
		this.nbSiegesTotal = nbSiegesTotal;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Ville getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(Ville villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public Ville getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(Ville villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
}
