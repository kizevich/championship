package main.java.by.itstep.championship.dao;

import main.java.by.itstep.championship.dao.impl.CrewDaoImpl;

public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory(){
    }

    public static DaoFactory getInstance(){
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public CrewDao getCrewDao() {
        return  new CrewDaoImpl();
    }
}
