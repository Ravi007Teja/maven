package com.nissan.training.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {

	@Test
	public void testAdd() {
		Calc c =  new Calc();
		assertEquals(10, c.add(5, 5));
	}
	
	@Test
	public void testsub() {
		Calc c =  new Calc();
				assertEquals(-5, c.subtract(5, 10));
	}
	
	@Test
	public void testmul() {
		Calc c =  new Calc();
		assertEquals(25, c.multiply(5, 5));
	}
	
	@Test
	public void testdivide() {
		Calc c =  new Calc();
		assertEquals(1, c.divide(5, 5));
	}

}
