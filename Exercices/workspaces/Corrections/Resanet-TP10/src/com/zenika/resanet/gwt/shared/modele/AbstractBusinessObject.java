package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;

public abstract class AbstractBusinessObject implements Serializable {

	private static final long serialVersionUID = 1L;

	// Identifiant technique des objets metiers
	private Long id;

	// Numéro de version pour le verrouillage optimiste
	private int version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
