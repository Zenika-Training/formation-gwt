package com.zenika.resanet.gwt.server.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.zenika.resanet.gwt.server.service.AuthentificationService;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

public class MockAuthentificationService implements AuthentificationService {

    private Map<String, Operateur> operateurs = new HashMap<String, Operateur>();

    /**
     * Constructeur du service d'authentification qui ajoute : <br>
     * - Un operateur avec le rôle Administrateur - Un operateur avec le rôle
     * Agent
     */
    public MockAuthentificationService() {
        super();

        Operateur admin = new Operateur();
        admin.setLogin("admin");
        admin.setPassword("admin");
        admin.setCourriel("admin@resanet.com");
        admin.setTelephone("3344");
        admin.setRole("ADMINISTRATEUR");

        Operateur pierre = new Operateur();
        pierre.setLogin("Pierre");
        pierre.setPassword("Pierre");
        pierre.setCourriel("pierre@resanet.com");
        pierre.setTelephone("3434");
        pierre.setRole("AGENT");

        this.operateurs.put(admin.getLogin(), admin);
        this.operateurs.put(pierre.getLogin(), pierre);
    }

    /**
     * @see com.zenika.resanet.service.AuthentificationService#authentifier(java.lang.String,
     *      java.lang.String)
     */
    public Operateur authentifier(String login, String password) throws OperateurNotFoundException {

        Operateur operateur = (Operateur) operateurs.get(login);

        if ((operateur != null) && (operateur.getPassword().equals(password))) {
            return operateur;
        }

        throw new OperateurNotFoundException("Operateur non trouvé en base");
    }

    /**
     * @see com.zenika.resanet.service.AuthentificationService#modifierOperateur(com.zenika.resanet.gwt.modele.Operateur)
     */
    public void modifierOperateur(Operateur operateur) {

        this.operateurs.put(operateur.getLogin(), operateur);

    }

}
