package main.java.by.itstep.championship.service;

import main.java.by.itstep.championship.entity.Crew;
import main.java.by.itstep.championship.entity.enums.PartOfTrack;
import main.java.by.itstep.championship.entity.Track;

import java.util.List;

public class Race {

    private CrewService crewService;

    public void start(List <Crew> crews, Track track) {
        for (PartOfTrack partOfTrack: track.getTrack()) {
            for (Crew crew: crews) {
                crewService.drive(crew, partOfTrack);
            }
        }
    }
}
