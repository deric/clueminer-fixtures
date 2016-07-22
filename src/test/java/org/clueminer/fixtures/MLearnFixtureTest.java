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

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author tombart
 */
public class MLearnFixtureTest {

    private MLearnFixture subject;

    public MLearnFixtureTest() {
        subject = new MLearnFixture();
    }

    @Test
    public void testIris() throws Exception {
        assertTrue(subject.iris().exists());
    }

    @Test
    public void testBosthouse() throws Exception {
        assertTrue(subject.bosthouse().exists());
    }

    @Test
    public void testIrisMissing() throws Exception {
        assertTrue(subject.irisMissing().exists());
    }

    @Test
    public void testIrisQuoted1() throws Exception {
        assertTrue(subject.irisQuoted1().exists());
    }

    @Test
    public void testIrisQuoted2() throws Exception {
        assertTrue(subject.irisQuoted2().exists());
    }

    @Test
    public void testCars() throws Exception {
        assertTrue(subject.cars().exists());
    }

    @Test
    public void testDermatology() throws Exception {
        assertTrue(subject.dermatology().exists());
    }

    @Test
    public void testForrestFires() throws Exception {
        assertTrue(subject.forrestFires().exists());
    }

    @Test
    public void testIrBaClassification() throws Exception {
        assertTrue(subject.irBaClassification().exists());
    }

    @Test
    public void testCorrelation() throws Exception {
        assertTrue(subject.correlations().exists());
    }

    @Test
    public void testSpirals() throws Exception {
        assertTrue(subject.spirals().exists());
    }
}
