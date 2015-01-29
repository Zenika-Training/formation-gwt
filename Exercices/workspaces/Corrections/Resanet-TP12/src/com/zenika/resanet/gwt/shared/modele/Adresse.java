package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;

/**
 * <p>
 * </p>
 * 
 */
public class Adresse implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String rue;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String codePostal;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String ville;

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getRue() {
		return rue;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getVille() {
		return ville;
	}
}
