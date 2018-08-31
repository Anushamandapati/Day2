package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Square;

class SquareTest 
{

	@Test
	void test()
	{
		assertEquals(25,Square.findSquare(5));
	}

}
