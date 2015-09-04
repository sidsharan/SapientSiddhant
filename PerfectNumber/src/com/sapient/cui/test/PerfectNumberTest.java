/**
 * 
 */
package com.sapient.cui.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.cui.client.PerfectNumber;

/**
 * @author sshara
 *
 */
public class PerfectNumberTest {
		int number;
		PerfectNumber perfectObject = new PerfectNumber();

		BufferedReader bufferObject = new BufferedReader(new InputStreamReader(System.in));
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
	public final void testCheckForPerfect() throws IOException {
try{
		number=Integer.parseInt(bufferObject.readLine());
		boolean expected = true;
		boolean actual = perfectObject.checkForPerfect(number);
		assertEquals(expected, actual);
		
	}
catch(NumberFormatException e)
{
	System.err.println("Please Input A Number");
}
	}
//	@Test
//	
//	public final void testCheckForPerfectByRandomOrZero() throws IOException {
//
////		BufferedReader bufferObject = new BufferedReader(new InputStreamReader(System.in));
//		number=Integer.parseInt(bufferObject.readLine());
//		boolean expected = false;
//		boolean actual = perfectObject.checkForPerfect(number);
//		assertEquals(expected, actual);
//	}

}
