package com.telusko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
	@Test
	void testcalc() {
		Calc calc = new Calc();
		int actualresult = calc.divide(10,5);
		int expectedresult = 2;
		
		assertEquals(expectedresult, actualresult);
		
		
	} 

}
