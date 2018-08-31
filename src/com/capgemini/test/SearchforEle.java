package com.capgemini.test;

public class SearchforEle 
{

	public static String ElementSearchInArray(int[] ar, int val) {
		// TODO Auto-generated method stub
		for(int i=0;i<=14;i++)
		{
			if(ar[i] == val)
			{
				String found = "Element exists in the array";
				return found;
			}
		}
		String notFound = "Element does not exist in the array";
		return notFound;
	}

}
