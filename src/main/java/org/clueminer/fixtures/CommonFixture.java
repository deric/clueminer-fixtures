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
public class CommonFixture extends AbstractFixture {

    public File irisData() throws IOException {
        return resource("iris/iris.data");
    }

    public File irisArff() throws IOException {
        return resource("iris/iris.arff");
    }

    public File wineData() throws IOException {
        return resource("wine/wine.data");
    }

    public File wineArff() throws IOException {
        return resource("wine/wine.arff");
    }

    public File umgArff() throws IOException {
        return resource("umg/data_umg2.arff");
    }

    public File simpleCluster() throws IOException {
        return resource("simple/cluster.arff");
    }

    public File yeastData() throws IOException {
        return resource("yeast/yeast.arff");
    }

    public File wellSeparatedCsv() throws IOException {
        return resource("simple/well-separated/well-separated.csv");
    }

    public File miguel() throws IOException {
        return resource("miguel/miguel.csv");
    }

    public File bananaArff() throws IOException {
        return resource("bananas/banana.arff");
    }

    public File glassArff() throws IOException {
        return resource("glass/glass.arff");
    }

    public File ionosphereArff() throws IOException {
        return resource("ionosphere/ionosphere.arff");
    }

    public File ionosphereArff2() throws IOException {
        return resource("ionosphere/iono.arff");
    }

    public File vehicleArff() throws IOException {
        return resource("vehicle/vehicle.arff");
    }

    public File insectArff() throws IOException {
        return resource("insect/insect.arff");
    }

    public File insectCsv() throws IOException {
        return resource("insect/insect.csv");
    }

    public File sonarArff() throws IOException {
        return resource("sonar/sonar.arff");
    }

    public File dermatologyArff() throws IOException {
        return resource("dermatology/dermatology.arff");
    }

    public File schoolData() throws IOException {
        return resource("school/school.data");
    }

    public File zooCsv() throws IOException {
        return resource("zoo/zoo.csv");
    }

    public File zoo2Arff() throws IOException {
        return resource("zoo/zoo2.arff");
    }

    public File legendreCsv() throws IOException {
        return resource("legendre/legendre.csv");
    }

    public File usArrestsCsv() throws IOException {
        return resource("state/USArrests.csv");
    }

    public File singleLinkEffect() throws IOException {
        return resource("simple/single-link-effect.ascii");
    }

    public File ds577() throws IOException {
        return resource("simple/DS577.arff");
    }

    public File blobs() throws IOException {
        return resource("simple/blobs.arff");
    }

    public File gaussians1() throws IOException {
        return resource("simple/gaussians1.arff");
    }

    public File simpleJson() throws IOException {
        return resource("json/simple.json");
    }

    public File lsun() throws IOException {
        return resource("artificial/lsun.arff");
    }

    public File bla() throws IOException {
        return resource("numerical/bla.arff");
    }

    public File jain() throws IOException {
        return resource("artificial/jain.arff");
    }

    public File spiral() throws IOException {
        return resource("artificial/spiral.arff");
    }

}
