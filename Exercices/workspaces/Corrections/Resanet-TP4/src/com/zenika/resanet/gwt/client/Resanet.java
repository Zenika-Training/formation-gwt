package com.zenika.resanet.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.zenika.resanet.gwt.shared.LoginDto;
import com.zenika.resanet.gwt.shared.modele.Operateur;
import com.zenika.resanet.gwt.shared.service.exception.OperateurNotFoundException;

public class Resanet implements EntryPoint {

    private LoginServiceAsync loginService = GWT.create(LoginService.class);

    private TextBox userTextBox;

    private TextBox passwordTextBox;

    private Button resetButton;

    private Button submitButton;

    @Override
    public void onModuleLoad() {
        RootLayoutPanel rootPanel = RootLayoutPanel.get();

        userTextBox = new TextBox();
        userTextBox.addStyleName("textBox");
        passwordTextBox = new PasswordTextBox();
        passwordTextBox.addStyleName("textBox");
        resetButton = new Button("Reset");
        resetButton.addStyleName("button");
        submitButton = new Button("Se connecter");
        submitButton.addStyleName("button");

        Grid grid = new Grid(2, 2);
        grid.setWidget(0, 0, new Label("Utilisateur : "));
        grid.setWidget(1, 0, new Label("Mot de passe : "));
        grid.setWidget(0, 1, userTextBox);
        grid.setWidget(1, 1, passwordTextBox);

        HorizontalPanel buttonPanel = new HorizontalPanel();
        buttonPanel.addStyleName("buttonBar");

        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);

        resetButton.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                userTextBox.setValue("");
                passwordTextBox.setValue("");
            }
        });

        submitButton.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                authenticateUser();
            }
        });

        VerticalPanel formPanel = new VerticalPanel();
        formPanel.add(grid);
        formPanel.add(buttonPanel);

        HorizontalPanel mainPanel = new HorizontalPanel();
        mainPanel.addStyleName("mainPanel");
        mainPanel.add(new Image("images/logo.gif"));
        mainPanel.add(formPanel);

        rootPanel.add(mainPanel);

    }

    private void authenticateUser() {
        if (!userTextBox.getValue().isEmpty() && !passwordTextBox.getValue().isEmpty()) {
            LoginDto credentials = new LoginDto(userTextBox.getValue(), passwordTextBox.getValue());

            loginService.authenticate(credentials, new AsyncCallback<Operateur>() {

                @Override
                public void onSuccess(Operateur result) {
                    Window.alert("Opérateur connecté");
                }

                @Override
                public void onFailure(Throwable caught) {
                    if (caught instanceof OperateurNotFoundException) {
                        Window.alert("Opérateur non trouvé");
                    } else {
                        Window.alert("Erreur de communication avec le serveur");
                    }
                }
            });
        } else {
            Window.alert("Merci de renseigner les champs");
        }
    }
}
