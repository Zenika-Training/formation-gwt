package com.zenika.resanet.gwt.client.view.popup;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.zenika.resanet.gwt.client.event.LogoutEvent;
import com.zenika.resanet.gwt.client.i18n.constants.AppConstantes;
import com.zenika.resanet.gwt.client.view.EcranPrincipal;

public class LogoutPopup extends DialogBox {

    private static LogoutPopupUiBinder uiBinder = GWT.create(LogoutPopupUiBinder.class);

    @UiField(provided = true)
    AppConstantes constants = AppConstantes.INSTANCE;

    interface LogoutPopupUiBinder extends UiBinder<DialogBox, LogoutPopup> {
    }

    public LogoutPopup() {
        uiBinder.createAndBindUi(this);
    }

    @UiHandler("yesButton")
    public void handlerYesClick(ClickEvent event) {
        EcranPrincipal.EVENT_BUS.fireEvent(new LogoutEvent());
        LogoutPopup.this.hide();
    }

    @UiHandler("noButton")
    public void handlerNoClick(ClickEvent event) {
        LogoutPopup.this.hide();
    }

    @UiFactory
    DialogBox getMe() {
        return this;
    }

}
