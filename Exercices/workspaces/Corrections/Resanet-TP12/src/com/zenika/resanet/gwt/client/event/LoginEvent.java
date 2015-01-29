package com.zenika.resanet.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public class LoginEvent extends GwtEvent<LoginHandler> {

    public static Type<LoginHandler> TYPE = new Type<LoginHandler>();

    private Operateur operateur = null;

    public LoginEvent(Operateur operateur) {
        this.operateur = operateur;
    }

    public Operateur getOperateur() {
        return operateur;
    }

    @Override
    public Type<LoginHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(LoginHandler handler) {
        handler.onLogin(this);
    }

}
