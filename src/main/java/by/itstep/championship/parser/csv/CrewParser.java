package main.java.by.itstep.championship.parser.csv;

import main.java.by.itstep.championship.entity.Crew;

import static main.java.by.itstep.championship.parser.csv.ParserProperties.SEPARATOR;

public class CrewParser {

    public static String parseCrew(Crew crew) {
        StringBuilder crewLine = new StringBuilder("");
        crewLine.append(SEPARATOR);
        crewLine.append(crew.getDriver());
        crewLine.append(SEPARATOR);
        crewLine.append(crew.getDriver());
        crewLine.append(SEPARATOR);
        crewLine.append(crew.getCar());
        return crewLine.toString();
    }
}
