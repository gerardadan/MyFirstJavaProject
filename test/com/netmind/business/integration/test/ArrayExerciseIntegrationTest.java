package com.netmind.business.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.business.ArrayExercise;

public class ArrayExerciseIntegrationTest {

	@Test
	public void testAddEvenNumbers() {
		int[] intArray = new int[100];
		ArrayExercise arrayExercise = new ArrayExercise();

		for (int i = 0; i < 100; i++) {
			intArray[i] = i + 1;
		}

		assertEquals(arrayExercise.addEvenNumbers(intArray), 2500);
	}

}
