package main.java.by.itstep.championship.dao;

import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Driver;

public interface CrewDao {

    void createCrew(Driver driver, Car car);
    void changeDriver(Driver ildDriver, Driver newDriver);
    void changeCar(Car oldCar, Car newCar);
}
