package main.java.by.itstep.championship.dao.impl;

import main.java.by.itstep.championship.dao.CrewDao;
import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Crew;
import main.java.by.itstep.championship.entity.Driver;

import static main.java.by.itstep.championship.parser.csv.CrewParser.parseCrew;

public class CrewDaoImpl implements CrewDao {
    @Override
    public void createCrew(Driver driver, Car car) {
        String CrewLine = parseCrew(new Crew(car, driver));
    }

    @Override
    public void changeDriver(Driver ildDriver, Driver newDriver) {

    }

    @Override
    public void changeCar(Car oldCar, Car newCar) {

    }
}
