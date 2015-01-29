package com.zenika.resanet.gwt.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public class EcranOperateur extends Composite {

    private TextBox loginTextBox;

    private TextBox telephoneTextBox;

    private TextBox emailTextBox;

    private ListBox roleListBox;

    private Button saveButton;

    public EcranOperateur(final Operateur operateur) {

        loginTextBox = new TextBox();
        loginTextBox.setEnabled(false);
        telephoneTextBox = new TextBox();
        emailTextBox = new TextBox();
        roleListBox = new ListBox();
        roleListBox.addItem("ADMINISTRATEUR");
        roleListBox.addItem("AGENT");
        saveButton = new Button("Enregistrer les modifications");

        loginTextBox.setValue(operateur.getLogin());
        telephoneTextBox.setValue(operateur.getTelephone());
        emailTextBox.setValue(operateur.getCourriel());

        roleListBox.setSelectedIndex(getItemIndex(operateur.getRole()));

        FlexTable flexTable = new FlexTable();
        flexTable.setText(0, 0, "Login :");
        flexTable.setText(1, 0, "Téléphone :");
        flexTable.setText(2, 0, "E-mail :");
        flexTable.setText(3, 0, "Rôle :");

        flexTable.setWidget(0, 1, loginTextBox);
        flexTable.setWidget(1, 1, telephoneTextBox);
        flexTable.setWidget(2, 1, emailTextBox);
        flexTable.setWidget(3, 1, roleListBox);

        HorizontalPanel buttonPanel = new HorizontalPanel();
        buttonPanel.addStyleName("buttonBar");

        buttonPanel.add(saveButton);

        VerticalPanel formPanel = new VerticalPanel();
        formPanel.add(flexTable);
        formPanel.add(buttonPanel);

        HorizontalPanel mainPanel = new HorizontalPanel();
        mainPanel.addStyleName("mainPanel");
        mainPanel.add(new Image("images/logo.gif"));
        mainPanel.add(formPanel);

        initWidget(mainPanel);

    }

    private int getItemIndex(String role) {
        for (int i = 0; i < roleListBox.getItemCount(); i++) {
            if (roleListBox.getItemText(i).equals(role)) {
                return i;
            }
        }
        return 0;
    }
}
