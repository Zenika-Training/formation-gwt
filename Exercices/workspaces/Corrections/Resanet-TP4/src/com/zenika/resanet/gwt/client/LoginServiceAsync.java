package com.zenika.resanet.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public interface LoginServiceAsync {

    void authenticate(LoginDto credentials, AsyncCallback<Operateur> callback);

}
