package com.capgemini.test;

public class IncomeTax
{

	public static double calculateTax(int n)
	{
		// TODO Auto-generated method stub
		
		if(n >=180001 && n <=300000)
		{
			return (n *0.1);
		}
		else if(n >=300001 && n <=500000)
		{
			return (n *0.2);
		}
		else if(n >=500001 && n <=1000000)
		{
			return (n *0.3);
		}
		else
		{
			return 0;
		}
	
	}

}
