package main.java.by.itstep.championship.entity;

import main.java.by.itstep.championship.entity.enums.Team;

public class Crew {

    private Car car;
    private Driver driver;
    private Team team;
    private int time;

    public Crew(Car car, Driver driver, Team team) {
        this.car = car;
        this.driver = driver;
        this.team = team;
        this.time = 0;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Team getTeam() { return team; }

    public int getTime() { return time; }

    public void setTime(int time) { this.time = time; }
}
