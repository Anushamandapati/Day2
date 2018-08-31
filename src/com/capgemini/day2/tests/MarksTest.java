package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.capgemini.test.Marks;

class MarksTest {

	@Test
	void test()
	{
		assertEquals("Passed",Marks.calculateGrade(70,70,70));
		assertEquals("Promoted",Marks.calculateGrade(50,70,70));
		assertEquals("Failed ",Marks.calculateGrade(50,50,50));
	}

}
