package com.zenika.resanet.gwt.server.service;

import java.util.Collection;

import com.zenika.resanet.gwt.shared.modele.Ville;

public interface VilleService {

    public Collection<Ville> findAll();

    public Ville findByName(String unNom);

    public Ville findById(Long unId);
}
