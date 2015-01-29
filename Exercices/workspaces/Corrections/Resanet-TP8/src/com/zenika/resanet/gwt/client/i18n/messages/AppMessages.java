package com.zenika.resanet.gwt.client.i18n.messages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface AppMessages extends Messages {

    public static final AppMessages INSTANCE = GWT.create(AppMessages.class);

    String welcomeuser(String login);

}
