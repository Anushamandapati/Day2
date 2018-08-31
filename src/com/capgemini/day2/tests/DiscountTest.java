package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Discount;

class DiscountTest {

	@Test
	void test()
	{
		assertArrayEquals(new double[] {350,650},Discount.calculateDiscount(1000));
	}

}
