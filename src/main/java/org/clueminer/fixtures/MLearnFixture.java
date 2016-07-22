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
public class MLearnFixture extends AbstractFixture {

    public File bosthouse() throws IOException {
        return resource("bosthouse/bosthouse.txt");
    }

    public File cars() throws IOException {
        return resource("car/cars.tab");
    }

    public File dermatology() throws IOException {
        return resource("dermatology/dermatology.arff");
    }

    public File forrestFires() throws IOException {
        return resource("forrestfires/forestfires.csv");
    }

    public File iris() throws IOException {
        return resource("iris/iris.data");
    }

    public File irisMissing() throws IOException {
        return resource("iris/iris-missings.data");
    }

    public File irisQuoted1() throws IOException {
        return resource("iris/iris-quoted1.data");
    }

    public File irisQuoted2() throws IOException {
        return resource("iris/iris-quoted2.data");
    }

    public File irBaClassification() throws IOException {
        return resource("ir/ir_ba_classification.csv");
    }

    public File correlations() throws IOException {
        return resource("csv/correlation.csv");
    }

    public File spirals() throws IOException {
        return resource("csv/SpiralsData.csv");
    }
}
