package com.javatechie.app.sonar_example;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return (Test) new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {

		App a = new App();
		a.m1();
		a.getData();
		assertTrue(true);
	}
}

