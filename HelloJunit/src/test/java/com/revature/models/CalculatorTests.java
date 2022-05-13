package com.revature.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.model.Calculator;

public class CalculatorTests {
	
	public static Calculator c;
	
	public int i = 5;
	public int j = 42;
	public int k = 0;
	
	public int result;
	
	
	@BeforeAll
	public static void createCalc() {
		c = new Calculator();
		System.out.println("This is inside of the @beforeall method");
	}
	
	
	@AfterAll
	public static void clearcalc() {
		c = null;
		System.out.println("This is in the @afterall method");
	}
	
	@Test
	public void testAdd() {
		System.out.println("This is inside the test Add method");
		result = c.add(j, i);
		assertTrue(result == 47);
		assertEquals(result, 47);
	}
	
	@Test
	public void testSubtract() {
		System.out.println("This is in the subtraction method");
		result = c.subtract(i,  j);
		assertEquals(-37, result);
	}
	
	}
