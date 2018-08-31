package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Sentence;

class SentenceTest 
{

	@Test
	void test()
	{
		assertEquals("this is Anu",Sentence.correctSentence("this is is Anu","is",3));
	}

}
