package main.java.by.itstep.championship.entity;

public class Driver {

    private String name;
    private int courage; // from 1 to 10
    private int attentiveness; // from 1 to 10

    public Driver(String name, int courage, int attentiveness) {
        this.name = name;
        this.courage = courage;
        this.attentiveness = attentiveness;
    }

    public String getName() {
        return name;
    }

    public int getCourage() {
        return courage;
    }

    public int getAttentiveness() {
        return attentiveness;
    }
}
