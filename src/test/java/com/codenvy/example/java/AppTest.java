package com.codenvy.example.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName
     *         name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {

TestSuite suit =         new TestSuite(AppTest.class);

return suit;
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
    
     public void testAppFailed() {
        assertTrue(false);
    }
 
      public void testAppHello() {
          System.out.println("Hello world");
        assertTrue(Math.random() > 0.7);
    }
    
}
