package com.zenika.resanet.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {

    Operateur authenticate(LoginDto credentials) throws OperateurNotFoundException;
}
