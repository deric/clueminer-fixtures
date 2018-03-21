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

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author deric
 */
public class ClustFixtureTest {

    private static ClustFixture instance;

    public ClustFixtureTest() {
        instance = new ClustFixture();
    }

    @Test
    public void testExt100p2() throws Exception {
        assertTrue(instance.ext100p2().exists());
    }

    @Test
    public void testExt100p3() throws Exception {
        assertTrue(instance.ext100p3().exists());
    }

    @Test
    public void testInt400p4() throws Exception {
        assertTrue(instance.int400p4().exists());
    }

    @Test
    public void testInt400p4assign() throws Exception {
        assertTrue(instance.int400p4assign().exists());
    }

}
