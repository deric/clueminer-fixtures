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
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author deric
 */
public class BioFixtureTest {

    private static BioFixture instance;

    public BioFixtureTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        instance = new BioFixture();
    }

    @Test
    public void testTestData() throws Exception {
        File result = instance.apData();
        assertEquals(true, result.exists());

    }

    @Test
    public void testGenomeFasta() throws Exception {
        File result = instance.genomeFasta();
        assertEquals(true, result.exists());
    }

    @Test
    public void testH1Test() throws Exception {
        File result = instance.h1Test();
        assertEquals(true, result.exists());
    }
}
