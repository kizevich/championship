package main.java.by.itstep.championship;

import java.io.File;

public interface Properties {

    String ROOT_DIR = System.getProperty("user.dir") + File.separator + "db";
    String TEAM1_FILE_PATH = ROOT_DIR + File.separator+ "team1.csv";

}
