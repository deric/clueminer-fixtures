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
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deric
 */
public class CommonFixtureTest {

    private static CommonFixture instance;

    public CommonFixtureTest() {
    }

    @Before
    public void setUp() {
        instance = new CommonFixture();
    }

    @Test
    public void testMakePath() throws Exception {
    }

    @Test
    public void testIrisData() throws Exception {
        assertTrue(instance.irisData().exists());
    }

    @Test
    public void testIrisArff() throws Exception {
        assertTrue(instance.irisArff().exists());
    }

    @Test
    public void testWineData() throws Exception {
        assertTrue(instance.wineData().exists());
    }

    @Test
    public void testUmgArff() throws Exception {
        assertTrue(instance.umgArff().exists());
    }

    @Test
    public void testSimpleCluster() throws Exception {
    }

    @Test
    public void testWellSeparatedCsv() throws Exception {
        assertTrue(instance.wellSeparatedCsv().exists());
    }

    @Test
    public void testBananaArff() throws Exception {
        assertTrue(instance.bananaArff().exists());
    }

    @Test
    public void testGlassArff() throws Exception {
        assertTrue(instance.glassArff().exists());
    }

    @Test
    public void testIonosphereArff() throws Exception {
        assertTrue(instance.ionosphereArff().exists());
    }

    @Test
    public void testIonosphereArff2() throws Exception {
        assertTrue(instance.ionosphereArff2().exists());
    }

    @Test
    public void testVehicleArff() throws Exception {
        assertTrue(instance.vehicleArff().exists());
    }

    @Test
    public void testInsectArff() throws Exception {
        assertTrue(instance.insectArff().exists());
    }

    @Test
    public void testInsectCsv() throws Exception {
        assertTrue(instance.insectCsv().exists());
    }

    @Test
    public void testSonarArff() throws Exception {
        assertTrue(instance.sonarArff().exists());
    }

    @Test
    public void testDermatologyArff() throws Exception {
        assertTrue(instance.dermatologyArff().exists());
    }

    @Test
    public void testSchoolData() throws Exception {
        assertTrue(instance.schoolData().exists());
    }

    @Test
    public void testZooCsv() throws Exception {
        assertTrue(instance.zooCsv().exists());
    }

    @Test
    public void testLegendreCsv() throws Exception {
        assertTrue(instance.legendreCsv().exists());
    }

    @Test
    public void testWineArff() throws Exception {
        assertTrue(instance.wineArff().exists());
    }

    @Test
    public void testYeastData() throws Exception {
        assertTrue(instance.yeastData().exists());
    }

    @Test
    public void testMiguel() throws Exception {
        assertTrue(instance.miguel().exists());
    }

    @Test
    public void testUsArrestsCsv() throws Exception {
        assertTrue(instance.usArrestsCsv().exists());
    }

    @Test
    public void testSingleLinkEffect() throws Exception {
        assertTrue(instance.singleLinkEffect().exists());
    }

    @Test
    public void testZoo() throws Exception {
        assertTrue(instance.zoo2Arff().exists());
    }

    @Test
    public void testDs577() throws Exception {
        assertTrue(instance.ds577().exists());
    }

    @Test
    public void testBlobs() throws Exception {
        assertTrue(instance.blobs().exists());
    }

    @Test
    public void testGaussians1() throws Exception {
        assertTrue(instance.gaussians1().exists());
    }

    @Test
    public void testSimplJson() throws Exception {
        assertTrue(instance.simpleJson().exists());
    }

    @Test
    public void testLsun() throws Exception {
        assertTrue(instance.lsun().exists());
    }

    @Test
    public void testBla() throws Exception {
        assertTrue(instance.bla().exists());
    }
}
