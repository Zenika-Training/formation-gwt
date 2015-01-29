package com.zenika.resanet.gwt.client.view;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.zenika.resanet.gwt.client.i18n.constants.AppConstantes;
import com.zenika.resanet.gwt.shared.modele.Transport;
import com.zenika.resanet.gwt.shared.modele.Ville;

public class EcranRecherche extends Composite {

	private static EcranRechercheUiBinder uiBinder = GWT
			.create(EcranRechercheUiBinder.class);

	interface EcranRechercheUiBinder extends UiBinder<Widget, EcranRecherche> {
	}

	@UiField(provided = true)
	AppConstantes constants = AppConstantes.INSTANCE;

	@UiField
	ListBox fromCityList;

	@UiField
	ListBox toCityList;

	@UiField
	CellTable<Transport> resultsTable;

	@UiField
	DateBox dateBox;

	public EcranRecherche() {
		initWidget(uiBinder.createAndBindUi(this));
		EcranPrincipal.LOGIN_SERVICE
				.findAllVilles(new AsyncCallback<Collection<Ville>>() {

					@Override
					public void onSuccess(Collection<Ville> result) {
						for (Ville ville : result) {
							fromCityList.addItem(ville.getNom(), ville.getId()
									.toString());
							toCityList.addItem(ville.getNom(), ville.getId()
									.toString());
						}
					}

					@Override
					public void onFailure(Throwable caught) {
						Window.alert(constants.servererror());
					}
				});

		buildResultTable();
		resultsTable.setVisible(false);
	}

	public float calculatePrice(Transport object) {
		if (EcranPrincipal.currentOperateur != null
				&& EcranPrincipal.currentOperateur.getRole().equals(
						"ADMINISTRATEUR")) {
			return object.getPrix() - object.getPrix() * 5 / 100;
		}
		return object.getPrix();
	}

	private void buildResultTable() {
		TextColumn<Transport> priceColumn = new TextColumn<Transport>() {

			@Override
			public String getValue(Transport object) {
				return String.valueOf(calculatePrice(object));
			}
		};
		resultsTable.addColumn(priceColumn, constants.price());

		TextColumn<Transport> totalSeatsColumn = new TextColumn<Transport>() {

			@Override
			public String getValue(Transport object) {
				return String.valueOf(object.getNbSiegesTotal());
			}
		};
		resultsTable.addColumn(totalSeatsColumn, constants.totalseats());

		TextColumn<Transport> availableSeatsColumn = new TextColumn<Transport>() {

			@Override
			public String getValue(Transport object) {
				return String.valueOf(object.getNbSiegesDispo());
			}
		};
		resultsTable
				.addColumn(availableSeatsColumn, constants.availableseats());

		TextColumn<Transport> departureTimeColumn = new TextColumn<Transport>() {

			@Override
			public String getValue(Transport object) {
				return object.getHeureDepart();
			}
		};
		resultsTable.addColumn(departureTimeColumn, constants.fromhour());

		TextColumn<Transport> arrivalTime = new TextColumn<Transport>() {

			@Override
			public String getValue(Transport object) {
				return object.getHeureArrivee();
			}
		};
		resultsTable.addColumn(arrivalTime, constants.tohour());
	}

	@UiHandler("searchButton")
	public void handleSearch(ClickEvent event) {
		if (dateBox.getValue() == null) {
			Window.alert(constants.fillfields());
		} else {
			EcranPrincipal.LOGIN_SERVICE.findTransportByCriteria(Long
					.valueOf(fromCityList.getValue(fromCityList
							.getSelectedIndex())), Long.valueOf(toCityList
					.getValue(toCityList.getSelectedIndex())), dateBox
					.getValue(), new AsyncCallback<Collection<Transport>>() {

				@Override
				public void onFailure(Throwable caught) {
					Window.alert(constants.servererror());
				}

				@Override
				public void onSuccess(Collection<Transport> result) {
					resultsTable.setRowData(new ArrayList<Transport>(result));
					resultsTable.setVisible(true);
				}
			});
		}
	}
}
