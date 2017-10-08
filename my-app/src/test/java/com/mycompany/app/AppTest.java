package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
	extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) 
	{
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() 
	{
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() 
	{
        System.out.println("Run App Test: testApp");
        assertTrue(true);
    }

    public void testFoo() 
	{
        System.out.println("Run App Test: testFoo");
        assertEquals(App.sayHello(), "Hello World!");
    }

    public void testBar() 
	{
        System.out.println("Run App Test: testBar");
        assertEquals(App.sayHello().substring(0, 5), "Hello");
    }
}
