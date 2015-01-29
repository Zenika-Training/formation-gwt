package com.zenika.resanet.gwt.client.view.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;
import com.zenika.resanet.gwt.client.event.ModifierOperateurEvent;
import com.zenika.resanet.gwt.client.event.RechercherVoyageEvent;
import com.zenika.resanet.gwt.client.view.EcranPrincipal;
import com.zenika.resanet.gwt.client.view.popup.LogoutPopup;

public class Menu extends Composite {

    private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);

    interface MenuUiBinder extends UiBinder<Widget, Menu> {
    }

    @UiField
    MenuItem modifierItem;

    @UiField
    MenuItem deconnecterItem;

    @UiField
    MenuItem rechercherItem;

    public Menu() {
        initWidget(uiBinder.createAndBindUi(this));
        modifierItem.setCommand(new Command() {

            @Override
            public void execute() {
                EcranPrincipal.EVENT_BUS.fireEvent(new ModifierOperateurEvent());
            }
        });

        deconnecterItem.setCommand(new Command() {

            @Override
            public void execute() {
                LogoutPopup logoutPopup = new LogoutPopup();
                logoutPopup.center();
            }
        });

        rechercherItem.setCommand(new Command() {

            @Override
            public void execute() {
                EcranPrincipal.EVENT_BUS.fireEvent(new RechercherVoyageEvent());
            }
        });
    }
}
