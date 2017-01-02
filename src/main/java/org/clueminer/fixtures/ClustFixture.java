/*
 * Copyright (C) 2011-2017 clueminer.org
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
 * @author deric
 */
public class ClustFixture extends AbstractFixture {

    public File ext100p2() throws IOException {
        return resource("clusterCrit/ext100_p2.csv");
    }

    public File ext100p3() throws IOException {
        return resource("clusterCrit/ext100_p3.csv");
    }

    public File int400p4() throws IOException {
        return resource("clusterCrit/int400_4.csv");
    }

    public File int400p4assign() throws IOException {
        return resource("clusterCrit/int400_4_assign.csv");
    }
}
