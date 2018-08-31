package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Cui;

class CuiTest
{

	@Test
	void test() 
	{
		assertEquals(1,Cui.checkId("Anusha","12345","Anusha","12345"));
	}

}
