/*
 * Copyright (C) 2011-2016 clueminer.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
