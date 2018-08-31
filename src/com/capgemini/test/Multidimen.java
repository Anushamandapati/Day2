package com.capgemini.test;

public class Multidimen 
{

	public static Object searchElement(int[][] md) 
	{
		// TODO Auto-generated method stub
		int ele=4;
	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(ele==md[i][j])
				{
					return "Found";
				}
		
			}
		}
		return null;
	}
}
