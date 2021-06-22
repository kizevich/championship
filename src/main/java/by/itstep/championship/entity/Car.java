package main.java.by.itstep.championship.entity;

public class Car {

    private int maxSpeed;
    private int speedup;
    private int driveAbility; // from 1 to 5

    public Car(int maxSpeed, int speedup, int driveAbility) {
        this.maxSpeed = maxSpeed;
        this.speedup = speedup;
        this.driveAbility = driveAbility;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeedup() {
        return speedup;
    }

    public int getDriveAbility() {
        return driveAbility;
    }
}
