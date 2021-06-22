package main.java.by.itstep.championship.service.impl;

import main.java.by.itstep.championship.dao.CrewDao;
import main.java.by.itstep.championship.dao.DaoFactory;
import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Driver;
import main.java.by.itstep.championship.service.CrewService;

public class CrewServiceImpl implements CrewService {

    private CrewDao crewDao;

    public CrewServiceImpl() {
        crewDao = DaoFactory.getInstance().getCrewDao();
    }

    @Override
    public void createCrew(Driver driver, Car car) {
        crewDao.createCrew(driver, car);
    }

    @Override
    public void changeDriver(Driver oldDriver, Driver newDriver) {
        crewDao.changeDriver(oldDriver, newDriver);
    }

    @Override
    public void changeCar(Car oldCar, Car newCar) {
        crewDao.changeCar(oldCar, newCar);
    }
}
