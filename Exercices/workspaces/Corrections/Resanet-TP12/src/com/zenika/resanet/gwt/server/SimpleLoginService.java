package com.zenika.resanet.gwt.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.zenika.resanet.gwt.client.LoginService;
import com.zenika.resanet.gwt.server.service.factory.ServiceFactory;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.modele.Transport;
import com.zenika.resanet.gwt.shared.modele.Ville;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

@SuppressWarnings("serial")
public class SimpleLoginService extends RemoteServiceServlet implements LoginService {

    @Override
    public Operateur authenticate(LoginDto credentials) throws OperateurNotFoundException {
        return ServiceFactory.getServiceFactory().getAuthentificationService()
                .authentifier(credentials.getUser(), credentials.getPassword());
    }

    @Override
    public void saveOperateur(Operateur operateur) {
        ServiceFactory.getServiceFactory().getAuthentificationService().modifierOperateur(operateur);
    }

    @Override
    public Collection<Ville> findAllVilles() {
        return new ArrayList<Ville>(ServiceFactory.getServiceFactory().getVilleService().findAll());
    }

    @Override
    public Collection<Transport> findTransportByCriteria(Long villeDepartId, Long villeArriveeId, Date dateDepart) {
        return new ArrayList<Transport>(ServiceFactory.getServiceFactory().getTransportService()
                .findByCriteria(villeDepartId, villeArriveeId, dateDepart));
    }
}
