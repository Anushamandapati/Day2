package com.capgemini.test;

public class ArmstrongRange 
{
	public static int[] findAllArmstrongNumber(int start, int end)
	{
		int i,sum=0;
		int num;
		int allArmstrongNumbers[] = new int[10];
		int index=0;
		for(i=start;i<=end;i++)
		{
			num=i;
			sum=0;
			while(num != 0)
			   {
				   int digit = num % 10;
				   sum = sum+(digit*digit*digit);
				   num = num/10;
			   }
			if(sum == i)
			{
				allArmstrongNumbers[index++]=i;
				
			}
		}
		return allArmstrongNumbers;
	}
}
