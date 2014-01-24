package org.clueminer.fixtures;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Tomas Barton
 */
public class TimeseriesFixture extends AbstractFixture {

    private static final String PREFIX = "sax/timeseries/";

    public File data01() throws IOException {
        return resource(PREFIX + "timeseries01.csv");
    }

    public File data02() throws IOException {
        return resource(PREFIX + "timeseries02.csv");
    }

    public File irBenzin() throws IOException {
        return resource("ir/40757_3.CSV");
    }

    public File ts01() {
        return resource("ts/33040.csv");
    }

    public File quoted() {
        return resource("ts/quoted.csv");
    }

    public File trace0() {
        return resource("ts/trace0.csv");
    }

    public File trace1() {
        return resource("ts/trace1.csv");
    }
    
    public File ap01() {
        return resource("ts/AP-01.csv");
    }
}
