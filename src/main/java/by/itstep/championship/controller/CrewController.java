package main.java.by.itstep.championship.controller;

import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Driver;

public interface CrewController {

    void createCrew(Driver driver, Car car);
    void changeDriver(Driver oldDriver, Driver newDriver);
    void changeCar(Car oldCar, Car newCar);
}
