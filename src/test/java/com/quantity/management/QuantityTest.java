/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 18-Apr-2022
 */
package com.quantity.management;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class QuantityTest {

	@SuppressWarnings("deprecation")
	@Test
	public void givenFeetAndInchIfEqualReturnTrue() {
//		fail("Not yet implemented");
		Quantity quantity = new Quantity();

		// boolean true || false
		boolean result = quantity.compare(2, 24);
		Assert.assertEquals(true, result);
	}

}
