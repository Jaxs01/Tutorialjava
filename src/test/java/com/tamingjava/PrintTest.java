package com.tamingjava;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Jacqueline
 *
 */
public class PrintTest {

	/**
	 * @throws java.lang.Exception
	 */

	@Test
	public void test() {
		String ExpectedResult = (":-)JAXS is awesome ");
		String ActualResult = Print.stringConversionAndReturnValue("Jaxs");
	assertEquals(ExpectedResult,ActualResult);
	}

}
