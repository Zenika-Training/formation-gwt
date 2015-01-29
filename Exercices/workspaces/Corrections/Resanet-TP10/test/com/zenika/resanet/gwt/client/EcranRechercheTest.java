package com.zenika.resanet.gwt.client;

import com.google.gwt.junit.client.GWTTestCase;
import com.zenika.resanet.gwt.client.view.EcranPrincipal;
import com.zenika.resanet.gwt.client.view.EcranRecherche;
import com.zenika.resanet.gwt.shared.modele.Avion;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

public class EcranRechercheTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.zenika.resanet.gwt.Resanet";
	}

	public void testAdministrateur() throws OperateurNotFoundException {
		EcranPrincipal.currentOperateur = new Operateur();
		EcranPrincipal.currentOperateur.setRole("ADMINISTRATEUR");

		Avion transport = new Avion();
		transport.setPrix(100f);

		EcranRecherche ecranRecherche = new EcranRecherche();

		assertEquals(95f, ecranRecherche.calculatePrice(transport));
	}
}
