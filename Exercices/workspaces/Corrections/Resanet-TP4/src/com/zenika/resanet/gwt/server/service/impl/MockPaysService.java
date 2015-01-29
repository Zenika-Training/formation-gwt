package com.zenika.resanet.gwt.server.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.zenika.resanet.gwt.server.service.PaysService;
import com.zenika.resanet.gwt.shared.modele.Pays;

public class MockPaysService implements PaysService {

    private Map<String, Pays> pays = new HashMap<String, Pays>();

    public MockPaysService() {
        pays.put("France", new Pays("France"));
        pays.put("Italie", new Pays("Italie"));
        pays.put("Espagne", new Pays("Espagne"));
    }

    public Collection<Pays> findAll() {
        return pays.values();
    }

    public Pays findByName(String unNom) {
        return (Pays) pays.get(unNom);
    }

}
