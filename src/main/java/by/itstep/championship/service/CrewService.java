package main.java.by.itstep.championship.service;

import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Crew;
import main.java.by.itstep.championship.entity.Driver;
import main.java.by.itstep.championship.entity.enums.PartOfTrack;
import main.java.by.itstep.championship.entity.enums.Team;

public interface CrewService {

    void createCrew(Driver driver, Car car, Team team);
    void changeDriver(Driver oldDriver, Driver newDriver);
    void changeCar(Car oldCar, Car newCar);
    void drive(Crew crew, PartOfTrack partOfTrack);
}
