package com.capgemini.test;

public class MissingElement
{

	public static int findMissingElement(int[] ms)
	{
		// TODO Auto-generated method stub
		int i,j,temp;
		for(i=0;i<ms.length;i++)
		{
			for(j=i+1;j<ms.length;j++)
			{
				if(ms[i]>ms[j])
				{
					
					temp=ms[i];
					ms[i]=ms[j];
					ms[j]=temp;
				}
			}
		}
		for(i=0;i<ms.length;i++)
		{
			if(ms[i]!=i)
			{
				return i;
			}
		}
		return i;
	}
	
}
