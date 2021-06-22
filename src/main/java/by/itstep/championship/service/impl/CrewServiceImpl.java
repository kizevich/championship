package main.java.by.itstep.championship.service.impl;

import main.java.by.itstep.championship.dao.CrewDao;
import main.java.by.itstep.championship.dao.DaoFactory;
import main.java.by.itstep.championship.entity.Car;
import main.java.by.itstep.championship.entity.Crew;
import main.java.by.itstep.championship.entity.Driver;
import main.java.by.itstep.championship.entity.enums.PartOfTrack;
import main.java.by.itstep.championship.entity.enums.Team;
import main.java.by.itstep.championship.service.CrewService;

public class CrewServiceImpl implements CrewService {

    private CrewDao crewDao;

    public CrewServiceImpl() {
        crewDao = DaoFactory.getInstance().getCrewDao();
    }

    @Override
    public void createCrew(Driver driver, Car car, Team team) {
        crewDao.createCrew(driver, car, team);
    }

    @Override
    public void changeDriver(Driver oldDriver, Driver newDriver) {
        crewDao.changeDriver(oldDriver, newDriver);
    }

    @Override
    public void changeCar(Car oldCar, Car newCar) {
        crewDao.changeCar(oldCar, newCar);
    }

    @Override
    public void drive(Crew crew, PartOfTrack partOfTrack) {
        if (partOfTrack.getId() == 0) {
            crew.setTime(driveTheStraight(crew, partOfTrack));
        }
        crewDao.drive(crew, partOfTrack);
    }

    private float driveTheTurn(Crew crew, PartOfTrack partOfTrack) {
        return -1;
    }

    private float driveTheStraight(Crew crew, PartOfTrack partOfTrack) {
        return (float) Math.sqrt(2 * partOfTrack.getLength() / crew.getCar().getSpeedup());
    }
}
