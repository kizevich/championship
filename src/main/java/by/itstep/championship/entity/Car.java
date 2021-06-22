package main.java.by.itstep.championship.entity;

public class Car {

    private float maxSpeed;
    private float speedup;
    private float driveAbility; // from 1 to 5

    public Car(int maxSpeed, int speedup, int driveAbility) {
        this.maxSpeed = maxSpeed;
        this.speedup = speedup;
        this.driveAbility = driveAbility;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getSpeedup() {
        return speedup;
    }

    public float getDriveAbility() {
        return driveAbility;
    }
}
