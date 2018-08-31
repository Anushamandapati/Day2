package com.capgemini.test;

public class Palindrome 
{
	public static boolean checkPalindromeNumber(int num)
	{
		// TODO Auto-generated method stub
		int sum=0,rem;
		int temp = num;
		while(num > 0)
		{
			rem= num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(sum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}