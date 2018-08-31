package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Armstrong;

class ArmstrongTest 
{
	@Test
	void testCheckArmstrongNumber()
	{
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(false,Armstrong.checkArmstrongNumber(142));
		assertEquals(false,Armstrong.checkArmstrongNumber(0456));
		assertEquals(false,Armstrong.checkArmstrongNumber('a'));
		
	}
	
}
