package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.StringofPalin;

class StringofPalinTest
{
	@Test
	void test()
	{
		assertArrayEquals(new String[] {"121", "787","545", "454", null, null, null, null, null, null}, StringofPalin.orderPalindromes(new String[] {"121","154","234","787","545","454","678","789","876","890"}));
	}

}
