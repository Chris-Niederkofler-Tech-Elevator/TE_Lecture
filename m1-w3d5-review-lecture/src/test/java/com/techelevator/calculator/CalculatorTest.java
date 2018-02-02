package com.techelevator.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@After
	public void cleanup() {
		calculator.reset();
	}
	
	@Test
	public void add_one_numbers() {
		// Setup (Arrange)
		double firstNumber = 10;
		// Act
		double result = calculator.add(firstNumber);
		// Assert (Verification)
		Assert.assertEquals("Result is not 10", 10, result, 0.0001d);
	}
	
	@Test
	public void add_two_numbers() {
		// Setup (Arrange)
		double firstNumber = 10;
		double secondNumber = 15;
		calculator.add(secondNumber);
		// Act
		calculator.add(firstNumber);
		// Assert (Verification)
		Assert.assertEquals("Result is not 25", 25, 
				calculator.getResult(), 0.0001d);
	}
	
	@Test
	public void subtract_number_from_0() {
		// Setup
		// Act
		calculator.subtract(25d);
		// Assert
		//Assert.assertEquals("Result is not -25", -25, 
		//		calculator.getResult(), 0.0001d);
		Assert.assertTrue("Result is not -25, it was " + calculator.getResult(), calculator.getResult() != -25d);
	}
}
