package com.zenika.resanet.gwt.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.zenika.resanet.gwt.client.LoginService;
import com.zenika.resanet.gwt.client.LoginServiceAsync;
import com.zenika.resanet.gwt.client.event.LoginEvent;
import com.zenika.resanet.gwt.client.event.LoginHandler;
import com.zenika.resanet.gwt.client.event.LogoutEvent;
import com.zenika.resanet.gwt.client.event.LogoutHandler;
import com.zenika.resanet.gwt.client.event.ModifierOperateurEvent;
import com.zenika.resanet.gwt.client.event.ModifierOperateurHandler;
import com.zenika.resanet.gwt.client.event.RechercherVoyageEvent;
import com.zenika.resanet.gwt.client.event.RechercherVoyageHandler;
import com.zenika.resanet.gwt.client.i18n.messages.AppMessages;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public class EcranPrincipal extends Composite {

    private FlowPanel flowPanel;

    public static final LoginServiceAsync LOGIN_SERVICE = GWT.create(LoginService.class);

    public static final EventBus EVENT_BUS = new SimpleEventBus();

    private Operateur currentOperateur = new Operateur();

    public EcranPrincipal() {
        flowPanel = new FlowPanel();
        initWidget(flowPanel);

        flowPanel.add(new EcranLogin());

        EVENT_BUS.addHandler(LoginEvent.TYPE, new LoginHandler() {

            @Override
            public void onLogin(LoginEvent event) {
                Window.alert(AppMessages.INSTANCE.welcomeuser(event.getOperateur().getLogin()));
                currentOperateur = event.getOperateur();
                showEcranOperateur(event.getOperateur());
            }
        });

        EVENT_BUS.addHandler(LogoutEvent.TYPE, new LogoutHandler() {

            @Override
            public void onLogout(LogoutEvent event) {
                currentOperateur = new Operateur();
                showEcranLogin();
            }

        });

        EVENT_BUS.addHandler(RechercherVoyageEvent.TYPE, new RechercherVoyageHandler() {

            @Override
            public void onRechercherVoyage(RechercherVoyageEvent event) {
                showEcranRechercheVoyage();
            }
        });

        EVENT_BUS.addHandler(ModifierOperateurEvent.TYPE, new ModifierOperateurHandler() {

            @Override
            public void onModifierOperateur(ModifierOperateurEvent event) {
                showEcranOperateur(currentOperateur);
            }
        });

    }

    protected void showEcranRechercheVoyage() {
        flowPanel.clear();
        flowPanel.add(new EcranRecherche());
    }

    private void showEcranLogin() {
        flowPanel.clear();
        flowPanel.add(new EcranLogin());
    }

    private void showEcranOperateur(Operateur result) {
        flowPanel.clear();
        flowPanel.add(new EcranOperateur(result));
    }
}
