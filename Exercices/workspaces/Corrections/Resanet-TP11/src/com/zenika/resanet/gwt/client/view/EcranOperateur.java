package com.zenika.resanet.gwt.client.view;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.zenika.resanet.gwt.client.i18n.constants.AppConstantes;
import com.zenika.resanet.gwt.client.view.menu.Menu;
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
        saveButton = new Button(AppConstantes.INSTANCE.savechanges());

        loginTextBox.setValue(operateur.getLogin());
        telephoneTextBox.setValue(operateur.getTelephone());
        emailTextBox.setValue(operateur.getCourriel());

        roleListBox.setSelectedIndex(getItemIndex(operateur.getRole()));

        FlexTable flexTable = new FlexTable();
        flexTable.setText(0, 0, AppConstantes.INSTANCE.login());
        flexTable.setText(1, 0, AppConstantes.INSTANCE.phone());
        flexTable.setText(2, 0, AppConstantes.INSTANCE.mail());
        flexTable.setText(3, 0, AppConstantes.INSTANCE.role());

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

        FlowPanel container = new FlowPanel();
        Menu menu = new Menu();
        container.add(menu);
        container.add(mainPanel);

        initWidget(container);

        saveButton.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                Operateur op = new Operateur();
                op.setId(operateur.getId());
                op.setCourriel(emailTextBox.getValue());
                op.setLogin(loginTextBox.getValue());
                op.setPassword(operateur.getPassword());
                op.setRole(roleListBox.getItemText(roleListBox.getSelectedIndex()));
                op.setTelephone(telephoneTextBox.getValue());
                op.setVersion(operateur.getVersion());

                EcranPrincipal.LOGIN_SERVICE.saveOperateur(op, new AsyncCallback<Void>() {

                    @Override
                    public void onSuccess(Void result) {
                        Window.alert(AppConstantes.INSTANCE.operateursaved());
                    }

                    @Override
                    public void onFailure(Throwable caught) {
                        Window.alert(AppConstantes.INSTANCE.operateursavederror());
                    }
                });
            }
        });

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
