package com.capgemini.test;

public class StringSearch
{

	public static int countRepeat(String[] names, String search)
	{
		// TODO Auto-generated method stub
		int i,count=0;
		for(i=0;i<names.length;i++)
		{
			if(names[i].compareTo(search)==0)
				count++;
		}
		return count;
	}
	

}
