package com.zenika.resanet.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class Resanet implements EntryPoint {

    private TextBox userTextBox;

    private TextBox passwordTextBox;

    private Button resetButton;

    private Button submitButton;

    @Override
    public void onModuleLoad() {
        RootPanel userLabelPanel = RootPanel.get("login.user.label");
        userLabelPanel.add(new Label("Utilisateur : "));

        RootPanel userInputPanel = RootPanel.get("login.user.input");
        userTextBox = new TextBox();
        userTextBox.addStyleName("textBox");
        userInputPanel.add(userTextBox);

        RootPanel passwordLabelPanel = RootPanel.get("login.password.label");
        passwordLabelPanel.add(new Label("Mot de passe : "));

        RootPanel passwordInputPanel = RootPanel.get("login.password.input");
        passwordTextBox = new PasswordTextBox();
        passwordTextBox.addStyleName("textBox");
        passwordInputPanel.add(passwordTextBox);

        RootPanel resetPanel = RootPanel.get("login.reset");
        resetButton = new Button("Reset");
        resetPanel.add(resetButton);

        RootPanel submitPanel = RootPanel.get("login.submit");
        submitButton = new Button("Se connecter");
        submitPanel.add(submitButton);

    }
}
