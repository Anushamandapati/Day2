package com.capgemini.test;

public class Armstrong 
{
	public static boolean checkArmstrongNumber(int num) 
	{
		// TODO Auto-generated method stub
		
	    int orignum=num;
	    int sum = 0;
	   while(num != 0)
	   {
		   int digit = num % 10;
		   sum = sum+(digit*digit*digit);
		   num = num/10;
	   }
	   if(sum== orignum)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
		
	}

}
