package com.sapient.cui.test.client;

import junit.framework.TestCase;

public class ArithmeticTestCase extends TestCase {
	int firstNumber,secondNumber;
	protected void setUp() throws Exception {
		super.setUp();
		firstNumber = 2;
		secondNumber = 4;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		firstNumber = 0;
		secondNumber = 0;
	}

	public final void testSum() {
		fail("Not yet implemented");
	}

}
