package main.java.by.itstep.championship.controller.impl;

import main.java.by.itstep.championship.controller.CrewController;
import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Driver;
import main.java.by.itstep.championship.service.CrewService;
import main.java.by.itstep.championship.service.ServiceFactory;

public class CrewControllerImpl implements CrewController {

    private CrewService crewService;

    public CrewControllerImpl() {
        this.crewService = ServiceFactory.getInstance().getCrewService();
    }

    @Override
    public void createCrew(Driver driver, Car car) {
        crewService.createCrew(driver,car);
    }

    @Override
    public void changeDriver(Driver oldDriver, Driver newDriver) {
        crewService.changeDriver(oldDriver, newDriver);
    }

    @Override
    public void changeCar(Car oldCar, Car newCar) {
        crewService.changeCar(oldCar, newCar);
    }
}
