package com.zenika.resanet.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class ModifierOperateurEvent extends GwtEvent<ModifierOperateurHandler> {

    public static Type<ModifierOperateurHandler> TYPE = new Type<ModifierOperateurHandler>();

    @Override
    public Type<ModifierOperateurHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ModifierOperateurHandler handler) {
        handler.onModifierOperateur(this);
    }

}
