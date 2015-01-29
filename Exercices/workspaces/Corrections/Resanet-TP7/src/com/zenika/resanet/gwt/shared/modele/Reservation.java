package com.zenika.resanet.gwt.shared.modele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Classe représentant une réservation
 */
public class Reservation implements IsSerializable{

	// Date de la réservation
	private Date dateReservation;

	// Transports sélectionnés
	private Collection<Transport> transports = new ArrayList<Transport>();

	// Adresse de livraison des billets
	private Adresse adresseLivraison;

	// Liste des voyageurs
	private Collection<Voyageur> voyageurs = new ArrayList<Voyageur>();

	public Adresse getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(Adresse adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	
	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	

	public Collection<Transport> getTransports() {
		return transports;
	}
	
	public void setTransports(Collection<Transport> transports) {
		this.transports = transports;
	}
	
	public Collection<Voyageur> getVoyageurs() {
		return voyageurs;
	}
	
	public void setVoyageurs(Collection<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

}
