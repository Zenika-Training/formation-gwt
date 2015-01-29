package com.zenika.resanet.gwt.server.service;

import java.util.Collection;
import java.util.Date;

import com.zenika.resanet.gwt.shared.modele.Transport;
import com.zenika.resanet.gwt.shared.modele.Ville;

public interface TransportService {

    public Collection<Transport> findByCriteria(Ville villeDepart, Ville villeArrivee, Date dateDepart);

    public Collection<Transport> findByCriteria(Long villeDepartId, Long villeArriveeId, Date dateDepart);

    public Transport findById(Long transportId);
}
