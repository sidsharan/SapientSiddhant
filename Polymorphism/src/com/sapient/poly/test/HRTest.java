/**
 * 
 */
package com.sapient.poly.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.cui.client.Confirmed;
import com.sapient.cui.client.Contract;
import com.sapient.cui.client.HR;
import com.sapient.cui.client.Intern;

/**
 * @author sshara
 *
 */
public class HRTest {
	Object result;
	HR HRObject = new HR();

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
		HRObject = null;
		result = null;
	}

	/**
	 * Test method for
	 * {@link com.sapient.cui.client.HR#empType(java.lang.String)}.
	 */
	@Test
	public final void testIntern() {

		result = HRObject.empType("I");
		assertTrue(result instanceof Intern);

	}

	@Test
	public final void testContract() {

		result = HRObject.empType("T");
		assertTrue(result instanceof Contract);
	}

	@Test
	public final void testConfirmed() {

		result = HRObject.empType("C");
		assertTrue(result instanceof Confirmed);

	}

	@Test
	public final void testForNull()   {

		result = HRObject.empType(null);
		assertNull(result);
	}

	@Test
	public final void testForRandomValue() {

		result = HRObject.empType("");
		assertNull(result);
		
	}

}
