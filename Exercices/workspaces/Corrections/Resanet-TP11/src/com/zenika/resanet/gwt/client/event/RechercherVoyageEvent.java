package com.zenika.resanet.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class RechercherVoyageEvent extends GwtEvent<RechercherVoyageHandler> {

    public static Type<RechercherVoyageHandler> TYPE = new Type<RechercherVoyageHandler>();

    @Override
    public Type<RechercherVoyageHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RechercherVoyageHandler handler) {
        handler.onRechercherVoyage(this);
    }

}
