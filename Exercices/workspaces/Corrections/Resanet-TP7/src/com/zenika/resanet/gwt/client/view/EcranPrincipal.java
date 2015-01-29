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
import com.zenika.resanet.gwt.client.i18n.messages.AppMessages;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public class EcranPrincipal extends Composite {

    private FlowPanel flowPanel;

    public static final LoginServiceAsync LOGIN_SERVICE = GWT.create(LoginService.class);

    public static final EventBus EVENT_BUS = new SimpleEventBus();

    public EcranPrincipal() {
        flowPanel = new FlowPanel();
        initWidget(flowPanel);

        flowPanel.add(new EcranLogin());

        EVENT_BUS.addHandler(LoginEvent.TYPE, new LoginHandler() {

            @Override
            public void onLogin(LoginEvent event) {
                Window.alert(AppMessages.INSTANCE.welcomeuser(event.getOperateur().getLogin()));
                showEcranOperateur(event.getOperateur());
            }
        });
    }

    private void showEcranOperateur(Operateur result) {
        flowPanel.clear();
        flowPanel.add(new EcranOperateur(result));
    }
}
