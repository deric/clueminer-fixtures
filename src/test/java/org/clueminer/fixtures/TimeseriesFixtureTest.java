package org.clueminer.fixtures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deric
 */
public class TimeseriesFixtureTest {

    private static TimeseriesFixture instance;

    public TimeseriesFixtureTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        instance = new TimeseriesFixture();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of data01 method, of class TimeseriesFixture.
     */
    @Test
    public void testData01() throws Exception {
        assertTrue(instance.data01().exists());
    }

    /**
     * Test of data02 method, of class TimeseriesFixture.
     */
    @Test
    public void testData02() throws Exception {
        assertTrue(instance.data02().exists());
    }

    /**
     * Test of irBenzin method, of class TimeseriesFixture.
     */
    @Test
    public void testIrBenzin() throws Exception {
        assertTrue(instance.irBenzin().exists());
    }

    @Test
    public void testTs01() {
        assertTrue(instance.ts01().exists());
    }

    @Test
    public void testTsQuoted() {
        assertTrue(instance.quoted().exists());
    }

    @Test
    public void testTrace0() {
        assertTrue(instance.trace0().exists());
    }

    @Test
    public void testTrace1() {
        assertTrue(instance.trace1().exists());
    }
    
    @Test
    public void testAP01() {
        assertTrue(instance.ap01().exists());
    }
}
