package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Multidimen;

class MultidimenTest
{

	@Test
	void test() 
	{
		assertEquals("Found",Multidimen.searchElement(new int[][] {{1,2},{3,4}}));
	}

}
