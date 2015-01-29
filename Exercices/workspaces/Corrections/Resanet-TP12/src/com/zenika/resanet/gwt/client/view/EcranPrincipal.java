package com.zenika.resanet.gwt.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.zenika.resanet.gwt.client.LoginService;
import com.zenika.resanet.gwt.client.LoginServiceAsync;
import com.zenika.resanet.gwt.client.event.LoginEvent;
import com.zenika.resanet.gwt.client.event.LoginHandler;
import com.zenika.resanet.gwt.client.event.LogoutEvent;
import com.zenika.resanet.gwt.client.event.LogoutHandler;
import com.zenika.resanet.gwt.client.event.ModifierOperateurEvent;
import com.zenika.resanet.gwt.client.event.ModifierOperateurHandler;
import com.zenika.resanet.gwt.client.event.RechercherVoyageEvent;
import com.zenika.resanet.gwt.client.event.RechercherVoyageHandler;
import com.zenika.resanet.gwt.client.i18n.messages.AppMessages;
import com.zenika.resanet.gwt.shared.modele.Operateur;

public class EcranPrincipal extends Composite {

	public final static String HISTORY_MODIFIER_OPERATEUR = "modifier-operateur";

	public final static String HISTORY_RECHERCHER_VOYAGES = "rechercher-voyages";

	private FlowPanel flowPanel;

	public static final LoginServiceAsync LOGIN_SERVICE = GWT
			.create(LoginService.class);

	public static final EventBus EVENT_BUS = new SimpleEventBus();

	private Operateur currentOperateur = new Operateur();

	public EcranPrincipal() {
		flowPanel = new FlowPanel();
		initWidget(flowPanel);

		flowPanel.add(new EcranLogin());

		EVENT_BUS.addHandler(LoginEvent.TYPE, new LoginHandler() {

			@Override
			public void onLogin(LoginEvent event) {
				Window.alert(AppMessages.INSTANCE.welcomeuser(event
						.getOperateur().getLogin()));
				currentOperateur = event.getOperateur();
				showEcranOperateur(event.getOperateur());
			}
		});

		EVENT_BUS.addHandler(LogoutEvent.TYPE, new LogoutHandler() {

			@Override
			public void onLogout(LogoutEvent event) {
				currentOperateur = new Operateur();
				showEcranLogin();
			}

		});

		EVENT_BUS.addHandler(RechercherVoyageEvent.TYPE,
				new RechercherVoyageHandler() {

					@Override
					public void onRechercherVoyage(RechercherVoyageEvent event) {
						showEcranRechercheVoyage();
					}
				});

		EVENT_BUS.addHandler(ModifierOperateurEvent.TYPE,
				new ModifierOperateurHandler() {

					@Override
					public void onModifierOperateur(ModifierOperateurEvent event) {
						showEcranOperateur(currentOperateur);
					}
				});

		hookHistory();

	}

	public void showEcranRechercheVoyage() {
		GWT.runAsync(new RunAsyncCallback() {
			@Override
			public void onSuccess() {
				flowPanel.clear();
				flowPanel.add(new EcranRecherche());
				History.newItem(HISTORY_RECHERCHER_VOYAGES, false);
			}

			@Override
			public void onFailure(Throwable reason) {
				Window.alert("Le chargement du module de recherche de voyages à échoué");
			}
		});
	}

	public void showEcranLogin() {
		flowPanel.clear();
		flowPanel.add(new EcranLogin());
		History.newItem("", false);
	}

	public void showEcranOperateur(final Operateur result) {
		GWT.runAsync(new RunAsyncCallback() {
			@Override
			public void onSuccess() {
				flowPanel.clear();
				flowPanel.add(new EcranOperateur(result));
				History.newItem(HISTORY_MODIFIER_OPERATEUR, false);
			}

			@Override
			public void onFailure(Throwable reason) {
				Window.alert("Le chargement du module de gestion de l'opérateur à échoué");
			}
		});
	}

	public void showEcranOperateur() {
		showEcranOperateur(currentOperateur);
	}

	private void hookHistory() {
		History.addValueChangeHandler(new ValueChangeHandler<String>() {

			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				String token = event.getValue();
				if (HISTORY_MODIFIER_OPERATEUR.equals(token)) {
					showEcranOperateur();
				} else if (HISTORY_RECHERCHER_VOYAGES.equals(token)) {
					showEcranRechercheVoyage();
				} else {
					showEcranLogin();
				}
			}
		});
	}
}
