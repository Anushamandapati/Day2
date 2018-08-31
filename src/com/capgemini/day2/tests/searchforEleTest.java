package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.SearchforEle;

class searchforEleTest
{

	@Test
	void test()
	{
	assertEquals("Element exists in the array", SearchforEle.ElementSearchInArray(new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}, 5));
	assertEquals("Element does not exist in the array",SearchforEle.ElementSearchInArray(new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}, 4));
	}

}
