package com.zenika.resanet.gwt.server.service;

import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

public interface AuthentificationService {

    public Operateur authentifier(String login, String password) throws OperateurNotFoundException;

    public void modifierOperateur(Operateur operateur);

}
