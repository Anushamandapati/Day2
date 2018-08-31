package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void test() 
	{
		assertArrayEquals(new int [] {153,370,371,407,0,0,0,0,0,0},ArmstrongRange.findAllArmstrongNumber(100,1000));
	}



}
