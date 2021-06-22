package main.java.by.itstep.championship.dao.impl;

import main.java.by.itstep.championship.dao.CrewDao;
import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Crew;
import main.java.by.itstep.championship.entity.Driver;
import main.java.by.itstep.championship.entity.enums.PartOfTrack;
import main.java.by.itstep.championship.entity.enums.Team;

import static main.java.by.itstep.championship.parser.csv.CrewParser.parseCrew;

public class CrewDaoImpl implements CrewDao {
    @Override
    public void createCrew(Driver driver, Car car, Team team) {
        String CrewLine = parseCrew(new Crew(car, driver, team));
    }

    @Override
    public void changeDriver(Driver ildDriver, Driver newDriver) {

    }

    @Override
    public void changeCar(Car oldCar, Car newCar) {

    }

    @Override
    public void drive(Crew crew, PartOfTrack partOfTrack) {

    }
}
