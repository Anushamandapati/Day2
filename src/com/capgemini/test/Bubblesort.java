package com.capgemini.test;

public class Bubblesort
{
	public static int[] findAllBubbleNumbers(int[] ar)
	{
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		return ar;
	}
}
