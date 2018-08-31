package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Reversestr;

class ReversestrTest
{

	@Test
	void testReverseString() 
	{
		assertEquals("ahsuna ",Reversestr.findReverse("anusha"));
	}
}
