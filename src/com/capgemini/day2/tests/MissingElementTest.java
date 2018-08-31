package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.MissingElement;

class MissingElementTest
{
	@Test
	void test()
	{
		assertEquals(2,MissingElement.findMissingElement(new int[] {0,1,3}));
		assertEquals(3,MissingElement.findMissingElement(new int[] {0,1,4,2}));
	}
}
