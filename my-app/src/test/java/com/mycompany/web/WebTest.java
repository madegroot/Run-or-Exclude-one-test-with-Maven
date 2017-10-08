package com.mycompany.web;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class WebTest     extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WebTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( WebTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testWeb()
    {
        assertTrue( true );
    }

    public void testFoo() {
        System.out.println("Run Web Test: testFoo");
        assertEquals(Web.sayHello(), "Hello Web!");
    }
}
