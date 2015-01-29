package com.zenika.resanet.gwt.shared.modele;

/**
 * <p>
 * </p>
 * 
 */
public class Facture {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private float total;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private boolean reglee;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private java.util.Date dateEmission;

	/**
	 * <p>
	 * </p>
	 * 
	 */
	public Reservation reservation;

	public void setTotal(float total) {
		this.total = total;
	}

	public float getTotal() {
		return total;
	}

	public void setReglee(boolean reglee) {
		this.reglee = reglee;
	}

	public boolean isReglee() {
		return reglee;
	}

	public void setDateEmission(java.util.Date dateEmission) {
		this.dateEmission = dateEmission;
	}

	public java.util.Date getDateEmission() {
		return dateEmission;
	}
}
