package com.netmind.business.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.business.Calculator;

public class CalculatorIntegrationTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(4, 2), 6);
	}

	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.substract(4, 2), 2);
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.multiply(4, 2), 8);
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.divide(4, 2), 2);
	}

}
