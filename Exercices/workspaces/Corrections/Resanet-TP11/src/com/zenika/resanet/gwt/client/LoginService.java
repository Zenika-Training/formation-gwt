package com.zenika.resanet.gwt.client;

import java.util.Collection;
import java.util.Date;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.modele.Transport;
import com.zenika.resanet.gwt.shared.modele.Ville;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {

    Operateur authenticate(LoginDto credentials) throws OperateurNotFoundException;

    void saveOperateur(Operateur operateur);

    Collection<Ville> findAllVilles();

    Collection<Transport> findTransportByCriteria(Long villeDepartId, Long villeArriveeId, Date dateDepart);

}
