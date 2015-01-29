package com.zenika.resanet.gwt.server.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import com.zenika.resanet.gwt.server.service.TransportService;
import com.zenika.resanet.gwt.server.service.VilleService;
import com.zenika.resanet.gwt.shared.modele.Avion;
import com.zenika.resanet.gwt.shared.modele.Train;
import com.zenika.resanet.gwt.shared.modele.Transport;
import com.zenika.resanet.gwt.shared.modele.Ville;

public class MockTransportService implements TransportService {

    private VilleService villeService;

    private Collection<Transport> transports = new ArrayList<Transport>();

    public MockTransportService(VilleService villeService) {

        setVilleService(villeService);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Ville paris = villeService.findByName("Paris");
        Ville lyon = villeService.findByName("Lyon");
        Ville marseille = villeService.findByName("Marseille");

        Train train1 = new Train(paris, lyon, calendar.getTime());
        train1.setId(new Long(1));
        train1.setNbSiegesTotal(500);
        train1.setNbSiegesDispo(20);
        train1.setPrix(100f);
        train1.setHeureDepart("10h00");
        train1.setHeureArrivee("12h00");
        train1.setVoitureBar(true);

        Train train2 = new Train(paris, lyon, calendar.getTime());
        train2.setId(new Long(2));
        train2.setNbSiegesTotal(500);
        train2.setNbSiegesDispo(10);
        train2.setPrix(100f);
        train2.setHeureDepart("12h15");
        train2.setHeureArrivee("14h05");
        train2.setVoitureBar(true);

        Train train3 = new Train(paris, marseille, calendar.getTime());
        train3.setId(new Long(3));
        train3.setNbSiegesTotal(500);
        train3.setNbSiegesDispo(20);
        train3.setPrix(150f);
        train3.setHeureDepart("17h00");
        train3.setHeureArrivee("19h00");
        train3.setVoitureBar(false);

        Avion avion1 = new Avion(paris, lyon, calendar.getTime());
        avion1.setId(new Long(4));
        avion1.setNbSiegesTotal(200);
        avion1.setNbSiegesDispo(150);
        avion1.setPrix(500f);
        avion1.setHeureDepart("12h00");
        avion1.setHeureArrivee("12h30");
        avion1.setCompagnie("Air France");

        Avion avion2 = new Avion(paris, marseille, calendar.getTime());
        avion2.setId(new Long(5));
        avion2.setNbSiegesTotal(200);
        avion2.setNbSiegesDispo(50);
        avion2.setPrix(450f);
        avion2.setHeureDepart("18h00");
        avion2.setHeureArrivee("18h30");
        avion2.setCompagnie("Air Italia");

        transports.add(train1);
        transports.add(train2);
        transports.add(train3);
        transports.add(avion1);
        transports.add(avion2);

    }

    @Override
    public Collection<Transport> findByCriteria(Ville villeDepart, Ville villeArrivee, Date dateDepart) {

        Collection<Transport> resultat = new ArrayList<Transport>();

        for (Transport unTransport : transports) {
            if (unTransport.getVilleDepart().equals(villeDepart) && unTransport.getVilleArrivee().equals(villeArrivee)
                    && sameDay(unTransport.getDateDepart(), dateDepart)) {
                resultat.add(unTransport);
            }
        }
        return resultat;
    }

    private boolean sameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }

    @Override
    public Collection<Transport> findByCriteria(Long villeDepartId, Long villeArriveeId, Date dateDepart) {

        Ville villeDepart = villeService.findById(villeDepartId);
        Ville villeArrivee = villeService.findById(villeArriveeId);

        return findByCriteria(villeDepart, villeArrivee, dateDepart);
    }

    @Override
    public Transport findById(Long id) {

        for (Transport unTransport : transports) {
            if (unTransport.getId().equals(id)) {
                return unTransport;
            }
        }

        return null;
    }

    public void setVilleService(VilleService villeService) {
        this.villeService = villeService;
    }

}
