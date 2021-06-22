package main.java.by.itstep.championship.service;

import main.java.by.itstep.championship.service.impl.CrewServiceImpl;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public CrewService getCrewService() {
        return new CrewServiceImpl();
    }
}
