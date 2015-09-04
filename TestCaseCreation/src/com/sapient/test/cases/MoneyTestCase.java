/**
 * 
 */
package com.sapient.test.cases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.cui.client.Money;

/**
 * @author sshara
 *
 */
public class MoneyTestCase {
	Money moneyObject = new Money(25, "INR");

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMoneyConstructor() {
		assertNotNull(new Money(25, "USD"));
		assertNotNull(new Money(-24, "USD"));
	}

	@Test
	public final void testCurrencyGetter() {
		assertTrue(moneyObject.currency() instanceof String);
	}

	@Test
	public final void testAdd() {
		Money x;
		x = moneyObject.add(new Money(56, "INR"));
		assertTrue(x instanceof Money);
	}

	@Test(expected = NullPointerException.class)
	public final void testNull() {
		moneyObject.add(null);
	}

	@Test
	public final void testAmountGetter() {
			assertEquals(moneyObject.amount(),int.class);
	}

}
