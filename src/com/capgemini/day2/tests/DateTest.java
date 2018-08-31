package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Date;

class DateTest {

	@Test
	void test()
	{
		assertEquals("28/mar/1996" , Date.changeDateFormat("28,03,1996"));
	}

}
