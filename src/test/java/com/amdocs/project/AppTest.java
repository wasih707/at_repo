package com.amdocs.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.amdocs.project.App;

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
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App app = new App();

        assertTrue( app.add(10,10) == 20 );
    }
}
