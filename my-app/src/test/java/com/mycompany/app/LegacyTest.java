package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LegacyTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LegacyTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(LegacyTest.class);
    }

    public void testFoo() throws InterruptedException {
        System.out.println("Run Legacy Test: testFoo");
        Thread.sleep(10000L);
        assertTrue(true);

    }

    public void testBar() throws InterruptedException {
        System.out.println("Run Legacy Test: testBar");
        Thread.sleep(10000L);
        assertTrue(true);
    }
}
