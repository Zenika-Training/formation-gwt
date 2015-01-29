package com.zenika.resanet.gwt.shared.modele;

import java.io.Serializable;

public class Operateur extends AbstractBusinessObject implements Serializable {

	private static final long serialVersionUID = 1L;

	// Identifiant de l'opérateur
	private String login;

	// Mot de passe de l'opérateur
	private String password;

	// Numéro de téléphone de l'opérateur
	private String telephone;

	// Mail de l'opérateur
	private String courriel;

	// Rôle de l'opérateur
	private String role;

	public Operateur() {

	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
