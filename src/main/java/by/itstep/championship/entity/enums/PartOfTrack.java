package main.java.by.itstep.championship.entity.enums;

public enum PartOfTrack {

    STRAIGHT1(500),
    STRAIGHT2(250),
    TURN1(100, 3),
    TURN2(50, 5);

    private int length;
    private int steepness; // from 1 to 5

    PartOfTrack(int length) {
        this.length = length;
    }

    PartOfTrack(int length, int steepness) {
        this.length = length;
        this.steepness = steepness;
    }

    public int getLength() {
        return length;
    }

    public int getSteepness() {
        return steepness;
    }
}
