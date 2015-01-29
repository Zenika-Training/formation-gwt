package com.zenika.resanet.gwt.client.i18n.constants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Constants;

public interface AppConstantes extends Constants {

    public static final AppConstantes INSTANCE = GWT.create(AppConstantes.class);

    String reset();

    String log();

    String user();

    String password();

    String operateurnotfound();

    String servererror();

    String fillfields();

    String savechanges();

    String login();

    String phone();

    String mail();

    String role();

    String operateursaved();

    String operateursavederror();

    String deconnect();

    String confirmdeconnect();

    String yes();

    String no();

    String fromcity();

    String tocity();

    String date();

    String search();

    String type();

    String price();

    String totalseats();

    String availableseats();

    String fromhour();

    String tohour();
}
