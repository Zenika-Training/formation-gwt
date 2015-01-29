package com.zenika.resanet.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.zenika.resanet.gwt.client.LoginService;
import com.zenika.resanet.gwt.server.service.factory.ServiceFactory;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

@SuppressWarnings("serial")
public class SimpleLoginService extends RemoteServiceServlet implements LoginService {

    @Override
    public Operateur authenticate(LoginDto credentials) throws OperateurNotFoundException {
        return ServiceFactory.getServiceFactory().getAuthentificationService()
                .authentifier(credentials.getUser(), credentials.getPassword());
    }
}
