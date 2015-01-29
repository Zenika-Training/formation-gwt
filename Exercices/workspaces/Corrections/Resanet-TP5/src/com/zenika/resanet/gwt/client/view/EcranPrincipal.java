package com.zenika.resanet.gwt.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.zenika.resanet.gwt.client.LoginService;
import com.zenika.resanet.gwt.client.LoginServiceAsync;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public class EcranPrincipal extends Composite {

    private FlowPanel flowPanel;

    public static final LoginServiceAsync LOGIN_SERVICE = GWT.create(LoginService.class);

    public static final EventBus EVENT_BUS = new SimpleEventBus();

    public EcranPrincipal() {
        flowPanel = new FlowPanel();
        initWidget(flowPanel);
        flowPanel.add(new EcranLogin(this));
    }

    public void showEcranOperateur(Operateur result) {
        flowPanel.clear();
        flowPanel.add(new EcranOperateur(result));
    }
}
