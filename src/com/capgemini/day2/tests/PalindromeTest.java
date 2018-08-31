package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Palindrome;

class PalindromeTest {

	@Test
	void testCheckPalindromeNumber()
	{
		assertEquals(true,Palindrome.checkPalindromeNumber(121));
		assertEquals(false,Palindrome.checkPalindromeNumber(345));
	}

}
