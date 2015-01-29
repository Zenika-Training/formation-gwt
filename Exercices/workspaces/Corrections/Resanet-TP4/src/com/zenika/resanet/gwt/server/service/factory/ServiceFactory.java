package com.zenika.resanet.gwt.server.service.factory;

import com.zenika.resanet.gwt.server.service.AuthentificationService;
import com.zenika.resanet.gwt.server.service.PaysService;
import com.zenika.resanet.gwt.server.service.TransportService;
import com.zenika.resanet.gwt.server.service.VilleService;
import com.zenika.resanet.gwt.server.service.impl.MockAuthentificationService;
import com.zenika.resanet.gwt.server.service.impl.MockPaysService;
import com.zenika.resanet.gwt.server.service.impl.MockTransportService;
import com.zenika.resanet.gwt.server.service.impl.MockVilleService;

public class ServiceFactory {

    private AuthentificationService authentificationService;

    private PaysService paysService;

    private VilleService villeService;

    private TransportService transportService;

    private static ServiceFactory instance;

    private ServiceFactory() {
        authentificationService = new MockAuthentificationService();
        paysService = new MockPaysService();
        villeService = new MockVilleService(paysService);
        transportService = new MockTransportService(villeService);
    }

    public static ServiceFactory getServiceFactory() {
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }

    public AuthentificationService getAuthentificationService() {
        return authentificationService;
    }

    public PaysService getPaysService() {
        return paysService;
    }

    public VilleService getVilleService() {
        return villeService;
    }

    public TransportService getTransportService() {
        return transportService;
    }
}
