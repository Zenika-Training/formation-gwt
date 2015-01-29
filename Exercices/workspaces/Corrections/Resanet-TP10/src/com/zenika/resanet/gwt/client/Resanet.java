package com.zenika.resanet.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.zenika.resanet.gwt.client.view.EcranPrincipal;

public class Resanet implements EntryPoint {

    EcranPrincipal ecranPrincipal = new EcranPrincipal();

    @Override
    public void onModuleLoad() {
        RootLayoutPanel rootPanel = RootLayoutPanel.get();

        rootPanel.add(ecranPrincipal);

        History.fireCurrentHistoryState();
    }

}
