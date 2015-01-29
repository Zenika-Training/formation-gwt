package com.zenika.resanet.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.zenika.resanet.gwt.client.view.EcranPrincipal;

public class Resanet implements EntryPoint {

    @Override
    public void onModuleLoad() {
    	RootLayoutPanel.get().add(new EcranPrincipal());
    }
   
}
