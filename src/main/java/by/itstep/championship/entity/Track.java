package main.java.by.itstep.championship.entity;

import main.java.by.itstep.championship.entity.enums.PartOfTrack;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<PartOfTrack> track = new ArrayList<>();
    private int length;

    public Track(List track) {
        this.track = track;
        for (PartOfTrack road : this.track) {
            length += road.getLength();
        }
    }

    public List<PartOfTrack> getTrack() {
        return track;
    }

    public int getLength() {
        return length;
    }
}
