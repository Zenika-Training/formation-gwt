package com.zenika.resanet.gwt.client;

import java.util.Collection;
import java.util.Date;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.modele.Transport;
import com.zenika.resanet.gwt.shared.modele.Ville;

public interface LoginServiceAsync {

    void authenticate(LoginDto credentials, AsyncCallback<Operateur> callback);

    void saveOperateur(Operateur operateur, AsyncCallback<Void> callback);

    void findAllVilles(AsyncCallback<Collection<Ville>> callback);

    void findTransportByCriteria(Long villeDepartId, Long villeArriveeId, Date dateDepart, AsyncCallback<Collection<Transport>> callback);

}
