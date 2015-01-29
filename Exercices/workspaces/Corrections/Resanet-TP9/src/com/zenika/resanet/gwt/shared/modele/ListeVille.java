package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;
import java.util.Collection;

public class ListeVille extends AbstractBusinessObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private Collection<Ville> liste = null;

	public ListeVille() {

	}

	public Collection<Ville> getListe() {
		return liste;
	}

	public void setListe(Collection<Ville> liste) {
		this.liste = liste;
	}

}
