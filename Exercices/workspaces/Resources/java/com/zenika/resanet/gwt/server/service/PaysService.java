package com.zenika.resanet.gwt.server.service;

import java.util.Collection;

import com.zenika.resanet.gwt.shared.modele.Pays;

public interface PaysService {

    public Collection<Pays> findAll();

    public Pays findByName(String unNom);
}
