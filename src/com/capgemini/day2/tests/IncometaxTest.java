package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.IncomeTax;

class IncometaxTest 
{

	@Test
	void test() 
	{
		assertEquals(0,IncomeTax.calculateTax(10000));
		assertEquals(28000,IncomeTax.calculateTax(280000));
		assertEquals(96000,IncomeTax.calculateTax(480000));
		assertEquals(174000,IncomeTax.calculateTax(580000));
	}
}
