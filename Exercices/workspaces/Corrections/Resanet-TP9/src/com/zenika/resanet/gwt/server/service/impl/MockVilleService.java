package com.zenika.resanet.gwt.server.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.zenika.resanet.gwt.server.service.PaysService;
import com.zenika.resanet.gwt.server.service.VilleService;
import com.zenika.resanet.gwt.shared.modele.Pays;
import com.zenika.resanet.gwt.shared.modele.Ville;

public class MockVilleService implements VilleService {

    private Map<String, Ville> villes = new HashMap<String, Ville>();

    public MockVilleService(PaysService paysService) {

        Pays france = paysService.findByName("France");

        Ville paris = new Ville();
        paris.setPays(france);
        paris.setNom("Paris");
        paris.setId(new Long(1));

        Ville toulouse = new Ville();
        toulouse.setPays(france);
        toulouse.setNom("Toulouse");
        toulouse.setId(new Long(2));

        Ville bordeaux = new Ville();
        bordeaux.setPays(france);
        bordeaux.setNom("Bordeaux");
        bordeaux.setId(new Long(3));

        Ville lyon = new Ville();
        lyon.setPays(france);
        lyon.setNom("Lyon");
        lyon.setId(new Long(4));

        Ville leMans = new Ville();
        leMans.setPays(france);
        leMans.setNom("Le Mans");
        leMans.setId(new Long(5));

        Ville marseille = new Ville();
        marseille.setPays(france);
        marseille.setNom("Marseille");
        marseille.setId(new Long(6));

        villes.put("Paris", paris);
        villes.put("Toulouse", toulouse);
        villes.put("Bordeaux", bordeaux);
        villes.put("Lyon", lyon);
        villes.put("Le Mans", leMans);
        villes.put("Marseille", marseille);
    }

    @Override
    public Collection<Ville> findAll() {
        return villes.values();
    }

    @Override
    public Ville findByName(String unNom) {
        return villes.get(unNom);
    }

    @Override
    public Ville findById(Long unId) {
        Collection<Ville> liste = villes.values();
        for (Ville uneVille : liste) {
            if (uneVille.getId().equals(unId)) {
                return uneVille;
            }
        }
        return null;
    }
}
