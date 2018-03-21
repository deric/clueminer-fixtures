/*
 * Copyright (C) 2011-2018 clueminer.org
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
public class BioFixture extends AbstractFixture {

    private static String folder = "bio/";

    public BioFixture() {
        super();
    }

    public File apData() throws IOException {
        return resource(folder + "AP-01_2012112.arff");
    }

    public File genomeFasta() throws IOException {
        return resource(folder + "Genome03EqSet01.fasta");
    }

    public File h1Test() throws IOException {
        return resource(folder + "h1-test.arff");
    }
}
